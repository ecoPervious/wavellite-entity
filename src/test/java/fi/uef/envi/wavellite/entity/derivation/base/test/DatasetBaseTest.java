/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.derivation.base.DatasetBase;
import fi.uef.envi.wavellite.vocabulary.QB;

/**
 * <p>
 * Title: DatasetBaseTest
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

public class DatasetBaseTest {
	
	@Test
	public void test1() {
		DatasetBase e = new DatasetBase("i1");
		DatasetBase a = new DatasetBase("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		DatasetBase e = new DatasetBase("i1", "t1");
		DatasetBase a = new DatasetBase("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		DatasetBase e = new DatasetBase("i1");
		DatasetBase a = new DatasetBase("i2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test4() {
		DatasetBase e = new DatasetBase("i1", "t1");
		DatasetBase a = new DatasetBase("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		DatasetBase s1 = new DatasetBase("i1");
		DatasetBase s2 = new DatasetBase("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		DatasetBase s1 = new DatasetBase("i1", "t1");
		DatasetBase s2 = new DatasetBase("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		DatasetBase s1 = new DatasetBase("i1");
		DatasetBase s2 = new DatasetBase("i2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		DatasetBase s1 = new DatasetBase("i1", "t1");
		DatasetBase s2 = new DatasetBase("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		DatasetBase s = new DatasetBase("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		DatasetBase s = new DatasetBase("i1");
		
		assertEquals(QB.DataSet, s.getType());
	}
	
	@Test
	public void test11() {
		DatasetBase s = new DatasetBase("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		DatasetBase s = new DatasetBase("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		DatasetBase s = new DatasetBase("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}

}
