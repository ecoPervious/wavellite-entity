/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base;

import fi.uef.envi.wavellite.vocabulary.QB;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: ComponentPropertyDimension
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

public class ComponentPropertyDimension extends ComponentPropertyBase {

	public ComponentPropertyDimension(String id) {
		this(id, QB.DimensionProperty);
	}
	
	public ComponentPropertyDimension(String id, String type) {
		super(id, type);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		ComponentPropertyDimension other = (ComponentPropertyDimension) obj;

		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;

		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "ComponentPropertyDimension [id = " + id + "; type = " + type + "]";
	}
	
}
