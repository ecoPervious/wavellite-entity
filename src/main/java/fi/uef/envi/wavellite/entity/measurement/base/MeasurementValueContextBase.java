/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.measurement.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.Feature;
import fi.uef.envi.wavellite.entity.core.Property;
import fi.uef.envi.wavellite.entity.core.Quality;
import fi.uef.envi.wavellite.entity.core.Sensor;
import fi.uef.envi.wavellite.entity.core.SpatialLocation;
import fi.uef.envi.wavellite.entity.core.TemporalLocation;
import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.measurement.MeasurementValueContext;
import fi.uef.envi.wavellite.vocabulary.WO;

/**
 * <p>
 * Title: MeasurementValueContextBase
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

public class MeasurementValueContextBase extends AbstractEntity implements
		MeasurementValueContext {

	private Sensor sensor;
	private Property property;
	private Feature feature;
	private TemporalLocation time;

	public MeasurementValueContextBase(Sensor sensor, Property property,
			Feature feature, TemporalLocation time) {
		this();

		setSensor(sensor);
		setProperty(property);
		setFeature(feature);
		setTemporalLocation(time);
	}

	public MeasurementValueContextBase() {
		this(UUID.randomUUID().toString());
	}

	public MeasurementValueContextBase(String id) {
		this(id, WO.MeasurementValueContext);
	}

	public MeasurementValueContextBase(String id, String type) {
		super(id, type);
	}

	@Override
	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	@Override
	public void setProperty(Property property) {
		this.property = property;
	}

	@Override
	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	@Override
	public void setTemporalLocation(TemporalLocation location) {
		this.time = location;
	}

	@Override
	public Sensor getSensor() {
		return sensor;
	}

	@Override
	public Property getProperty() {
		return property;
	}

	@Override
	public Feature getFeature() {
		return feature;
	}

	@Override
	public TemporalLocation getTemporalLocation() {
		return time;
	}

	@Override
	public SpatialLocation getSpatialLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Quality getQuality() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((sensor == null) ? 0 : sensor.hashCode());
		result = prime * result
				+ ((property == null) ? 0 : property.hashCode());
		result = prime * result + ((feature == null) ? 0 : feature.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());

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

		MeasurementValueContextBase other = (MeasurementValueContextBase) obj;

		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;

		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;

		if (sensor == null) {
			if (other.sensor != null)
				return false;
		} else if (!sensor.equals(other.sensor))
			return false;

		if (property == null) {
			if (other.property != null)
				return false;
		} else if (!property.equals(other.property))
			return false;

		if (feature == null) {
			if (other.feature != null)
				return false;
		} else if (!feature.equals(other.feature))
			return false;

		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "MeasurementContextBase [id = " + id + "; type = " + type
				+ "; sensor = " + sensor + "; property = " + property
				+ "; feature = " + feature + "; time = " + time + "]";
	}

}
