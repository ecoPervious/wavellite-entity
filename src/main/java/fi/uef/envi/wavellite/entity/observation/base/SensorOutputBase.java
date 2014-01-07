/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.observation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.observation.ObservationValue;
import fi.uef.envi.wavellite.entity.observation.SensorOutput;
import fi.uef.envi.wavellite.vocabulary.SSN;

/**
 * <p>
 * Title: SensorOutputBase
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Project:
 * </p>
 * <p>
 * Copyright: Copyright (C) 2013
 * </p>
 * 
 * @author Markus Stocker
 */

public class SensorOutputBase extends AbstractEntity implements SensorOutput {

	private ObservationValue value;

	public SensorOutputBase() {
		this(UUID.randomUUID().toString());
	}
	
	public SensorOutputBase(ObservationValue value) {
		this(UUID.randomUUID().toString(), value);
	}
	
	public SensorOutputBase(String id) {
		this(id, SSN.SensorOutput);
	}

	public SensorOutputBase(String id, ObservationValue value) {
		this(id, SSN.SensorOutput, value);
	}
	
	public SensorOutputBase(String id, String type) {
		super(id, type);
	}

	public SensorOutputBase(String id, String type, ObservationValue value) {
		super(id, type);

		setObservationValue(value);
	}
	
	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void setObservationValue(ObservationValue value) {
		if (value == null)
			throw new NullPointerException("[value = null]");

		this.value = value;
	}

	@Override
	public ObservationValue getObservationValue() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());

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

		SensorOutputBase other = (SensorOutputBase) obj;

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

		return true;
	}

	@Override
	public String toString() {
		return "SensorOutputBase [id = " + id + "; type = " + type
				+ "; value = " + value + "]";
	}

}
