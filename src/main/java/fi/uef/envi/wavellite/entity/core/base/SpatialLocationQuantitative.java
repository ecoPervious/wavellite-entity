/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.UUID;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.WKTWriter;
import com.vividsolutions.jts.io.gml2.GMLWriter;

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

	private Geometry geometry;
	private GMLWriter gmlWriter = new GMLWriter();
	private WKTWriter wktWriter = new WKTWriter();

	public SpatialLocationQuantitative() {
		this(UUID.randomUUID().toString());
	}

	public SpatialLocationQuantitative(Geometry geometry) {
		this(UUID.randomUUID().toString(), geometry);
	}

	public SpatialLocationQuantitative(String id) {
		this(id, WTO.SpatialLocationQuantitative);
	}

	public SpatialLocationQuantitative(String id, Geometry geometry) {
		this(id, WTO.SpatialLocationQuantitative, geometry);
	}

	public SpatialLocationQuantitative(String id, String type) {
		super(id, type);
	}

	public SpatialLocationQuantitative(String id, String type, Geometry geometry) {
		super(id, type);

		setGeometry(geometry);
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public String getGeometryAsWKT() {
		return wktWriter.writeFormatted(geometry);
	}

	public String getGeometryAsGML() {
		return gmlWriter.write(geometry);
	}

	@Override
	public void accept(SpatialLocationVisitor visitor) {
		visitor.visit(this);
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

		SpatialLocationQuantitative other = (SpatialLocationQuantitative) obj;

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
		return "SpatialLocationQuantitative [id = " + id + "; type = " + type
				+ "; geometry = " + geometry + "]";
	}

}
