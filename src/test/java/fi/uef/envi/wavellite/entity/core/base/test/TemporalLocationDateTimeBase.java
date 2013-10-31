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
import fi.uef.envi.wavellite.vocabulary.DUL;

/**
 * <p>
 * Title: TemporalLocationDateTimeBase
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

public class TemporalLocationDateTimeBase {

	@Test
	public void test1() {
		TemporalLocationDateTime e = new TemporalLocationDateTime("i1");
		TemporalLocationDateTime a = new TemporalLocationDateTime("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		TemporalLocationDateTime e = new TemporalLocationDateTime("i1", "t1");
		TemporalLocationDateTime a = new TemporalLocationDateTime("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		TemporalLocationDateTime e = new TemporalLocationDateTime("i1");
		TemporalLocationDateTime a = new TemporalLocationDateTime("i2");

		assertNotEquals(e, a);
	}

	@Test
	public void test4() {
		TemporalLocationDateTime e = new TemporalLocationDateTime("i1", "t1");
		TemporalLocationDateTime a = new TemporalLocationDateTime("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		TemporalLocationDateTime s1 = new TemporalLocationDateTime("i1");
		TemporalLocationDateTime s2 = new TemporalLocationDateTime("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		TemporalLocationDateTime s1 = new TemporalLocationDateTime("i1", "t1");
		TemporalLocationDateTime s2 = new TemporalLocationDateTime("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		TemporalLocationDateTime s1 = new TemporalLocationDateTime("i1");
		TemporalLocationDateTime s2 = new TemporalLocationDateTime("i2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		TemporalLocationDateTime s1 = new TemporalLocationDateTime("i1", "t1");
		TemporalLocationDateTime s2 = new TemporalLocationDateTime("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		TemporalLocationDateTime s = new TemporalLocationDateTime("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		TemporalLocationDateTime s = new TemporalLocationDateTime("i1");

		assertEquals(DUL.TimeInterval, s.getType());
	}

	@Test
	public void test11() {
		TemporalLocationDateTime s = new TemporalLocationDateTime("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		TemporalLocationDateTime s = new TemporalLocationDateTime("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		TemporalLocationDateTime s = new TemporalLocationDateTime("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		TemporalLocationDateTime s = new TemporalLocationDateTime(new DateTime(
				2013, 10, 31, 0, 0, 0));

		assertEquals(new DateTime(2013, 10, 31, 0, 0, 0), s.getDateTime());
	}
	
	@Test
	public void test15() {
		TemporalLocationDateTime s = new TemporalLocationDateTime(new DateTime(
				2013, 11, 1, 0, 0, 0));

		assertNotEquals(new DateTime(2013, 10, 31, 0, 0, 0), s.getDateTime());
	}

}
