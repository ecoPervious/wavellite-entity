/*
 * Copyright (C) 2012 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation;

import fi.uef.envi.wavellite.entity.core.Entity;

/**
 * <p>
 * Title: Attribute
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
 * @author Markus Stocker
 */

public interface Attribute extends Entity {
	
	public String getName();
	
	public Object getValue();
	
	public void setName(String name);
	
	public void setValue(Object value);
	
	public void accept(AttributeVisitor visitor);
	
}
