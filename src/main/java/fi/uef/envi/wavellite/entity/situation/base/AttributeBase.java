/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.situation.Attribute;
import fi.uef.envi.wavellite.entity.situation.AttributeValue;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: AttributeBase
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

public class AttributeBase extends AbstractEntity implements Attribute {

	private AttributeValue value;

	public AttributeBase() {
		this(UUID.randomUUID().toString());
	}

	public AttributeBase(AttributeValue value) {
		this(UUID.randomUUID().toString(), value);
	}

	public AttributeBase(String id) {
		this(id, STO.Attribute);
	}

	public AttributeBase(String id, AttributeValue value) {
		this(id, STO.Attribute, value);
	}

	public AttributeBase(String id, String type) {
		super(id, type);
	}

	public AttributeBase(String id, String type, AttributeValue value) {
		this(id, type);

		this.value = value;
	}

	@Override
	public AttributeValue getAttributeValue() {
		return value;
	}

	@Override
	public void setAttributeValue(AttributeValue value) {
		this.value = value;
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

		AttributeBase other = (AttributeBase) obj;

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
		return "AttributeBase [id = " + id + "; type = " + type + "; value = "
				+ value + "]";
	}

}
