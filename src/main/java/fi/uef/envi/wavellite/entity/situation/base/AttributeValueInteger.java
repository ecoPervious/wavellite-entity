/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.situation.AttributeValueVisitor;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: AttributeValueInteger
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

public class AttributeValueInteger extends AbstractAttributeValue {

	public AttributeValueInteger() {
		this(UUID.randomUUID().toString());
	}

	public AttributeValueInteger(Integer value) {
		this(UUID.randomUUID().toString(), value);
	}

	public AttributeValueInteger(String id) {
		this(id, STO.Value);
	}
	
	public AttributeValueInteger(String id, Integer value) {
		this(id, STO.Value, value);
	}
	
	public AttributeValueInteger(String id, String type) {
		super(id, type);
	}

	public AttributeValueInteger(String id, String type, Integer value) {
		super(id, type, value);
	}

	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public Integer getValue() {
		return (Integer) value;
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

		AttributeValueInteger other = (AttributeValueInteger) obj;

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
		return "AttributeValueInteger [id = " + id + "; type = " + type
				+ "; value = " + value + "]";
	}

}
