/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.observation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.observation.ObservationValueVisitor;
import fi.uef.envi.wavellite.vocabulary.SSN;

/**
 * <p>
 * Title: ObservationValueDouble
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

public class ObservationValueDouble extends AbstractObservationValue {

	private static final long serialVersionUID = -7824217647470553427L;

	public ObservationValueDouble() {
		this(UUID.randomUUID().toString());
	}
	
	public ObservationValueDouble(Double value) {
		this(UUID.randomUUID().toString(), value);
	}
	
	public ObservationValueDouble(String id) {
		this(id, SSN.ObservationValue);
	}

	public ObservationValueDouble(String id, Double value) {
		this(id, SSN.ObservationValue, value);
	}
	
	public ObservationValueDouble(String id, String type) {
		super(id, type);
	}

	public ObservationValueDouble(String id, String type, Double value) {
		super(id, type, value);
	}
	
	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public Double getValue() {
		return (Double)value;
	}
	
	@Override
	public void accept(ObservationValueVisitor visitor) {
		visitor.visit(this);
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

		ObservationValueDouble other = (ObservationValueDouble) obj;

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
		return "ObservationValueDouble [id = " + id + "; type = " + type
				+ "; value = " + value + "]";
	}

}
