/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.measurement.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.Feature;
import fi.uef.envi.wavellite.entity.core.Property;
import fi.uef.envi.wavellite.entity.core.Quality;
import fi.uef.envi.wavellite.entity.core.Sensor;
import fi.uef.envi.wavellite.entity.core.SpatialLocation;
import fi.uef.envi.wavellite.entity.core.TemporalLocation;
import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.measurement.MeasurementValueContext;
import fi.uef.envi.wavellite.vocabulary.WOE;

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
	private TemporalLocation temporalLocation;
	private SpatialLocation spatialLocation;
	private Quality quality;

	public MeasurementValueContextBase() {
		this(UUID.randomUUID().toString());
	}

	public MeasurementValueContextBase(String id) {
		this(id, WOE.MeasurementValueContext);
	}

	public MeasurementValueContextBase(String id, String type) {
		super(id, type);
	}

	public MeasurementValueContextBase(Sensor sensor) {
		this(UUID.randomUUID().toString(), sensor);
	}

	public MeasurementValueContextBase(String id, Sensor sensor) {
		this(UUID.randomUUID().toString(), WOE.MeasurementValueContext, sensor);
	}

	public MeasurementValueContextBase(String id, String type, Sensor sensor) {
		this(id, type, sensor, null);
	}

	public MeasurementValueContextBase(Sensor sensor, Property property) {
		this(UUID.randomUUID().toString(), sensor, property);
	}

	public MeasurementValueContextBase(String id, Sensor sensor,
			Property property) {
		this(UUID.randomUUID().toString(), WOE.MeasurementValueContext, sensor,
				property);
	}

	public MeasurementValueContextBase(String id, String type, Sensor sensor,
			Property property) {
		this(id, type, sensor, property, null);
	}

	public MeasurementValueContextBase(Sensor sensor, Property property,
			Feature feature) {
		this(UUID.randomUUID().toString(), sensor, property, feature);
	}

	public MeasurementValueContextBase(String id, Sensor sensor,
			Property property, Feature feature) {
		this(UUID.randomUUID().toString(), WOE.MeasurementValueContext, sensor,
				property, feature);
	}

	public MeasurementValueContextBase(String id, String type, Sensor sensor,
			Property property, Feature feature) {
		this(id, type, sensor, property, feature, null);
	}

	public MeasurementValueContextBase(Sensor sensor, Property property,
			Feature feature, TemporalLocation temporalLocation) {
		this(UUID.randomUUID().toString(), sensor, property, feature,
				temporalLocation);
	}

	public MeasurementValueContextBase(String id, Sensor sensor,
			Property property, Feature feature,
			TemporalLocation temporalLocation) {
		this(UUID.randomUUID().toString(), WOE.MeasurementValueContext, sensor,
				property, feature, temporalLocation);
	}

	public MeasurementValueContextBase(String id, String type, Sensor sensor,
			Property property, Feature feature,
			TemporalLocation temporalLocation) {
		this(id, type, sensor, property, feature, temporalLocation, null);
	}

	public MeasurementValueContextBase(Sensor sensor, Property property,
			Feature feature, TemporalLocation temporalLocation,
			SpatialLocation spatialLocation) {
		this(UUID.randomUUID().toString(), sensor, property, feature,
				temporalLocation, spatialLocation);
	}

	public MeasurementValueContextBase(String id, Sensor sensor,
			Property property, Feature feature,
			TemporalLocation temporalLocation, SpatialLocation spatialLocation) {
		this(UUID.randomUUID().toString(), WOE.MeasurementValueContext, sensor,
				property, feature, temporalLocation, spatialLocation);
	}

	public MeasurementValueContextBase(String id, String type, Sensor sensor,
			Property property, Feature feature,
			TemporalLocation temporalLocation, SpatialLocation spatialLocation) {
		this(id, type, sensor, property, feature, temporalLocation,
				spatialLocation, null);
	}

	public MeasurementValueContextBase(Sensor sensor, Property property,
			Feature feature, TemporalLocation temporalLocation,
			SpatialLocation spatialLocation, Quality quality) {
		this(UUID.randomUUID().toString(), sensor, property, feature,
				temporalLocation, spatialLocation, quality);
	}

	public MeasurementValueContextBase(String id, Sensor sensor,
			Property property, Feature feature,
			TemporalLocation temporalLocation, SpatialLocation spatialLocation,
			Quality quality) {
		this(UUID.randomUUID().toString(), WOE.MeasurementValueContext, sensor,
				property, feature, temporalLocation, spatialLocation, quality);
	}

	public MeasurementValueContextBase(String id, String type, Sensor sensor,
			Property property, Feature feature,
			TemporalLocation temporalLocation, SpatialLocation spatialLocation,
			Quality quality) {
		super(id, type);
		
		setSensor(sensor);
		setProperty(property);
		setFeature(feature);
		setTemporalLocation(temporalLocation);
		setSpatialLocation(spatialLocation);
		setQuality(quality);
	}

	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
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
		this.temporalLocation = location;
	}

	@Override
	public void setSpatialLocation(SpatialLocation location) {
		this.spatialLocation = location;
	}

	@Override
	public void setQuality(Quality quality) {
		this.quality = quality;
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
		return temporalLocation;
	}

	@Override
	public SpatialLocation getSpatialLocation() {
		return spatialLocation;
	}

	@Override
	public Quality getQuality() {
		return quality;
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
		result = prime
				* result
				+ ((temporalLocation == null) ? 0 : temporalLocation.hashCode());
		result = prime * result
				+ ((spatialLocation == null) ? 0 : spatialLocation.hashCode());
		result = prime * result + ((quality == null) ? 0 : quality.hashCode());

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

		if (temporalLocation == null) {
			if (other.temporalLocation != null)
				return false;
		} else if (!temporalLocation.equals(other.temporalLocation))
			return false;

		if (spatialLocation == null) {
			if (other.spatialLocation != null)
				return false;
		} else if (!spatialLocation.equals(other.spatialLocation))
			return false;

		if (quality == null) {
			if (other.quality != null)
				return false;
		} else if (!quality.equals(other.quality))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "MeasurementContextBase [id = " + id + "; type = " + type
				+ "; sensor = " + sensor + "; property = " + property
				+ "; feature = " + feature + "; temporalLocation = "
				+ temporalLocation + "; spatialLocation = " + spatialLocation
				+ "; quality = " + quality + "]";
	}

}
