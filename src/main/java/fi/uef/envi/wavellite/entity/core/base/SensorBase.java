/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.Sensor;
import fi.uef.envi.wavellite.entity.observation.Sensing;
import fi.uef.envi.wavellite.vocabulary.SSN;

/**
 * <p>
 * Title: SensorBase
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

public class SensorBase extends AbstractEntity implements Sensor {

	private static final long serialVersionUID = -8805371750193731525L;

	private Sensing sensing;

	public SensorBase(String id) {
		this(id, SSN.Sensor);
	}

	public SensorBase(String id, String type) {
		super(id, type);
	}

	@Override
	public void setSensing(Sensing sensing) {
		this.sensing = sensing;
	}

	@Override
	public Sensing getSensing() {
		return sensing;
	}

	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((sensing == null) ? 0 : sensing.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		SensorBase other = (SensorBase) obj;

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

		if (sensing == null) {
			if (other.sensing != null)
				return false;
		} else if (!sensing.equals(other.sensing))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "SensorBase [id = " + id + "; type = " + type + "; sensing = "
				+ sensing + "]";
	}

}
