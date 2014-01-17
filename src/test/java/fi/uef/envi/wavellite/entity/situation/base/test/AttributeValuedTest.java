/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.situation.base.AttributeValued;
import fi.uef.envi.wavellite.entity.situation.base.AttributeValueDouble;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: AttributeValuedTest
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

public class AttributeValuedTest {

	@Test
	public void test1() {
		AttributeValued e = new AttributeValued("i1");
		AttributeValued a = new AttributeValued("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		AttributeValued e = new AttributeValued("i1", "t1");
		AttributeValued a = new AttributeValued("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		AttributeValued e = new AttributeValued("i1");
		AttributeValued a = new AttributeValued("i2");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test4() {
		AttributeValued e = new AttributeValued("i1", "t1");
		AttributeValued a = new AttributeValued("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		AttributeValued s1 = new AttributeValued("i1");
		AttributeValued s2 = new AttributeValued("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		AttributeValued s1 = new AttributeValued("i1", "t1");
		AttributeValued s2 = new AttributeValued("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		AttributeValued s1 = new AttributeValued("i1");
		AttributeValued s2 = new AttributeValued("i2");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		AttributeValued s1 = new AttributeValued("i1", "t1");
		AttributeValued s2 = new AttributeValued("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		AttributeValued s = new AttributeValued("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		AttributeValued s = new AttributeValued("i1");
		
		assertEquals(STO.Attribute, s.getType());
	}
	
	@Test
	public void test11() {
		AttributeValued s = new AttributeValued("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		AttributeValued s = new AttributeValued("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		AttributeValued s = new AttributeValued("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test14() {
		AttributeValued s1 = new AttributeValued("i1");
		AttributeValued s2 = new AttributeValued("i1");
		
		s1.setValue(new AttributeValueDouble("v1"));
		s2.setValue(new AttributeValueDouble("v1"));
		
		assertEquals(s1, s2);
	}
	
	@Test
	public void test15() {
		AttributeValued s1 = new AttributeValued("i1");
		AttributeValued s2 = new AttributeValued("i1");
		
		s1.setValue(new AttributeValueDouble("v1", 0.0));
		s2.setValue(new AttributeValueDouble("v1", 0.0));
		
		assertEquals(s1, s2);
	}
	
	@Test
	public void test16() {
		AttributeValued s1 = new AttributeValued("i1");
		AttributeValued s2 = new AttributeValued("i1");
		
		s1.setValue(new AttributeValueDouble("v1", 0.5));
		s2.setValue(new AttributeValueDouble("v1", 0.0));
		
		assertNotEquals(s1, s2);
	}
	
}
