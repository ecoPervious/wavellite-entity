/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.derivation.ComponentProperty;
import fi.uef.envi.wavellite.entity.derivation.ComponentSpecification;
import fi.uef.envi.wavellite.entity.derivation.DataStructureDefinition;
import fi.uef.envi.wavellite.vocabulary.QB;

/**
 * <p>
 * Title: DataStructureDefinitionBase
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

public class DataStructureDefinitionBase extends AbstractEntity implements
		DataStructureDefinition {

	private Set<ComponentSpecification> componentSpecifications;

	public DataStructureDefinitionBase() {
		this(UUID.randomUUID().toString());
	}

	public DataStructureDefinitionBase(String id) {
		this(id, QB.DataStructureDefinition);
	}

	public DataStructureDefinitionBase(String id, String type) {
		super(id, type);

		this.componentSpecifications = new HashSet<ComponentSpecification>();
	}
	
	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void addComponentSpecification(ComponentSpecification component) {
		componentSpecifications.add(component);
	}

	@Override
	public Set<ComponentSpecification> getComponentSpecifications() {
		return componentSpecifications;
	}

	@Override
	public List<ComponentSpecification> getComponentSpecificationsOrdered() {
		ComponentSpecification[] a = componentSpecifications
				.toArray(new ComponentSpecification[] {});

		Arrays.sort(a, new ComponentSpecificationComparator());

		return Arrays.asList(a);
	}

	@Override
	public Set<ComponentProperty> getComponentProperties() {
		Set<ComponentProperty> ret = new HashSet<ComponentProperty>();

		for (ComponentSpecification componentSpecification : getComponentSpecifications())
			ret.add(componentSpecification.getComponentProperty());

		return ret;
	}

	@Override
	public List<ComponentProperty> getComponentPropertiesOrdered() {
		List<ComponentProperty> ret = new ArrayList<ComponentProperty>();

		for (ComponentSpecification componentSpecification : getComponentSpecificationsOrdered())
			ret.add(componentSpecification.getComponentProperty());

		return ret;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime
				* result
				+ ((componentSpecifications == null) ? 0
						: componentSpecifications.hashCode());

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

		DataStructureDefinitionBase other = (DataStructureDefinitionBase) obj;

		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;

		if (componentSpecifications == null) {
			if (other.componentSpecifications != null)
				return false;
		} else if (!componentSpecifications
				.equals(other.componentSpecifications))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "DataStructureDefinitionBase [id = " + id + "; type = " + type
				+ "; componentSpecifications = " + componentSpecifications
				+ "]";
	}

	private class ComponentSpecificationComparator implements
			Comparator<ComponentSpecification> {

		@Override
		public int compare(ComponentSpecification o1, ComponentSpecification o2) {
			// a negative integer, zero, or a positive integer as the first
			// argument is less than, equal to, or greater than the second.
			if (o1.getOrder() == o2.getOrder())
				return 0;

			if (o1.getOrder() < o2.getOrder())
				return -1;

			return 1;
		}

	}

}
