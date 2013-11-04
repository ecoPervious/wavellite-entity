/*
 * Copyright (C) 2012 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation;

/**
 * <p>
 * Title: RelevantObjectVisitor
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

public interface RelevantObjectVisitor {

	public void visit(RelevantIndividual object);

}
