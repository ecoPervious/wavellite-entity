/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.TemporalLocation;
import fi.uef.envi.wavellite.entity.situation.RelevantObjectVisitor;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: RelevantObjectTemporalLocation
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

public class RelevantObjectTemporalLocation extends AbstractRelevantObject {

	private TemporalLocation location;

	public RelevantObjectTemporalLocation() {
		this(UUID.randomUUID().toString());
	}

	public RelevantObjectTemporalLocation(TemporalLocation location) {
		this(UUID.randomUUID().toString(), location);
	}

	public RelevantObjectTemporalLocation(String id) {
		this(id, WOE.RelevantObject);
	}

	public RelevantObjectTemporalLocation(String id, TemporalLocation location) {
		this(id, WOE.RelevantObject, location);
	}

	public RelevantObjectTemporalLocation(String id, String type) {
		super(id, type);
	}

	public RelevantObjectTemporalLocation(String id, String type,
			TemporalLocation location) {
		this(id, type);

		this.location = location;
	}

	@Override
	public void accept(RelevantObjectVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}
	
	public TemporalLocation getValue() {
		return location;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());

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

		RelevantObjectTemporalLocation other = (RelevantObjectTemporalLocation) obj;

		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;

		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "RelevantObjectTemporalLocation [id = " + id + "; type = "
				+ type + "; location = " + location + "]";
	}

}
