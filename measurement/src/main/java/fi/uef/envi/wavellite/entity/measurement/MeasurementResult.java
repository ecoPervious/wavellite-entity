/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.measurement;

import fi.uef.envi.wavellite.entity.core.Entity;

/**
 * <p>
 * Title: MeasurementResult
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

public interface MeasurementResult extends Entity {

	public MeasurementValue getValue();
	
	public MeasurementValueContext getContext();
	
	public void setValue(MeasurementValue value);
	
	public void setContext(MeasurementValueContext context);
	
}
