/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.situation.base.AttributeValueInteger;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: AttributeValueIntegerTest
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

public class AttributeValueIntegerTest {

	@Test
	public void test1() {
		AttributeValueInteger e = new AttributeValueInteger("i1", 0);
		AttributeValueInteger a = new AttributeValueInteger("i1", 0);

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		AttributeValueInteger e = new AttributeValueInteger("i1", 0);
		AttributeValueInteger a = new AttributeValueInteger("i1", 1);

		assertNotEquals(e, a);
	}

	@Test
	public void test3() {
		AttributeValueInteger s1 = new AttributeValueInteger("i1", 0);
		AttributeValueInteger s2 = new AttributeValueInteger("i1", 0);

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test4() {
		AttributeValueInteger s1 = new AttributeValueInteger("i1", 0);
		AttributeValueInteger s2 = new AttributeValueInteger("i1", 1);

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test5() {
		AttributeValueInteger s = new AttributeValueInteger("i1", 0);

		assertEquals("i1", s.getId());
	}

	@Test
	public void test6() {
		AttributeValueInteger s = new AttributeValueInteger("i1", 0);

		assertEquals(WOE.AttributeValueInteger, s.getType());
	}

	@Test
	public void test7() {
		AttributeValueInteger s = new AttributeValueInteger("i1", "t1", 0);

		assertEquals("t1", s.getType());
	}

	@Test
	public void test8() {
		AttributeValueInteger s = new AttributeValueInteger("i1", 0);

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test9() {
		AttributeValueInteger s = new AttributeValueInteger("i1", "t1", 0);

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test10() {
		AttributeValueInteger s1 = new AttributeValueInteger("i1");
		AttributeValueInteger s2 = new AttributeValueInteger("i1");

		s1.setValue("v1");
		s2.setValue("v1");

		assertEquals(s1, s2);
	}

	@Test
	public void test15() {
		AttributeValueInteger s1 = new AttributeValueInteger("i1");
		AttributeValueInteger s2 = new AttributeValueInteger("i1");

		s1.setValue("v1");
		s2.setValue("v2");

		assertNotEquals(s1, s2);
	}

}
