/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.SpatialLocation;
import fi.uef.envi.wavellite.entity.situation.AttributeVisitor;
import fi.uef.envi.wavellite.entity.situation.RelevantObject;
import fi.uef.envi.wavellite.entity.situation.RelevantObjectVisitor;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: AttributeSpatialLocation
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

public class AttributeSpatialLocation extends AbstractAttribute implements
		RelevantObject {

	private static final long serialVersionUID = -8851282458063826547L;

	public AttributeSpatialLocation() {
		this(UUID.randomUUID().toString());
	}

	public AttributeSpatialLocation(SpatialLocation value) {
		this(UUID.randomUUID().toString(), value);
	}

	public AttributeSpatialLocation(String id) {
		this(id, STO.Attribute);
	}

	public AttributeSpatialLocation(String id, SpatialLocation value) {
		this(id, STO.Attribute, value);
	}

	public AttributeSpatialLocation(String id, String type) {
		super(id, type);
	}

	public AttributeSpatialLocation(String id, String type,
			SpatialLocation value) {
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
	public SpatialLocation getValue() {
		return (SpatialLocation) value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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

		AttributeSpatialLocation other = (AttributeSpatialLocation) obj;

		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;

		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
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
		return "AttributeSpatialLocation [id = " + id + "; type = " + type
				+ "; name = " + name + "; value = " + value + "]";
	}

}
