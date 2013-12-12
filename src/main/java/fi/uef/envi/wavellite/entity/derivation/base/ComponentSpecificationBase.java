/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.derivation.ComponentProperty;
import fi.uef.envi.wavellite.entity.derivation.ComponentSpecification;
import fi.uef.envi.wavellite.vocabulary.QB;

/**
 * <p>
 * Title: ComponentSpecificationBase
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

public class ComponentSpecificationBase extends AbstractEntity implements
		ComponentSpecification {

	private int order;
	private boolean componentRequired;
	private ComponentProperty componentProperty;

	public ComponentSpecificationBase() {
		this(UUID.randomUUID().toString());
	}

	public ComponentSpecificationBase(String id) {
		this(id, QB.ComponentSpecification);
	}

	public ComponentSpecificationBase(String id, String type) {
		super(id, type);
	}

	@Override
	public void setComponentProperty(ComponentProperty property) {
		if (property == null)
			throw new NullPointerException("[property = null]");

		this.componentProperty = property;
		this.order = 0;
		this.componentRequired = false;
	}

	@Override
	public ComponentProperty getComponentProperty() {
		return componentProperty;
	}

	@Override
	public int getOrder() {
		return order;
	}

	@Override
	public void setOrder(int order) {
		this.order = order;
	}

	@Override
	public void setComponentRequired(boolean required) {
		componentRequired = required;
	}

	@Override
	public boolean isComponentRequired() {
		return componentRequired;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime
				* result
				+ ((componentProperty == null) ? 0 : componentProperty
						.hashCode());
		result = prime * result + order;

		if (componentRequired)
			result = prime * result + 1;

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

		ComponentSpecificationBase other = (ComponentSpecificationBase) obj;

		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;

		if (componentProperty == null) {
			if (other.componentProperty != null)
				return false;
		} else if (!componentProperty.equals(other.componentProperty))
			return false;

		if (order != other.order)
			return false;

		if (componentRequired != other.componentRequired)
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "ComponentSpecificationBase [id = " + id + "; type = " + type
				+ "; componentProperty = " + componentProperty + "; order = "
				+ order + "; componentRequired = " + componentRequired + "]";
	}

}
