/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.Feature;
import fi.uef.envi.wavellite.entity.core.Property;
import fi.uef.envi.wavellite.entity.core.Sensor;
import fi.uef.envi.wavellite.entity.core.SpatialGeometry;
import fi.uef.envi.wavellite.entity.core.SpatialLocation;
import fi.uef.envi.wavellite.entity.core.TemporalLocation;
import fi.uef.envi.wavellite.entity.derivation.Component;
import fi.uef.envi.wavellite.entity.derivation.ComponentProperty;
import fi.uef.envi.wavellite.entity.derivation.ComponentPropertyValue;
import fi.uef.envi.wavellite.entity.derivation.ComponentSpecification;
import fi.uef.envi.wavellite.entity.derivation.DataStructureDefinition;
import fi.uef.envi.wavellite.entity.derivation.Dataset;
import fi.uef.envi.wavellite.entity.derivation.DatasetObservation;
import fi.uef.envi.wavellite.entity.measurement.MeasurementResult;
import fi.uef.envi.wavellite.entity.measurement.MeasurementValue;
import fi.uef.envi.wavellite.entity.measurement.MeasurementValueContext;
import fi.uef.envi.wavellite.entity.observation.ObservationValue;
import fi.uef.envi.wavellite.entity.observation.SensorObservation;
import fi.uef.envi.wavellite.entity.observation.SensorOutput;
import fi.uef.envi.wavellite.entity.situation.Attribute;
import fi.uef.envi.wavellite.entity.situation.AttributeValue;
import fi.uef.envi.wavellite.entity.situation.ElementaryInfon;
import fi.uef.envi.wavellite.entity.situation.Relation;
import fi.uef.envi.wavellite.entity.situation.RelevantObject;
import fi.uef.envi.wavellite.entity.situation.Situation;
import fi.uef.envi.wavellite.entity.situation.base.AttributeSpatialLocation;
import fi.uef.envi.wavellite.entity.situation.base.AttributeTemporalLocation;

/**
 * <p>
 * Title: AbstractEntityVisitor
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

public abstract class AbstractEntityVisitor implements EntityVisitor {

	@Override
	public void visit(Feature entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(Property entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(Sensor entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(SpatialGeometry entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(SpatialLocation entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(TemporalLocation entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(Component entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(ComponentProperty entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(ComponentPropertyValue entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(ComponentSpecification entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(Dataset entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(DatasetObservation entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(DataStructureDefinition entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(MeasurementResult entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(MeasurementValueContext entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(MeasurementValue entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(ObservationValue entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(SensorObservation entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(SensorOutput entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(Attribute entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}
	
	@Override
	public void visit(AttributeValue entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}
	
	@Override
	public void visit(ElementaryInfon entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(Relation entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(RelevantObject entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(Situation entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}
	
	@Override
	public void visit(AttributeSpatialLocation entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

	@Override
	public void visit(AttributeTemporalLocation entity) {
		throw new UnsupportedOperationException(
				"Not supported by this entity visitor");
	}

}
