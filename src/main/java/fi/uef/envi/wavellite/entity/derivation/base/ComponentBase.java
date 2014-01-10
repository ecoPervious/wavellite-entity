/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.derivation.Component;
import fi.uef.envi.wavellite.entity.derivation.ComponentProperty;
import fi.uef.envi.wavellite.entity.derivation.ComponentPropertyValue;
import fi.uef.envi.wavellite.vocabulary.WEO;

/**
 * <p>
 * Title: ComponentBase
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

public class ComponentBase extends AbstractEntity implements Component {

	private ComponentProperty property;
	private ComponentPropertyValue value;

	public ComponentBase() {
		this(UUID.randomUUID().toString());
	}

	public ComponentBase(ComponentProperty property,
			ComponentPropertyValue value) {
		this(UUID.randomUUID().toString(), property, value);
	}

	public ComponentBase(String id) {
		this(id, WEO.Component);
	}

	public ComponentBase(String id, ComponentProperty property,
			ComponentPropertyValue value) {
		this(id, WEO.Component, property, value);
	}

	public ComponentBase(String id, String type) {
		super(id, type);
	}

	public ComponentBase(String id, String type, ComponentProperty property,
			ComponentPropertyValue value) {
		super(id, type);

		setComponentProperty(property);
		setComponentPropertyValue(value);
	}

	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public void setComponentProperty(ComponentProperty property) {
		this.property = property;
	}

	@Override
	public void setComponentPropertyValue(ComponentPropertyValue value) {
		this.value = value;
	}

	@Override
	public ComponentProperty getComponentProperty() {
		return property;
	}

	@Override
	public ComponentPropertyValue getComponentPropertyValue() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

//		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result
				+ ((property == null) ? 0 : property.hashCode());
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

		ComponentBase other = (ComponentBase) obj;

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

		if (property == null) {
			if (other.property != null)
				return false;
		} else if (!property.equals(other.property))
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
		return "ComponentBase [id = " + id + "; type = " + type
				+ "; property = " + property + "; value = " + value + "]";
	}

}
