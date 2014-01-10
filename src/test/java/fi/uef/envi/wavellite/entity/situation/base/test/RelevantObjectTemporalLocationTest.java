/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.joda.time.DateTime;
import org.junit.Test;

import fi.uef.envi.wavellite.entity.core.base.TemporalLocationDateTime;
import fi.uef.envi.wavellite.entity.situation.base.RelevantObjectTemporalLocation;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: RelevantObjectTemporalLocation
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

public class RelevantObjectTemporalLocationTest {

	@Test
	public void test1() {
		RelevantObjectTemporalLocation e = new RelevantObjectTemporalLocation(
				"i1");
		RelevantObjectTemporalLocation a = new RelevantObjectTemporalLocation(
				"i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		RelevantObjectTemporalLocation e = new RelevantObjectTemporalLocation(
				"i1", "t1");
		RelevantObjectTemporalLocation a = new RelevantObjectTemporalLocation(
				"i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		RelevantObjectTemporalLocation e = new RelevantObjectTemporalLocation(
				"i1");
		RelevantObjectTemporalLocation a = new RelevantObjectTemporalLocation(
				"i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		RelevantObjectTemporalLocation e = new RelevantObjectTemporalLocation(
				"i1", "t1");
		RelevantObjectTemporalLocation a = new RelevantObjectTemporalLocation(
				"i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		RelevantObjectTemporalLocation s1 = new RelevantObjectTemporalLocation(
				"i1");
		RelevantObjectTemporalLocation s2 = new RelevantObjectTemporalLocation(
				"i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		RelevantObjectTemporalLocation s1 = new RelevantObjectTemporalLocation(
				"i1", "t1");
		RelevantObjectTemporalLocation s2 = new RelevantObjectTemporalLocation(
				"i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		RelevantObjectTemporalLocation s1 = new RelevantObjectTemporalLocation(
				"i1");
		RelevantObjectTemporalLocation s2 = new RelevantObjectTemporalLocation(
				"i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		RelevantObjectTemporalLocation s1 = new RelevantObjectTemporalLocation(
				"i1", "t1");
		RelevantObjectTemporalLocation s2 = new RelevantObjectTemporalLocation(
				"i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		RelevantObjectTemporalLocation s = new RelevantObjectTemporalLocation(
				"i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		RelevantObjectTemporalLocation s = new RelevantObjectTemporalLocation(
				"i1");

		assertEquals(WOE.TemporalLocation, s.getType());
	}

	@Test
	public void test11() {
		RelevantObjectTemporalLocation s = new RelevantObjectTemporalLocation(
				"i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		RelevantObjectTemporalLocation s = new RelevantObjectTemporalLocation(
				"i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		RelevantObjectTemporalLocation s = new RelevantObjectTemporalLocation(
				"i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		RelevantObjectTemporalLocation s1 = new RelevantObjectTemporalLocation(
				new TemporalLocationDateTime(new DateTime(2014, 1, 10, 0, 0, 0)));
		RelevantObjectTemporalLocation s2 = new RelevantObjectTemporalLocation(
				new TemporalLocationDateTime(new DateTime(2014, 1, 10, 0, 0, 0)));

		assertEquals(s1, s2);
	}

	@Test
	public void test15() {
		RelevantObjectTemporalLocation s1 = new RelevantObjectTemporalLocation(
				new TemporalLocationDateTime(new DateTime(2014, 1, 10, 0, 0, 0)));
		RelevantObjectTemporalLocation s2 = new RelevantObjectTemporalLocation(
				new TemporalLocationDateTime(new DateTime(2014, 1, 10, 1, 0, 0)));

		assertNotEquals(s1, s2);
	}

}
