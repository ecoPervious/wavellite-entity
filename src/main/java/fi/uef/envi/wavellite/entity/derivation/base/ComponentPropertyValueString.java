/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.derivation.ComponentPropertyValueVisitor;
import fi.uef.envi.wavellite.vocabulary.WEO;

/**
 * <p>
 * Title: ComponentPropertyValueString
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

public class ComponentPropertyValueString extends
		AbstractComponentPropertyValue {

	public ComponentPropertyValueString(String value) {
		this(UUID.randomUUID().toString(), value);
	}

	public ComponentPropertyValueString(String id, String value) {
		this(id, WEO.ComponentPropertyValueString, value);
	}

	public ComponentPropertyValueString(String id, String type, String value) {
		super(id, type, value);
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
	public String getValue() {
		return (String)super.getValue();
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

		ComponentPropertyValueString other = (ComponentPropertyValueString) obj;

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
		return "ComponentPropertyValueString [id = " + id + "; type = " + type
				+ "; value = " + value + "]";
	}

}
