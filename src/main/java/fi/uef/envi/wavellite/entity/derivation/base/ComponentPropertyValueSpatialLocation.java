/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.SpatialLocation;
import fi.uef.envi.wavellite.entity.derivation.ComponentPropertyValueVisitor;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: ComponentPropertyValueSpatialLocation
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

public class ComponentPropertyValueSpatialLocation extends
		AbstractComponentPropertyValue {

	private static final long serialVersionUID = 6332871355991832398L;

	public ComponentPropertyValueSpatialLocation() {
		this(UUID.randomUUID().toString());
	}

	public ComponentPropertyValueSpatialLocation(SpatialLocation value) {
		this(UUID.randomUUID().toString(), value);
	}

	public ComponentPropertyValueSpatialLocation(String id) {
		this(id, WOE.ComponentPropertyValue);
	}

	public ComponentPropertyValueSpatialLocation(String id,
			SpatialLocation value) {
		this(id, WOE.ComponentPropertyValue, value);
	}

	public ComponentPropertyValueSpatialLocation(String id, String type) {
		super(id, type);
	}

	public ComponentPropertyValueSpatialLocation(String id, String type,
			SpatialLocation value) {
		super(id, type, value);
	}

	@Override
	public SpatialLocation getValue() {
		return (SpatialLocation) value;
	}

	@Override
	public void accept(ComponentPropertyValueVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public void accept(EntityVisitor visitor) {
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

		ComponentPropertyValueSpatialLocation other = (ComponentPropertyValueSpatialLocation) obj;

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
		return "ComponentPropertyValueSpatialLocation [id = " + id
				+ "; type = " + type + "; value = " + value + "]";
	}

}
