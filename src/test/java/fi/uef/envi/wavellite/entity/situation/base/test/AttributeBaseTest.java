/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.situation.base.AttributeBase;
import fi.uef.envi.wavellite.entity.situation.base.AttributeValueDouble;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: AttributeBaseTest
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

public class AttributeBaseTest {

	@Test
	public void test1() {
		AttributeBase e = new AttributeBase("i1");
		AttributeBase a = new AttributeBase("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		AttributeBase e = new AttributeBase("i1", "t1");
		AttributeBase a = new AttributeBase("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		AttributeBase e = new AttributeBase("i1");
		AttributeBase a = new AttributeBase("i2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test4() {
		AttributeBase e = new AttributeBase("i1", "t1");
		AttributeBase a = new AttributeBase("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		AttributeBase s1 = new AttributeBase("i1");
		AttributeBase s2 = new AttributeBase("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		AttributeBase s1 = new AttributeBase("i1", "t1");
		AttributeBase s2 = new AttributeBase("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		AttributeBase s1 = new AttributeBase("i1");
		AttributeBase s2 = new AttributeBase("i2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		AttributeBase s1 = new AttributeBase("i1", "t1");
		AttributeBase s2 = new AttributeBase("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		AttributeBase s = new AttributeBase("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		AttributeBase s = new AttributeBase("i1");
		
		assertEquals(STO.Attribute, s.getType());
	}
	
	@Test
	public void test11() {
		AttributeBase s = new AttributeBase("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		AttributeBase s = new AttributeBase("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		AttributeBase s = new AttributeBase("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test14() {
		AttributeBase s1 = new AttributeBase("i1");
		AttributeBase s2 = new AttributeBase("i1");
		
		s1.setAttributeValue(new AttributeValueDouble("v1"));
		s2.setAttributeValue(new AttributeValueDouble("v1"));
		
		assertEquals(s1, s2);
	}
	
	@Test
	public void test15() {
		AttributeBase s1 = new AttributeBase("i1");
		AttributeBase s2 = new AttributeBase("i1");
		
		s1.setAttributeValue(new AttributeValueDouble("v1", 0.0));
		s2.setAttributeValue(new AttributeValueDouble("v1", 0.0));
		
		assertEquals(s1, s2);
	}
	
	@Test
	public void test16() {
		AttributeBase s1 = new AttributeBase("i1");
		AttributeBase s2 = new AttributeBase("i1");
		
		s1.setAttributeValue(new AttributeValueDouble("v1", 0.5));
		s2.setAttributeValue(new AttributeValueDouble("v1", 0.0));
		
		assertNotEquals(s1, s2);
	}
	
}
