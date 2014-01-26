/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.UUID;

import org.openrdf.model.URI;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.situation.RelevantObjectVisitor;
import fi.uef.envi.wavellite.entity.situation.ValueVisitor;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: ValueUri
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

public class ValueUri extends AbstractValue {

	public ValueUri() {
		this(UUID.randomUUID().toString());
	}

	public ValueUri(String id) {
		this(id, STO.Value);
	}
	
	public ValueUri(URI value) {
		this(UUID.randomUUID().toString(), value);
	}

	public ValueUri(String id, URI value) {
		this(id, STO.Value, value);
	}

	public ValueUri(String id, String type) {
		super(id, type);
	}
	
	public ValueUri(String id, String type, URI value) {
		super(id, type, value);
	}

	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public void accept(RelevantObjectVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public void accept(ValueVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public URI getValue() {
		return (URI) value;
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

		ValueUri other = (ValueUri) obj;

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
		return "ValueUri [id = " + id + "; type = " + type
				+ "; value = " + value + "]";
	}

}
