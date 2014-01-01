/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.measurement.base.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import fi.uef.envi.wavellite.entity.measurement.base.MeasurementValueDouble;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: MeasurementValueDoubleTest
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

public class MeasurementValueDoubleTest {

	@Test
	public void test1() {
		MeasurementValueDouble e = new MeasurementValueDouble("i1", 0.0);
		MeasurementValueDouble a = new MeasurementValueDouble("i1", 0.0);

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		MeasurementValueDouble e = new MeasurementValueDouble("i1", 0.0);
		MeasurementValueDouble a = new MeasurementValueDouble("i1", 0.5);

		assertNotEquals(e, a);
	}

	@Test
	public void test3() {
		MeasurementValueDouble v1 = new MeasurementValueDouble("i1", 0.0);
		MeasurementValueDouble v2 = new MeasurementValueDouble("i1", 0.0);

		assertEquals(v1.hashCode(), v2.hashCode());
	}

	@Test
	public void test4() {
		MeasurementValueDouble v1 = new MeasurementValueDouble("i1", 0.0);
		MeasurementValueDouble v2 = new MeasurementValueDouble("i1", 0.5);

		assertNotEquals(v1.hashCode(), v2.hashCode());
	}

	@Test
	public void test5() {
		MeasurementValueDouble v = new MeasurementValueDouble(0.0);

		assertEquals(Double.valueOf(0.0), v.getValue());
	}

	@Test
	public void test6() {
		MeasurementValueDouble v = new MeasurementValueDouble(0.5);

		assertNotEquals(Double.valueOf(0.0), v.getValue());
	}

	@Test
	public void test7() {
		MeasurementValueDouble v = new MeasurementValueDouble(0.0);

		assertEquals(WTO.MeasurementValueDouble, v.getType());
	}

}
