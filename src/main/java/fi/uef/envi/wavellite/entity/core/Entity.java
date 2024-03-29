/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core;

import java.io.Serializable;

/**
 * <p>
 * Title: Entity
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

public interface Entity extends Serializable {

	public String getId();
	
	public String getType();
	
	public void setType(String type);
	
	public void accept(EntityVisitor visitor);
	
}
