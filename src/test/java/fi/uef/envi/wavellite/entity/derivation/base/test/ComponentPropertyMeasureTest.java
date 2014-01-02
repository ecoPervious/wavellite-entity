/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyMeasure;
import fi.uef.envi.wavellite.vocabulary.QB;

/**
 * <p>
 * Title: ComponentPropertyMeasure
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

public class ComponentPropertyMeasureTest {

	@Test
	public void test1() {
		ComponentPropertyMeasure e = new ComponentPropertyMeasure("i1");
		ComponentPropertyMeasure a = new ComponentPropertyMeasure("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ComponentPropertyMeasure e = new ComponentPropertyMeasure("i1", "t1");
		ComponentPropertyMeasure a = new ComponentPropertyMeasure("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		ComponentPropertyMeasure e = new ComponentPropertyMeasure("i1");
		ComponentPropertyMeasure a = new ComponentPropertyMeasure("i2");

		assertNotEquals(e, a);
	}

	@Test
	public void test4() {
		ComponentPropertyMeasure e = new ComponentPropertyMeasure("i1", "t1");
		ComponentPropertyMeasure a = new ComponentPropertyMeasure("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		ComponentPropertyMeasure s1 = new ComponentPropertyMeasure("i1");
		ComponentPropertyMeasure s2 = new ComponentPropertyMeasure("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		ComponentPropertyMeasure s1 = new ComponentPropertyMeasure("i1", "t1");
		ComponentPropertyMeasure s2 = new ComponentPropertyMeasure("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		ComponentPropertyMeasure s1 = new ComponentPropertyMeasure("i1");
		ComponentPropertyMeasure s2 = new ComponentPropertyMeasure("i2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		ComponentPropertyMeasure s1 = new ComponentPropertyMeasure("i1", "t1");
		ComponentPropertyMeasure s2 = new ComponentPropertyMeasure("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		ComponentPropertyMeasure s = new ComponentPropertyMeasure("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		ComponentPropertyMeasure s = new ComponentPropertyMeasure("i1");

		assertEquals(QB.MeasureProperty, s.getType());
	}

	@Test
	public void test11() {
		ComponentPropertyMeasure s = new ComponentPropertyMeasure("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		ComponentPropertyMeasure s = new ComponentPropertyMeasure("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		ComponentPropertyMeasure s = new ComponentPropertyMeasure("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

}
