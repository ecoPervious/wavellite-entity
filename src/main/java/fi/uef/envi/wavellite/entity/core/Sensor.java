/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core;

import fi.uef.envi.wavellite.entity.observation.Sensing;


/**
 * <p>
 * Title: Sensor
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Project: Wavellite Entity
 * </p>
 * <p>
 * Copyright: Copyright (C) 2013
 * </p>
 * 
 * @author Markus Stocker
 */

public interface Sensor extends Entity {

	/**
	 * The sensing process implemented by this sensor
	 * 
	 * @param sensing
	 */
	public void setSensing(Sensing sensing);
	
	public Sensing getSensing();
	
}
