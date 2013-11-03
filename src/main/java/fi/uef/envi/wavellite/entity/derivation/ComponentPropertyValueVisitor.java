/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation;

import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueDouble;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueTemporalLocation;

/**
 * <p>
 * Title: ComponentPropertyValueVisitor
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

public interface ComponentPropertyValueVisitor {

	public void visit(ComponentPropertyValueDouble value);
	
	public void visit(ComponentPropertyValueTemporalLocation value);
	
}
