/**
 * The Units of Measure API, UCUM codes, UCUM table (regardless of format),
 * and UCUM Specification are copyright © 1999-2010, 
 * Regenstrief Institute, Inc. and the Unified Codes for Units of Measures 
 * (UCUM) Organization. All rights reserved.
 *
 * See TermsOfUse for details.
 */
package org.unitsofmeasure;

/**
 * <p>
 * Represents a quantitative properties or attributes of thing. Mass, time,
 * distance, heat, and angular separation are among the familiar examples of
 * quantitative properties.
 * </p>
 * 
 * <p>
 * This interface has no method (tagging interface) is used solely to specify
 * the quantitative property associated to a class through class
 * parameterization and to provide limited compile time dimension
 * consistency.[code] Unit<Mass> pound = ... Measure<Length> size = ...
 * Sensor<Temperature> thermometer = ... Vector3D<Velocity> aircraftSpeed = ...
 * [/code]
 * </p>
 * 
 * @param <Q>
 *            The type of the quantity.
 * 
 * @author <a href="mailto:jean-marie@dautelle.com">Jean-Marie Dautelle</a>
 * @author <a href="mailto:desruisseaux@users.sourceforge.net">Martin
 *         Desruisseaux</a>
 * @author <a href="mailto:jsr275@catmedia.us">Werner Keil</a>
 * @see <a href="http://en.wikipedia.org/wiki/Quantity">Wikipedia: Quantity</a>
 * @version 1.0
 */
public interface Quantity<Q extends Quantity<Q>> {

    // No method, tagging interface.

}
