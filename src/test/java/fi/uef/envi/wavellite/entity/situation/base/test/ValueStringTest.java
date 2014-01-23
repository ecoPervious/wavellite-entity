/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.situation.base.ValueString;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: ValueStringTest
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

public class ValueStringTest {
	
	@Test
	public void test1() {
		ValueString e = new ValueString("i1", "v1");
		ValueString a = new ValueString("i1", "v1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		ValueString e = new ValueString("i1", "v1");
		ValueString a = new ValueString("i1", "v2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test3() {
		ValueString s1 = new ValueString("i1", "v1");
		ValueString s2 = new ValueString("i1", "v1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test4() {
		ValueString s1 = new ValueString("i1", "v1");
		ValueString s2 = new ValueString("i1", "v2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test5() {
		ValueString s = new ValueString("i1", "v1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test6() {
		ValueString s = new ValueString("i1", "v1");
		
		assertEquals(STO.Value, s.getType());
	}
	
	@Test
	public void test7() {
		ValueString s = new ValueString("i1", "t1", "v1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test8() {
		ValueString s = new ValueString("i1", "v1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test9() {
		ValueString s = new ValueString("i1", "t1", "v1");
		
		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test10() {
		ValueString s1 = new ValueString("i1", null);
		ValueString s2 = new ValueString("i1", null);
		
		s1.setValue("v1");
		s2.setValue("v1");
		
		assertEquals(s1, s2);
	}
	
	@Test
	public void test15() {
		ValueString s1 = new ValueString("i1", null);
		ValueString s2 = new ValueString("i1", null);
		
		s1.setValue("v1");
		s2.setValue("v2");
		
		assertNotEquals(s1, s2);
	}
	
}
