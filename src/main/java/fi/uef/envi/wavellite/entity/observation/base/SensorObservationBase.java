/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.observation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.Feature;
import fi.uef.envi.wavellite.entity.core.Property;
import fi.uef.envi.wavellite.entity.core.Sensor;
import fi.uef.envi.wavellite.entity.core.SpatialLocation;
import fi.uef.envi.wavellite.entity.core.TemporalLocation;
import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.observation.SensorObservation;
import fi.uef.envi.wavellite.entity.observation.SensorOutput;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: SensorObservationBase
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

public class SensorObservationBase extends AbstractEntity implements
		SensorObservation {

	private Sensor sensor;
	private Feature feature;
	private Property property;
	private SensorOutput output;
	private TemporalLocation temporalLocation;
	private SpatialLocation spatialLocation;

	public SensorObservationBase() {
		this(UUID.randomUUID().toString());
	}

	public SensorObservationBase(String id) {
		this(id, WTO.SensorObservation);
	}

	public SensorObservationBase(String id, String type) {
		super(id, type);
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
	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	@Override
	public void setProperty(Property property) {
		this.property = property;
	}

	@Override
	public void setSensorOutput(SensorOutput output) {
		this.output = output;
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
	public Sensor getSensor() {
		return sensor;
	}

	@Override
	public Feature getFeature() {
		return feature;
	}

	@Override
	public Property getProperty() {
		return property;
	}

	@Override
	public SensorOutput getSensorOutput() {
		return output;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((sensor == null) ? 0 : sensor.hashCode());
		result = prime * result
				+ ((property == null) ? 0 : property.hashCode());
		result = prime * result + ((feature == null) ? 0 : feature.hashCode());
		result = prime * result + ((output == null) ? 0 : output.hashCode());
		result = prime
				* result
				+ ((temporalLocation == null) ? 0 : temporalLocation.hashCode());
		result = prime * result
				+ ((spatialLocation == null) ? 0 : spatialLocation.hashCode());

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

		SensorObservationBase other = (SensorObservationBase) obj;

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

		if (output == null) {
			if (other.output != null)
				return false;
		} else if (!output.equals(other.output))
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

		return true;
	}

	@Override
	public String toString() {
		return "SensorObservationBase [id = " + id + "; type = " + type
				+ "; sensor = " + sensor + "; property = " + property
				+ "; feature = " + feature + "; output = " + output
				+ "; temporalLocation = " + temporalLocation
				+ "; spatialLocation = " + spatialLocation + "]";
	}

}
