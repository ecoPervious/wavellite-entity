/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.core.base.SpatialLocationPlace;
import fi.uef.envi.wavellite.entity.situation.base.RelevantObjectSpatialLocation;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: RelevantObjectSpatialLocation
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

public class RelevantObjectSpatialLocationTest {

	@Test
	public void test1() {
		RelevantObjectSpatialLocation e = new RelevantObjectSpatialLocation("i1");
		RelevantObjectSpatialLocation a = new RelevantObjectSpatialLocation("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		RelevantObjectSpatialLocation e = new RelevantObjectSpatialLocation("i1", "t1");
		RelevantObjectSpatialLocation a = new RelevantObjectSpatialLocation("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		RelevantObjectSpatialLocation e = new RelevantObjectSpatialLocation("i1");
		RelevantObjectSpatialLocation a = new RelevantObjectSpatialLocation("i2");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test4() {
		RelevantObjectSpatialLocation e = new RelevantObjectSpatialLocation("i1", "t1");
		RelevantObjectSpatialLocation a = new RelevantObjectSpatialLocation("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		RelevantObjectSpatialLocation s1 = new RelevantObjectSpatialLocation("i1");
		RelevantObjectSpatialLocation s2 = new RelevantObjectSpatialLocation("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		RelevantObjectSpatialLocation s1 = new RelevantObjectSpatialLocation("i1", "t1");
		RelevantObjectSpatialLocation s2 = new RelevantObjectSpatialLocation("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		RelevantObjectSpatialLocation s1 = new RelevantObjectSpatialLocation("i1");
		RelevantObjectSpatialLocation s2 = new RelevantObjectSpatialLocation("i2");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		RelevantObjectSpatialLocation s1 = new RelevantObjectSpatialLocation("i1", "t1");
		RelevantObjectSpatialLocation s2 = new RelevantObjectSpatialLocation("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		RelevantObjectSpatialLocation s = new RelevantObjectSpatialLocation("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		RelevantObjectSpatialLocation s = new RelevantObjectSpatialLocation("i1");
		
		assertEquals(WOE.SpatialLocation, s.getType());
	}
	
	@Test
	public void test11() {
		RelevantObjectSpatialLocation s = new RelevantObjectSpatialLocation("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		RelevantObjectSpatialLocation s = new RelevantObjectSpatialLocation("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		RelevantObjectSpatialLocation s = new RelevantObjectSpatialLocation("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test14() {
		RelevantObjectSpatialLocation s1 = new RelevantObjectSpatialLocation(new SpatialLocationPlace("l1"));
		RelevantObjectSpatialLocation s2 = new RelevantObjectSpatialLocation(new SpatialLocationPlace("l1"));
			
		assertEquals(s1, s2);
	}
	
	@Test
	public void test15() {
		RelevantObjectSpatialLocation s1 = new RelevantObjectSpatialLocation(new SpatialLocationPlace("l1"));
		RelevantObjectSpatialLocation s2 = new RelevantObjectSpatialLocation(new SpatialLocationPlace("l2"));
		
		assertNotEquals(s1, s2);
	}
	
}
