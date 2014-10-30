/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import fi.uef.envi.wavellite.entity.core.base.OperationBase;
import fi.uef.envi.wavellite.vocabulary.WOO;

/**
 * <p>
 * Title: OperationBaseTest
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

public class OperationBaseTest {

	@Test
	public void test1() {
		OperationBase e = new OperationBase("i1");
		OperationBase a = new OperationBase("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		OperationBase e = new OperationBase("i1", "t1");
		OperationBase a = new OperationBase("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		OperationBase e = new OperationBase("i1");
		OperationBase a = new OperationBase("i2");

		assertNotEquals(e, a);
	}

	@Test
	public void test4() {
		OperationBase e = new OperationBase("i1", "t1");
		OperationBase a = new OperationBase("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		OperationBase s1 = new OperationBase("i1");
		OperationBase s2 = new OperationBase("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		OperationBase s1 = new OperationBase("i1", "t1");
		OperationBase s2 = new OperationBase("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		OperationBase s1 = new OperationBase("i1");
		OperationBase s2 = new OperationBase("i2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		OperationBase s1 = new OperationBase("i1", "t1");
		OperationBase s2 = new OperationBase("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		OperationBase s = new OperationBase("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		OperationBase s = new OperationBase("i1");

		assertEquals(WOO.Operation, s.getType());
	}

	@Test
	public void test11() {
		OperationBase s = new OperationBase("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		OperationBase s = new OperationBase("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		OperationBase s = new OperationBase("i1", "t1");

		assertNotEquals("t2", s.getType());
	}
	
}
