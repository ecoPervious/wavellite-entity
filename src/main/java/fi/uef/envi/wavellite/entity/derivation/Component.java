/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation;

import fi.uef.envi.wavellite.entity.core.Entity;

/**
 * <p>
 * Title: Component
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

public interface Component extends Entity {

	public void setComponentProperty(ComponentProperty property);
	
	public void setComponentPropertyValue(ComponentPropertyValue value);
	
	public ComponentProperty getComponentProperty();
	
	public ComponentPropertyValue getComponentPropertyValue();
	
}
