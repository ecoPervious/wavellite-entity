/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.UUID;

import org.joda.time.Interval;

import fi.uef.envi.wavellite.entity.core.TemporalLocationVisitor;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: TemporalLocationInterval
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

public class TemporalLocationInterval extends AbstractTemporalLocation {

	private TemporalLocationDateTime start;
	private TemporalLocationDateTime end;

	public TemporalLocationInterval(TemporalLocationDateTime start,
			TemporalLocationDateTime end) {
		this(UUID.randomUUID().toString(), start, end);
	}

	public TemporalLocationInterval(String id, TemporalLocationDateTime start,
			TemporalLocationDateTime end) {
		this(id, WTO.TemporalLocationInterval, start, end);
	}

	public TemporalLocationInterval(String id, String type,
			TemporalLocationDateTime start, TemporalLocationDateTime end) {
		super(id, type, new Interval(start.getValue(), end.getValue()));

		this.start = start;
		this.end = end;
	}

	@Override
	public Interval getValue() {
		return (Interval) value;
	}

	public TemporalLocationDateTime getStart() {
		return start;
	}

	public TemporalLocationDateTime getEnd() {
		return end;
	}

	@Override
	public void accept(TemporalLocationVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		result = prime * result + ((end == null) ? 0 : end.hashCode());

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

		TemporalLocationInterval other = (TemporalLocationInterval) obj;

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

		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;

		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "TemporalLocationInterval [id = " + id + "; type = " + type
				+ "; value = " + value + "; start = " + start + "; end = "
				+ end + "]";
	}

}
