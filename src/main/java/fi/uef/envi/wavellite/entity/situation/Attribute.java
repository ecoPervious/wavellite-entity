/*
 * Copyright (C) 2012 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation;

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

public interface Attribute extends STObject {
	
	public String getName();
	
	public Object getValue();
	
	public void setName(String name);
	
	public void setValue(Object value);
	
	public void accept(AttributeVisitor visitor);
	
}
