/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import fi.uef.envi.wavellite.entity.core.SpatialLocation;
import fi.uef.envi.wavellite.vocabulary.WEO;

/**
 * <p>
 * Title: AbstractSpatialLocation
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

public abstract class AbstractSpatialLocation extends AbstractEntity implements
		SpatialLocation {

	private Set<SpatialLocation> equal = new HashSet<SpatialLocation>();
	private Set<SpatialLocation> disjoint = new HashSet<SpatialLocation>();
	private Set<SpatialLocation> intersects = new HashSet<SpatialLocation>();
	private Set<SpatialLocation> touches = new HashSet<SpatialLocation>();
	private Set<SpatialLocation> within = new HashSet<SpatialLocation>();
	private Set<SpatialLocation> contains = new HashSet<SpatialLocation>();
	private Set<SpatialLocation> overlaps = new HashSet<SpatialLocation>();

	public AbstractSpatialLocation() {
		this(UUID.randomUUID().toString());
	}

	public AbstractSpatialLocation(String id) {
		this(id, WEO.SpatialLocation);
	}

	public AbstractSpatialLocation(String id, String type) {
		super(id, type);
	}

	public AbstractSpatialLocation(String id, String type, Object value) {
		super(id, type);
	}

	@Override
	public void equal(SpatialLocation location) {
		equal.add(location);
	}

	@Override
	public void disjoint(SpatialLocation location) {
		disjoint.add(location);
	}

	@Override
	public void intersects(SpatialLocation location) {
		intersects.add(location);
	}

	@Override
	public void touches(SpatialLocation location) {
		touches.add(location);
	}

	@Override
	public void within(SpatialLocation location) {
		within.add(location);
	}

	@Override
	public void contains(SpatialLocation location) {
		contains.add(location);
	}

	@Override
	public void overlaps(SpatialLocation location) {
		overlaps.add(location);
	}

	@Override
	public Set<SpatialLocation> equal() {
		return Collections.unmodifiableSet(equal);
	}

	@Override
	public Set<SpatialLocation> disjoint() {
		return Collections.unmodifiableSet(disjoint);
	}

	@Override
	public Set<SpatialLocation> intersects() {
		return Collections.unmodifiableSet(intersects);
	}

	@Override
	public Set<SpatialLocation> touches() {
		return Collections.unmodifiableSet(touches);
	}

	@Override
	public Set<SpatialLocation> within() {
		return Collections.unmodifiableSet(within);
	}

	@Override
	public Set<SpatialLocation> contains() {
		return Collections.unmodifiableSet(contains);
	}

	@Override
	public Set<SpatialLocation> overlaps() {
		return Collections.unmodifiableSet(overlaps);
	}

}
