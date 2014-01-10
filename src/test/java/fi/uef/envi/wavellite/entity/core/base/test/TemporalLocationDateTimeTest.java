/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.joda.time.DateTime;
import org.junit.Test;

import fi.uef.envi.wavellite.entity.core.base.TemporalLocationDateTime;
import fi.uef.envi.wavellite.vocabulary.WEO;

/**
 * <p>
 * Title: TemporalLocationDateTimeTest
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

public class TemporalLocationDateTimeTest {

	@Test
	public void test1() {
		TemporalLocationDateTime e = new TemporalLocationDateTime("i1",
				new DateTime(2013, 11, 04, 0, 0, 0));
		TemporalLocationDateTime a = new TemporalLocationDateTime("i1",
				new DateTime(2013, 11, 04, 0, 0, 0));

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		TemporalLocationDateTime e = new TemporalLocationDateTime("i1", "t1",
				new DateTime(2013, 11, 04, 0, 0, 0));
		TemporalLocationDateTime a = new TemporalLocationDateTime("i1", "t1",
				new DateTime(2013, 11, 04, 0, 0, 0));

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		TemporalLocationDateTime e = new TemporalLocationDateTime("i1",
				new DateTime(2013, 11, 04, 0, 0, 0));
		TemporalLocationDateTime a = new TemporalLocationDateTime("i2",
				new DateTime(2013, 11, 04, 0, 0, 0));

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		TemporalLocationDateTime e = new TemporalLocationDateTime("i1", "t1",
				new DateTime(2013, 11, 04, 0, 0, 0));
		TemporalLocationDateTime a = new TemporalLocationDateTime("i1", "t2",
				new DateTime(2013, 11, 04, 0, 0, 0));

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		TemporalLocationDateTime s1 = new TemporalLocationDateTime("i1",
				new DateTime(2013, 11, 04, 0, 0, 0));
		TemporalLocationDateTime s2 = new TemporalLocationDateTime("i1",
				new DateTime(2013, 11, 04, 0, 0, 0));

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		TemporalLocationDateTime s1 = new TemporalLocationDateTime("i1", "t1",
				new DateTime(2013, 11, 04, 0, 0, 0));
		TemporalLocationDateTime s2 = new TemporalLocationDateTime("i1", "t1",
				new DateTime(2013, 11, 04, 0, 0, 0));

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		TemporalLocationDateTime s1 = new TemporalLocationDateTime("i1",
				new DateTime(2013, 11, 04, 0, 0, 0));
		TemporalLocationDateTime s2 = new TemporalLocationDateTime("i2",
				new DateTime(2013, 11, 04, 0, 0, 0));

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		TemporalLocationDateTime s1 = new TemporalLocationDateTime("i1", "t1",
				new DateTime(2013, 11, 04, 0, 0, 0));
		TemporalLocationDateTime s2 = new TemporalLocationDateTime("i1", "t2",
				new DateTime(2013, 11, 04, 0, 0, 0));

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		TemporalLocationDateTime s = new TemporalLocationDateTime("i1",
				new DateTime(2013, 11, 04, 0, 0, 0));

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		TemporalLocationDateTime s = new TemporalLocationDateTime("i1",
				new DateTime(2013, 11, 04, 0, 0, 0));

		assertEquals(WEO.TimePoint, s.getType());
	}

	@Test
	public void test11() {
		TemporalLocationDateTime s = new TemporalLocationDateTime("i1", "t1",
				new DateTime(2013, 11, 04, 0, 0, 0));

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		TemporalLocationDateTime s = new TemporalLocationDateTime("i1",
				new DateTime(2013, 11, 04, 0, 0, 0));

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		TemporalLocationDateTime s = new TemporalLocationDateTime("i1", "t1",
				new DateTime(2013, 11, 04, 0, 0, 0));

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		TemporalLocationDateTime s = new TemporalLocationDateTime(new DateTime(
				2013, 10, 31, 0, 0, 0));

		assertEquals(new DateTime(2013, 10, 31, 0, 0, 0), s.getValue());
	}

	@Test
	public void test15() {
		TemporalLocationDateTime s = new TemporalLocationDateTime(new DateTime(
				2013, 11, 1, 0, 0, 0));

		assertNotEquals(new DateTime(2013, 10, 31, 0, 0, 0), s.getValue());
	}

	@Test
	public void test16() {
		TemporalLocationDateTime s1 = new TemporalLocationDateTime(new DateTime(
				2013, 11, 1, 0, 0, 0));
		TemporalLocationDateTime s2 = new TemporalLocationDateTime(new DateTime(
						2013, 11, 1, 1, 0, 0));

		assertNotEquals(s1, s2);
	}

}
