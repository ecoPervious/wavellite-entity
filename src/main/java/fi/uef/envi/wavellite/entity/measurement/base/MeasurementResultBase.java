/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.measurement.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.measurement.MeasurementValueContext;
import fi.uef.envi.wavellite.entity.measurement.MeasurementResult;
import fi.uef.envi.wavellite.entity.measurement.MeasurementValue;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: MeasurementResultBase
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

public class MeasurementResultBase extends AbstractEntity implements
		MeasurementResult {

	private static final long serialVersionUID = -7818144488933554209L;
	private MeasurementValue value;
	private MeasurementValueContext context;

	public MeasurementResultBase(MeasurementValue value,
			MeasurementValueContext context) {
		this();

		setValue(value);
		setContext(context);
	}

	public MeasurementResultBase() {
		this(UUID.randomUUID().toString());
	}

	public MeasurementResultBase(String id) {
		this(id, WOE.MeasurementResult);
	}

	public MeasurementResultBase(String id, String type) {
		super(id, type);
	}
	
	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public MeasurementValue getValue() {
		return value;
	}

	@Override
	public MeasurementValueContext getContext() {
		return context;
	}

	@Override
	public void setValue(MeasurementValue value) {
		this.value = value;
	}

	@Override
	public void setContext(MeasurementValueContext context) {
		this.context = context;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		result = prime * result + ((context == null) ? 0 : context.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		MeasurementResultBase other = (MeasurementResultBase) obj;

		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;

		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;

		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;

		if (context == null) {
			if (other.context != null)
				return false;
		} else if (!context.equals(other.context))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "MeasurementResultBase [id = " + id + "; type = " + type
				+ "; value = " + value + "; context = " + context + "]";
	}

}
