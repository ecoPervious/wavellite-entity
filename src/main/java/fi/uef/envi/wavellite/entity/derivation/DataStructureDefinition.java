/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation;

import java.util.List;
import java.util.Set;

import fi.uef.envi.wavellite.entity.core.Entity;

/**
 * <p>
 * Title: DataStructureDefinition
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

public interface DataStructureDefinition extends Entity {

	public void addComponentSpecification(ComponentSpecification component);
	
	public Set<ComponentSpecification> getComponentSpecifications();
	
	public List<ComponentSpecification> getComponentSpecificationsOrdered();
	
	public Set<ComponentProperty> getComponentProperties();
	
	public List<ComponentProperty> getComponentPropertiesOrdered();
	
}
