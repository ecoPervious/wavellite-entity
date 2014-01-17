/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.TemporalLocation;
import fi.uef.envi.wavellite.entity.situation.AttributeVisitor;
import fi.uef.envi.wavellite.entity.situation.RelevantObject;
import fi.uef.envi.wavellite.entity.situation.RelevantObjectVisitor;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: AttributeTemporalLocation
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

public class AttributeTemporalLocation extends AbstractAttribute implements
		RelevantObject {

	public AttributeTemporalLocation() {
		this(UUID.randomUUID().toString());
	}

	public AttributeTemporalLocation(TemporalLocation value) {
		this(UUID.randomUUID().toString(), value);
	}

	public AttributeTemporalLocation(String id) {
		this(id, STO.Attribute);
	}

	public AttributeTemporalLocation(String id, TemporalLocation value) {
		this(id, STO.Attribute, value);
	}

	public AttributeTemporalLocation(String id, String type) {
		super(id, type);
	}

	public AttributeTemporalLocation(String id, String type,
			TemporalLocation value) {
		super(id, type, value);
	}

	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void accept(RelevantObjectVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public void accept(AttributeVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public TemporalLocation getValue() {
		return (TemporalLocation) value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

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

		AttributeTemporalLocation other = (AttributeTemporalLocation) obj;

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
		return "AttributeTemporalLocation [id = " + id + "; type = " + type
				+ "; value = " + value + "]";
	}

}
