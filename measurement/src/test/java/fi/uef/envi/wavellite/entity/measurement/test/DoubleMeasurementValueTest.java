/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.measurement.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import fi.uef.envi.wavellite.entity.measurement.base.DoubleMeasurementValue;
import fi.uef.envi.wavellite.vocabulary.WO;

/**
 * <p>
 * Title: DoubleMeasurementValueTest
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

public class DoubleMeasurementValueTest {

	@Test
	public void test1() {
		DoubleMeasurementValue e = new DoubleMeasurementValue(0.0);
		DoubleMeasurementValue a = new DoubleMeasurementValue(0.0);
		
		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		DoubleMeasurementValue e = new DoubleMeasurementValue(0.0);
		DoubleMeasurementValue a = new DoubleMeasurementValue(0.5);
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test3() {
		DoubleMeasurementValue v1 = new DoubleMeasurementValue(0.0);
		DoubleMeasurementValue v2 = new DoubleMeasurementValue(0.0);
		
		assertEquals(v1.hashCode(), v2.hashCode());
	}
	
	@Test
	public void test4() {
		DoubleMeasurementValue v1 = new DoubleMeasurementValue(0.0);
		DoubleMeasurementValue v2 = new DoubleMeasurementValue(0.5);
		
		assertNotEquals(v1.hashCode(), v2.hashCode());
	}
	
	@Test
	public void test5() {
		DoubleMeasurementValue v = new DoubleMeasurementValue(0.0);
		
		assertEquals(Double.valueOf(0.0), v.getValue());
	}
	
	@Test
	public void test6() {
		DoubleMeasurementValue v = new DoubleMeasurementValue(0.5);
		
		assertNotEquals(Double.valueOf(0.0), v.getValue());
	}
	
	@Test
	public void test7() {
		DoubleMeasurementValue v = new DoubleMeasurementValue(0.0);
		
		assertEquals(WO.DoubleMeasurementValue, v.getType());
	}
	
}
