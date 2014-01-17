/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.core.base.SpatialLocationPlace;
import fi.uef.envi.wavellite.entity.situation.base.AttributeSpatialLocation;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: AttributeSpatialLocationTest
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

public class AttributeSpatialLocationTest {

	@Test
	public void test1() {
		AttributeSpatialLocation e = new AttributeSpatialLocation("i1");
		AttributeSpatialLocation a = new AttributeSpatialLocation("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		AttributeSpatialLocation e = new AttributeSpatialLocation("i1", "t1");
		AttributeSpatialLocation a = new AttributeSpatialLocation("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		AttributeSpatialLocation e = new AttributeSpatialLocation("i1");
		AttributeSpatialLocation a = new AttributeSpatialLocation("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		AttributeSpatialLocation e = new AttributeSpatialLocation("i1", "t1");
		AttributeSpatialLocation a = new AttributeSpatialLocation("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		AttributeSpatialLocation s1 = new AttributeSpatialLocation("i1");
		AttributeSpatialLocation s2 = new AttributeSpatialLocation("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		AttributeSpatialLocation s1 = new AttributeSpatialLocation("i1", "t1");
		AttributeSpatialLocation s2 = new AttributeSpatialLocation("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		AttributeSpatialLocation s1 = new AttributeSpatialLocation("i1");
		AttributeSpatialLocation s2 = new AttributeSpatialLocation("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		AttributeSpatialLocation s1 = new AttributeSpatialLocation("i1", "t1");
		AttributeSpatialLocation s2 = new AttributeSpatialLocation("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		AttributeSpatialLocation s = new AttributeSpatialLocation("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		AttributeSpatialLocation s = new AttributeSpatialLocation("i1");

		assertEquals(STO.Attribute, s.getType());
	}

	@Test
	public void test11() {
		AttributeSpatialLocation s = new AttributeSpatialLocation("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		AttributeSpatialLocation s = new AttributeSpatialLocation("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		AttributeSpatialLocation s = new AttributeSpatialLocation("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		AttributeSpatialLocation s1 = new AttributeSpatialLocation(
				new SpatialLocationPlace("l1"));
		AttributeSpatialLocation s2 = new AttributeSpatialLocation(
				new SpatialLocationPlace("l1"));

		assertEquals(s1, s2);
	}

	@Test
	public void test15() {
		AttributeSpatialLocation s1 = new AttributeSpatialLocation(
				new SpatialLocationPlace("l1"));
		AttributeSpatialLocation s2 = new AttributeSpatialLocation(
				new SpatialLocationPlace("l2"));

		assertNotEquals(s1, s2);
	}

}
