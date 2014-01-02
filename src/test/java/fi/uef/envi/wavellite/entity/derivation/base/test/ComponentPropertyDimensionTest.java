/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyDimension;
import fi.uef.envi.wavellite.vocabulary.QB;

/**
 * <p>
 * Title: ComponentPropertyDimension
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

public class ComponentPropertyDimensionTest {

	@Test
	public void test1() {
		ComponentPropertyDimension e = new ComponentPropertyDimension("i1");
		ComponentPropertyDimension a = new ComponentPropertyDimension("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ComponentPropertyDimension e = new ComponentPropertyDimension("i1",
				"t1");
		ComponentPropertyDimension a = new ComponentPropertyDimension("i1",
				"t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		ComponentPropertyDimension e = new ComponentPropertyDimension("i1");
		ComponentPropertyDimension a = new ComponentPropertyDimension("i2");

		assertNotEquals(e, a);
	}

	@Test
	public void test4() {
		ComponentPropertyDimension e = new ComponentPropertyDimension("i1",
				"t1");
		ComponentPropertyDimension a = new ComponentPropertyDimension("i1",
				"t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		ComponentPropertyDimension s1 = new ComponentPropertyDimension("i1");
		ComponentPropertyDimension s2 = new ComponentPropertyDimension("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		ComponentPropertyDimension s1 = new ComponentPropertyDimension("i1",
				"t1");
		ComponentPropertyDimension s2 = new ComponentPropertyDimension("i1",
				"t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		ComponentPropertyDimension s1 = new ComponentPropertyDimension("i1");
		ComponentPropertyDimension s2 = new ComponentPropertyDimension("i2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		ComponentPropertyDimension s1 = new ComponentPropertyDimension("i1",
				"t1");
		ComponentPropertyDimension s2 = new ComponentPropertyDimension("i1",
				"t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		ComponentPropertyDimension s = new ComponentPropertyDimension("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		ComponentPropertyDimension s = new ComponentPropertyDimension("i1");

		assertEquals(QB.DimensionProperty, s.getType());
	}

	@Test
	public void test11() {
		ComponentPropertyDimension s = new ComponentPropertyDimension("i1",
				"t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		ComponentPropertyDimension s = new ComponentPropertyDimension("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		ComponentPropertyDimension s = new ComponentPropertyDimension("i1",
				"t1");

		assertNotEquals("t2", s.getType());
	}

}
