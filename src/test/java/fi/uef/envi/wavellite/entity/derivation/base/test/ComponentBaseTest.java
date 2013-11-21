/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.derivation.base.ComponentBase;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyBase;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueInteger;
import fi.uef.envi.wavellite.vocabulary.WO;

/**
 * <p>
 * Title: ComponentBaseTest
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

public class ComponentBaseTest {

	@Test
	public void test1() {
		ComponentBase e = new ComponentBase("i1");
		ComponentBase a = new ComponentBase("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ComponentBase e = new ComponentBase("i1", "t1");
		ComponentBase a = new ComponentBase("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		ComponentBase e = new ComponentBase("i1");
		ComponentBase a = new ComponentBase("i2");

		assertNotEquals(e, a);
	}

	@Test
	public void test4() {
		ComponentBase e = new ComponentBase("i1", "t1");
		ComponentBase a = new ComponentBase("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		ComponentBase s1 = new ComponentBase("i1");
		ComponentBase s2 = new ComponentBase("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		ComponentBase s1 = new ComponentBase("i1", "t1");
		ComponentBase s2 = new ComponentBase("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		ComponentBase s1 = new ComponentBase("i1");
		ComponentBase s2 = new ComponentBase("i2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		ComponentBase s1 = new ComponentBase("i1", "t1");
		ComponentBase s2 = new ComponentBase("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		ComponentBase s = new ComponentBase("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		ComponentBase s = new ComponentBase("i1");

		assertEquals(WO.Component, s.getType());
	}

	@Test
	public void test11() {
		ComponentBase s = new ComponentBase("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		ComponentBase s = new ComponentBase("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		ComponentBase s = new ComponentBase("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		ComponentBase e = new ComponentBase("c1", new ComponentPropertyBase(
				"p1"), new ComponentPropertyValueInteger("v1", 1));
		ComponentBase a = new ComponentBase("c1", new ComponentPropertyBase(
				"p1"), new ComponentPropertyValueInteger("v1", 1));

		assertEquals(e, a);
	}

	@Test
	public void test15() {
		ComponentBase e = new ComponentBase("c1", new ComponentPropertyBase(
				"p1"), new ComponentPropertyValueInteger("v1", 1));
		ComponentBase a = new ComponentBase("c1", new ComponentPropertyBase(
				"p1"), new ComponentPropertyValueInteger("v1", 0));

		assertNotEquals(e, a);
	}

}
