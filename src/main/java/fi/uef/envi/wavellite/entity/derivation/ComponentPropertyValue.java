/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation;

import org.openrdf.model.URI;

import fi.uef.envi.wavellite.entity.core.SpatialLocation;
import fi.uef.envi.wavellite.entity.core.TemporalLocation;

/**
 * <p>
 * Title: ComponentPropertyValue
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

public interface ComponentPropertyValue {

	public void setValue(Object value);

	public Object getValue();

	public Double getValueAsDouble();

	public Integer getValueAsInteger();

	public String getValueAsString();

	public TemporalLocation getValueAsTemporalLocation();

	public SpatialLocation getValueAsSpatialLocation();

	public URI getValueAsUri();

	public void accept(ComponentPropertyValueVisitor visitor);

}
