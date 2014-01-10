/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.SpatialLocation;
import fi.uef.envi.wavellite.entity.situation.RelevantObjectVisitor;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: RelevantIndividualSpatialLocation
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

public class RelevantObjectSpatialLocation extends AbstractRelevantObject {

	private SpatialLocation location;

	public RelevantObjectSpatialLocation() {
		this(UUID.randomUUID().toString());
	}

	public RelevantObjectSpatialLocation(SpatialLocation location) {
		this(UUID.randomUUID().toString(), location);
	}

	public RelevantObjectSpatialLocation(String id) {
		this(id, WOE.SpatialLocation);
	}

	public RelevantObjectSpatialLocation(String id, SpatialLocation location) {
		this(id, WOE.SpatialLocation, location);
	}

	public RelevantObjectSpatialLocation(String id, String type) {
		super(id, type);
	}

	public RelevantObjectSpatialLocation(String id, String type,
			SpatialLocation location) {
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

		RelevantObjectSpatialLocation other = (RelevantObjectSpatialLocation) obj;

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
		return "RelevantObjectSpatialLocation [id = " + id + "; type = "
				+ type + "; location = " + location + "]";
	}

}
