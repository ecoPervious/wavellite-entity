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
import fi.uef.envi.wavellite.entity.situation.base.AttributeValueTemporalLocation;
import fi.uef.envi.wavellite.vocabulary.WEO;

/**
 * <p>
 * Title: AttributeValueTemporalLocationTest
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

public class AttributeValueTemporalLocationTest {

	@Test
	public void test1() {
		AttributeValueTemporalLocation e = new AttributeValueTemporalLocation(
				"i1");
		AttributeValueTemporalLocation a = new AttributeValueTemporalLocation(
				"i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		AttributeValueTemporalLocation e = new AttributeValueTemporalLocation(
				"i1", "t1");
		AttributeValueTemporalLocation a = new AttributeValueTemporalLocation(
				"i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		AttributeValueTemporalLocation e = new AttributeValueTemporalLocation(
				"i1");
		AttributeValueTemporalLocation a = new AttributeValueTemporalLocation(
				"i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		AttributeValueTemporalLocation e = new AttributeValueTemporalLocation(
				"i1", "t1");
		AttributeValueTemporalLocation a = new AttributeValueTemporalLocation(
				"i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		AttributeValueTemporalLocation s1 = new AttributeValueTemporalLocation(
				"i1");
		AttributeValueTemporalLocation s2 = new AttributeValueTemporalLocation(
				"i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		AttributeValueTemporalLocation s1 = new AttributeValueTemporalLocation(
				"i1", "t1");
		AttributeValueTemporalLocation s2 = new AttributeValueTemporalLocation(
				"i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		AttributeValueTemporalLocation s1 = new AttributeValueTemporalLocation(
				"i1");
		AttributeValueTemporalLocation s2 = new AttributeValueTemporalLocation(
				"i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		AttributeValueTemporalLocation s1 = new AttributeValueTemporalLocation(
				"i1", "t1");
		AttributeValueTemporalLocation s2 = new AttributeValueTemporalLocation(
				"i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		AttributeValueTemporalLocation s = new AttributeValueTemporalLocation(
				"i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		AttributeValueTemporalLocation s = new AttributeValueTemporalLocation(
				"i1");

		assertEquals(WEO.AttributeValueTemporalLocation, s.getType());
	}

	@Test
	public void test11() {
		AttributeValueTemporalLocation s = new AttributeValueTemporalLocation(
				"i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		AttributeValueTemporalLocation s = new AttributeValueTemporalLocation(
				"i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		AttributeValueTemporalLocation s = new AttributeValueTemporalLocation(
				"i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		AttributeValueTemporalLocation s1 = new AttributeValueTemporalLocation(
				"i1");
		AttributeValueTemporalLocation s2 = new AttributeValueTemporalLocation(
				"i1");

		s1.setValue(new TemporalLocationDateTime("d1", new DateTime(2013, 11, 04, 0, 0, 0)));
		s2.setValue(new TemporalLocationDateTime("d1", new DateTime(2013, 11, 04, 0, 0, 0)));

		assertEquals(s1, s2);
	}

	@Test
	public void test15() {
		AttributeValueTemporalLocation s1 = new AttributeValueTemporalLocation(
				"i1");
		AttributeValueTemporalLocation s2 = new AttributeValueTemporalLocation(
				"i1");

		s1.setValue(new TemporalLocationDateTime("d1", new DateTime(2013, 11, 04, 0, 0, 0)));
		s2.setValue(new TemporalLocationDateTime("d1", new DateTime(2013, 11, 04, 1, 0, 0)));

		assertNotEquals(s1, s2);
	}

}
