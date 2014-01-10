/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.measurement.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.measurement.MeasurementValue;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: AbstractMeasurementValue
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

public abstract class AbstractMeasurementValue extends AbstractEntity implements
		MeasurementValue {

	protected Object value;

	public AbstractMeasurementValue() {
		this(UUID.randomUUID().toString());
	}

	public AbstractMeasurementValue(String id) {
		this(id, WOE.MeasurementValue);
	}

	public AbstractMeasurementValue(String id, String type) {
		super(id, type);
	}

	public AbstractMeasurementValue(String id, String type, Object value) {
		super(id, type);

		setValue(value);
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

}
