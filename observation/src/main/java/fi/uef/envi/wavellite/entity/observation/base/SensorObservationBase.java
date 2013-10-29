/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.observation.base;

import java.util.UUID;

import fi.uef.envi.wavellite.entity.common.Feature;
import fi.uef.envi.wavellite.entity.common.Property;
import fi.uef.envi.wavellite.entity.common.Sensor;
import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.observation.SensorObservation;
import fi.uef.envi.wavellite.vocabulary.WO;

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

	public SensorObservationBase() {
		this(WO.SensorObservation);
	}

	public SensorObservationBase(String type) {
		this(UUID.randomUUID().toString(), type);
	}

	public SensorObservationBase(String id, String type) {
		super(id, type);
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((sensor == null) ? 0 : sensor.hashCode());
		result = prime * result
				+ ((property == null) ? 0 : property.hashCode());
		result = prime * result + ((feature == null) ? 0 : feature.hashCode());

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

		return true;
	}

	@Override
	public String toString() {
		return "SensorObservationBase [id = " + id + "; type = " + type
				+ "; sensor = " + sensor + "; property = " + property
				+ "; feature = " + feature + "]";
	}

}
