/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation;

import fi.uef.envi.wavellite.entity.situation.base.ValueDouble;
import fi.uef.envi.wavellite.entity.situation.base.ValueInteger;
import fi.uef.envi.wavellite.entity.situation.base.ValuePeriod;
import fi.uef.envi.wavellite.entity.situation.base.ValueString;
import fi.uef.envi.wavellite.entity.situation.base.AttributeUri;

/**
 * <p>
 * Title: ValueVisitor
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

public interface ValueVisitor {

	public void visit(ValueDouble value);

	public void visit(ValueString value);
	
	public void visit(AttributeUri value);
	
	public void visit(ValueInteger value);
	
	public void visit(ValuePeriod value);
	
}
