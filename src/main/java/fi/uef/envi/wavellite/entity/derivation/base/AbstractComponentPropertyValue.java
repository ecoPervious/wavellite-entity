/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base;

import org.openrdf.model.URI;

import fi.uef.envi.wavellite.entity.core.SpatialLocation;
import fi.uef.envi.wavellite.entity.core.TemporalLocation;
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

	private static final long serialVersionUID = -8892563883527113933L;
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

	@Override
	public Number getValueAsNumber() {
		return (Number) value;
	}

	@Override
	public Double getValueAsDouble() {
		if (value instanceof Integer)
			return getValueAsInteger().doubleValue();

		return (Double) value;
	}

	@Override
	public Integer getValueAsInteger() {
		return (Integer) value;
	}

	@Override
	public String getValueAsString() {
		return (String) value;
	}

	@Override
	public TemporalLocation getValueAsTemporalLocation() {
		return (TemporalLocation) value;
	}

	@Override
	public SpatialLocation getValueAsSpatialLocation() {
		return (SpatialLocation) value;
	}

	@Override
	public URI getValueAsUri() {
		return (URI) value;
	}

}
