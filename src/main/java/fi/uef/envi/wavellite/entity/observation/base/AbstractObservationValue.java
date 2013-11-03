/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.observation.base;

import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.observation.ObservationValue;

/**
 * <p>
 * Title: AbstractObservationValue
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

public abstract class AbstractObservationValue extends AbstractEntity implements
		ObservationValue {

	protected Object value;
	
	public AbstractObservationValue(String id, String type) {
		super(id, type);
	}
	
	public AbstractObservationValue(String id, String type, Object value) {
		super(id, type);
		
		setValue(value);
	}
	
	@Override
	public void setValue(Object value) {
		if (value == null)
			throw new NullPointerException("[value = null]");

		this.value = (Double)value;
	}

	@Override
	public Object getValue() {
		return value;
	}

}