/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.openrdf.model.URI;

import fi.uef.envi.wavellite.entity.core.SpatialLocationVisitor;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: SpatialLocationQualitative
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

public class SpatialLocationQualitative extends AbstractSpatialLocation {

	private String label;
	// Typically used for a, but not limited to, geonames.org URIs
	private Set<URI> sameAs;

	public SpatialLocationQualitative() {
		this(UUID.randomUUID().toString());
	}

	public SpatialLocationQualitative(String label) {
		this(UUID.randomUUID().toString(), label);
	}

	public SpatialLocationQualitative(String label, URI sameAs) {
		this(UUID.randomUUID().toString(), label, sameAs);
	}

	public SpatialLocationQualitative(String id, String label) {
		this(id, WTO.SpatialLocationQualitative, label);
	}

	public SpatialLocationQualitative(String id, String label, URI sameAs) {
		this(id, WTO.SpatialLocationQualitative, label, sameAs);
	}

	public SpatialLocationQualitative(String id, String type, String label) {
		this(id, type, label, null);
	}

	public SpatialLocationQualitative(String id, String type, String label,
			URI sameAs) {
		super(id, type);

		this.sameAs = new HashSet<URI>();

		setLabel(label);
		
		addSameAs(sameAs);
	}

	@Override
	public void accept(SpatialLocationVisitor visitor) {
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

		SpatialLocationQualitative other = (SpatialLocationQualitative) obj;

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
		return "SpatialLocationQualitative [id = " + id + "; type = " + type
				+ "; label = " + label + "; sameAs = " + sameAs + "]";
	}

}