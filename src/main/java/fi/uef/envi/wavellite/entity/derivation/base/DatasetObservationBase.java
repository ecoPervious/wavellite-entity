/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.derivation.ComponentProperty;
import fi.uef.envi.wavellite.entity.derivation.ComponentPropertyValue;
import fi.uef.envi.wavellite.entity.derivation.Dataset;
import fi.uef.envi.wavellite.entity.derivation.DatasetObservation;
import fi.uef.envi.wavellite.vocabulary.WO;

/**
 * <p>
 * Title: DatasetObservationBase
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

public class DatasetObservationBase extends AbstractEntity implements
		DatasetObservation {

	private Dataset dataset;
	private HashMap<ComponentProperty, ComponentPropertyValue> components;

	public DatasetObservationBase() {
		this(UUID.randomUUID().toString());
	}

	public DatasetObservationBase(String id) {
		this(id, WO.DatasetObservation);
	}

	public DatasetObservationBase(String id, String type) {
		super(id, type);

		this.components = new LinkedHashMap<ComponentProperty, ComponentPropertyValue>();
	}

	@Override
	public void setDataset(Dataset dataset) {
		if (dataset == null)
			throw new NullPointerException("[dataset = null]");

		this.dataset = dataset;
	}

	@Override
	public Dataset getDataset() {
		return dataset;
	}

	@Override
	public void addComponent(ComponentProperty property,
			ComponentPropertyValue value) {
		components.put(property, value);
	}

	@Override
	public Set<ComponentProperty> getComponentProperties() {
		return Collections.unmodifiableSet(components.keySet());
	}

	@Override
	public ComponentPropertyValue getComponentPropertyValue(
			ComponentProperty property) {
		return components.get(property);
	}
	
	@Override
	public int getDimensionality() {
		return components.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((dataset == null) ? 0 : dataset.hashCode());
		result = prime * result
				+ ((components == null) ? 0 : components.hashCode());

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

		DatasetObservationBase other = (DatasetObservationBase) obj;

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

		if (dataset == null) {
			if (other.dataset != null)
				return false;
		} else if (!dataset.equals(other.dataset))
			return false;

		if (components == null) {
			if (other.components != null)
				return false;
		} else if (!components.equals(other.components))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "DatasetObservationBase [id = " + id + "; type = " + type
				+ "; dataset = " + dataset + "; componentProperties = "
				+ components + "]";
	}

}
