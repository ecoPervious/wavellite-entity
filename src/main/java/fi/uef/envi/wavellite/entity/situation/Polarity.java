/*
 * Copyright (C) 2012 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation;

/**
 * <p>
 * Title: Polarity
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

public enum Polarity {

	True("1"), False("0");

	private final String value;

	Polarity(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}

	public static Polarity fromValue(String value) {
		for (Polarity polarity : Polarity.values()) {
			if (polarity.value.equals(value)) {
				return polarity;
			}
		}

		throw new IllegalArgumentException(value.toString());
	}
}
