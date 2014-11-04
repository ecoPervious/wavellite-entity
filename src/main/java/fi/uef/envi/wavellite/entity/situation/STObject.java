/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation;

import java.util.List;

import fi.uef.envi.wavellite.entity.core.Entity;
import fi.uef.envi.wavellite.entity.core.Operation;
import fi.uef.envi.wavellite.entity.core.Operator;
import fi.uef.envi.wavellite.entity.derivation.DatasetObservation;

/**
 * <p>
 * Title: STObject
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

public interface STObject extends Entity {

	public void setAttributedTo(Operator operator);
	
	public Operator getAttributedTo();
	
	public void setGeneratedBy(Operation operation);
	
	public Operation getGeneratedBy();
	
	public void addDerivedFrom(DatasetObservation observation);
	
	public void addDerivedFrom(Situation situation);
	
	public List<Entity> getDerivedFrom();
	
}
