/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core;

import fi.uef.envi.wavellite.entity.core.base.SpatialLocationPlace;
import fi.uef.envi.wavellite.entity.core.base.SpatialLocationRegion;

/**
 * <p>
 * Title: SpatialLocationVisitor
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Project: Wavellite Entity
 * </p>
 * <p>
 * Copyright: Copyright (C) 2014
 * </p>
 * 
 * @author Markus Stocker
 */

public interface SpatialLocationVisitor {

	public void visit(SpatialLocationPlace location);
	
	public void visit(SpatialLocationRegion location);
	
}
