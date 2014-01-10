/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueString;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: ComponentPropertyValueStringTest
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

public class ComponentPropertyValueStringTest {

	@Test
	public void test1() {
		ComponentPropertyValueString e = new ComponentPropertyValueString("i1");
		ComponentPropertyValueString a = new ComponentPropertyValueString("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ComponentPropertyValueString e = new ComponentPropertyValueString("i1",
				"t1");
		ComponentPropertyValueString a = new ComponentPropertyValueString("i1",
				"t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		ComponentPropertyValueString e = new ComponentPropertyValueString("i1",
				"t1");
		ComponentPropertyValueString a = new ComponentPropertyValueString("i2",
				"t1");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		ComponentPropertyValueString e = new ComponentPropertyValueString("i1",
				"t1");
		ComponentPropertyValueString a = new ComponentPropertyValueString("i1",
				"t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		ComponentPropertyValueString s1 = new ComponentPropertyValueString("i1");
		ComponentPropertyValueString s2 = new ComponentPropertyValueString("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		ComponentPropertyValueString s1 = new ComponentPropertyValueString(
				"i1", "t1");
		ComponentPropertyValueString s2 = new ComponentPropertyValueString(
				"i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		ComponentPropertyValueString s1 = new ComponentPropertyValueString("i1", "s1");
		ComponentPropertyValueString s2 = new ComponentPropertyValueString("i2", "s1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		ComponentPropertyValueString s1 = new ComponentPropertyValueString(
				"i1", "t1");
		ComponentPropertyValueString s2 = new ComponentPropertyValueString(
				"i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		ComponentPropertyValueString s = new ComponentPropertyValueString("i1", "s1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		ComponentPropertyValueString s = new ComponentPropertyValueString("i1");

		assertEquals(WOE.ComponentPropertyValueString, s.getType());
	}

	@Test
	public void test11() {
		ComponentPropertyValueString s = new ComponentPropertyValueString("i1",
				"t1", "s1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		ComponentPropertyValueString s = new ComponentPropertyValueString("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		ComponentPropertyValueString s = new ComponentPropertyValueString("i1",
				"t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		ComponentPropertyValueString e = new ComponentPropertyValueString("i1",
				"s1");
		ComponentPropertyValueString a = new ComponentPropertyValueString("i1",
				"s1");

		assertEquals(e, a);
	}

	@Test
	public void test15() {
		ComponentPropertyValueString e = new ComponentPropertyValueString("i1",
				"s1");
		ComponentPropertyValueString a = new ComponentPropertyValueString("i1",
				"s2");

		assertNotEquals(e, a);
	}

}
