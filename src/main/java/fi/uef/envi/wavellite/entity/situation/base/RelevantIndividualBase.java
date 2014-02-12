/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.situation.Attribute;
import fi.uef.envi.wavellite.entity.situation.RelevantIndividual;
import fi.uef.envi.wavellite.entity.situation.RelevantObjectVisitor;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: RelevantIndividualBase
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

public class RelevantIndividualBase extends AbstractRelevantObject implements
		RelevantIndividual {

	private static final long serialVersionUID = 5749430056919006280L;
	private Set<Attribute> attributes;

	public RelevantIndividualBase() {
		this(UUID.randomUUID().toString());
	}

	public RelevantIndividualBase(Attribute... attributes) {
		this(UUID.randomUUID().toString(), attributes);
	}

	public RelevantIndividualBase(String id) {
		this(id, STO.RelevantIndividual);
	}

	public RelevantIndividualBase(String id, Attribute... attributes) {
		this(id, STO.RelevantIndividual, attributes);
	}

	public RelevantIndividualBase(String id, String type) {
		super(id, type);

		this.attributes = new HashSet<Attribute>();
	}

	public RelevantIndividualBase(String id, String type,
			Attribute... attributes) {
		this(id, type);

		for (Attribute attribute : attributes) {
			this.attributes.add(attribute);
		}
	}

	@Override
	public void accept(RelevantObjectVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void addAttribute(Attribute attribute) {
		this.attributes.add(attribute);
	}

	@Override
	public Set<Attribute> getAttributes() {
		return Collections.unmodifiableSet(attributes);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

//		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result
				+ ((attributes == null) ? 0 : attributes.hashCode());

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

		RelevantIndividualBase other = (RelevantIndividualBase) obj;

//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;

		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;

		if (attributes == null) {
			if (other.attributes != null)
				return false;
		} else if (!attributes.equals(other.attributes))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "RelevantIndividualBase [id = " + id + "; type = " + type
				+ "; attributes = " + attributes + "]";
	}

}
