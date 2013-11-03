/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.UUID;

import org.joda.time.DateTime;

import fi.uef.envi.wavellite.entity.core.TemporalLocationVisitor;
import fi.uef.envi.wavellite.vocabulary.WO;

/**
 * <p>
 * Title: TemporalLocationDateTime
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

public class TemporalLocationDateTime extends AbstractTemporalLocation {

	public TemporalLocationDateTime() {
		this(DateTime.now());
	}
	
	public TemporalLocationDateTime(DateTime value) {
		this(UUID.randomUUID().toString(), value);
	}
	
	public TemporalLocationDateTime(String id) {
		this(id, DateTime.now());
	}

	public TemporalLocationDateTime(String id, DateTime value) {
		this(id, WO.TemporalLocationDateTime, value);
	}

	public TemporalLocationDateTime(String id, String type) {
		this(id, type, DateTime.now());
	}
	
	public TemporalLocationDateTime(String id, String type, DateTime value) {
		super(id, type, value);
	}

	@Override
	public DateTime getValue() {
		return (DateTime)value;
	}

	@Override
	public void accept(TemporalLocationVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((id == null) ? 0 : id.hashCode());
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

		TemporalLocationDateTime other = (TemporalLocationDateTime) obj;

		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;

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
		return "TemporalLocationDateTime [id = " + id + "; type = " + type
				+ "; value = " + value + "]";
	}

}
