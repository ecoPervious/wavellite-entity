/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.measurement.base;

import fi.uef.envi.wavellite.vocabulary.WO;

/**
 * <p>
 * Title: DoubleMeasurementValue
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

public class DoubleMeasurementValue extends AbstractMeasurementValue {

	private Double value;

	public DoubleMeasurementValue(Double value) {
		super(WO.DoubleMeasurementValue);

		setValue(value);
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());

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

		DoubleMeasurementValue other = (DoubleMeasurementValue) obj;

		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;

		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "DoubleMeasurementValue [id = " + id + "; type = " + type
				+ "; value = " + value + "]";
	}

}
