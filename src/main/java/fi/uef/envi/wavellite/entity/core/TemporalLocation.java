/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core;

import org.joda.time.DateTime;
import org.joda.time.Interval;


/**
 * <p>
 * Title: TemporalLocation
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

public interface TemporalLocation extends Entity {

	public void accept(TemporalLocationVisitor visitor);
	
	public void setValue(Object value);
	
	public Object getValue();
	
	public DateTime getValueAsDateTime();
	
	public Interval getValueAsInterval();
	
}
