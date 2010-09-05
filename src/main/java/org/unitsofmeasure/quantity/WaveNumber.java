/**
 *  The Units of Measure API, UCUM codes, UCUM table (regardless of format),
 *  and UCUM Specification are copyright © 1999-2010, Regenstrief Institute, Inc.
 *  and the Unified Codes for Units of Measures (UCUM) Organization.
 *  All rights reserved.
 *
 * See TermsOfUse for details.
 */
package org.unitsofmeasure.quantity;

import org.unitsofmeasure.Quantity;

/**
 * This interface represents a wave property inversely related to wavelength.
 * The system unit for this quantity is "1/m" (reciprocal meters).
 * 
 * @author <a href="mailto:jean-marie@dautelle.com">Jean-Marie Dautelle</a>
 * @author <a href="mailto:jcp@catmedia.us">Werner Keil</a>
 * @version 1.8 ($Revision: 1.7 $), $Date: 2010/02/02 20:17:02 $
 * @see <a href="http://en.wikipedia.org/wiki/Wavenumber">Wikipedia's
 *      Wavenumber</a>
 * 
 */
public interface WaveNumber extends Quantity<WaveNumber> {
}