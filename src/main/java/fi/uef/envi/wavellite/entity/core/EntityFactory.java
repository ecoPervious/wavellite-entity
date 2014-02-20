/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core;

import java.util.Random;
import java.util.Set;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.openrdf.model.URI;

import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;

import fi.uef.envi.wavellite.entity.core.base.FeatureBase;
import fi.uef.envi.wavellite.entity.core.base.PropertyBase;
import fi.uef.envi.wavellite.entity.core.base.SensorBase;
import fi.uef.envi.wavellite.entity.core.base.SpatialGeometryLineString;
import fi.uef.envi.wavellite.entity.core.base.SpatialGeometryPoint;
import fi.uef.envi.wavellite.entity.core.base.SpatialGeometryPolygon;
import fi.uef.envi.wavellite.entity.core.base.SpatialLocationPlace;
import fi.uef.envi.wavellite.entity.core.base.SpatialLocationRegion;
import fi.uef.envi.wavellite.entity.core.base.TemporalLocationDateTime;
import fi.uef.envi.wavellite.entity.core.base.TemporalLocationInterval;
import fi.uef.envi.wavellite.entity.derivation.Component;
import fi.uef.envi.wavellite.entity.derivation.ComponentProperty;
import fi.uef.envi.wavellite.entity.derivation.ComponentPropertyValue;
import fi.uef.envi.wavellite.entity.derivation.Dataset;
import fi.uef.envi.wavellite.entity.derivation.DatasetObservation;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentBase;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyBase;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyDimension;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyMeasure;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueDouble;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueInteger;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueSpatialLocation;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueString;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueTemporalLocation;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueUri;
import fi.uef.envi.wavellite.entity.derivation.base.DatasetBase;
import fi.uef.envi.wavellite.entity.derivation.base.DatasetObservationBase;
import fi.uef.envi.wavellite.entity.measurement.MeasurementResult;
import fi.uef.envi.wavellite.entity.measurement.MeasurementValue;
import fi.uef.envi.wavellite.entity.measurement.MeasurementValueContext;
import fi.uef.envi.wavellite.entity.measurement.base.MeasurementResultBase;
import fi.uef.envi.wavellite.entity.measurement.base.MeasurementValueContextBase;
import fi.uef.envi.wavellite.entity.measurement.base.MeasurementValueDouble;
import fi.uef.envi.wavellite.entity.observation.ObservationValue;
import fi.uef.envi.wavellite.entity.observation.SensorObservation;
import fi.uef.envi.wavellite.entity.observation.SensorOutput;
import fi.uef.envi.wavellite.entity.observation.base.ObservationValueDouble;
import fi.uef.envi.wavellite.entity.observation.base.SensorObservationBase;
import fi.uef.envi.wavellite.entity.observation.base.SensorOutputBase;
import fi.uef.envi.wavellite.entity.situation.Attribute;
import fi.uef.envi.wavellite.entity.situation.Value;
import fi.uef.envi.wavellite.entity.situation.ElementaryInfon;
import fi.uef.envi.wavellite.entity.situation.Polarity;
import fi.uef.envi.wavellite.entity.situation.Relation;
import fi.uef.envi.wavellite.entity.situation.RelevantIndividual;
import fi.uef.envi.wavellite.entity.situation.RelevantObject;
import fi.uef.envi.wavellite.entity.situation.Situation;
import fi.uef.envi.wavellite.entity.situation.base.AttributeRelevantIndividual;
import fi.uef.envi.wavellite.entity.situation.base.ValueDouble;
import fi.uef.envi.wavellite.entity.situation.base.AttributeSpatialLocation;
import fi.uef.envi.wavellite.entity.situation.base.ValuePeriod;
import fi.uef.envi.wavellite.entity.situation.base.ValueString;
import fi.uef.envi.wavellite.entity.situation.base.AttributeTemporalLocation;
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

	public static SensorOutput sensorOutput(ObservationValue value) {
		return new SensorOutputBase(value);
	}

	public static SensorOutput sensorOutput(Double output) {
		return sensorOutput(observationValue(output));
	}

	public static ObservationValue observationValue(Double output) {
		return new ObservationValueDouble(output);
	}

	public static TemporalLocation now() {
		return temporalLocation();
	}

	public static TemporalLocation temporalLocation() {
		return new TemporalLocationDateTime();
	}

	public static TemporalLocation temporalLocation(int year, int month,
			int day, int hour, int min, int sec) {
		return dateTime(year, month, day, hour, min, sec);
	}

	public static TemporalLocation temporalLocation(DateTime time) {
		return new TemporalLocationDateTime(time);
	}

	public static TemporalLocationDateTime dateTime(int year, int month,
			int day, int hour, int min, int sec) {
		return dateTime(new DateTime(year, month, day, hour, min, sec));
	}

	public static TemporalLocationDateTime dateTime(DateTime time) {
		return new TemporalLocationDateTime(time);
	}

	public static TemporalLocation temporalLocation(Interval interval) {
		return temporalLocation(interval.getStart(), interval.getEnd());
	}

	public static TemporalLocation temporalLocation(DateTime start, DateTime end) {
		return temporalLocation(new TemporalLocationDateTime(start),
				new TemporalLocationDateTime(end));
	}

	public static TemporalLocation temporalLocation(
			TemporalLocationDateTime start, TemporalLocationDateTime end) {
		return new TemporalLocationInterval(start, end);
	}

	public static TemporalLocationInterval interval(Interval interval) {
		return interval(interval.getStart(), interval.getEnd());
	}

	public static TemporalLocationInterval interval(DateTime start, DateTime end) {
		return interval(new TemporalLocationDateTime(start),
				new TemporalLocationDateTime(end));
	}

	public static TemporalLocationInterval interval(
			TemporalLocationDateTime start, TemporalLocationDateTime end) {
		return new TemporalLocationInterval(start, end);
	}

	public static SpatialLocation spatialLocation(String label) {
		return new SpatialLocationPlace(label);
	}

	public static SpatialLocation spatialLocation(String label, URI sameAs) {
		return new SpatialLocationPlace(label, sameAs);
	}

	public static SpatialLocation spatialLocation(SpatialGeometry geometry) {
		return new SpatialLocationRegion(geometry);
	}

	public static SpatialLocation spatialLocation(Point geometry) {
		return spatialLocation(spatialGeometry(geometry));
	}

	public static SpatialLocation spatialLocation(Polygon geometry) {
		return spatialLocation(spatialGeometry(geometry));
	}

	public static SpatialLocation spatialLocation(LineString geometry) {
		return spatialLocation(spatialGeometry(geometry));
	}

	public static SpatialGeometry spatialGeometry(Point geometry) {
		return new SpatialGeometryPoint(geometry);
	}

	public static SpatialGeometry spatialGeometry(Polygon geometry) {
		return new SpatialGeometryPolygon(geometry);
	}

	public static SpatialGeometry spatialGeometry(LineString geometry) {
		return new SpatialGeometryLineString(geometry);
	}

	public static MeasurementValueContext measurementValueContext(
			Sensor sensor, Property property, Feature feature,
			TemporalLocation temporalLocation) {
		return measurementValueContext(sensor, property, feature,
				temporalLocation, null);
	}

	public static MeasurementValueContext measurementValueContext(
			Sensor sensor, Property property, Feature feature,
			TemporalLocation temporalLocation, SpatialLocation spatialLocation) {
		return new MeasurementValueContextBase(sensor, property, feature,
				temporalLocation, spatialLocation);
	}

	public static MeasurementResult measurementResult(MeasurementValue value,
			MeasurementValueContext context) {
		return new MeasurementResultBase(value, context);
	}

	public static SensorObservation sensorObservation(Sensor sensor,
			Property property, Feature feature, SensorOutput output,
			TemporalLocation temporalLocation) {
		SensorObservation ret = new SensorObservationBase();

		ret.setSensor(sensor);
		ret.setProperty(property);
		ret.setFeature(feature);
		ret.setSensorOutput(output);
		ret.setTemporalLocation(temporalLocation);

		return ret;
	}

	public static SensorObservation sensorObservation(Sensor sensor,
			Property property, Feature feature, SensorOutput output,
			TemporalLocation temporalLocation, SpatialLocation spatialLocation) {
		SensorObservation ret = sensorObservation(sensor, property, feature,
				output, temporalLocation);

		ret.setSpatialLocation(spatialLocation);

		return ret;
	}

	public static Dataset dataset(String id) {
		return new DatasetBase(id);
	}

	public static DatasetObservation datasetObservation() {
		return new DatasetObservationBase();
	}

	public static DatasetObservation datasetObservation(Dataset dataset) {
		DatasetObservation ret = datasetObservation();

		ret.setDataset(dataset);

		return ret;
	}

	public static DatasetObservation datasetObservation(Dataset dataset,
			Component... components) {
		DatasetObservation ret = datasetObservation(dataset);

		for (Component component : components) {
			ret.addComponent(component);
		}

		return ret;
	}

	public static DatasetObservation datasetObservation(Dataset dataset,
			Set<Component> components) {
		DatasetObservation ret = datasetObservation(dataset);

		ret.addComponents(components);

		return ret;
	}

	public static Component component(int year, int month, int day, int hour,
			int min, int sec) {
		return component(new DateTime(year, month, day, hour, min, sec));
	}

	public static Component component(String id, int year, int month, int day,
			int hour, int min, int sec) {
		return component(id, new DateTime(year, month, day, hour, min, sec));
	}

	public static Component component(ComponentPropertyDimension property,
			int year, int month, int day, int hour, int min, int sec) {
		return component(property, new DateTime(year, month, day, hour, min,
				sec));
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

	public static Component component(ComponentProperty property,
			TemporalLocation location) {
		return component(property, componentPropertyValue(location));
	}

	public static Component component(ComponentProperty property,
			SpatialLocation location) {
		return component(property, componentPropertyValue(location));
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

	public static ComponentPropertyDimension dimension(String id) {
		return componentPropertyDimension(id);
	}

	public static ComponentPropertyDimension componentPropertyDimension(
			String id) {
		return new ComponentPropertyDimension(id);
	}

	public static ComponentPropertyMeasure measure(String id) {
		return componentPropertyMeasure(id);
	}

	public static ComponentPropertyMeasure componentPropertyMeasure(String id) {
		return new ComponentPropertyMeasure(id);
	}

	public static ComponentPropertyDimension componentPropertyTimePeriod() {
		return new ComponentPropertyDimension(SDMX.Dimension.timePeriod,
				QB.DimensionProperty);
	}

	public static ComponentPropertyValue componentPropertyValue() {
		return componentPropertyValue(new Random().nextDouble());
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

	public static ComponentPropertyValue componentPropertyValue(
			SpatialLocation location) {
		return new ComponentPropertyValueSpatialLocation(location);
	}
	
	public static ComponentPropertyValue componentPropertyValue(String value) {
		return new ComponentPropertyValueString(value);
	}
	
	public static ComponentPropertyValue componentPropertyValue(URI value) {
		return new ComponentPropertyValueUri(value);
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

	public static AttributeTemporalLocation relevantObject(DateTime object) {
		return relevantObject(object);
	}

	public static AttributeTemporalLocation relevantObject(Interval object) {
		return relevantObject(object);
	}

	public static AttributeTemporalLocation relevantObject(
			TemporalLocation object) {
		return attribute(object);
	}

	public static AttributeSpatialLocation relevantObject(Point object) {
		return relevantObject(object);
	}

	public static AttributeSpatialLocation relevantObject(Polygon object) {
		return relevantObject(object);
	}

	public static AttributeSpatialLocation relevantObject(LineString object) {
		return relevantObject(object);
	}

	public static AttributeSpatialLocation relevantObject(SpatialLocation object) {
		return attribute(object);
	}

	public static RelevantIndividual relevantIndividual(Attribute... attributes) {
		return new RelevantIndividualBase(attributes);
	}

	public static RelevantIndividual relevantIndividual(Double value) {
		return relevantIndividual(attribute(attributeValue(value)));
	}

	public static RelevantIndividual relevantIndividual(Period value) {
		return relevantIndividual(attribute(attributeValue(value)));
	}

	public static RelevantIndividual relevantIndividual(String value) {
		return relevantIndividual(attribute(attributeValue(value)));
	}

	public static Attribute attribute(Value value) {
		return new AttributeRelevantIndividual(value);
	}

	public static Value attributeValue(Double value) {
		return new ValueDouble(value);
	}

	public static Value attributeValue(Period value) {
		return new ValuePeriod(value);
	}

	public static Value attributeValue(String value) {
		return new ValueString(value);
	}

	public static AttributeTemporalLocation attribute(DateTime time) {
		return attribute(temporalLocation(time));
	}

	public static AttributeTemporalLocation attribute(Interval interval) {
		return attribute(temporalLocation(interval));
	}

	public static AttributeTemporalLocation attribute(TemporalLocation location) {
		return new AttributeTemporalLocation(location);
	}

	public static AttributeSpatialLocation attribute(SpatialLocation location) {
		return new AttributeSpatialLocation(location);
	}

}
