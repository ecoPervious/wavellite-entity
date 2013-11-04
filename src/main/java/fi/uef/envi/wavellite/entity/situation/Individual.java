/*
 * Copyright (C) 2012 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation;

import java.util.Set;

/**
 * <p>
 * Title: Individual
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

public interface Individual extends RelevantObject {
	
	public void addAttribute(Attribute attribute);
	
	public Set<Attribute> getAttributes();

}
