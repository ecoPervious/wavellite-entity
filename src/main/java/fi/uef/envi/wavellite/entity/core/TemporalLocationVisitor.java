/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core;

import fi.uef.envi.wavellite.entity.core.base.TemporalLocationDateTime;

/**
 * <p>
 * Title: TemporalLocationVisitor
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

public interface TemporalLocationVisitor {

	public void visit(TemporalLocationDateTime time);
	
}
