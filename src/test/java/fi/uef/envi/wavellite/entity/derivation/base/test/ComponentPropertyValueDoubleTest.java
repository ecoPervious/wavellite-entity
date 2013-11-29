/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueDouble;
import fi.uef.envi.wavellite.vocabulary.WO;

/**
 * <p>
 * Title: ComponentPropertyValueDoubleTest
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

public class ComponentPropertyValueDoubleTest {

	@Test
	public void test1() {
		ComponentPropertyValueDouble e = new ComponentPropertyValueDouble("i1");
		ComponentPropertyValueDouble a = new ComponentPropertyValueDouble("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ComponentPropertyValueDouble e = new ComponentPropertyValueDouble("i1",
				"t1");
		ComponentPropertyValueDouble a = new ComponentPropertyValueDouble("i1",
				"t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		ComponentPropertyValueDouble e = new ComponentPropertyValueDouble("i1");
		ComponentPropertyValueDouble a = new ComponentPropertyValueDouble("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		ComponentPropertyValueDouble e = new ComponentPropertyValueDouble("i1",
				"t1");
		ComponentPropertyValueDouble a = new ComponentPropertyValueDouble("i1",
				"t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		ComponentPropertyValueDouble s1 = new ComponentPropertyValueDouble("i1");
		ComponentPropertyValueDouble s2 = new ComponentPropertyValueDouble("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		ComponentPropertyValueDouble s1 = new ComponentPropertyValueDouble(
				"i1", "t1");
		ComponentPropertyValueDouble s2 = new ComponentPropertyValueDouble(
				"i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		ComponentPropertyValueDouble s1 = new ComponentPropertyValueDouble("i1");
		ComponentPropertyValueDouble s2 = new ComponentPropertyValueDouble("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		ComponentPropertyValueDouble s1 = new ComponentPropertyValueDouble(
				"i1", "t1");
		ComponentPropertyValueDouble s2 = new ComponentPropertyValueDouble(
				"i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		ComponentPropertyValueDouble s = new ComponentPropertyValueDouble("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		ComponentPropertyValueDouble s = new ComponentPropertyValueDouble("i1");

		assertEquals(WO.ComponentPropertyValueDouble, s.getType());
	}

	@Test
	public void test11() {
		ComponentPropertyValueDouble s = new ComponentPropertyValueDouble("i1",
				"t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		ComponentPropertyValueDouble s = new ComponentPropertyValueDouble("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		ComponentPropertyValueDouble s = new ComponentPropertyValueDouble("i1",
				"t1");

		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test14() {
		ComponentPropertyValueDouble e = new ComponentPropertyValueDouble("i1", 0.0);
		ComponentPropertyValueDouble a = new ComponentPropertyValueDouble("i1", 0.0);
		
		assertEquals(e, a);
	}
	
	@Test
	public void test15() {
		ComponentPropertyValueDouble e = new ComponentPropertyValueDouble("i1", 0.5);
		ComponentPropertyValueDouble a = new ComponentPropertyValueDouble("i1", 0.0);
		
		assertNotEquals(e, a);
	}

}
