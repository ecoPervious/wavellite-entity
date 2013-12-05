/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.base.AbstractEntity;
import fi.uef.envi.wavellite.entity.situation.ElementaryInfon;
import fi.uef.envi.wavellite.entity.situation.Situation;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: SituationBase
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

public class SituationBase extends AbstractEntity implements Situation {

	private Set<ElementaryInfon> infons;

	public SituationBase() {
		this(UUID.randomUUID().toString());
	}
	
	public SituationBase(ElementaryInfon... infons) {
		this(UUID.randomUUID().toString(), infons);
	}
		
	public SituationBase(String id) {
		this(id, STO.Situation);
	}
	
	public SituationBase(String id, ElementaryInfon... infons) {
		this(id, STO.Situation, infons);
	}

	public SituationBase(String id, String type) {
		super(id, type);

		this.infons = new HashSet<ElementaryInfon>();
	}
	
	public SituationBase(String id, String type, ElementaryInfon... infons) {
		this(id, type);
	
		for (ElementaryInfon infon : infons) {
			this.infons.add(infon);
		}
	}

	@Override
	public void addSupportedInfon(ElementaryInfon infon) {
		infons.add(infon);
	}

	@Override
	public Set<ElementaryInfon> getSupportedInfons() {
		return Collections.unmodifiableSet(infons);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

//		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((infons == null) ? 0 : infons.hashCode());

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

		SituationBase other = (SituationBase) obj;
		
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

		if (infons == null) {
			if (other.infons != null)
				return false;
		} else if (!infons.equals(other.infons))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "SituationBase [id = " + id + "; type = " + type + "; infons = "
				+ infons + "]";
	}

}
