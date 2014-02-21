/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.situation.ElementaryInfon;
import fi.uef.envi.wavellite.entity.situation.Polarity;
import fi.uef.envi.wavellite.entity.situation.Relation;
import fi.uef.envi.wavellite.entity.situation.RelevantObject;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: ElementaryInfonBase
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

public class ElementaryInfonBase extends AbstractEntity implements
		ElementaryInfon {

	private static final long serialVersionUID = 191483565485552354L;
	private Relation relation;
	private List<RelevantObject> objects;
	private Polarity polarity = Polarity.True;

	public ElementaryInfonBase() {
		this(UUID.randomUUID().toString());
	}

	public ElementaryInfonBase(Relation relation, Polarity polarity,
			RelevantObject... objects) {
		this(UUID.randomUUID().toString(), relation, polarity, objects);
	}

	public ElementaryInfonBase(String id) {
		this(id, STO.ElementaryInfon);
	}

	public ElementaryInfonBase(String id, Relation relation, Polarity polarity,
			RelevantObject... objects) {
		this(id, STO.ElementaryInfon, relation, polarity, objects);
	}

	public ElementaryInfonBase(String id, String type) {
		super(id, type);

		this.objects = new ArrayList<RelevantObject>();
	}

	public ElementaryInfonBase(String id, String type, Relation relation,
			Polarity polarity, RelevantObject... objects) {
		this(id, type);

		this.relation = relation;
		this.polarity = polarity;

		for (RelevantObject object : objects) {
			this.objects.add(object);
		}
	}
	
	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void setRelation(Relation relation) {
		this.relation = relation;
	}

	@Override
	public void addRelevantObject(RelevantObject object) {
		objects.add(object);
	}

	@Override
	public void setPolarity(Polarity polarity) {
		this.polarity = polarity;
	}

	@Override
	public Relation getRelation() {
		return relation;
	}

	@Override
	public List<RelevantObject> getRelevantObjects() {
		return Collections.unmodifiableList(objects);
	}

	@Override
	public Polarity getPolarity() {
		return polarity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

//		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result
				+ ((relation == null) ? 0 : relation.hashCode());
		result = prime * result + ((objects == null) ? 0 : objects.hashCode());
		result = prime * result
				+ ((polarity == null) ? 0 : polarity.hashCode());

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

		ElementaryInfonBase other = (ElementaryInfonBase) obj;

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

		if (relation == null) {
			if (other.relation != null)
				return false;
		} else if (!relation.equals(other.relation))
			return false;

		if (objects == null) {
			if (other.objects != null)
				return false;
		} else if (!objects.equals(other.objects))
			return false;

		if (polarity == null) {
			if (other.polarity != null)
				return false;
		} else if (!polarity.equals(other.polarity))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "ElementaryInfonBase [id = " + id + "; type = " + type
				+ "; relation = " + relation + "; objects = " + objects
				+ "; polarity = " + polarity + "]";
	}

}
