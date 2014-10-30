/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation;

import java.util.Collection;
import java.util.Set;

import fi.uef.envi.wavellite.entity.core.Entity;
import fi.uef.envi.wavellite.entity.core.Operation;
import fi.uef.envi.wavellite.entity.core.Operator;

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
	
	public void setOperator(Operator operator);
	
	public Operator getOperator();
	
	public void setOperation(Operation operation);
	
	public Operation getOperation();

}
