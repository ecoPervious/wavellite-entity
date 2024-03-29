/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.TemporalLocation;
import fi.uef.envi.wavellite.entity.derivation.ComponentPropertyValueVisitor;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: ComponentPropertyValueTemporalLocation
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

public class ComponentPropertyValueTemporalLocation extends
		AbstractComponentPropertyValue {

	private static final long serialVersionUID = 5707275584740427938L;

	public ComponentPropertyValueTemporalLocation() {
		this(UUID.randomUUID().toString());
	}

	public ComponentPropertyValueTemporalLocation(TemporalLocation value) {
		this(UUID.randomUUID().toString(), value);
	}

	public ComponentPropertyValueTemporalLocation(String id) {
		this(id, WOE.ComponentPropertyValue);
	}

	public ComponentPropertyValueTemporalLocation(String id,
			TemporalLocation value) {
		this(id, WOE.ComponentPropertyValue, value);
	}

	public ComponentPropertyValueTemporalLocation(String id, String type) {
		super(id, type);
	}

	public ComponentPropertyValueTemporalLocation(String id, String type,
			TemporalLocation value) {
		super(id, type, value);
	}

	@Override
	public TemporalLocation getValue() {
		return (TemporalLocation)value;
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

//		result = prime * result + ((id == null) ? 0 : id.hashCode());
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

		ComponentPropertyValueTemporalLocation other = (ComponentPropertyValueTemporalLocation) obj;

//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;

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
		return "ComponentPropertyValueTemporalLocation [id = " + id
				+ "; type = " + type + "; value = " + value + "]";
	}

}
