/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.UUID;

import org.joda.time.Period;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.situation.RelevantObjectVisitor;
import fi.uef.envi.wavellite.entity.situation.ValueVisitor;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: ValuePeriod
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

public class ValuePeriod extends AbstractValue {

	public ValuePeriod() {
		this(UUID.randomUUID().toString());
	}

	public ValuePeriod(Period period) {
		this(UUID.randomUUID().toString(), period);
	}

	public ValuePeriod(String id) {
		this(id, STO.Value);
	}

	public ValuePeriod(String id, Period period) {
		this(id, STO.Value, period);
	}

	public ValuePeriod(String id, String type) {
		super(id, type);
	}

	public ValuePeriod(String id, String type, Period period) {
		super(id, type, period);
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
	public Period getValue() {
		return (Period) value;
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

		ValuePeriod other = (ValuePeriod) obj;

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
		return "AttributeValuePeriod [id = " + id + "; type = " + type
				+ "; value = " + value + "]";
	}

}
