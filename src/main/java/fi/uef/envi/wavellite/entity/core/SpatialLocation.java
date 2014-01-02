/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core;

import java.util.Set;


/**
 * <p>
 * Title: SpatialLocation
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

public interface SpatialLocation extends Entity {

	public void accept(SpatialLocationVisitor visitor);
	
	public void equal(SpatialLocation location);
	
	public void disjoint(SpatialLocation location);
	
	public void intersects(SpatialLocation location);
	
	public void touches(SpatialLocation location);
	
	public void within(SpatialLocation location);
	
	public void contains(SpatialLocation location);
	
	public void overlaps(SpatialLocation location);
	
	public Set<SpatialLocation> equal();
	
	public Set<SpatialLocation> disjoint();
	
	public Set<SpatialLocation> intersects();
	
	public Set<SpatialLocation> touches();
	
	public Set<SpatialLocation> within();
	
	public Set<SpatialLocation> contains();
	
	public Set<SpatialLocation> overlaps();
	
}
