/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.UUID;

import com.vividsolutions.jts.geom.LineString;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.SpatialGeometryVisitor;
import fi.uef.envi.wavellite.vocabulary.SF;

/**
 * <p>
 * Title: SpatialGeometryLineString
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

public class SpatialGeometryLineString extends AbstractSpatialGeometry {

	private static final long serialVersionUID = 4020988360733927318L;

	public SpatialGeometryLineString() {
		this(UUID.randomUUID().toString());
	}

	public SpatialGeometryLineString(LineString geometry) {
		this(UUID.randomUUID().toString(), geometry);
	}

	public SpatialGeometryLineString(String id) {
		this(id, SF.LineString);
	}

	public SpatialGeometryLineString(String id, LineString geometry) {
		this(id, SF.LineString, geometry);
	}

	public SpatialGeometryLineString(String id, String type) {
		super(id, type);
	}

	public SpatialGeometryLineString(String id, String type, LineString geometry) {
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
	public LineString getValue() {
		return (LineString) value;
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

		SpatialGeometryLineString other = (SpatialGeometryLineString) obj;

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
		return "SpatialGeometryLineString [id = " + id + "; type = " + type
				+ "; geometry = " + value + "]";
	}
}
