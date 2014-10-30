/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core;

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
import fi.uef.envi.wavellite.entity.observation.Stimulus;
import fi.uef.envi.wavellite.entity.observation.SensorObservation;
import fi.uef.envi.wavellite.entity.observation.SensorOutput;
import fi.uef.envi.wavellite.entity.situation.Attribute;
import fi.uef.envi.wavellite.entity.situation.ElementaryInfon;
import fi.uef.envi.wavellite.entity.situation.Relation;
import fi.uef.envi.wavellite.entity.situation.RelevantObject;
import fi.uef.envi.wavellite.entity.situation.Situation;
import fi.uef.envi.wavellite.entity.situation.base.AttributeSpatialLocation;
import fi.uef.envi.wavellite.entity.situation.base.AttributeTemporalLocation;
import fi.uef.envi.wavellite.entity.situation.base.ValueDouble;
import fi.uef.envi.wavellite.entity.situation.base.ValueInteger;
import fi.uef.envi.wavellite.entity.situation.base.ValuePeriod;
import fi.uef.envi.wavellite.entity.situation.base.ValueString;
import fi.uef.envi.wavellite.entity.situation.base.AttributeUri;

/**
 * <p>
 * Title: EntityVisitor
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

public interface EntityVisitor {
	
	public void visit(Operation operation);
	
	public void visit(Operator operator);

	public void visit(Feature entity);
	
	public void visit(Property entity);
	
	public void visit(Sensor entity);
	
	public void visit(Stimulus entity);
	
	public void visit(SpatialGeometry entity);
	
	public void visit(SpatialLocation entity);
	
	public void visit(TemporalLocation entity);
	
	public void visit(Component entity);
	
	public void visit(ComponentProperty entity);
	
	public void visit(ComponentPropertyValue entity);
	
	public void visit(ComponentSpecification entity);
	
	public void visit(Dataset entity);
	
	public void visit(DatasetObservation entity);
	
	public void visit(DataStructureDefinition entity);
	
	public void visit(MeasurementResult entity);
	
	public void visit(MeasurementValueContext entity);
	
	public void visit(MeasurementValue entity);
	
	public void visit(ObservationValue entity);
	
	public void visit(SensorObservation entity);
	
	public void visit(SensorOutput entity);
	
	public void visit(Attribute entity);
	
	public void visit(ValueDouble entity);
	
	public void visit(ValueInteger entity);
	
	public void visit(ValuePeriod entity);
	
	public void visit(ValueString entity);
	
	public void visit(AttributeUri entity);
	
	public void visit(ElementaryInfon entity);
	
	public void visit(Relation entity);
	
	public void visit(RelevantObject entity);
	
	public void visit(AttributeSpatialLocation entity);
	
	public void visit(AttributeTemporalLocation entity);
	
	public void visit(Situation entity);
	
}
