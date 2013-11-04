/*
 * Copyright (C) 2012 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation;

import fi.uef.envi.wavellite.entity.core.Entity;

/**
 * <p>
 * Title: AttributeValue
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Project: Wavellite Entity
 * </p>
 * <p>
 * Copyright: Copyright (C) 2012
 * </p>
 * 
 * @author Markus Stocker, markus.stocker@uef.fi
 */

public interface AttributeValue extends Entity {

	public void accept(AttributeValueVisitor visitor);
	
	public void setValue(Object value);
	
	public Object getValue();
	
}
