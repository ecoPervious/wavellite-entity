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
import fi.uef.envi.wavellite.entity.situation.base.AttributeTemporalLocation;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: AttributeTemporalLocationTest
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

public class AttributeTemporalLocationTest {

	@Test
	public void test1() {
		AttributeTemporalLocation e = new AttributeTemporalLocation("i1");
		AttributeTemporalLocation a = new AttributeTemporalLocation("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		AttributeTemporalLocation e = new AttributeTemporalLocation("i1", "t1");
		AttributeTemporalLocation a = new AttributeTemporalLocation("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		AttributeTemporalLocation e = new AttributeTemporalLocation("i1");
		AttributeTemporalLocation a = new AttributeTemporalLocation("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		AttributeTemporalLocation e = new AttributeTemporalLocation("i1", "t1");
		AttributeTemporalLocation a = new AttributeTemporalLocation("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		AttributeTemporalLocation s1 = new AttributeTemporalLocation("i1");
		AttributeTemporalLocation s2 = new AttributeTemporalLocation("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		AttributeTemporalLocation s1 = new AttributeTemporalLocation("i1", "t1");
		AttributeTemporalLocation s2 = new AttributeTemporalLocation("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		AttributeTemporalLocation s1 = new AttributeTemporalLocation("i1");
		AttributeTemporalLocation s2 = new AttributeTemporalLocation("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		AttributeTemporalLocation s1 = new AttributeTemporalLocation("i1", "t1");
		AttributeTemporalLocation s2 = new AttributeTemporalLocation("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		AttributeTemporalLocation s = new AttributeTemporalLocation("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		AttributeTemporalLocation s = new AttributeTemporalLocation("i1");

		assertEquals(STO.Attribute, s.getType());
	}

	@Test
	public void test11() {
		AttributeTemporalLocation s = new AttributeTemporalLocation("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		AttributeTemporalLocation s = new AttributeTemporalLocation("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		AttributeTemporalLocation s = new AttributeTemporalLocation("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		AttributeTemporalLocation s1 = new AttributeTemporalLocation(
				new TemporalLocationDateTime(new DateTime(2014, 1, 10, 0, 0, 0)));
		AttributeTemporalLocation s2 = new AttributeTemporalLocation(
				new TemporalLocationDateTime(new DateTime(2014, 1, 10, 0, 0, 0)));

		assertEquals(s1, s2);
	}

	@Test
	public void test15() {
		AttributeTemporalLocation s1 = new AttributeTemporalLocation(
				new TemporalLocationDateTime(new DateTime(2014, 1, 10, 0, 0, 0)));
		AttributeTemporalLocation s2 = new AttributeTemporalLocation(
				new TemporalLocationDateTime(new DateTime(2014, 1, 10, 1, 0, 0)));

		assertNotEquals(s1, s2);
	}

}
