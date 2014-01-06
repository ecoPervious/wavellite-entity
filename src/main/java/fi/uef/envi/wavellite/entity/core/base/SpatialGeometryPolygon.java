/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.UUID;

import com.vividsolutions.jts.geom.Polygon;

import fi.uef.envi.wavellite.entity.core.SpatialGeometryVisitor;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: SpatialGeometryPolygon
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

public class SpatialGeometryPolygon extends AbstractSpatialGeometry {

	public SpatialGeometryPolygon() {
		this(UUID.randomUUID().toString());
	}

	public SpatialGeometryPolygon(Polygon geometry) {
		this(UUID.randomUUID().toString(), geometry);
	}

	public SpatialGeometryPolygon(String id) {
		this(id, WTO.Polygon);
	}

	public SpatialGeometryPolygon(String id, Polygon geometry) {
		this(id, WTO.Polygon, geometry);
	}

	public SpatialGeometryPolygon(String id, String type) {
		super(id, type);
	}

	public SpatialGeometryPolygon(String id, String type, Polygon geometry) {
		super(id, type, geometry);
	}

	public void accept(SpatialGeometryVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public Polygon getGeometry() {
		return (Polygon) geometry;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result
				+ ((geometry == null) ? 0 : geometry.hashCode());

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

		SpatialGeometryPolygon other = (SpatialGeometryPolygon) obj;

		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;

		if (geometry == null) {
			if (other.geometry != null)
				return false;
		} else if (!geometry.equals(other.geometry))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "SpatialGeometryPolygon [id = " + id + "; type = " + type
				+ "; geometry = " + geometry + "]";
	}
}
