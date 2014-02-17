/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core;

import com.vividsolutions.jts.geom.Geometry;

/**
 * <p>
 * Title: SpatialGeometry
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

public interface SpatialGeometry extends Entity {

	public Geometry getValue();
	
	public String getValueAsWKT();
	
	public String getValueAsGML();
	
	public void setValueAsWKT(String value);
	
	public void setValueAsGML(String value);
	
	public void accept(SpatialGeometryVisitor visitor);
	
}
