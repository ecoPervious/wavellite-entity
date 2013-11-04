/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.situation.base.AttributeBase;
import fi.uef.envi.wavellite.entity.situation.base.RelevantIndividualBase;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: RelevantIndividualBaseTest
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

public class RelevantIndividualBaseTest {

	@Test
	public void test1() {
		RelevantIndividualBase e = new RelevantIndividualBase("i1");
		RelevantIndividualBase a = new RelevantIndividualBase("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		RelevantIndividualBase e = new RelevantIndividualBase("i1", "t1");
		RelevantIndividualBase a = new RelevantIndividualBase("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		RelevantIndividualBase e = new RelevantIndividualBase("i1");
		RelevantIndividualBase a = new RelevantIndividualBase("i2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test4() {
		RelevantIndividualBase e = new RelevantIndividualBase("i1", "t1");
		RelevantIndividualBase a = new RelevantIndividualBase("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		RelevantIndividualBase s1 = new RelevantIndividualBase("i1");
		RelevantIndividualBase s2 = new RelevantIndividualBase("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		RelevantIndividualBase s1 = new RelevantIndividualBase("i1", "t1");
		RelevantIndividualBase s2 = new RelevantIndividualBase("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		RelevantIndividualBase s1 = new RelevantIndividualBase("i1");
		RelevantIndividualBase s2 = new RelevantIndividualBase("i2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		RelevantIndividualBase s1 = new RelevantIndividualBase("i1", "t1");
		RelevantIndividualBase s2 = new RelevantIndividualBase("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		RelevantIndividualBase s = new RelevantIndividualBase("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		RelevantIndividualBase s = new RelevantIndividualBase("i1");
		
		assertEquals(STO.RelevantIndividual, s.getType());
	}
	
	@Test
	public void test11() {
		RelevantIndividualBase s = new RelevantIndividualBase("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		RelevantIndividualBase s = new RelevantIndividualBase("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		RelevantIndividualBase s = new RelevantIndividualBase("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test14() {
		RelevantIndividualBase s1 = new RelevantIndividualBase("i1");
		RelevantIndividualBase s2 = new RelevantIndividualBase("i1");
		
		s1.addAttribute(new AttributeBase("a1"));
		s2.addAttribute(new AttributeBase("a1"));
		
		assertEquals(s1, s2);
	}
	
	@Test
	public void test15() {
		RelevantIndividualBase s1 = new RelevantIndividualBase("i1");
		RelevantIndividualBase s2 = new RelevantIndividualBase("i1");
		
		s1.addAttribute(new AttributeBase("a1"));
		s2.addAttribute(new AttributeBase("a2"));
		
		assertNotEquals(s1, s2);
	}
	
}
