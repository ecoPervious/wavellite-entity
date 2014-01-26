/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import fi.uef.envi.wavellite.entity.core.base.FeatureBase;
import fi.uef.envi.wavellite.vocabulary.SSN;

/**
 * <p>
 * Title: FeatureBaseTest
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

public class FeatureBaseTest {

	@Test
	public void test1() {
		FeatureBase e = new FeatureBase("i1");
		FeatureBase a = new FeatureBase("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		FeatureBase e = new FeatureBase("i1", "t1");
		FeatureBase a = new FeatureBase("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		FeatureBase e = new FeatureBase("i1");
		FeatureBase a = new FeatureBase("i2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test4() {
		FeatureBase e = new FeatureBase("i1", "t1");
		FeatureBase a = new FeatureBase("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		FeatureBase s1 = new FeatureBase("i1");
		FeatureBase s2 = new FeatureBase("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		FeatureBase s1 = new FeatureBase("i1", "t1");
		FeatureBase s2 = new FeatureBase("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		FeatureBase s1 = new FeatureBase("i1");
		FeatureBase s2 = new FeatureBase("i2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		FeatureBase s1 = new FeatureBase("i1", "t1");
		FeatureBase s2 = new FeatureBase("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		FeatureBase s = new FeatureBase("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		FeatureBase s = new FeatureBase("i1");
		
		assertEquals(SSN.FeatureOfInterest, s.getType());
	}
	
	@Test
	public void test11() {
		FeatureBase s = new FeatureBase("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		FeatureBase s = new FeatureBase("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		FeatureBase s = new FeatureBase("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
}
