/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.measurement.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.measurement.base.MeasurementContextBase;
import fi.uef.envi.wavellite.vocabulary.WO;

/**
 * <p>
 * Title: MeasurementContextBaseTest
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

public class MeasurementContextBaseTest {

	@Test
	public void test1() {
		MeasurementContextBase e = new MeasurementContextBase("i1");
		MeasurementContextBase a = new MeasurementContextBase("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		MeasurementContextBase e = new MeasurementContextBase("i1", "t1");
		MeasurementContextBase a = new MeasurementContextBase("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		MeasurementContextBase e = new MeasurementContextBase("i1");
		MeasurementContextBase a = new MeasurementContextBase("i2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test4() {
		MeasurementContextBase e = new MeasurementContextBase("i1", "t1");
		MeasurementContextBase a = new MeasurementContextBase("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		MeasurementContextBase s1 = new MeasurementContextBase("i1");
		MeasurementContextBase s2 = new MeasurementContextBase("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		MeasurementContextBase s1 = new MeasurementContextBase("i1", "t1");
		MeasurementContextBase s2 = new MeasurementContextBase("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		MeasurementContextBase s1 = new MeasurementContextBase("i1");
		MeasurementContextBase s2 = new MeasurementContextBase("i2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		MeasurementContextBase s1 = new MeasurementContextBase("i1", "t1");
		MeasurementContextBase s2 = new MeasurementContextBase("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		MeasurementContextBase s = new MeasurementContextBase("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		MeasurementContextBase s = new MeasurementContextBase("i1");
		
		assertEquals(WO.MeasurementContext, s.getType());
	}
	
	@Test
	public void test11() {
		MeasurementContextBase s = new MeasurementContextBase("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		MeasurementContextBase s = new MeasurementContextBase("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		MeasurementContextBase s = new MeasurementContextBase("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
}
