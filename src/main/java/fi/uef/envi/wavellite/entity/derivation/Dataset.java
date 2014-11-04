/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation;

import java.util.List;
import java.util.Set;

import fi.uef.envi.wavellite.entity.core.Entity;
import fi.uef.envi.wavellite.entity.core.Operation;
import fi.uef.envi.wavellite.entity.core.Operator;

/**
 * <p>
 * Title: Dataset
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

public interface Dataset extends Entity {

	public void setDataStructureDefinition(DataStructureDefinition structure);

	public DataStructureDefinition getDataStructureDefinition();

	public Set<ComponentProperty> getComponentProperties();
	
	public List<ComponentProperty> getComponentPropertiesOrdered();
	
	public void setAttributedTo(Operator operator);
	
	public Operator getAttributedTo();
	
	public void setGeneratedBy(Operation operation);
	
	public Operation getGeneratedBy();
	
	public void addDerivedFrom(Dataset dataset);

	public List<Dataset> getDerivedFrom();

}
