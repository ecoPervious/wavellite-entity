/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.UUID;

import org.joda.time.DateTime;

import fi.uef.envi.wavellite.entity.core.TemporalLocation;
import fi.uef.envi.wavellite.entity.core.TemporalLocationVisitor;
import fi.uef.envi.wavellite.vocabulary.DUL;

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

public class TemporalLocationDateTime extends AbstractEntity implements
		TemporalLocation {

	private DateTime time;

	public TemporalLocationDateTime(DateTime time) {
		this(UUID.randomUUID().toString(), time);
	}

	public TemporalLocationDateTime(String id, DateTime time) {
		this(id, DUL.TimeInterval, time);
	}

	public TemporalLocationDateTime(String id, String type, DateTime time) {
		super(id, type);

		setDateTime(time);
	}

	public TemporalLocationDateTime() {
		this(UUID.randomUUID().toString());
	}

	public TemporalLocationDateTime(String id) {
		this(id, DUL.TimeInterval);
	}

	public TemporalLocationDateTime(String id, String type) {
		super(id, type);
	}

	public void setDateTime(DateTime time) {
		if (time == null)
			throw new NullPointerException("[time = null]");

		this.time = time;
	}

	public DateTime getDateTime() {
		return time;
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
		result = prime * result + ((time == null) ? 0 : time.hashCode());

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

		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "TemporalLocationDateTime [id = " + id + "; type = " + type
				+ "; time = " + time + "]";
	}

}
