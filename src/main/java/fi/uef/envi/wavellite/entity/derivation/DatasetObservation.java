/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation;

import java.util.Set;

import fi.uef.envi.wavellite.entity.core.Entity;

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

	public void addComponentProperty(ComponentProperty property,
			ComponentPropertyValue value);

	public Set<ComponentProperty> getComponentProperties();

	public ComponentPropertyValue getComponentPropertyValue(
			ComponentProperty property);

}
