/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import fi.uef.envi.wavellite.entity.core.Entity;

/**
 * <p>
 * Title: AbstractEntity
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

public abstract class AbstractEntity implements Entity {

	private static final long serialVersionUID = -2335045343468916664L;
	protected String id;
	protected String type;

	public AbstractEntity(String id, String type) {
		if (id == null)
			throw new NullPointerException("[id = null]");

		this.id = id;
		
		setType(type);
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		if (type == null)
			throw new NullPointerException("[type = null]");
		
		this.type = type;
	}

}
