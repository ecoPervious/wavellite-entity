/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.measurement;

import fi.uef.envi.wavellite.entity.core.Entity;
import fi.uef.envi.wavellite.entity.core.Feature;
import fi.uef.envi.wavellite.entity.core.Property;
import fi.uef.envi.wavellite.entity.core.Quality;
import fi.uef.envi.wavellite.entity.core.Sensor;
import fi.uef.envi.wavellite.entity.core.SpatialLocation;
import fi.uef.envi.wavellite.entity.core.TemporalLocation;

/**
 * <p>
 * Title: MeasurementValueContext
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

public interface MeasurementValueContext extends Entity {

	public Sensor getSensor();
	
	public Property getProperty();
	
	public Feature getFeature();
	
	public TemporalLocation getTemporalLocation();
	
	public SpatialLocation getSpatialLocation();
	
	public Quality getQuality();
	
	public void setSensor(Sensor sensor);
	
	public void setProperty(Property property);
	
	public void setFeature(Feature feature);
	
	public void setTemporalLocation(TemporalLocation location);
	
	public void setSpatialLocation(SpatialLocation location);
	
	public void setQuality(Quality quality);
	
}
