/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation;

/**
 * <p>
 * Title: ComponentPropertyValue
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

public interface ComponentPropertyValue {

	public void setValue(Object value);

	public Object getValue();
	
	public void accept(ComponentPropertyValueVisitor visitor);

}
