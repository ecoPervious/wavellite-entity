/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.UUID;

import com.vividsolutions.jts.geom.Point;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.SpatialGeometryVisitor;
import fi.uef.envi.wavellite.vocabulary.SF;

/**
 * <p>
 * Title: SpatialGeometryPoint
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

public class SpatialGeometryPoint extends AbstractSpatialGeometry {

	public SpatialGeometryPoint() {
		this(UUID.randomUUID().toString());
	}

	public SpatialGeometryPoint(Point geometry) {
		this(UUID.randomUUID().toString(), geometry);
	}

	public SpatialGeometryPoint(String id) {
		this(id, SF.Point);
	}

	public SpatialGeometryPoint(String id, Point geometry) {
		this(id, SF.Point, geometry);
	}

	public SpatialGeometryPoint(String id, String type) {
		super(id, type);
	}

	public SpatialGeometryPoint(String id, String type, Point geometry) {
		super(id, type, geometry);
	}

	@Override
	public void accept(SpatialGeometryVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public Point getGeometry() {
		return (Point) geometry;
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

		SpatialGeometryPoint other = (SpatialGeometryPoint) obj;

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
		return "SpatialGeometryPoint [id = " + id + "; type = " + type
				+ "; geometry = " + geometry + "]";
	}
}
