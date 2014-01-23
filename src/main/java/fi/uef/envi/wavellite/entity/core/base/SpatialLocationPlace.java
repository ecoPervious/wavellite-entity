/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.openrdf.model.URI;

import fi.uef.envi.wavellite.entity.core.EntityVisitor;
import fi.uef.envi.wavellite.entity.core.SpatialLocationVisitor;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: SpatialLocationPlace
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Project: Wavellite Entity
 * </p>
 * <p>
 * Copyright: Copyright (C) 2014
 * </p>
 * 
 * @author Markus Stocker
 */

public class SpatialLocationPlace extends AbstractSpatialLocation {

	private String label;
	private Set<URI> sameAs;

	public SpatialLocationPlace() {
		this(UUID.randomUUID().toString());
	}

	public SpatialLocationPlace(String id) {
		this(id, WOE.SpatialPlace);
	}

	public SpatialLocationPlace(String id, URI sameAs) {
		this(id, WOE.SpatialPlace, sameAs, null);
	}

	public SpatialLocationPlace(String id, String label) {
		this(id, WOE.SpatialPlace, null, label);
	}
	
	public SpatialLocationPlace(String id, String type, String label) {
		this(id, type, null, label);
	}
	
	public SpatialLocationPlace(String id, URI sameAs, String label) {
		this(id, WOE.SpatialPlace, sameAs, label);
	}

	public SpatialLocationPlace(String id, String type, URI sameAs, String label) {
		super(id, type);

		this.sameAs = new HashSet<URI>();

		setLabel(label);
		addSameAs(sameAs);
	}

	@Override
	public void accept(SpatialLocationVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void accept(EntityVisitor visitor) {
		visitor.visit(this);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Set<URI> sameAs() {
		return sameAs;
	}

	public void addSameAs(URI sameAs) {
		if (sameAs == null)
			return;

		this.sameAs.add(sameAs);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((label == null) ? 0 : label.hashCode());

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

		SpatialLocationPlace other = (SpatialLocationPlace) obj;

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

		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "SpatialLocationPlace [id = " + id + "; type = " + type
				+ "; label = " + label + "; sameAs = " + sameAs + "]";
	}

}
