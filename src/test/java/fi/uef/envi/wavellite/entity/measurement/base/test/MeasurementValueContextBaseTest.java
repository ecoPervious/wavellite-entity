/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.measurement.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.measurement.base.MeasurementValueContextBase;
import fi.uef.envi.wavellite.vocabulary.WEO;

/**
 * <p>
 * Title: MeasurementValueContextBaseTest
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

public class MeasurementValueContextBaseTest {

	@Test
	public void test1() {
		MeasurementValueContextBase e = new MeasurementValueContextBase("i1");
		MeasurementValueContextBase a = new MeasurementValueContextBase("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		MeasurementValueContextBase e = new MeasurementValueContextBase("i1", "t1");
		MeasurementValueContextBase a = new MeasurementValueContextBase("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		MeasurementValueContextBase e = new MeasurementValueContextBase("i1");
		MeasurementValueContextBase a = new MeasurementValueContextBase("i2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test4() {
		MeasurementValueContextBase e = new MeasurementValueContextBase("i1", "t1");
		MeasurementValueContextBase a = new MeasurementValueContextBase("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		MeasurementValueContextBase s1 = new MeasurementValueContextBase("i1");
		MeasurementValueContextBase s2 = new MeasurementValueContextBase("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		MeasurementValueContextBase s1 = new MeasurementValueContextBase("i1", "t1");
		MeasurementValueContextBase s2 = new MeasurementValueContextBase("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		MeasurementValueContextBase s1 = new MeasurementValueContextBase("i1");
		MeasurementValueContextBase s2 = new MeasurementValueContextBase("i2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		MeasurementValueContextBase s1 = new MeasurementValueContextBase("i1", "t1");
		MeasurementValueContextBase s2 = new MeasurementValueContextBase("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		MeasurementValueContextBase s = new MeasurementValueContextBase("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		MeasurementValueContextBase s = new MeasurementValueContextBase("i1");
		
		assertEquals(WEO.MeasurementValueContext, s.getType());
	}
	
	@Test
	public void test11() {
		MeasurementValueContextBase s = new MeasurementValueContextBase("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		MeasurementValueContextBase s = new MeasurementValueContextBase("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		MeasurementValueContextBase s = new MeasurementValueContextBase("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
}
