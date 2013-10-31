/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.observation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.observation.ObservationValue;
import fi.uef.envi.wavellite.entity.observation.base.ObservationValueDouble;
import fi.uef.envi.wavellite.entity.observation.base.SensorOutputBase;
import fi.uef.envi.wavellite.vocabulary.SSN;

/**
 * <p>
 * Title: SensorOutputBaseTest
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

public class SensorOutputBaseTest {

	@Test
	public void test1() {
		SensorOutputBase e = new SensorOutputBase("i1");
		SensorOutputBase a = new SensorOutputBase("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		SensorOutputBase e = new SensorOutputBase("i1", "t1");
		SensorOutputBase a = new SensorOutputBase("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		SensorOutputBase e = new SensorOutputBase("i1");
		SensorOutputBase a = new SensorOutputBase("i2");

		assertNotEquals(e, a);
	}

	@Test
	public void test4() {
		SensorOutputBase e = new SensorOutputBase("i1", "t1");
		SensorOutputBase a = new SensorOutputBase("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		SensorOutputBase s1 = new SensorOutputBase("i1");
		SensorOutputBase s2 = new SensorOutputBase("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		SensorOutputBase s1 = new SensorOutputBase("i1", "t1");
		SensorOutputBase s2 = new SensorOutputBase("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		SensorOutputBase s1 = new SensorOutputBase("i1");
		SensorOutputBase s2 = new SensorOutputBase("i2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		SensorOutputBase s1 = new SensorOutputBase("i1", "t1");
		SensorOutputBase s2 = new SensorOutputBase("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		SensorOutputBase s = new SensorOutputBase("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		SensorOutputBase s = new SensorOutputBase("i1");

		assertEquals(SSN.SensorOutput, s.getType());
	}

	@Test
	public void test11() {
		SensorOutputBase s = new SensorOutputBase("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		SensorOutputBase s = new SensorOutputBase("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		SensorOutputBase s = new SensorOutputBase("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		ObservationValue v = new ObservationValueDouble(0.0);
		SensorOutputBase s = new SensorOutputBase(v);

		assertEquals(v, s.getObservationValue());
		assertEquals(Double.valueOf(0.0), s.getObservationValue().getValue());
	}

	@Test
	public void test15() {
		ObservationValue v = new ObservationValueDouble(0.5);
		SensorOutputBase s = new SensorOutputBase(v);

		assertEquals(v, s.getObservationValue());
		assertNotEquals(Double.valueOf(0.0), s.getObservationValue().getValue());
	}

}
