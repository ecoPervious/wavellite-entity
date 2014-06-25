/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.situation.Polarity;
import fi.uef.envi.wavellite.entity.situation.base.ElementaryInfonBase;
import fi.uef.envi.wavellite.entity.situation.base.RelationBase;
import fi.uef.envi.wavellite.entity.situation.base.RelevantIndividualBase;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: ElementaryInfonBaseTest
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

public class ElementaryInfonBaseTest {

	@Test
	public void test1() {
		ElementaryInfonBase e = new ElementaryInfonBase("i1");
		ElementaryInfonBase a = new ElementaryInfonBase("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ElementaryInfonBase e = new ElementaryInfonBase("i1", "t1");
		ElementaryInfonBase a = new ElementaryInfonBase("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		ElementaryInfonBase e = new ElementaryInfonBase("i1");
		ElementaryInfonBase a = new ElementaryInfonBase("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		ElementaryInfonBase e = new ElementaryInfonBase("i1", "t1");
		ElementaryInfonBase a = new ElementaryInfonBase("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		ElementaryInfonBase s1 = new ElementaryInfonBase("i1");
		ElementaryInfonBase s2 = new ElementaryInfonBase("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		ElementaryInfonBase s1 = new ElementaryInfonBase("i1", "t1");
		ElementaryInfonBase s2 = new ElementaryInfonBase("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		ElementaryInfonBase s1 = new ElementaryInfonBase("i1");
		ElementaryInfonBase s2 = new ElementaryInfonBase("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		ElementaryInfonBase s1 = new ElementaryInfonBase("i1", "t1");
		ElementaryInfonBase s2 = new ElementaryInfonBase("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		ElementaryInfonBase s = new ElementaryInfonBase("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		ElementaryInfonBase s = new ElementaryInfonBase("i1");

		assertEquals(STO.ElementaryInfon, s.getType());
	}

	@Test
	public void test11() {
		ElementaryInfonBase s = new ElementaryInfonBase("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		ElementaryInfonBase s = new ElementaryInfonBase("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		ElementaryInfonBase s = new ElementaryInfonBase("i1", "t1");

		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test14() {
		ElementaryInfonBase s1 = new ElementaryInfonBase("i1");
		ElementaryInfonBase s2 = new ElementaryInfonBase("i1");
		
		s1.setRelation(new RelationBase("r1"));
		s2.setRelation(new RelationBase("r1"));
		
		s1.addRelevantObject(new RelevantIndividualBase("i1"));
		s2.addRelevantObject(new RelevantIndividualBase("i1"));
		
		s1.setPolarity(Polarity.True);
		s2.setPolarity(Polarity.True);
		
		assertEquals(s1, s2);
	}
	
	@Test
	public void test15() {
		ElementaryInfonBase s1 = new ElementaryInfonBase("i1");
		ElementaryInfonBase s2 = new ElementaryInfonBase("i1");
		
		s1.setRelation(new RelationBase("r1"));
		s2.setRelation(new RelationBase("r1"));
		
		s1.addRelevantObject(new RelevantIndividualBase("i2"));
		s2.addRelevantObject(new RelevantIndividualBase("i1"));
		
		s1.setPolarity(Polarity.True);
		s2.setPolarity(Polarity.True);
		
		assertNotEquals(s1, s2);
	}

}
