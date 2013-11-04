/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.situation.AttributeValue;

/**
 * <p>
 * Title: AbstractAttributeValue
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

public abstract class AbstractAttributeValue extends AbstractEntity implements
		AttributeValue {

	protected Object value;
	
	public AbstractAttributeValue(String id, String type) {
		super(id, type);
	}
	
	public AbstractAttributeValue(String id, String type, Object value) {
		this(id, type);
		
		setValue(value);
	}
	
	@Override
	public void setValue(Object value) {
		this.value = value;
	}

	@Override
	public Object getValue() {
		return value;
	}

}
