/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyBase;
import fi.uef.envi.wavellite.vocabulary.QB;

/**
 * <p>
 * Title: ComponentPropertyBaseTest
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

public class ComponentPropertyBaseTest {

	@Test
	public void test1() {
		ComponentPropertyBase e = new ComponentPropertyBase("i1");
		ComponentPropertyBase a = new ComponentPropertyBase("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ComponentPropertyBase e = new ComponentPropertyBase("i1", "t1");
		ComponentPropertyBase a = new ComponentPropertyBase("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		ComponentPropertyBase e = new ComponentPropertyBase("i1");
		ComponentPropertyBase a = new ComponentPropertyBase("i2");

		assertNotEquals(e, a);
	}

	@Test
	public void test4() {
		ComponentPropertyBase e = new ComponentPropertyBase("i1", "t1");
		ComponentPropertyBase a = new ComponentPropertyBase("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		ComponentPropertyBase s1 = new ComponentPropertyBase("i1");
		ComponentPropertyBase s2 = new ComponentPropertyBase("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		ComponentPropertyBase s1 = new ComponentPropertyBase("i1", "t1");
		ComponentPropertyBase s2 = new ComponentPropertyBase("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		ComponentPropertyBase s1 = new ComponentPropertyBase("i1");
		ComponentPropertyBase s2 = new ComponentPropertyBase("i2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		ComponentPropertyBase s1 = new ComponentPropertyBase("i1", "t1");
		ComponentPropertyBase s2 = new ComponentPropertyBase("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		ComponentPropertyBase s = new ComponentPropertyBase("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		ComponentPropertyBase s = new ComponentPropertyBase("i1");

		assertEquals(QB.ComponentProperty, s.getType());
	}

	@Test
	public void test11() {
		ComponentPropertyBase s = new ComponentPropertyBase("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		ComponentPropertyBase s = new ComponentPropertyBase("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		ComponentPropertyBase s = new ComponentPropertyBase("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

}
