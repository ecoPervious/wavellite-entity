/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core;

import java.util.Map;
import java.util.Random;

import org.joda.time.DateTime;

import fi.uef.envi.wavellite.entity.core.base.FeatureBase;
import fi.uef.envi.wavellite.entity.core.base.PropertyBase;
import fi.uef.envi.wavellite.entity.core.base.SensorBase;
import fi.uef.envi.wavellite.entity.core.base.TemporalLocationDateTime;
import fi.uef.envi.wavellite.entity.derivation.ComponentProperty;
import fi.uef.envi.wavellite.entity.derivation.ComponentPropertyValue;
import fi.uef.envi.wavellite.entity.derivation.Dataset;
import fi.uef.envi.wavellite.entity.derivation.DatasetObservation;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyBase;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueDouble;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueTemporalLocation;
import fi.uef.envi.wavellite.entity.derivation.base.DatasetBase;
import fi.uef.envi.wavellite.entity.derivation.base.DatasetObservationBase;
import fi.uef.envi.wavellite.entity.measurement.MeasurementResult;
import fi.uef.envi.wavellite.entity.measurement.MeasurementValue;
import fi.uef.envi.wavellite.entity.measurement.MeasurementValueContext;
import fi.uef.envi.wavellite.entity.measurement.base.MeasurementResultBase;
import fi.uef.envi.wavellite.entity.measurement.base.MeasurementValueContextBase;
import fi.uef.envi.wavellite.entity.measurement.base.MeasurementValueDouble;

/**
 * <p>
 * Title: EntityFactory
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

public class EntityFactory {

	public static MeasurementValue measurementValue() {
		return new MeasurementValueDouble(new Random().nextDouble());
	}

	public static MeasurementValue measurementValue(Double value) {
		return new MeasurementValueDouble(value);
	}

	public static Sensor sensor(String id) {
		return new SensorBase(id);
	}

	public static Property property(String id) {
		return new PropertyBase(id);
	}

	public static Feature feature(String id) {
		return new FeatureBase(id);
	}

	public static TemporalLocation temporalLocation() {
		return new TemporalLocationDateTime();
	}

	public static TemporalLocation temporalLocation(DateTime time) {
		return new TemporalLocationDateTime(time);
	}

	public static MeasurementValueContext measurementValueContext(
			Sensor sensor, Property property, Feature feature,
			TemporalLocation time) {
		return new MeasurementValueContextBase(sensor, property, feature, time);
	}

	public static MeasurementResult measurementResult(MeasurementValue value,
			MeasurementValueContext context) {
		return new MeasurementResultBase(value, context);
	}

	public static Dataset dataset(String id) {
		return new DatasetBase(id);
	}

	public static DatasetObservation datasetObservation(Dataset dataset,
			Map<ComponentProperty, ComponentPropertyValue> components) {
		DatasetObservation ret = new DatasetObservationBase();

		ret.setDataset(dataset);

		for (Map.Entry<ComponentProperty, ComponentPropertyValue> entry : components
				.entrySet()) {
			ret.addComponentProperty(entry.getKey(), entry.getValue());
		}

		return ret;
	}

	public static ComponentProperty componentProperty(String id) {
		return new ComponentPropertyBase(id);
	}

	public static ComponentPropertyValue componentPropertyValue(Double value) {
		return new ComponentPropertyValueDouble(value);
	}

	public static ComponentPropertyValue componentPropertyValue(DateTime value) {
		return new ComponentPropertyValueTemporalLocation(
				new TemporalLocationDateTime(value));
	}

}
