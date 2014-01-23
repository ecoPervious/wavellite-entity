/*
 * Copyright (C) 2012 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation;

import fi.uef.envi.wavellite.entity.situation.base.AttributeSpatialLocation;
import fi.uef.envi.wavellite.entity.situation.base.AttributeTemporalLocation;
import fi.uef.envi.wavellite.entity.situation.base.ValueDouble;
import fi.uef.envi.wavellite.entity.situation.base.ValueInteger;
import fi.uef.envi.wavellite.entity.situation.base.ValuePeriod;
import fi.uef.envi.wavellite.entity.situation.base.ValueString;
import fi.uef.envi.wavellite.entity.situation.base.ValueUri;


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
	
	public void visit(AttributeSpatialLocation object);

	public void visit(AttributeTemporalLocation object);
	
	public void visit(ValueDouble object);
	
	public void visit(ValueInteger object);
	
	public void visit(ValuePeriod object);
	
	public void visit(ValueString object);
	
	public void visit(ValueUri object);

}
