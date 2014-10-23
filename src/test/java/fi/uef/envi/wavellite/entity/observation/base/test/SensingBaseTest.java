/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.observation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.observation.base.SensingBase;
import fi.uef.envi.wavellite.vocabulary.SSN;

/**
 * <p>
 * Title: SensingBaseTest
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

public class SensingBaseTest {

	@Test
	public void test1() {
		SensingBase e = new SensingBase("i1");
		SensingBase a = new SensingBase("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		SensingBase e = new SensingBase("i1", "t1");
		SensingBase a = new SensingBase("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		SensingBase e = new SensingBase("i1");
		SensingBase a = new SensingBase("i2");

		assertNotEquals(e, a);
	}

	@Test
	public void test4() {
		SensingBase e = new SensingBase("i1", "t1");
		SensingBase a = new SensingBase("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		SensingBase s1 = new SensingBase("i1");
		SensingBase s2 = new SensingBase("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		SensingBase s1 = new SensingBase("i1", "t1");
		SensingBase s2 = new SensingBase("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		SensingBase s1 = new SensingBase("i1");
		SensingBase s2 = new SensingBase("i2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		SensingBase s1 = new SensingBase("i1", "t1");
		SensingBase s2 = new SensingBase("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		SensingBase s = new SensingBase("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		SensingBase s = new SensingBase("i1");

		assertEquals(SSN.Sensing, s.getType());
	}

	@Test
	public void test11() {
		SensingBase s = new SensingBase("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		SensingBase s = new SensingBase("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		SensingBase s = new SensingBase("i1", "t1");

		assertNotEquals("t2", s.getType());
	}
	
}
