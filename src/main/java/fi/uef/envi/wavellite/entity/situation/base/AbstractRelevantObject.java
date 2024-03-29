/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import fi.uef.envi.wavellite.entity.situation.RelevantObject;

/**
 * <p>
 * Title: AbstractRelevantObject
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

public abstract class AbstractRelevantObject extends AbstractSTObject implements
		RelevantObject {

	private static final long serialVersionUID = -4685705879875540200L;

	public AbstractRelevantObject(String id, String type) {
		super(id, type);
	}

}
