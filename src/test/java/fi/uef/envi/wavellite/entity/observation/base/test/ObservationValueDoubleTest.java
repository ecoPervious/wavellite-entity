/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.observation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.observation.base.ObservationValueDouble;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: ObservationValueDoubleTest
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

public class ObservationValueDoubleTest {

	@Test
	public void test1() {
		ObservationValueDouble e = new ObservationValueDouble("i1");
		ObservationValueDouble a = new ObservationValueDouble("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ObservationValueDouble e = new ObservationValueDouble("i1", "t1");
		ObservationValueDouble a = new ObservationValueDouble("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		ObservationValueDouble e = new ObservationValueDouble("i1");
		ObservationValueDouble a = new ObservationValueDouble("i2");

		assertNotEquals(e, a);
	}

	@Test
	public void test4() {
		ObservationValueDouble e = new ObservationValueDouble("i1", "t1");
		ObservationValueDouble a = new ObservationValueDouble("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		ObservationValueDouble s1 = new ObservationValueDouble("i1");
		ObservationValueDouble s2 = new ObservationValueDouble("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		ObservationValueDouble s1 = new ObservationValueDouble("i1", "t1");
		ObservationValueDouble s2 = new ObservationValueDouble("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		ObservationValueDouble s1 = new ObservationValueDouble("i1");
		ObservationValueDouble s2 = new ObservationValueDouble("i2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		ObservationValueDouble s1 = new ObservationValueDouble("i1", "t1");
		ObservationValueDouble s2 = new ObservationValueDouble("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		ObservationValueDouble s = new ObservationValueDouble("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		ObservationValueDouble s = new ObservationValueDouble("i1");

		assertEquals(WOE.ObservationValueDouble, s.getType());
	}

	@Test
	public void test11() {
		ObservationValueDouble s = new ObservationValueDouble("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		ObservationValueDouble s = new ObservationValueDouble("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		ObservationValueDouble s = new ObservationValueDouble("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		ObservationValueDouble s = new ObservationValueDouble(0.0);

		assertEquals(Double.valueOf(0.0), s.getValue());
	}

	public void test15() {
		ObservationValueDouble s = new ObservationValueDouble(0.5);

		assertNotEquals(Double.valueOf(0.0), s.getValue());
	}

}
