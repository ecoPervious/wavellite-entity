/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.core.base.SpatialLocationPlace;
import fi.uef.envi.wavellite.entity.situation.base.AttributeValueSpatialLocation;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: AttributeValueSpatialLocationTest
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

public class AttributeValueSpatialLocationTest {

	@Test
	public void test1() {
		AttributeValueSpatialLocation e = new AttributeValueSpatialLocation(
				"i1");
		AttributeValueSpatialLocation a = new AttributeValueSpatialLocation(
				"i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		AttributeValueSpatialLocation e = new AttributeValueSpatialLocation(
				"i1", "t1");
		AttributeValueSpatialLocation a = new AttributeValueSpatialLocation(
				"i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		AttributeValueSpatialLocation e = new AttributeValueSpatialLocation(
				"i1");
		AttributeValueSpatialLocation a = new AttributeValueSpatialLocation(
				"i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		AttributeValueSpatialLocation e = new AttributeValueSpatialLocation(
				"i1", "t1");
		AttributeValueSpatialLocation a = new AttributeValueSpatialLocation(
				"i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		AttributeValueSpatialLocation s1 = new AttributeValueSpatialLocation(
				"i1");
		AttributeValueSpatialLocation s2 = new AttributeValueSpatialLocation(
				"i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		AttributeValueSpatialLocation s1 = new AttributeValueSpatialLocation(
				"i1", "t1");
		AttributeValueSpatialLocation s2 = new AttributeValueSpatialLocation(
				"i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		AttributeValueSpatialLocation s1 = new AttributeValueSpatialLocation(
				"i1");
		AttributeValueSpatialLocation s2 = new AttributeValueSpatialLocation(
				"i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		AttributeValueSpatialLocation s1 = new AttributeValueSpatialLocation(
				"i1", "t1");
		AttributeValueSpatialLocation s2 = new AttributeValueSpatialLocation(
				"i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		AttributeValueSpatialLocation s = new AttributeValueSpatialLocation(
				"i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		AttributeValueSpatialLocation s = new AttributeValueSpatialLocation(
				"i1");

		assertEquals(STO.Value, s.getType());
	}

	@Test
	public void test11() {
		AttributeValueSpatialLocation s = new AttributeValueSpatialLocation(
				"i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		AttributeValueSpatialLocation s = new AttributeValueSpatialLocation(
				"i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		AttributeValueSpatialLocation s = new AttributeValueSpatialLocation(
				"i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		AttributeValueSpatialLocation s1 = new AttributeValueSpatialLocation(
				"i1");
		AttributeValueSpatialLocation s2 = new AttributeValueSpatialLocation(
				"i1");

		s1.setValue(new SpatialLocationPlace("sl1", "l1"));
		s2.setValue(new SpatialLocationPlace("sl1", "l1"));

		assertEquals(s1, s2);
	}

	@Test
	public void test15() {
		AttributeValueSpatialLocation s1 = new AttributeValueSpatialLocation(
				"i1");
		AttributeValueSpatialLocation s2 = new AttributeValueSpatialLocation(
				"i1");

		s1.setValue(new SpatialLocationPlace("sl1", "l1"));
		s2.setValue(new SpatialLocationPlace("sl1", "l2"));

		assertNotEquals(s1, s2);
	}

}
