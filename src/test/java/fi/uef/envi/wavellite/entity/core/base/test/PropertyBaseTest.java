/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import fi.uef.envi.wavellite.entity.core.base.PropertyBase;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: PropertyBaseTest
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

public class PropertyBaseTest {

	@Test
	public void test1() {
		PropertyBase e = new PropertyBase("i1");
		PropertyBase a = new PropertyBase("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		PropertyBase e = new PropertyBase("i1", "t1");
		PropertyBase a = new PropertyBase("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		PropertyBase e = new PropertyBase("i1");
		PropertyBase a = new PropertyBase("i2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test4() {
		PropertyBase e = new PropertyBase("i1", "t1");
		PropertyBase a = new PropertyBase("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		PropertyBase s1 = new PropertyBase("i1");
		PropertyBase s2 = new PropertyBase("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		PropertyBase s1 = new PropertyBase("i1", "t1");
		PropertyBase s2 = new PropertyBase("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		PropertyBase s1 = new PropertyBase("i1");
		PropertyBase s2 = new PropertyBase("i2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		PropertyBase s1 = new PropertyBase("i1", "t1");
		PropertyBase s2 = new PropertyBase("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		PropertyBase s = new PropertyBase("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		PropertyBase s = new PropertyBase("i1");
		
		assertEquals(WOE.Property, s.getType());
	}
	
	@Test
	public void test11() {
		PropertyBase s = new PropertyBase("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		PropertyBase s = new PropertyBase("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		PropertyBase s = new PropertyBase("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
}
