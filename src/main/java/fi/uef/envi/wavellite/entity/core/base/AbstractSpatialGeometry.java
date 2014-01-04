/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.UUID;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.WKTWriter;
import com.vividsolutions.jts.io.gml2.GMLWriter;

import fi.uef.envi.wavellite.entity.core.SpatialGeometry;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: AbstractSpatialGeometry
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

public abstract class AbstractSpatialGeometry extends AbstractEntity implements
		SpatialGeometry {

	protected Geometry geometry;
	private WKTWriter wktWriter = new WKTWriter();
	private GMLWriter gmlWriter = new GMLWriter();

	public AbstractSpatialGeometry() {
		this(UUID.randomUUID().toString());
	}

	public AbstractSpatialGeometry(String id) {
		this(id, WTO.SpatialGeometry);
	}

	public AbstractSpatialGeometry(String id, String type) {
		super(id, type);
	}

	public AbstractSpatialGeometry(String id, String type, Geometry geometry) {
		super(id, type);
		
		this.geometry = geometry;
	}

	@Override
	public Geometry getGeometry() {
		return geometry;
	}
	
	@Override
	public String getGeometryAsWKT() {
		if (geometry == null)
			return null;
		
		return wktWriter.writeFormatted(geometry);
	}
	
	@Override
	public String getGeometryAsGML() {
		if (geometry == null)
			return null;
		
		return gmlWriter.write(geometry);
	}

}
