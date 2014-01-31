/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation;

import java.util.Collection;

import fi.uef.envi.wavellite.entity.core.Entity;

/**
 * <p>
 * Title: Dataset
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

public interface Dataset extends Entity {

	public void setDataStructureDefinition(DataStructureDefinition structure);

	public DataStructureDefinition getDataStructureDefinition();

	public Collection<Component> getComponents();

}
