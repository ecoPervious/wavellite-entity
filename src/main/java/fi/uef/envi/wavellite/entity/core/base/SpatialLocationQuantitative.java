/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.SpatialGeometry;
import fi.uef.envi.wavellite.entity.core.SpatialLocationVisitor;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: SpatialLocationQualitative
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

public class SpatialLocationQuantitative extends AbstractSpatialLocation {

	private SpatialGeometry spatialGeometry;

	public SpatialLocationQuantitative() {
		this(UUID.randomUUID().toString());
	}

	public SpatialLocationQuantitative(SpatialGeometry geometry) {
		this(UUID.randomUUID().toString(), geometry);
	}

	public SpatialLocationQuantitative(String id) {
		this(id, WTO.SpatialLocationQuantitative);
	}

	public SpatialLocationQuantitative(String id, SpatialGeometry geometry) {
		this(id, WTO.SpatialLocationQuantitative, geometry);
	}

	public SpatialLocationQuantitative(String id, String type) {
		super(id, type);
	}

	public SpatialLocationQuantitative(String id, String type, SpatialGeometry geometry) {
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

		SpatialLocationQuantitative other = (SpatialLocationQuantitative) obj;

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
		return "SpatialLocationQuantitative [id = " + id + "; type = " + type
				+ "; spatialGeometry = " + spatialGeometry + "]";
	}

}
