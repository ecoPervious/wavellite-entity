/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.situation.Value;
import fi.uef.envi.wavellite.entity.situation.AttributeVisitor;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: AttributeValue
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

public class AttributeValue extends AbstractAttribute {

	private static final long serialVersionUID = -4246633244475301142L;

	public AttributeValue() {
		this(UUID.randomUUID().toString());
	}

	public AttributeValue(Value value) {
		this(UUID.randomUUID().toString(), value);
	}

	public AttributeValue(String id) {
		this(id, STO.Attribute);
	}

	public AttributeValue(String id, Value value) {
		this(id, STO.Attribute, value);
	}

	public AttributeValue(String id, String type) {
		super(id, type);
	}

	public AttributeValue(String id, String type, Value value) {
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
	public Value getValue() {
		return (Value) value;
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

		AttributeValue other = (AttributeValue) obj;

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
		return "AttributeValue [id = " + id + "; type = " + type + "; name = "
				+ name + "; value = " + value + "]";
	}

}
