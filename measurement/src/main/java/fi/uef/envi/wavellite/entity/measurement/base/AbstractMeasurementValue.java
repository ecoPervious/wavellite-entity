/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.measurement.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.measurement.MeasurementValue;
import fi.uef.envi.wavellite.vocabulary.WO;

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

	public AbstractMeasurementValue() {
		this(WO.MeasurementValue);
	}
	
	public AbstractMeasurementValue(String type) {
		this(UUID.randomUUID().toString(), type);
	}
	
	public AbstractMeasurementValue(String id, String type) {
		super(id, type);
	}

}
