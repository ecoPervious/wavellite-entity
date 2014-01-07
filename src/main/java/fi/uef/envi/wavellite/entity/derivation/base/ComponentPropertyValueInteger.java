/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.derivation.ComponentPropertyValueVisitor;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: ComponentPropertyValueInteger
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

public class ComponentPropertyValueInteger extends
		AbstractComponentPropertyValue {

	public ComponentPropertyValueInteger() {
		this(UUID.randomUUID().toString());
	}

	public ComponentPropertyValueInteger(Integer value) {
		this(UUID.randomUUID().toString(), value);
	}

	public ComponentPropertyValueInteger(String id) {
		this(id, WTO.ComponentPropertyValueInteger);
	}

	public ComponentPropertyValueInteger(String id, Integer value) {
		this(id, WTO.ComponentPropertyValueInteger, value);
	}

	public ComponentPropertyValueInteger(String id, String type) {
		super(id, type);
	}

	public ComponentPropertyValueInteger(String id, String type, Integer value) {
		super(id, type, value);
	}

	@Override
	public Integer getValue() {
		return (Integer)super.getValue();
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

		ComponentPropertyValueInteger other = (ComponentPropertyValueInteger) obj;

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
		return "ComponentPropertyValueInteger [id = " + id + "; type = " + type
				+ "; value = " + value + "]";
	}

}
