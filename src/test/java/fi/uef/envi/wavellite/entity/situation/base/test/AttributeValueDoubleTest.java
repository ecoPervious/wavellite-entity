/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.situation.base.AttributeValueDouble;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: AttributeValueDoubleTest
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

public class AttributeValueDoubleTest {

	@Test
	public void test1() {
		AttributeValueDouble e = new AttributeValueDouble("i1");
		AttributeValueDouble a = new AttributeValueDouble("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		AttributeValueDouble e = new AttributeValueDouble("i1", "t1");
		AttributeValueDouble a = new AttributeValueDouble("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		AttributeValueDouble e = new AttributeValueDouble("i1");
		AttributeValueDouble a = new AttributeValueDouble("i2");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test4() {
		AttributeValueDouble e = new AttributeValueDouble("i1", "t1");
		AttributeValueDouble a = new AttributeValueDouble("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		AttributeValueDouble s1 = new AttributeValueDouble("i1");
		AttributeValueDouble s2 = new AttributeValueDouble("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		AttributeValueDouble s1 = new AttributeValueDouble("i1", "t1");
		AttributeValueDouble s2 = new AttributeValueDouble("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		AttributeValueDouble s1 = new AttributeValueDouble("i1");
		AttributeValueDouble s2 = new AttributeValueDouble("i2");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		AttributeValueDouble s1 = new AttributeValueDouble("i1", "t1");
		AttributeValueDouble s2 = new AttributeValueDouble("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		AttributeValueDouble s = new AttributeValueDouble("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		AttributeValueDouble s = new AttributeValueDouble("i1");
		
		assertEquals(STO.Value, s.getType());
	}
	
	@Test
	public void test11() {
		AttributeValueDouble s = new AttributeValueDouble("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		AttributeValueDouble s = new AttributeValueDouble("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		AttributeValueDouble s = new AttributeValueDouble("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test14() {
		AttributeValueDouble s1 = new AttributeValueDouble("i1");
		AttributeValueDouble s2 = new AttributeValueDouble("i1");
		
		s1.setValue(0.0);
		s2.setValue(0.0);
		
		assertEquals(s1, s2);
	}
	
	@Test
	public void test15() {
		AttributeValueDouble s1 = new AttributeValueDouble("i1");
		AttributeValueDouble s2 = new AttributeValueDouble("i1");
		
		s1.setValue(0.5);
		s2.setValue(0.0);
		
		assertNotEquals(s1, s2);
	}
	
}
