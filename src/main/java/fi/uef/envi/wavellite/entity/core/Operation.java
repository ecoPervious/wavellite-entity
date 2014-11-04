/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core;

/**
 * <p>
 * Title: Operation
 * </p>
 * <p>
 * Description: A PROV-O activity
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

public interface Operation extends Entity {

	public void setAssociatedWith(Operator operator);
	
	public Operator getAssociatedWith();
	
}
