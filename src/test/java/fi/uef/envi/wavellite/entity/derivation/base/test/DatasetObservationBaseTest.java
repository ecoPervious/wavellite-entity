/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.derivation.base.DatasetBase;
import fi.uef.envi.wavellite.entity.derivation.base.DatasetObservationBase;
import fi.uef.envi.wavellite.vocabulary.WEO;

/**
 * <p>
 * Title: DatasetObservationBaseTest
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

public class DatasetObservationBaseTest {

	@Test
	public void test1() {
		DatasetObservationBase e = new DatasetObservationBase("i1");
		DatasetObservationBase a = new DatasetObservationBase("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		DatasetObservationBase e = new DatasetObservationBase("i1", "t1");
		DatasetObservationBase a = new DatasetObservationBase("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		DatasetObservationBase e = new DatasetObservationBase("i1");
		DatasetObservationBase a = new DatasetObservationBase("i2");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test4() {
		DatasetObservationBase e = new DatasetObservationBase("i1", "t1");
		DatasetObservationBase a = new DatasetObservationBase("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		DatasetObservationBase s1 = new DatasetObservationBase("i1");
		DatasetObservationBase s2 = new DatasetObservationBase("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		DatasetObservationBase s1 = new DatasetObservationBase("i1", "t1");
		DatasetObservationBase s2 = new DatasetObservationBase("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		DatasetObservationBase s1 = new DatasetObservationBase("i1");
		DatasetObservationBase s2 = new DatasetObservationBase("i2");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		DatasetObservationBase s1 = new DatasetObservationBase("i1", "t1");
		DatasetObservationBase s2 = new DatasetObservationBase("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		DatasetObservationBase s = new DatasetObservationBase("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		DatasetObservationBase s = new DatasetObservationBase("i1");
		
		assertEquals(WEO.DatasetObservation, s.getType());
	}
	
	@Test
	public void test11() {
		DatasetObservationBase s = new DatasetObservationBase("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		DatasetObservationBase s = new DatasetObservationBase("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		DatasetObservationBase s = new DatasetObservationBase("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test14() {
		DatasetObservationBase e = new DatasetObservationBase("i1");
		DatasetObservationBase a = new DatasetObservationBase("i1");
		
		DatasetBase d = new DatasetBase("d1");
		
		e.setDataset(d);
		a.setDataset(d);
		
		assertEquals(e, a);
	}
	
}
