/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.Operation;
import fi.uef.envi.wavellite.entity.core.Operator;
import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.derivation.ComponentProperty;
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

	private static final long serialVersionUID = -6188604240253868400L;
	
	private DataStructureDefinition definition;
	private Operation operation;
	private Operator operator;

	public DatasetBase(String id) {
		this(id, QB.DataSet);
	}

	public DatasetBase(String id, DataStructureDefinition definition) {
		this(id, QB.DataSet, definition);
	}

	public DatasetBase(String id, String type) {
		super(id, type);
	}

	public DatasetBase(String id, String type,
			DataStructureDefinition definition) {
		super(id, type);

		setDataStructureDefinition(definition);
	}

	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void setDataStructureDefinition(DataStructureDefinition definition) {
		if (definition == null)
			throw new NullPointerException("[definition = null]");

		this.definition = definition;
	}

	@Override
	public DataStructureDefinition getDataStructureDefinition() {
		return definition;
	}

	@Override
	public Set<ComponentProperty> getComponentProperties() {
		if (definition == null)
			return Collections.emptySet();

		return definition.getComponentProperties();
	}

	@Override
	public List<ComponentProperty> getComponentPropertiesOrdered() {
		if (definition == null)
			return Collections.emptyList();

		return definition.getComponentPropertiesOrdered();
	}
	
	@Override
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
	@Override
	public Operator getOperator() {
		return operator;
	}
	
	@Override
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
	@Override
	public Operation getOperation() {
		return operation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result
				+ ((definition == null) ? 0 : definition.hashCode());

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

		if (definition == null) {
			if (other.definition != null)
				return false;
		} else if (!definition.equals(other.definition))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "DatasetBase [id = " + id + "; type = " + type
				+ "; definition = " + definition + "]";
	}

}
