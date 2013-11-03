/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base;

import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.derivation.ComponentPropertyValue;

/**
 * <p>
 * Title: AbstractComponentPropertyValue
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

public abstract class AbstractComponentPropertyValue extends AbstractEntity
		implements ComponentPropertyValue {

	protected Object value;

	public AbstractComponentPropertyValue(String id, String type) {
		super(id, type);
	}

	public AbstractComponentPropertyValue(String id, String type, Object value) {
		super(id, type);

		setValue(value);
	}

	@Override
	public void setValue(Object value) {
		if (value == null)
			throw new NullPointerException("[value = null]");

		this.value = value;
	}

	@Override
	public Object getValue() {
		return value;
	}

}
