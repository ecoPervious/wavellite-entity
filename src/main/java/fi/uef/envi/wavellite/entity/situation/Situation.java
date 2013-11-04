/*
 * Copyright (C) 2012 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation;

import java.util.Set;

import fi.uef.envi.wavellite.entity.core.Entity;

/**
 * <p>
 * Title: Situation
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

public interface Situation extends Entity {

	public void addSupportedInfon(ElementaryInfon infon);

	public Set<ElementaryInfon> getSupportedInfons();

}
