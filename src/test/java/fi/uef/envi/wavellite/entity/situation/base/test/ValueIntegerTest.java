/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.situation.base.ValueInteger;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: ValueIntegerTest
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

public class ValueIntegerTest {

	@Test
	public void test1() {
		ValueInteger e = new ValueInteger("i1", 0);
		ValueInteger a = new ValueInteger("i1", 0);

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ValueInteger e = new ValueInteger("i1", 0);
		ValueInteger a = new ValueInteger("i1", 1);

		assertNotEquals(e, a);
	}

	@Test
	public void test3() {
		ValueInteger s1 = new ValueInteger("i1", 0);
		ValueInteger s2 = new ValueInteger("i1", 0);

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test4() {
		ValueInteger s1 = new ValueInteger("i1", 0);
		ValueInteger s2 = new ValueInteger("i1", 1);

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test5() {
		ValueInteger s = new ValueInteger("i1", 0);

		assertEquals("i1", s.getId());
	}

	@Test
	public void test6() {
		ValueInteger s = new ValueInteger("i1", 0);

		assertEquals(STO.Value, s.getType());
	}

	@Test
	public void test7() {
		ValueInteger s = new ValueInteger("i1", "t1", 0);

		assertEquals("t1", s.getType());
	}

	@Test
	public void test8() {
		ValueInteger s = new ValueInteger("i1", 0);

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test9() {
		ValueInteger s = new ValueInteger("i1", "t1", 0);

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test10() {
		ValueInteger s1 = new ValueInteger("i1");
		ValueInteger s2 = new ValueInteger("i1");

		s1.setValue("v1");
		s2.setValue("v1");

		assertEquals(s1, s2);
	}

	@Test
	public void test15() {
		ValueInteger s1 = new ValueInteger("i1");
		ValueInteger s2 = new ValueInteger("i1");

		s1.setValue("v1");
		s2.setValue("v2");

		assertNotEquals(s1, s2);
	}

}
