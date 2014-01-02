/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation;

import fi.uef.envi.wavellite.entity.situation.base.AttributeValueDouble;
import fi.uef.envi.wavellite.entity.situation.base.AttributeValueInteger;
import fi.uef.envi.wavellite.entity.situation.base.AttributeValueString;
import fi.uef.envi.wavellite.entity.situation.base.AttributeValueTemporalLocation;
import fi.uef.envi.wavellite.entity.situation.base.AttributeValueUri;

/**
 * <p>
 * Title: AttributeValueVisitor
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

public interface AttributeValueVisitor {

	public void visit(AttributeValueDouble value);

	public void visit(AttributeValueString value);
	
	public void visit(AttributeValueUri value);
	
	public void visit(AttributeValueInteger value);
	
	public void visit(AttributeValueTemporalLocation value);
	
}
