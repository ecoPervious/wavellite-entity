/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.io.IOException;
import java.util.UUID;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import com.vividsolutions.jts.io.WKTWriter;
import com.vividsolutions.jts.io.gml2.GMLReader;
import com.vividsolutions.jts.io.gml2.GMLWriter;

import fi.uef.envi.wavellite.entity.core.SpatialGeometry;
import fi.uef.envi.wavellite.vocabulary.SF;

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

	private static final long serialVersionUID = 1103769230679763300L;
	protected Geometry value;
	private WKTWriter wktWriter = new WKTWriter();
	private WKTReader wktReader = new WKTReader();
	private GMLWriter gmlWriter = new GMLWriter();
	private GMLReader gmlReader = new GMLReader();

	public AbstractSpatialGeometry() {
		this(UUID.randomUUID().toString());
	}

	public AbstractSpatialGeometry(String id) {
		this(id, SF.Geometry);
	}

	public AbstractSpatialGeometry(String id, String type) {
		super(id, type);
	}

	public AbstractSpatialGeometry(String id, String type, Geometry geometry) {
		super(id, type);

		this.value = geometry;
	}

	@Override
	public Geometry getValue() {
		return value;
	}
	
	@Override
	public void setValue(Geometry value) {
		this.value = value;
	}

	@Override
	public String getValueAsWKT() {
		if (value == null)
			return null;

		return wktWriter.writeFormatted(value);
	}

	@Override
	public String getValueAsGML() {
		if (value == null)
			return null;

		return gmlWriter.write(value);
	}

	@Override
	public void setValueAsWKT(String value) {
		if (value == null)
			return;

		try {
			this.value = wktReader.read(value);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void setValueAsGML(String value) {
		if (value == null)
			return;

		try {
			this.value = gmlReader.read(value, null);
		} catch (ParserConfigurationException | IOException | SAXException e) {
			throw new RuntimeException(e);
		}
	}

}
