/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.UUID;

import org.joda.time.DateTime;
import org.joda.time.Interval;

import fi.uef.envi.wavellite.entity.core.TemporalLocation;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: AbstractTemporalLocation
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

public abstract class AbstractTemporalLocation extends AbstractEntity implements
		TemporalLocation {

	protected Object value;

	public AbstractTemporalLocation() {
		this(UUID.randomUUID().toString());
	}

	public AbstractTemporalLocation(String id) {
		this(id, WTO.TemporalLocation);
	}

	public AbstractTemporalLocation(String id, String type) {
		super(id, type);
	}

	public AbstractTemporalLocation(String id, String type, Object value) {
		super(id, type);

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
	
	@Override
	public DateTime getValueAsDateTime() {
		return (DateTime)value;
	}

	@Override
	public Interval getValueAsInterval() {
		return (Interval)value;
	}
	
}
