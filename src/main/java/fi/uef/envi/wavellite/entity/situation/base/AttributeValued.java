/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.situation.AttributeValue;
import fi.uef.envi.wavellite.entity.situation.AttributeVisitor;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: AttributeValued
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

public class AttributeValued extends AbstractAttribute {

	public AttributeValued() {
		this(UUID.randomUUID().toString());
	}

	public AttributeValued(AttributeValue value) {
		this(UUID.randomUUID().toString(), value);
	}

	public AttributeValued(String id) {
		this(id, STO.Attribute);
	}

	public AttributeValued(String id, AttributeValue value) {
		this(id, STO.Attribute, value);
	}

	public AttributeValued(String id, String type) {
		super(id, type);
	}

	public AttributeValued(String id, String type, AttributeValue value) {
		super(id, type, value);
	}

	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public void accept(AttributeVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public AttributeValue getValue() {
		return (AttributeValue) value;
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

		AttributeValued other = (AttributeValued) obj;

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
		return "AttributeValued [id = " + id + "; type = " + type
				+ "; value = " + value + "]";
	}

}
