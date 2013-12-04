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
import fi.uef.envi.wavellite.entity.derivation.Component;
import fi.uef.envi.wavellite.entity.derivation.ComponentProperty;
import fi.uef.envi.wavellite.entity.derivation.ComponentPropertyValue;
import fi.uef.envi.wavellite.entity.derivation.Dataset;
import fi.uef.envi.wavellite.entity.derivation.DatasetObservation;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentBase;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyBase;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyDomain;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyRange;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueDouble;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueInteger;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueTemporalLocation;
import fi.uef.envi.wavellite.entity.derivation.base.DatasetBase;
import fi.uef.envi.wavellite.entity.derivation.base.DatasetObservationBase;
import fi.uef.envi.wavellite.entity.measurement.MeasurementResult;
import fi.uef.envi.wavellite.entity.measurement.MeasurementValue;
import fi.uef.envi.wavellite.entity.measurement.MeasurementValueContext;
import fi.uef.envi.wavellite.entity.measurement.base.MeasurementResultBase;
import fi.uef.envi.wavellite.entity.measurement.base.MeasurementValueContextBase;
import fi.uef.envi.wavellite.entity.measurement.base.MeasurementValueDouble;
import fi.uef.envi.wavellite.entity.situation.Attribute;
import fi.uef.envi.wavellite.entity.situation.AttributeValue;
import fi.uef.envi.wavellite.entity.situation.ElementaryInfon;
import fi.uef.envi.wavellite.entity.situation.Polarity;
import fi.uef.envi.wavellite.entity.situation.Relation;
import fi.uef.envi.wavellite.entity.situation.RelevantIndividual;
import fi.uef.envi.wavellite.entity.situation.RelevantObject;
import fi.uef.envi.wavellite.entity.situation.Situation;
import fi.uef.envi.wavellite.entity.situation.base.AttributeBase;
import fi.uef.envi.wavellite.entity.situation.base.AttributeValueDouble;
import fi.uef.envi.wavellite.entity.situation.base.AttributeValueString;
import fi.uef.envi.wavellite.entity.situation.base.AttributeValueTemporalLocation;
import fi.uef.envi.wavellite.entity.situation.base.ElementaryInfonBase;
import fi.uef.envi.wavellite.entity.situation.base.RelationBase;
import fi.uef.envi.wavellite.entity.situation.base.RelevantIndividualBase;
import fi.uef.envi.wavellite.entity.situation.base.SituationBase;
import fi.uef.envi.wavellite.vocabulary.QB;
import fi.uef.envi.wavellite.vocabulary.SDMX;

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
			ret.addComponent(entry.getKey(), entry.getValue());
		}

		return ret;
	}

	public static Component component(int year, int month, int day, int hour,
			int min, int sec) {
		return component(new DateTime(year, month, day, hour, min, sec));
	}

	public static Component component(DateTime value) {
		return component(componentPropertyTimePeriod(), value);
	}

	public static Component component(String id, DateTime value) {
		return component(componentProperty(id), value);
	}

	public static Component component(ComponentProperty property, DateTime value) {
		return component(property, componentPropertyValue(value));
	}

	public static Component component(String id, Double value) {
		return component(componentProperty(id), value);
	}

	public static Component component(ComponentProperty property, Double value) {
		return component(property, componentPropertyValue(value));
	}

	public static Component component(String id, Integer value) {
		return component(componentProperty(id), value);
	}

	public static Component component(ComponentProperty property, Integer value) {
		return component(property, componentPropertyValue(value));
	}

	public static Component component(ComponentProperty property,
			ComponentPropertyValue value) {
		return new ComponentBase(property, value);
	}

	public static ComponentProperty componentProperty(String id) {
		return new ComponentPropertyBase(id);
	}

	public static ComponentPropertyDomain componentPropertyDomain(String id) {
		return new ComponentPropertyDomain(id);
	}

	public static ComponentPropertyRange componentPropertyRange(String id) {
		return new ComponentPropertyRange(id);
	}

	public static ComponentPropertyDomain componentPropertyTimePeriod() {
		return new ComponentPropertyDomain(SDMX.Dimension.timePeriod,
				QB.DimensionProperty);
	}

	public static ComponentPropertyValue componentPropertyValue(Double value) {
		return new ComponentPropertyValueDouble(value);
	}

	public static ComponentPropertyValue componentPropertyValue(Integer value) {
		return new ComponentPropertyValueInteger(value);
	}

	public static ComponentPropertyValue componentPropertyValue(DateTime value) {
		return componentPropertyValue(new TemporalLocationDateTime(value));
	}

	public static ComponentPropertyValue componentPropertyValue(
			TemporalLocation location) {
		return new ComponentPropertyValueTemporalLocation(location);
	}

	public static Situation situation(ElementaryInfon... infons) {
		return new SituationBase(infons);
	}

	public static ElementaryInfon elementaryInfon(Relation relation,
			Polarity polarity, RelevantObject... objects) {
		return new ElementaryInfonBase(relation, polarity, objects);
	}

	public static Relation relation(String id) {
		return new RelationBase(id);
	}

	public static RelevantIndividual relevantIndividual(Attribute... attributes) {
		return new RelevantIndividualBase(attributes);
	}

	public static RelevantIndividual relevantIndividual(Double value) {
		return relevantIndividual(attribute(attributeValue(value)));
	}

	public static RelevantIndividual relevantIndividual(String value) {
		return relevantIndividual(attribute(attributeValue(value)));
	}

	public static RelevantIndividual relevantIndividual(
			TemporalLocation location) {
		return relevantIndividual(attribute(attributeValue(location)));
	}

	public static RelevantIndividual relevantIndividual(DateTime time) {
		return relevantIndividual(attribute(attributeValue(time)));
	}

	public static Attribute attribute(AttributeValue value) {
		return new AttributeBase(value);
	}

	public static AttributeValue attributeValue(Double value) {
		return new AttributeValueDouble(value);
	}

	public static AttributeValue attributeValue(String value) {
		return new AttributeValueString(value);
	}

	public static AttributeValue attributeValue(DateTime time) {
		return new AttributeValueTemporalLocation(temporalLocation(time));
	}

	public static AttributeValue attributeValue(TemporalLocation location) {
		return new AttributeValueTemporalLocation(location);
	}

}
