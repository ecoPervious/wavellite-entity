/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.observation;

import fi.uef.envi.wavellite.entity.common.Feature;
import fi.uef.envi.wavellite.entity.common.Property;
import fi.uef.envi.wavellite.entity.common.Sensor;

/**
 * <p>
 * Title: SensorObservation
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

public interface SensorObservation {

	public void setSensor(Sensor sensor);
	
	public void setFeature(Feature feature);
	
	public void setProperty(Property property);
	
	public Sensor getSensor();
	
	public Feature getFeature();
	
	public Property getProperty();
	
}
