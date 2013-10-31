/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.observation;

import fi.uef.envi.wavellite.entity.core.Entity;

/**
 * <p>
 * Title: ObservationValue
 * </p> 
 * <p>
 * Description:
 * </p>
 * <p>
 * Project:
 * </p>
 * <p>
 * Copyright: Copyright (C) 2013
 * </p>
 * 
 * @author Markus Stocker
 */

public interface ObservationValue extends Entity {

	public void setValue(Object value);
	
	public Object getValue();
	
	public void accept(ObservationValueVisitor visitor);
	
}
