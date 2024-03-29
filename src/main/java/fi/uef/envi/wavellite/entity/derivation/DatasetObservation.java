/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import fi.uef.envi.wavellite.entity.core.Entity;
import fi.uef.envi.wavellite.entity.core.Operation;
import fi.uef.envi.wavellite.entity.core.Operator;
import fi.uef.envi.wavellite.entity.observation.SensorObservation;

/**
 * <p>
 * Title: DatasetObservation
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

public interface DatasetObservation extends Entity {

	public Dataset getDataset();

	public void setDataset(Dataset dataset);

	public void addComponent(Component component);

	public void addComponents(Collection<Component> components);

	public void addComponent(ComponentProperty property,
			ComponentPropertyValue value);

	public void setComponentPropertyValue(ComponentProperty property,
			ComponentPropertyValue value);
	
	public void setComponent(Component component);

	public Collection<Component> getComponents();

	public Set<ComponentProperty> getComponentProperties();

	public ComponentPropertyValue getComponentPropertyValue(
			ComponentProperty property);

	public int getDimensionality();
	
	public void setAttributedTo(Operator operator);
	
	public Operator getAttributedTo();
	
	public void setGeneratedBy(Operation operation);
	
	public Operation getGeneratedBy();
	
	public void addDerivedFrom(SensorObservation observation);
	
	public void addDerivedFrom(DatasetObservation observation);

	public List<Entity> getDerivedFrom();
}
