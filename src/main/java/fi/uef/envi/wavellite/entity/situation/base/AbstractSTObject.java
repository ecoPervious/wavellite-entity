/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fi.uef.envi.wavellite.entity.core.Entity;
import fi.uef.envi.wavellite.entity.core.Operation;
import fi.uef.envi.wavellite.entity.core.Operator;
import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.derivation.DatasetObservation;
import fi.uef.envi.wavellite.entity.situation.Situation;

/**
 * <p>
 * Title: AbstractSTObject
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Project:
 * </p>
 * <p>
 * Copyright: Copyright (C) 2014
 * </p>
 * 
 * @author Markus Stocker
 */

public abstract class AbstractSTObject extends AbstractEntity {

	private static final long serialVersionUID = 8509176831266155764L;

	private Operator operator;
	private Operation operation;
	private List<Entity> derived;
	
	public AbstractSTObject(String id, String type) {
		super(id, type);
		
		this.derived = new ArrayList<Entity>();
	}

	public void setAttributedTo(Operator operator) {
		this.operator = operator;
	}
	
	public Operator getAttributedTo() {
		return operator;
	}
	
	public void setGeneratedBy(Operation operation) {
		this.operation = operation;
	}
	
	public Operation getGeneratedBy() {
		return operation;
	}
	
	public void addDerivedFrom(DatasetObservation observation) {
		derived.add(observation);
	}
	
	public void addDerivedFrom(Situation situation) {
		derived.add(situation);
	}
	
	public List<Entity> getDerivedFrom() {
		return Collections.unmodifiableList(derived);
	}
	
}
