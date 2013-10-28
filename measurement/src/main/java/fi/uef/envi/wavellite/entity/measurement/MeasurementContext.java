/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.measurement;

import fi.uef.envi.wavellite.entity.common.Feature;
import fi.uef.envi.wavellite.entity.common.Property;
import fi.uef.envi.wavellite.entity.common.Quality;
import fi.uef.envi.wavellite.entity.common.Sensor;
import fi.uef.envi.wavellite.entity.common.SpatialLocation;
import fi.uef.envi.wavellite.entity.common.TemporalLocation;
import fi.uef.envi.wavellite.entity.core.Entity;

/**
 * <p>
 * Title: MeasurementContext
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

public interface MeasurementContext extends Entity {

	public Sensor getSensor();
	
	public Property getProperty();
	
	public Feature getFeature();
	
	public TemporalLocation getTemporalLocation();
	
	public SpatialLocation getSpatialLocation();
	
	public Quality getQuality();
	
}
