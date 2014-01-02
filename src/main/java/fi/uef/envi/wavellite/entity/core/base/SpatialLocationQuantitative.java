/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import fi.uef.envi.wavellite.entity.core.SpatialLocationVisitor;

/**
 * <p>
 * Title: SpatialLocationQualitative
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

public class SpatialLocationQuantitative extends AbstractSpatialLocation {

	@Override
	public void accept(SpatialLocationVisitor visitor) {
		visitor.visit(this);
	}

}
