/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.situation.base.RelationBase;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: RelationBaseTest
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

public class RelationBaseTest {

	@Test
	public void test1() {
		RelationBase e = new RelationBase("i1");
		RelationBase a = new RelationBase("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		RelationBase e = new RelationBase("i1", "t1");
		RelationBase a = new RelationBase("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		RelationBase e = new RelationBase("i1");
		RelationBase a = new RelationBase("i2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test4() {
		RelationBase e = new RelationBase("i1", "t1");
		RelationBase a = new RelationBase("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		RelationBase s1 = new RelationBase("i1");
		RelationBase s2 = new RelationBase("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		RelationBase s1 = new RelationBase("i1", "t1");
		RelationBase s2 = new RelationBase("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		RelationBase s1 = new RelationBase("i1");
		RelationBase s2 = new RelationBase("i2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		RelationBase s1 = new RelationBase("i1", "t1");
		RelationBase s2 = new RelationBase("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		RelationBase s = new RelationBase("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		RelationBase s = new RelationBase("i1");
		
		assertEquals(STO.Relation, s.getType());
	}
	
	@Test
	public void test11() {
		RelationBase s = new RelationBase("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		RelationBase s = new RelationBase("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		RelationBase s = new RelationBase("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
}
