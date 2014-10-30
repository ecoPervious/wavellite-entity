/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import fi.uef.envi.wavellite.entity.core.base.OperatorBase;
import fi.uef.envi.wavellite.vocabulary.WOO;

/**
 * <p>
 * Title: OperatorBaseTest
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

public class OperatorBaseTest {

	@Test
	public void test1() {
		OperatorBase e = new OperatorBase("i1");
		OperatorBase a = new OperatorBase("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		OperatorBase e = new OperatorBase("i1", "t1");
		OperatorBase a = new OperatorBase("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		OperatorBase e = new OperatorBase("i1");
		OperatorBase a = new OperatorBase("i2");

		assertNotEquals(e, a);
	}

	@Test
	public void test4() {
		OperatorBase e = new OperatorBase("i1", "t1");
		OperatorBase a = new OperatorBase("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		OperatorBase s1 = new OperatorBase("i1");
		OperatorBase s2 = new OperatorBase("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		OperatorBase s1 = new OperatorBase("i1", "t1");
		OperatorBase s2 = new OperatorBase("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		OperatorBase s1 = new OperatorBase("i1");
		OperatorBase s2 = new OperatorBase("i2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		OperatorBase s1 = new OperatorBase("i1", "t1");
		OperatorBase s2 = new OperatorBase("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		OperatorBase s = new OperatorBase("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		OperatorBase s = new OperatorBase("i1");

		assertEquals(WOO.Operator, s.getType());
	}

	@Test
	public void test11() {
		OperatorBase s = new OperatorBase("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		OperatorBase s = new OperatorBase("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		OperatorBase s = new OperatorBase("i1", "t1");

		assertNotEquals("t2", s.getType());
	}
	
}
