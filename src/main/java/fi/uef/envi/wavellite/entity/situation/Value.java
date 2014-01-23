/*
 * Copyright (C) 2012 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation;

/**
 * <p>
 * Title: Value
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

public interface Value extends RelevantObject {

	public void accept(ValueVisitor visitor);
	
	public void setValue(Object value);
	
	public Object getValue();
	
}
