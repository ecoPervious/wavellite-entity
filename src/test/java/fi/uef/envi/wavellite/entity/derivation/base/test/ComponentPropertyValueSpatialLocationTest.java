/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.core.base.SpatialLocationPlace;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueSpatialLocation;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: ComponentPropertyValueSpatialLocationTest
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

public class ComponentPropertyValueSpatialLocationTest {

	@Test
	public void test1() {
		ComponentPropertyValueSpatialLocation e = new ComponentPropertyValueSpatialLocation(
				"i1");
		ComponentPropertyValueSpatialLocation a = new ComponentPropertyValueSpatialLocation(
				"i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ComponentPropertyValueSpatialLocation e = new ComponentPropertyValueSpatialLocation(
				"i1", "t1");
		ComponentPropertyValueSpatialLocation a = new ComponentPropertyValueSpatialLocation(
				"i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		ComponentPropertyValueSpatialLocation e = new ComponentPropertyValueSpatialLocation(
				"i1");
		ComponentPropertyValueSpatialLocation a = new ComponentPropertyValueSpatialLocation(
				"i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		ComponentPropertyValueSpatialLocation e = new ComponentPropertyValueSpatialLocation(
				"i1", "t1");
		ComponentPropertyValueSpatialLocation a = new ComponentPropertyValueSpatialLocation(
				"i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		ComponentPropertyValueSpatialLocation s1 = new ComponentPropertyValueSpatialLocation(
				"i1");
		ComponentPropertyValueSpatialLocation s2 = new ComponentPropertyValueSpatialLocation(
				"i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		ComponentPropertyValueSpatialLocation s1 = new ComponentPropertyValueSpatialLocation(
				"i1", "t1");
		ComponentPropertyValueSpatialLocation s2 = new ComponentPropertyValueSpatialLocation(
				"i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		ComponentPropertyValueSpatialLocation s1 = new ComponentPropertyValueSpatialLocation(
				"i1");
		ComponentPropertyValueSpatialLocation s2 = new ComponentPropertyValueSpatialLocation(
				"i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		ComponentPropertyValueSpatialLocation s1 = new ComponentPropertyValueSpatialLocation(
				"i1", "t1");
		ComponentPropertyValueSpatialLocation s2 = new ComponentPropertyValueSpatialLocation(
				"i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		ComponentPropertyValueSpatialLocation s = new ComponentPropertyValueSpatialLocation(
				"i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		ComponentPropertyValueSpatialLocation s = new ComponentPropertyValueSpatialLocation(
				"i1");

		assertEquals(WOE.ComponentPropertyValueSpatialLocation, s.getType());
	}

	@Test
	public void test11() {
		ComponentPropertyValueSpatialLocation s = new ComponentPropertyValueSpatialLocation(
				"i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		ComponentPropertyValueSpatialLocation s = new ComponentPropertyValueSpatialLocation(
				"i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		ComponentPropertyValueSpatialLocation s = new ComponentPropertyValueSpatialLocation(
				"i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		ComponentPropertyValueSpatialLocation e = new ComponentPropertyValueSpatialLocation(
				"i1", new SpatialLocationPlace("tl1", "l1"));
		ComponentPropertyValueSpatialLocation a = new ComponentPropertyValueSpatialLocation(
				"i1", new SpatialLocationPlace("tl1", "l1"));

		assertEquals(e, a);
	}

	@Test
	public void test15() {
		ComponentPropertyValueSpatialLocation e = new ComponentPropertyValueSpatialLocation(
				"i1", new SpatialLocationPlace("tl1", "l1"));
		ComponentPropertyValueSpatialLocation a = new ComponentPropertyValueSpatialLocation(
				"i1", new SpatialLocationPlace("tl1", "l2"));

		assertNotEquals(e, a);
	}

}
