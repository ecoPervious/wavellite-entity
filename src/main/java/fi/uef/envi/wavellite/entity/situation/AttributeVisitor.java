/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation;

import fi.uef.envi.wavellite.entity.situation.base.AttributeSpatialLocation;
import fi.uef.envi.wavellite.entity.situation.base.AttributeTemporalLocation;
import fi.uef.envi.wavellite.entity.situation.base.AttributeValue;
import fi.uef.envi.wavellite.entity.situation.base.AttributeUri;

/**
 * <p>
 * Title: AttributeVisitor
 * </p>
 * <p>
 * Description:
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

public interface AttributeVisitor {

	public void visit(AttributeValue attribute);

	public void visit(AttributeSpatialLocation attribute);

	public void visit(AttributeTemporalLocation attribute);

	public void visit(AttributeUri attribute);

}
