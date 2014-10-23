/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import fi.uef.envi.wavellite.entity.core.base.SensorBase;
import fi.uef.envi.wavellite.entity.observation.base.SensingBase;
import fi.uef.envi.wavellite.vocabulary.SSN;

/**
 * <p>
 * Title: SensorBaseTest
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

public class SensorBaseTest {

	@Test
	public void test1() {
		SensorBase e = new SensorBase("i1");
		SensorBase a = new SensorBase("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		SensorBase e = new SensorBase("i1", "t1");
		SensorBase a = new SensorBase("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		SensorBase e = new SensorBase("i1");
		SensorBase a = new SensorBase("i2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test4() {
		SensorBase e = new SensorBase("i1", "t1");
		SensorBase a = new SensorBase("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		SensorBase s1 = new SensorBase("i1");
		SensorBase s2 = new SensorBase("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		SensorBase s1 = new SensorBase("i1", "t1");
		SensorBase s2 = new SensorBase("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		SensorBase s1 = new SensorBase("i1");
		SensorBase s2 = new SensorBase("i2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		SensorBase s1 = new SensorBase("i1", "t1");
		SensorBase s2 = new SensorBase("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		SensorBase s = new SensorBase("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		SensorBase s = new SensorBase("i1");
		
		assertEquals(SSN.Sensor, s.getType());
	}
	
	@Test
	public void test11() {
		SensorBase s = new SensorBase("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		SensorBase s = new SensorBase("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		SensorBase s = new SensorBase("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test14() {
		SensorBase s1 = new SensorBase("i1");
		SensorBase s2 = new SensorBase("i1");
		
		s1.setSensing(new SensingBase("s1"));
		s2.setSensing(new SensingBase("s1"));
		
		assertEquals(s1, s2);
	}
	
	@Test
	public void test15() {
		SensorBase s1 = new SensorBase("i1");
		SensorBase s2 = new SensorBase("i1");
		
		s1.setSensing(new SensingBase("s1"));
		s2.setSensing(new SensingBase("s2"));
		
		assertNotEquals(s1, s2);
	}
	
}
