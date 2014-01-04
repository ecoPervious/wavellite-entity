/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core;

import fi.uef.envi.wavellite.entity.core.base.SpatialGeometryLineString;
import fi.uef.envi.wavellite.entity.core.base.SpatialGeometryPoint;
import fi.uef.envi.wavellite.entity.core.base.SpatialGeometryPolygon;

/**
 * <p>
 * Title: SpatialGeometryVisitor
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

public interface SpatialGeometryVisitor {

	public void visit(SpatialGeometryPoint geometry);
	
	public void visit(SpatialGeometryPolygon geometry);
	
	public void visit(SpatialGeometryLineString geometry);
	
}
