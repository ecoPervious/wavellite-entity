/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.observation;

import fi.uef.envi.wavellite.entity.core.Entity;
import fi.uef.envi.wavellite.entity.core.Feature;
import fi.uef.envi.wavellite.entity.core.Property;
import fi.uef.envi.wavellite.entity.core.Sensor;
import fi.uef.envi.wavellite.entity.core.TemporalLocation;

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

public interface SensorObservation extends Entity {

	public void setSensor(Sensor sensor);

	public void setFeature(Feature feature);

	public void setProperty(Property property);

	public void setSensorOutput(SensorOutput output);

	public void setTemporalLocation(TemporalLocation location);

	public Sensor getSensor();

	public Feature getFeature();

	public Property getProperty();

	public SensorOutput getSensorOutput();

	public TemporalLocation getTemporalLocation();

}
