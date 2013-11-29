/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueInteger;
import fi.uef.envi.wavellite.vocabulary.WO;

/**
 * <p>
 * Title: ComponentPropertyValueIntegerTest
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

public class ComponentPropertyValueIntegerTest {

	@Test
	public void test1() {
		ComponentPropertyValueInteger e = new ComponentPropertyValueInteger("i1");
		ComponentPropertyValueInteger a = new ComponentPropertyValueInteger("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ComponentPropertyValueInteger e = new ComponentPropertyValueInteger("i1",
				"t1");
		ComponentPropertyValueInteger a = new ComponentPropertyValueInteger("i1",
				"t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		ComponentPropertyValueInteger e = new ComponentPropertyValueInteger("i1");
		ComponentPropertyValueInteger a = new ComponentPropertyValueInteger("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		ComponentPropertyValueInteger e = new ComponentPropertyValueInteger("i1",
				"t1");
		ComponentPropertyValueInteger a = new ComponentPropertyValueInteger("i1",
				"t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		ComponentPropertyValueInteger s1 = new ComponentPropertyValueInteger("i1");
		ComponentPropertyValueInteger s2 = new ComponentPropertyValueInteger("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		ComponentPropertyValueInteger s1 = new ComponentPropertyValueInteger(
				"i1", "t1");
		ComponentPropertyValueInteger s2 = new ComponentPropertyValueInteger(
				"i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		ComponentPropertyValueInteger s1 = new ComponentPropertyValueInteger("i1");
		ComponentPropertyValueInteger s2 = new ComponentPropertyValueInteger("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		ComponentPropertyValueInteger s1 = new ComponentPropertyValueInteger(
				"i1", "t1");
		ComponentPropertyValueInteger s2 = new ComponentPropertyValueInteger(
				"i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		ComponentPropertyValueInteger s = new ComponentPropertyValueInteger("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		ComponentPropertyValueInteger s = new ComponentPropertyValueInteger("i1");

		assertEquals(WO.ComponentPropertyValueInteger, s.getType());
	}

	@Test
	public void test11() {
		ComponentPropertyValueInteger s = new ComponentPropertyValueInteger("i1",
				"t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		ComponentPropertyValueInteger s = new ComponentPropertyValueInteger("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		ComponentPropertyValueInteger s = new ComponentPropertyValueInteger("i1",
				"t1");
		
		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test14() {
		ComponentPropertyValueInteger e = new ComponentPropertyValueInteger("i1", 0);
		ComponentPropertyValueInteger a = new ComponentPropertyValueInteger("i1", 0);
		
		assertEquals(e, a);
	}
	
	@Test
	public void test15() {
		ComponentPropertyValueInteger e = new ComponentPropertyValueInteger("i1", 5);
		ComponentPropertyValueInteger a = new ComponentPropertyValueInteger("i1", 0);
		
		assertNotEquals(e, a);
	}

}
