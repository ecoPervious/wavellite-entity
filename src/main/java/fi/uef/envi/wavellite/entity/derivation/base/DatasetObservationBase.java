/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import fi.uef.envi.wavellite.entity.core.Entity;
import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.Operation;
import fi.uef.envi.wavellite.entity.core.Operator;
import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.derivation.Component;
import fi.uef.envi.wavellite.entity.derivation.ComponentProperty;
import fi.uef.envi.wavellite.entity.derivation.ComponentPropertyValue;
import fi.uef.envi.wavellite.entity.derivation.Dataset;
import fi.uef.envi.wavellite.entity.derivation.DatasetObservation;
import fi.uef.envi.wavellite.entity.observation.SensorObservation;
import fi.uef.envi.wavellite.vocabulary.WOE;

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

	private static final long serialVersionUID = -903449366250020973L;
	private Dataset dataset;
	private Map<ComponentProperty, Component> components;
	private Operator operator;
	private Operation operation;
	private List<Entity> derived = new ArrayList<Entity>();
	
	private final static Logger log = Logger
			.getLogger(DatasetObservationBase.class.getName());

	public DatasetObservationBase() {
		this(UUID.randomUUID().toString());
	}

	public DatasetObservationBase(String id) {
		this(id, WOE.DatasetObservation);
	}

	public DatasetObservationBase(String id, String type) {
		super(id, type);

		this.components = new LinkedHashMap<ComponentProperty, Component>();
	}

	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
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
	public void addComponent(Component component) {
		ComponentProperty componentProperty = component.getComponentProperty();

		if (components.containsKey(componentProperty)) {
			if (log.isLoggable(Level.WARNING))
				log.warning("Dataset observation already contains this component property (override) [componentProperty = "
						+ componentProperty
						+ "; components = "
						+ components
						+ "]");
		}

		setComponent(component);
	}

	@Override
	public void setComponent(Component component) {
		ComponentProperty componentProperty = component.getComponentProperty();
		components.put(componentProperty, component);
	}

	@Override
	public void setComponentPropertyValue(ComponentProperty property,
			ComponentPropertyValue value) {
		setComponent(new ComponentBase(property, value));
	}

	@Override
	public void addComponents(Collection<Component> components) {
		for (Component component : components) {
			addComponent(component);
		}
	}

	@Override
	public void addComponent(ComponentProperty property,
			ComponentPropertyValue value) {
		addComponent(new ComponentBase(property, value));
	}

	@Override
	public Collection<Component> getComponents() {
		return Collections.unmodifiableCollection(components.values());
	}

	@Override
	public Set<ComponentProperty> getComponentProperties() {
		return Collections.unmodifiableSet(components.keySet());
	}

	@Override
	public ComponentPropertyValue getComponentPropertyValue(
			ComponentProperty property) {
		Component component = components.get(property);

		if (component == null)
			return null;

		return component.getComponentPropertyValue();
	}

	@Override
	public int getDimensionality() {
		return components.size();
	}
	
	@Override
	public void setGeneratedBy(Operation operation) {
		this.operation = operation;
	}
	
	@Override
	public Operation getGeneratedBy() {
		return operation;
	}

	@Override
	public void setAttributedTo(Operator operator) {
		this.operator = operator;
	}
	
	@Override
	public Operator getAttributedTo() {
		return operator;
	}
	
	@Override
	public void addDerivedFrom(SensorObservation observation) {
		this.derived.add(observation);
	}
	
	@Override
	public void addDerivedFrom(DatasetObservation observation) {
		this.derived.add(observation);
	}
	
	@Override
	public List<Entity> getDerivedFrom() {
		return Collections.unmodifiableList(derived);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		// result = prime * result + ((id == null) ? 0 : id.hashCode());
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

		// if (id == null) {
		// if (other.id != null)
		// return false;
		// } else if (!id.equals(other.id))
		// return false;

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
				+ "; dataset = " + dataset + "; components = " + components
				+ "]";
	}

}
