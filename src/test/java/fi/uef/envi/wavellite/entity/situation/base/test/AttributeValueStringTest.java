/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.situation.base.AttributeValueString;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: AttributeValueStringTest
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

public class AttributeValueStringTest {
	
	@Test
	public void test1() {
		AttributeValueString e = new AttributeValueString("i1", "v1");
		AttributeValueString a = new AttributeValueString("i1", "v1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		AttributeValueString e = new AttributeValueString("i1", "v1");
		AttributeValueString a = new AttributeValueString("i1", "v2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test3() {
		AttributeValueString s1 = new AttributeValueString("i1", "v1");
		AttributeValueString s2 = new AttributeValueString("i1", "v1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test4() {
		AttributeValueString s1 = new AttributeValueString("i1", "v1");
		AttributeValueString s2 = new AttributeValueString("i1", "v2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test5() {
		AttributeValueString s = new AttributeValueString("i1", "v1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test6() {
		AttributeValueString s = new AttributeValueString("i1", "v1");
		
		assertEquals(WTO.AttributeValueString, s.getType());
	}
	
	@Test
	public void test7() {
		AttributeValueString s = new AttributeValueString("i1", "t1", "v1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test8() {
		AttributeValueString s = new AttributeValueString("i1", "v1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test9() {
		AttributeValueString s = new AttributeValueString("i1", "t1", "v1");
		
		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test10() {
		AttributeValueString s1 = new AttributeValueString("i1", null);
		AttributeValueString s2 = new AttributeValueString("i1", null);
		
		s1.setValue("v1");
		s2.setValue("v1");
		
		assertEquals(s1, s2);
	}
	
	@Test
	public void test15() {
		AttributeValueString s1 = new AttributeValueString("i1", null);
		AttributeValueString s2 = new AttributeValueString("i1", null);
		
		s1.setValue("v1");
		s2.setValue("v2");
		
		assertNotEquals(s1, s2);
	}
	
}
