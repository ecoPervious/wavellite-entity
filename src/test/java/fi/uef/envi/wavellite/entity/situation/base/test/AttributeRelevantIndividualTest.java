/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.situation.base.AttributeRelevantIndividual;
import fi.uef.envi.wavellite.entity.situation.base.ValueDouble;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: AttributeRelevantIndividualTest
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

public class AttributeRelevantIndividualTest {

	@Test
	public void test1() {
		AttributeRelevantIndividual e = new AttributeRelevantIndividual("i1");
		AttributeRelevantIndividual a = new AttributeRelevantIndividual("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		AttributeRelevantIndividual e = new AttributeRelevantIndividual("i1", "t1");
		AttributeRelevantIndividual a = new AttributeRelevantIndividual("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		AttributeRelevantIndividual e = new AttributeRelevantIndividual("i1");
		AttributeRelevantIndividual a = new AttributeRelevantIndividual("i2");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test4() {
		AttributeRelevantIndividual e = new AttributeRelevantIndividual("i1", "t1");
		AttributeRelevantIndividual a = new AttributeRelevantIndividual("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		AttributeRelevantIndividual s1 = new AttributeRelevantIndividual("i1");
		AttributeRelevantIndividual s2 = new AttributeRelevantIndividual("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		AttributeRelevantIndividual s1 = new AttributeRelevantIndividual("i1", "t1");
		AttributeRelevantIndividual s2 = new AttributeRelevantIndividual("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		AttributeRelevantIndividual s1 = new AttributeRelevantIndividual("i1");
		AttributeRelevantIndividual s2 = new AttributeRelevantIndividual("i2");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		AttributeRelevantIndividual s1 = new AttributeRelevantIndividual("i1", "t1");
		AttributeRelevantIndividual s2 = new AttributeRelevantIndividual("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		AttributeRelevantIndividual s = new AttributeRelevantIndividual("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		AttributeRelevantIndividual s = new AttributeRelevantIndividual("i1");
		
		assertEquals(STO.Attribute, s.getType());
	}
	
	@Test
	public void test11() {
		AttributeRelevantIndividual s = new AttributeRelevantIndividual("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		AttributeRelevantIndividual s = new AttributeRelevantIndividual("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		AttributeRelevantIndividual s = new AttributeRelevantIndividual("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test14() {
		AttributeRelevantIndividual s1 = new AttributeRelevantIndividual("i1");
		AttributeRelevantIndividual s2 = new AttributeRelevantIndividual("i1");
		
		s1.setValue(new ValueDouble("v1"));
		s2.setValue(new ValueDouble("v1"));
		
		assertEquals(s1, s2);
	}
	
	@Test
	public void test15() {
		AttributeRelevantIndividual s1 = new AttributeRelevantIndividual("i1");
		AttributeRelevantIndividual s2 = new AttributeRelevantIndividual("i1");
		
		s1.setValue(new ValueDouble("v1", 0.0));
		s2.setValue(new ValueDouble("v1", 0.0));
		
		assertEquals(s1, s2);
	}
	
	@Test
	public void test16() {
		AttributeRelevantIndividual s1 = new AttributeRelevantIndividual("i1");
		AttributeRelevantIndividual s2 = new AttributeRelevantIndividual("i1");
		
		s1.setValue(new ValueDouble("v1", 0.5));
		s2.setValue(new ValueDouble("v1", 0.0));
		
		assertNotEquals(s1, s2);
	}
	
}
