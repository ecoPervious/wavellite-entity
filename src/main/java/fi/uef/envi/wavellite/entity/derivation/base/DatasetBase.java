/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base;

import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.derivation.DataStructureDefinition;
import fi.uef.envi.wavellite.entity.derivation.Dataset;
import fi.uef.envi.wavellite.vocabulary.QB;

/**
 * <p>
 * Title: DatasetBase
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

public class DatasetBase extends AbstractEntity implements Dataset {

	private DataStructureDefinition structure;

	public DatasetBase(String id) {
		this(id, QB.DataSet);
	}

	public DatasetBase(String id, String type) {
		super(id, type);
	}

	@Override
	public void setStructure(DataStructureDefinition structure) {
		if (structure == null)
			throw new NullPointerException("[structure = null]");

		this.structure = structure;
	}

	@Override
	public DataStructureDefinition getStructure() {
		return structure;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((structure == null) ? 0 : structure.hashCode());

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

		DatasetBase other = (DatasetBase) obj;

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

		if (structure == null) {
			if (other.structure != null)
				return false;
		} else if (!structure.equals(other.structure))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "DatasetBase [id = " + id + "; type = " + type
				+ "; structure = " + structure + "]";
	}

}
