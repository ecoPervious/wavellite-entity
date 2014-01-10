/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.SpatialGeometry;
import fi.uef.envi.wavellite.entity.core.SpatialLocationVisitor;
import fi.uef.envi.wavellite.vocabulary.WEO;

/**
 * <p>
 * Title: SpatialLocationRegion
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Project: Wavellite Entity
 * </p>
 * <p>
 * Copyright: Copyright (C) 2014
 * </p>
 * 
 * @author Markus Stocker
 */

public class SpatialLocationRegion extends AbstractSpatialLocation {

	private SpatialGeometry spatialGeometry;

	public SpatialLocationRegion() {
		this(UUID.randomUUID().toString());
	}

	public SpatialLocationRegion(SpatialGeometry geometry) {
		this(UUID.randomUUID().toString(), geometry);
	}

	public SpatialLocationRegion(String id) {
		this(id, WEO.SpatialRegion);
	}

	public SpatialLocationRegion(String id, SpatialGeometry geometry) {
		this(id, WEO.SpatialRegion, geometry);
	}

	public SpatialLocationRegion(String id, String type) {
		super(id, type);
	}

	public SpatialLocationRegion(String id, String type, SpatialGeometry geometry) {
		super(id, type);

		this.spatialGeometry = geometry;
	}

	public SpatialGeometry getSpatialGeometry() {
		return spatialGeometry;
	}

	@Override
	public void accept(SpatialLocationVisitor visitor) {
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
				+ ((spatialGeometry == null) ? 0 : spatialGeometry.hashCode());

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

		SpatialLocationRegion other = (SpatialLocationRegion) obj;

		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;

		if (spatialGeometry == null) {
			if (other.spatialGeometry != null)
				return false;
		} else if (!spatialGeometry.equals(other.spatialGeometry))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "SpatialLocationRegion [id = " + id + "; type = " + type
				+ "; spatialGeometry = " + spatialGeometry + "]";
	}

}
