/*
 * Copyright (C) 2012 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation;

import java.util.List;

import fi.uef.envi.wavellite.entity.core.Entity;

/**
 * <p>
 * Title: ElementaryInfon
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

public interface ElementaryInfon extends Entity {

	public void setRelation(Relation relation);

	public void addRelevantObject(RelevantObject relevantObject);

	public void setPolarity(Polarity polarity);
	
	public Relation getRelation();
	
	public List<RelevantObject> getRelevantObjects();
	
	public Polarity getPolarity();
}
