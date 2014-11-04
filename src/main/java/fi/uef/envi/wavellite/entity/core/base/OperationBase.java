/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.Operation;
import fi.uef.envi.wavellite.entity.core.Operator;
import fi.uef.envi.wavellite.vocabulary.WOO;

/**
 * <p>
 * Title: OperationBase
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

public class OperationBase extends AbstractEntity implements Operation {

	private static final long serialVersionUID = -2101868541407032777L;

	private Operator operator;

	public OperationBase(String id) {
		this(id, WOO.Operation);
	}

	public OperationBase(String id, String type) {
		super(id, type);
	}

	@Override
	public void setAssociatedWith(Operator operator) {
		this.operator = operator;
	}

	@Override
	public Operator getAssociatedWith() {
		return operator;
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
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());

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

		OperationBase other = (OperationBase) obj;

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
		
		if (operator == null) {
			if (other.operator != null)
				return false;
		} else if (!operator.equals(other.operator))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "OperationBase [id = " + id + "; type = " + type
				+ "; operator = " + operator + "]";
	}

}
