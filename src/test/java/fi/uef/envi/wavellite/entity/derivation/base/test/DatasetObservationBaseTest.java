/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.core.base.OperationBase;
import fi.uef.envi.wavellite.entity.core.base.OperatorBase;
import fi.uef.envi.wavellite.entity.derivation.base.DatasetBase;
import fi.uef.envi.wavellite.entity.derivation.base.DatasetObservationBase;
import fi.uef.envi.wavellite.entity.observation.base.SensorObservationBase;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: DatasetObservationBaseTest
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

public class DatasetObservationBaseTest {

	@Test
	public void test1() {
		DatasetObservationBase e = new DatasetObservationBase("i1");
		DatasetObservationBase a = new DatasetObservationBase("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		DatasetObservationBase e = new DatasetObservationBase("i1", "t1");
		DatasetObservationBase a = new DatasetObservationBase("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		DatasetObservationBase e = new DatasetObservationBase("i1");
		DatasetObservationBase a = new DatasetObservationBase("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		DatasetObservationBase e = new DatasetObservationBase("i1", "t1");
		DatasetObservationBase a = new DatasetObservationBase("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		DatasetObservationBase s1 = new DatasetObservationBase("i1");
		DatasetObservationBase s2 = new DatasetObservationBase("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		DatasetObservationBase s1 = new DatasetObservationBase("i1", "t1");
		DatasetObservationBase s2 = new DatasetObservationBase("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		DatasetObservationBase s1 = new DatasetObservationBase("i1");
		DatasetObservationBase s2 = new DatasetObservationBase("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		DatasetObservationBase s1 = new DatasetObservationBase("i1", "t1");
		DatasetObservationBase s2 = new DatasetObservationBase("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		DatasetObservationBase s = new DatasetObservationBase("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		DatasetObservationBase s = new DatasetObservationBase("i1");

		assertEquals(WOE.DatasetObservation, s.getType());
	}

	@Test
	public void test11() {
		DatasetObservationBase s = new DatasetObservationBase("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		DatasetObservationBase s = new DatasetObservationBase("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		DatasetObservationBase s = new DatasetObservationBase("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		DatasetObservationBase e = new DatasetObservationBase("i1");
		DatasetObservationBase a = new DatasetObservationBase("i1");

		DatasetBase d = new DatasetBase("d1");

		e.setDataset(d);
		a.setDataset(d);

		assertEquals(e, a);
	}

	@Test
	public void test15() {
		DatasetObservationBase e = new DatasetObservationBase("i1");
		DatasetObservationBase a = new DatasetObservationBase("i1");

		e.setAttributedTo(new OperatorBase("o1"));
		a.setAttributedTo(new OperatorBase("o1"));

		e.setGeneratedBy(new OperationBase("o2"));
		a.setGeneratedBy(new OperationBase("o2"));

		assertEquals(e, a);
	}

	@Test
	public void test16() {
		DatasetObservationBase e = new DatasetObservationBase("i1");

		e.setAttributedTo(new OperatorBase("o1"));

		e.setGeneratedBy(new OperationBase("o2"));

		assertEquals(new OperatorBase("o1"), e.getAttributedTo());
		assertEquals(new OperationBase("o2"), e.getGeneratedBy());
	}

	@Test
	public void test17() {
		DatasetObservationBase e = new DatasetObservationBase("i1");

		e.setAttributedTo(new OperatorBase("o1"));

		e.setGeneratedBy(new OperationBase("o2"));

		assertNotEquals(new OperatorBase("p1"), e.getAttributedTo());
		assertNotEquals(new OperationBase("p2"), e.getGeneratedBy());
	}

	@Test
	public void test18() {
		DatasetObservationBase e = new DatasetObservationBase("i1");

		e.addDerivedFrom(new SensorObservationBase("i2"));
		e.addDerivedFrom(new SensorObservationBase("i3"));

		assertEquals(2, e.getDerivedFrom().size());
	}

}
