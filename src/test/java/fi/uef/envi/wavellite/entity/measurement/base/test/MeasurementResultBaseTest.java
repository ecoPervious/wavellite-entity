/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.measurement.base.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import fi.uef.envi.wavellite.entity.measurement.base.MeasurementResultBase;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: MeasurementResultBaseTest
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

public class MeasurementResultBaseTest {

	@Test
	public void test1() {
		MeasurementResultBase e = new MeasurementResultBase("i1", "t1");
		MeasurementResultBase a = new MeasurementResultBase("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		MeasurementResultBase e = new MeasurementResultBase("i1", "t1");
		MeasurementResultBase a = new MeasurementResultBase("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		MeasurementResultBase e = new MeasurementResultBase("i1");
		MeasurementResultBase a = new MeasurementResultBase("i2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test4() {
		MeasurementResultBase e = new MeasurementResultBase("i1", "t1");
		MeasurementResultBase a = new MeasurementResultBase("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		MeasurementResultBase s1 = new MeasurementResultBase("i1");
		MeasurementResultBase s2 = new MeasurementResultBase("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		MeasurementResultBase s1 = new MeasurementResultBase("i1", "t1");
		MeasurementResultBase s2 = new MeasurementResultBase("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		MeasurementResultBase s1 = new MeasurementResultBase("i1");
		MeasurementResultBase s2 = new MeasurementResultBase("i2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		MeasurementResultBase s1 = new MeasurementResultBase("i1", "t1");
		MeasurementResultBase s2 = new MeasurementResultBase("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		MeasurementResultBase s = new MeasurementResultBase("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		MeasurementResultBase s = new MeasurementResultBase("i1");
		
		assertEquals(WTO.MeasurementResult, s.getType());
	}
	
	@Test
	public void test11() {
		MeasurementResultBase s = new MeasurementResultBase("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		MeasurementResultBase s = new MeasurementResultBase("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		MeasurementResultBase s = new MeasurementResultBase("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
}
