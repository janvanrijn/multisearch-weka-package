/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * AbstractParameter.java
 * Copyright (C) 2008 University of Waikato, Hamilton, New Zealand
 */

package weka.core.setupgenerator;

import weka.core.OptionHandler;
import weka.core.Utils;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Abstract container class for search parameters.
 *
 * @author  fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 4521 $
 */
public abstract class AbstractParameter
  implements Serializable, Cloneable, OptionHandler {
  
  /** for serialization. */
  private static final long serialVersionUID = -941906920843843404L;

  /**
   * default constructor.
   */
  public AbstractParameter() {
    super();
  }
  
  /**
   * Returns a string describing the object.
   * 
   * @return 		a description suitable for displaying in the
   *         		explorer/experimenter gui
   */
  public abstract String globalInfo();
  
  /**
   * Returns a clone of itself.
   * 
   * @return		a clone
   */
  public Object clone() {
    AbstractParameter 	result;
    
    try {
      result = (AbstractParameter) getClass().newInstance();
      result.setOptions(getOptions());
    }
    catch (Exception e) {
      result = null;
      e.printStackTrace();
    }
    
    return result;
  }
  
  /**
   * Gets an enumeration describing the available options.
   *
   * @return an enumeration of all the available options.
   */
  public Enumeration listOptions() {
    return new Vector().elements();
  }

  /**
   * returns the options of the current setup.
   *
   * @return		the current options
   */
  public String[] getOptions() {
    return new String[0];
  }

  /**
   * Parses the options for this object.
   *
   * @param options	the options to use
   * @throws Exception	if setting of options fails
   */
  public void setOptions(String[] options) throws Exception {
    Utils.checkForRemainingOptions(options);
  }

  /**
   * Returns a string representation of the search parameter.
   *
   * @return		a string representation
   */
  public abstract String toString();
}