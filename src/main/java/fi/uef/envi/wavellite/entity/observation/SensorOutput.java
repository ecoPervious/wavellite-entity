/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.observation;

import fi.uef.envi.wavellite.entity.core.Entity;

/**
 * <p>
 * Title: SensorOutput
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

public interface SensorOutput extends Entity {

	public void setObservationValue(ObservationValue value);
	
	public ObservationValue getObservationValue();
	
}
