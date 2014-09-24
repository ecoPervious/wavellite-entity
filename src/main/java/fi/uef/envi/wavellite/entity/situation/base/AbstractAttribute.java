/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.situation.Attribute;

/**
 * <p>
 * Title: AbstractAttribute
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Project: Wavellite Entity
 * </p>
 * <p>
 * Copyright: Copyright (C) 2014
 * </p>
 * 
 * @author Markus Stocker
 */

public abstract class AbstractAttribute extends AbstractEntity implements
		Attribute {

	private static final long serialVersionUID = -3895824058486371102L;

	protected String name;
	protected Object value;

	public AbstractAttribute(String id, String type) {
		super(id, type);
	}

	public AbstractAttribute(String id, String type, Object value) {
		this(id, type);

		setValue(value);
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
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
