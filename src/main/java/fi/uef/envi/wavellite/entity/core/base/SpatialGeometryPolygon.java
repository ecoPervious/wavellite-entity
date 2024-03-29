/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.UUID;

import com.vividsolutions.jts.geom.Polygon;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.SpatialGeometryVisitor;
import fi.uef.envi.wavellite.vocabulary.SF;

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

	private static final long serialVersionUID = 5166439266495837060L;

	public SpatialGeometryPolygon() {
		this(UUID.randomUUID().toString());
	}

	public SpatialGeometryPolygon(Polygon geometry) {
		this(UUID.randomUUID().toString(), geometry);
	}

	public SpatialGeometryPolygon(String id) {
		this(id, SF.Polygon);
	}

	public SpatialGeometryPolygon(String id, Polygon geometry) {
		this(id, SF.Polygon, geometry);
	}

	public SpatialGeometryPolygon(String id, String type) {
		super(id, type);
	}

	public SpatialGeometryPolygon(String id, String type, Polygon geometry) {
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
	public Polygon getValue() {
		return (Polygon) value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result
				+ ((value == null) ? 0 : value.hashCode());

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

		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "SpatialGeometryPolygon [id = " + id + "; type = " + type
				+ "; geometry = " + value + "]";
	}
}
