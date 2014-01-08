/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.SpatialLocation;
import fi.uef.envi.wavellite.entity.situation.AttributeValueVisitor;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: AttributeValueSpatialLocation
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

public class AttributeValueSpatialLocation extends AbstractAttributeValue {

	public AttributeValueSpatialLocation() {
		this(UUID.randomUUID().toString());
	}

	public AttributeValueSpatialLocation(SpatialLocation value) {
		this(UUID.randomUUID().toString(), value);
	}

	public AttributeValueSpatialLocation(String id) {
		this(id, WTO.AttributeValueSpatialLocation);
	}

	public AttributeValueSpatialLocation(String id, SpatialLocation value) {
		this(id, WTO.AttributeValueSpatialLocation, value);
	}

	public AttributeValueSpatialLocation(String id, String type) {
		super(id, type);
	}

	public AttributeValueSpatialLocation(String id, String type,
			SpatialLocation value) {
		super(id, type, value);
	}

	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public SpatialLocation getValue() {
		return (SpatialLocation) value;
	}

	@Override
	public void accept(AttributeValueVisitor visitor) {
		visitor.visit(this);
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

		AttributeValueSpatialLocation other = (AttributeValueSpatialLocation) obj;

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
		return "AttributeValueSpatialLocation [id = " + id + "; type = " + type
				+ "; value = " + value + "]";
	}

}