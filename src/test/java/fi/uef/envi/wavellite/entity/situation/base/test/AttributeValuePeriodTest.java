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

import fi.uef.envi.wavellite.entity.situation.base.AttributeValuePeriod;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: AttributeValuePeriodTest
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

public class AttributeValuePeriodTest {

	@Test
	public void test1() {
		AttributeValuePeriod e = new AttributeValuePeriod("i1");
		AttributeValuePeriod a = new AttributeValuePeriod("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		AttributeValuePeriod e = new AttributeValuePeriod("i1", "t1");
		AttributeValuePeriod a = new AttributeValuePeriod("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		AttributeValuePeriod e = new AttributeValuePeriod("i1");
		AttributeValuePeriod a = new AttributeValuePeriod("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		AttributeValuePeriod e = new AttributeValuePeriod("i1", "t1");
		AttributeValuePeriod a = new AttributeValuePeriod("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		AttributeValuePeriod s1 = new AttributeValuePeriod("i1");
		AttributeValuePeriod s2 = new AttributeValuePeriod("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		AttributeValuePeriod s1 = new AttributeValuePeriod("i1", "t1");
		AttributeValuePeriod s2 = new AttributeValuePeriod("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		AttributeValuePeriod s1 = new AttributeValuePeriod("i1");
		AttributeValuePeriod s2 = new AttributeValuePeriod("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		AttributeValuePeriod s1 = new AttributeValuePeriod("i1", "t1");
		AttributeValuePeriod s2 = new AttributeValuePeriod("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		AttributeValuePeriod s = new AttributeValuePeriod("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		AttributeValuePeriod s = new AttributeValuePeriod("i1");

		assertEquals(STO.Value, s.getType());
	}

	@Test
	public void test11() {
		AttributeValuePeriod s = new AttributeValuePeriod("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		AttributeValuePeriod s = new AttributeValuePeriod("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		AttributeValuePeriod s = new AttributeValuePeriod("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		AttributeValuePeriod s1 = new AttributeValuePeriod("i1");
		AttributeValuePeriod s2 = new AttributeValuePeriod("i1");

		s1.setValue(new Period(new DateTime(2011, 1, 1, 0, 0, 0), new DateTime(
				2011, 1, 1, 0, 0, 1)));
		s2.setValue(new Period(new DateTime(2011, 1, 1, 0, 0, 0), new DateTime(
				2011, 1, 1, 0, 0, 1)));

		assertEquals(s1, s2);
	}

	@Test
	public void test15() {
		AttributeValuePeriod s1 = new AttributeValuePeriod("i1");
		AttributeValuePeriod s2 = new AttributeValuePeriod("i1");

		s1.setValue(new Period(new DateTime(2011, 1, 1, 0, 0, 0), new DateTime(
				2011, 1, 1, 0, 0, 1)));
		s1.setValue(new Period(new DateTime(2011, 1, 1, 0, 0, 0), new DateTime(
				2011, 1, 1, 0, 0, 2)));

		assertNotEquals(s1, s2);
	}

}
