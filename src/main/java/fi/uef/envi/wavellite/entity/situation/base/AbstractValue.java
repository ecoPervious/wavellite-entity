/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.situation.RelevantObject;
import fi.uef.envi.wavellite.entity.situation.Value;

/**
 * <p>
 * Title: AbstractValue
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

public abstract class AbstractValue extends AbstractEntity implements
		Value, RelevantObject {

	private static final long serialVersionUID = 1607261161707719469L;
	protected Object value;
	
	public AbstractValue(String id, String type) {
		super(id, type);
	}
	
	public AbstractValue(String id, String type, Object value) {
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
