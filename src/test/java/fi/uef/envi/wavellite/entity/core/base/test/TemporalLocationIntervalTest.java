/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.junit.Test;

import fi.uef.envi.wavellite.entity.core.base.TemporalLocationDateTime;
import fi.uef.envi.wavellite.entity.core.base.TemporalLocationInterval;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: TemporalLocationIntervalTest
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

public class TemporalLocationIntervalTest {

	@Test
	public void test1() {
		TemporalLocationInterval e = new TemporalLocationInterval(
				"i1",
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));
		TemporalLocationInterval a = new TemporalLocationInterval("i1",
				new TemporalLocationDateTime("i2", new DateTime(2013, 11, 4, 0,
						0, 0)), new TemporalLocationDateTime("i2",
						new DateTime(2013, 11, 4, 1, 0, 0)));

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		TemporalLocationInterval e = new TemporalLocationInterval(
				"i1",
				"t1",
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));
		TemporalLocationInterval a = new TemporalLocationInterval("i1", "t1",
				new TemporalLocationDateTime("i2", new DateTime(2013, 11, 4, 0,
						0, 0)), new TemporalLocationDateTime("i2",
						new DateTime(2013, 11, 4, 1, 0, 0)));

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		TemporalLocationInterval e = new TemporalLocationInterval(
				"i1",
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));
		TemporalLocationInterval a = new TemporalLocationInterval("i2",
				new TemporalLocationDateTime("i2", new DateTime(2013, 11, 4, 0,
						0, 0)), new TemporalLocationDateTime("i2",
						new DateTime(2013, 11, 4, 1, 0, 0)));

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		TemporalLocationInterval e = new TemporalLocationInterval(
				"i1",
				"t1",
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));
		TemporalLocationInterval a = new TemporalLocationInterval("i1", "t2",
				new TemporalLocationDateTime("i2", "t2", new DateTime(2013, 11,
						4, 0, 0, 0)), new TemporalLocationDateTime("i2", "t2",
						new DateTime(2013, 11, 4, 1, 0, 0)));

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		TemporalLocationInterval s1 = new TemporalLocationInterval(
				"i1",
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));
		TemporalLocationInterval s2 = new TemporalLocationInterval("i1",
				new TemporalLocationDateTime("i2", new DateTime(2013, 11, 4, 0,
						0, 0)), new TemporalLocationDateTime("i2",
						new DateTime(2013, 11, 4, 1, 0, 0)));

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		TemporalLocationInterval s1 = new TemporalLocationInterval(
				"i1",
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));
		TemporalLocationInterval s2 = new TemporalLocationInterval("i1",
				new TemporalLocationDateTime("i2", new DateTime(2013, 11, 4, 0,
						0, 0)), new TemporalLocationDateTime("i2",
						new DateTime(2013, 11, 4, 1, 0, 0)));

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		TemporalLocationInterval s1 = new TemporalLocationInterval(
				"i1",
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));
		TemporalLocationInterval s2 = new TemporalLocationInterval("i2",
				new TemporalLocationDateTime("i2", new DateTime(2013, 11, 4, 0,
						0, 0)), new TemporalLocationDateTime("i2",
						new DateTime(2013, 11, 4, 1, 0, 0)));

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		TemporalLocationInterval s1 = new TemporalLocationInterval(
				"i1",
				"t1",
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));
		TemporalLocationInterval s2 = new TemporalLocationInterval("i1", "t2",
				new TemporalLocationDateTime("i2", "t2", new DateTime(2013, 11,
						4, 0, 0, 0)), new TemporalLocationDateTime("i2", "t2",
						new DateTime(2013, 11, 4, 1, 0, 0)));

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		TemporalLocationInterval s = new TemporalLocationInterval(
				"i1",
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		TemporalLocationInterval s = new TemporalLocationInterval(
				"i1",
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));

		assertEquals(WTO.TimeInterval, s.getType());
	}

	@Test
	public void test11() {
		TemporalLocationInterval s = new TemporalLocationInterval(
				"i1",
				"t1",
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		TemporalLocationInterval s = new TemporalLocationInterval(
				"i1",
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		TemporalLocationInterval s = new TemporalLocationInterval(
				"i1",
				"t1",
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		TemporalLocationInterval s = new TemporalLocationInterval(
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));

		assertEquals(new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0,
				0, 0)), s.getStart());
		assertEquals(new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1,
				0, 0)), s.getEnd());
		assertEquals(new Interval(new DateTime(2013, 11, 4, 0, 0, 0),
				new DateTime(2013, 11, 4, 1, 0, 0)), s.getValue());
	}

	@Test
	public void test15() {
		TemporalLocationInterval s = new TemporalLocationInterval(
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));

		assertNotEquals(new DateTime(2013, 11, 5, 0, 0, 0), s.getStart());
		assertNotEquals(new DateTime(2013, 11, 5, 1, 0, 0), s.getEnd());
		assertNotEquals(new Interval(new DateTime(2013, 11, 5, 0, 0, 0),
				new DateTime(2013, 11, 5, 1, 0, 0)), s.getValue());
	}

	@Test
	public void test16() {
		TemporalLocationInterval s1 = new TemporalLocationInterval(
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 4, 1, 0, 0)));
		TemporalLocationInterval s2 = new TemporalLocationInterval(
				new TemporalLocationDateTime(new DateTime(2013, 11, 5, 0, 0, 0)),
				new TemporalLocationDateTime(new DateTime(2013, 11, 5, 1, 0, 0)));

		assertNotEquals(s1, s2);
	}

}
