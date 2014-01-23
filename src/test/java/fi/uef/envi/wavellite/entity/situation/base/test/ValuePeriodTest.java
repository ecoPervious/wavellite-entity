/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.junit.Test;

import fi.uef.envi.wavellite.entity.situation.base.ValuePeriod;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: ValuePeriodTest
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

public class ValuePeriodTest {

	@Test
	public void test1() {
		ValuePeriod e = new ValuePeriod("i1");
		ValuePeriod a = new ValuePeriod("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ValuePeriod e = new ValuePeriod("i1", "t1");
		ValuePeriod a = new ValuePeriod("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		ValuePeriod e = new ValuePeriod("i1");
		ValuePeriod a = new ValuePeriod("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		ValuePeriod e = new ValuePeriod("i1", "t1");
		ValuePeriod a = new ValuePeriod("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		ValuePeriod s1 = new ValuePeriod("i1");
		ValuePeriod s2 = new ValuePeriod("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		ValuePeriod s1 = new ValuePeriod("i1", "t1");
		ValuePeriod s2 = new ValuePeriod("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		ValuePeriod s1 = new ValuePeriod("i1");
		ValuePeriod s2 = new ValuePeriod("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		ValuePeriod s1 = new ValuePeriod("i1", "t1");
		ValuePeriod s2 = new ValuePeriod("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		ValuePeriod s = new ValuePeriod("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		ValuePeriod s = new ValuePeriod("i1");

		assertEquals(STO.Value, s.getType());
	}

	@Test
	public void test11() {
		ValuePeriod s = new ValuePeriod("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		ValuePeriod s = new ValuePeriod("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		ValuePeriod s = new ValuePeriod("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		ValuePeriod s1 = new ValuePeriod("i1");
		ValuePeriod s2 = new ValuePeriod("i1");

		s1.setValue(new Period(new DateTime(2011, 1, 1, 0, 0, 0), new DateTime(
				2011, 1, 1, 0, 0, 1)));
		s2.setValue(new Period(new DateTime(2011, 1, 1, 0, 0, 0), new DateTime(
				2011, 1, 1, 0, 0, 1)));

		assertEquals(s1, s2);
	}

	@Test
	public void test15() {
		ValuePeriod s1 = new ValuePeriod("i1");
		ValuePeriod s2 = new ValuePeriod("i1");

		s1.setValue(new Period(new DateTime(2011, 1, 1, 0, 0, 0), new DateTime(
				2011, 1, 1, 0, 0, 1)));
		s1.setValue(new Period(new DateTime(2011, 1, 1, 0, 0, 0), new DateTime(
				2011, 1, 1, 0, 0, 2)));

		assertNotEquals(s1, s2);
	}

}
