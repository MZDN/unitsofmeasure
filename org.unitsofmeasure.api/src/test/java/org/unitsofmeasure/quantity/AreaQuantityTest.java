/**
 * The Units of Measure API, UCUM codes, UCUM table (regardless of format),
 * and UCUM Specification are copyright © 1999-2010,
 * Regenstrief Institute, Inc. and the Unified Codes for Units of Measures
 * (UCUM) Organization. All rights reserved.
 *
 * See LICENCE.txt for details.
 */
package org.unitsofmeasure.quantity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.unitsofmeasure.AreaUnit;
import org.unitsofmeasure.DistanceUnit;

/**
 * @author Werner Keil
 * @version $Revision$, $Date$
 */
public class AreaQuantityTest {

    AreaQuantity area;
    AreaUnit m2;
    
    @Before
    public void setUp() {
	m2 = AreaUnit.sqmetre;
	area = new AreaQuantity(100, m2);
    }
    
    @Test
    public void testAreaQuantity() {
	assertNotNull(area);
    }

    @Test
    public void testAdd() {
	AreaQuantity area2 = new AreaQuantity(50, m2);
	AreaQuantity result = area.add(area2);
	assertEquals(150d, result.scalar, 0);
    }

    @Test
    public void testSubtract() {
	AreaQuantity area2 = new AreaQuantity(50, m2);
	AreaQuantity result = area.subtract(area2);
	assertEquals(50d, result.scalar, 0);
    }

    @Test
    public void testEq() {
	AreaQuantity area2 = new AreaQuantity(100, m2);
	assertEquals(area, area2);
    }

    @Test
    public void testGt() {
	AreaQuantity area2 = new AreaQuantity(120, m2);
	assertTrue(area2.gt(area));
    }

    @Test
    public void testLt() {
	AreaQuantity area2 = new AreaQuantity(20, m2);
	assertTrue(area2.lt(area));
    }

    @Test
    public void testGe() {
	AreaQuantity area2 = new AreaQuantity(120, m2);
	assertTrue(area2.ge(area));
	area2 = new AreaQuantity(100, m2);
	assertTrue(area2.ge(area));
    }

    @Test
    public void testLe() {
	AreaQuantity area2 = new AreaQuantity(20, m2);
	assertTrue(area2.le(area));
	area2 = new AreaQuantity(100, m2);
	assertTrue(area2.le(area));
    }

    @Test
    public void testMultiplyDouble() {
	AreaQuantity result = area.multiply(3d);
	assertEquals(300d, result.scalar, 0d);
    }

    @Test
    public void testDivideDouble() {
	AreaQuantity result = area.divide(10d);
	assertEquals(10d, result.scalar, 0d);
    }

    @Test
    public void testDivideDistanceQuantity() {
	DistanceQuantity distance = new DistanceQuantity(10, DistanceUnit.m);
	DistanceQuantity result = area.divide(distance);
	assertEquals(10d, result.scalar, 0d);
    }

    @Test
    public void testMultiplyDistanceQuantity() {
	DistanceQuantity distance = new DistanceQuantity(15, DistanceUnit.m);
	VolumeQuantity result = area.multiply(distance);
	assertEquals(1500d, result.scalar, 0d);
    }

    @Test
    public void testConvert() {
	AreaQuantity result = area.convert(AreaUnit.acre);
	assertEquals(100d, result.scalar, 0d);
    }

    @Test
    public void testShowInUnits() {
	String result = area.showInUnits(AreaUnit.hectare, 2);
	assertEquals("0.01 hectares", result);
    }

}
