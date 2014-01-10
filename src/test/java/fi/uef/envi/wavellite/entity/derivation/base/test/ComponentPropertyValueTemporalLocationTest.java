/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.joda.time.DateTime;
import org.junit.Test;

import fi.uef.envi.wavellite.entity.core.base.TemporalLocationDateTime;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueTemporalLocation;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: ComponentPropertyValueTemporalLocationTest
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

public class ComponentPropertyValueTemporalLocationTest {

	@Test
	public void test1() {
		ComponentPropertyValueTemporalLocation e = new ComponentPropertyValueTemporalLocation(
				"i1");
		ComponentPropertyValueTemporalLocation a = new ComponentPropertyValueTemporalLocation(
				"i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ComponentPropertyValueTemporalLocation e = new ComponentPropertyValueTemporalLocation(
				"i1", "t1");
		ComponentPropertyValueTemporalLocation a = new ComponentPropertyValueTemporalLocation(
				"i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		ComponentPropertyValueTemporalLocation e = new ComponentPropertyValueTemporalLocation(
				"i1");
		ComponentPropertyValueTemporalLocation a = new ComponentPropertyValueTemporalLocation(
				"i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		ComponentPropertyValueTemporalLocation e = new ComponentPropertyValueTemporalLocation(
				"i1", "t1");
		ComponentPropertyValueTemporalLocation a = new ComponentPropertyValueTemporalLocation(
				"i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		ComponentPropertyValueTemporalLocation s1 = new ComponentPropertyValueTemporalLocation(
				"i1");
		ComponentPropertyValueTemporalLocation s2 = new ComponentPropertyValueTemporalLocation(
				"i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		ComponentPropertyValueTemporalLocation s1 = new ComponentPropertyValueTemporalLocation(
				"i1", "t1");
		ComponentPropertyValueTemporalLocation s2 = new ComponentPropertyValueTemporalLocation(
				"i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		ComponentPropertyValueTemporalLocation s1 = new ComponentPropertyValueTemporalLocation(
				"i1");
		ComponentPropertyValueTemporalLocation s2 = new ComponentPropertyValueTemporalLocation(
				"i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		ComponentPropertyValueTemporalLocation s1 = new ComponentPropertyValueTemporalLocation(
				"i1", "t1");
		ComponentPropertyValueTemporalLocation s2 = new ComponentPropertyValueTemporalLocation(
				"i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		ComponentPropertyValueTemporalLocation s = new ComponentPropertyValueTemporalLocation(
				"i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		ComponentPropertyValueTemporalLocation s = new ComponentPropertyValueTemporalLocation(
				"i1");

		assertEquals(WOE.ComponentPropertyValueTemporalLocation, s.getType());
	}

	@Test
	public void test11() {
		ComponentPropertyValueTemporalLocation s = new ComponentPropertyValueTemporalLocation(
				"i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		ComponentPropertyValueTemporalLocation s = new ComponentPropertyValueTemporalLocation(
				"i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		ComponentPropertyValueTemporalLocation s = new ComponentPropertyValueTemporalLocation(
				"i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		ComponentPropertyValueTemporalLocation e = new ComponentPropertyValueTemporalLocation(
				"i1", new TemporalLocationDateTime("tl1", new DateTime(2013, 1,
						1, 0, 0, 0)));
		ComponentPropertyValueTemporalLocation a = new ComponentPropertyValueTemporalLocation(
				"i1", new TemporalLocationDateTime("tl1", new DateTime(2013, 1,
						1, 0, 0, 0)));

		assertEquals(e, a);
	}

	@Test
	public void test15() {
		ComponentPropertyValueTemporalLocation e = new ComponentPropertyValueTemporalLocation(
				"i1", new TemporalLocationDateTime("tl1", new DateTime(2013, 1,
						1, 0, 0, 0)));
		ComponentPropertyValueTemporalLocation a = new ComponentPropertyValueTemporalLocation(
				"i1", new TemporalLocationDateTime("tl1", new DateTime(2013, 1,
						2, 0, 0, 0)));

		assertNotEquals(e, a);
	}

}
