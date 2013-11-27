/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.situation.ElementaryInfon;
import fi.uef.envi.wavellite.entity.situation.Polarity;
import fi.uef.envi.wavellite.entity.situation.Situation;
import fi.uef.envi.wavellite.entity.situation.base.AttributeBase;
import fi.uef.envi.wavellite.entity.situation.base.AttributeValueString;
import fi.uef.envi.wavellite.entity.situation.base.ElementaryInfonBase;
import fi.uef.envi.wavellite.entity.situation.base.RelationBase;
import fi.uef.envi.wavellite.entity.situation.base.RelevantIndividualBase;
import fi.uef.envi.wavellite.entity.situation.base.SituationBase;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: SituationBaseTest
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

public class SituationBaseTest {

	@Test
	public void test1() {
		SituationBase e = new SituationBase("i1");
		SituationBase a = new SituationBase("i1");

		assertEquals(e, a);
	}
	
	@Test
	public void test2() {
		SituationBase e = new SituationBase("i1", "t1");
		SituationBase a = new SituationBase("i1", "t1");
		
		assertEquals(e, a);
	}
	
	@Test
	public void test3() {
		SituationBase e = new SituationBase("i1");
		SituationBase a = new SituationBase("i2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test4() {
		SituationBase e = new SituationBase("i1", "t1");
		SituationBase a = new SituationBase("i1", "t2");
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test5() {
		SituationBase s1 = new SituationBase("i1");
		SituationBase s2 = new SituationBase("i1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test6() {
		SituationBase s1 = new SituationBase("i1", "t1");
		SituationBase s2 = new SituationBase("i1", "t1");
		
		assertEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test7() {
		SituationBase s1 = new SituationBase("i1");
		SituationBase s2 = new SituationBase("i2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test8() {
		SituationBase s1 = new SituationBase("i1", "t1");
		SituationBase s2 = new SituationBase("i1", "t2");
		
		assertNotEquals(s1.hashCode(), s2.hashCode());
	}
	
	@Test
	public void test9() {
		SituationBase s = new SituationBase("i1");
		
		assertEquals("i1", s.getId());
	}
	
	@Test
	public void test10() {
		SituationBase s = new SituationBase("i1");
		
		assertEquals(STO.Situation, s.getType());
	}
	
	@Test
	public void test11() {
		SituationBase s = new SituationBase("i1", "t1");
		
		assertEquals("t1", s.getType());
	}
	
	@Test
	public void test12() {
		SituationBase s = new SituationBase("i1");
		
		assertNotEquals("i2", s.getId());
	}
	
	@Test
	public void test13() {
		SituationBase s = new SituationBase("i1", "t1");
		
		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test14() {
		SituationBase s1 = new SituationBase("i1");
		SituationBase s2 = new SituationBase("i1");
		
		s1.addSupportedInfon(new ElementaryInfonBase("i1"));
		s2.addSupportedInfon(new ElementaryInfonBase("i1"));
		
		assertEquals(s1, s2);
	}
	
	@Test
	public void test15() {
		SituationBase s1 = new SituationBase("i1");
		SituationBase s2 = new SituationBase("i1");
		
		s1.addSupportedInfon(new ElementaryInfonBase("i2"));
		s2.addSupportedInfon(new ElementaryInfonBase("i1"));
		
		assertNotEquals(s1, s2);
	}
	
	@Test
	public void test16() {
		Situation a = new SituationBase("s1");
		ElementaryInfon i1 = new ElementaryInfonBase("i1");
		i1.setRelation(new RelationBase("r1"));
		i1.addRelevantObject(new RelevantIndividualBase("o1", new AttributeBase(
				"a1", new AttributeValueString("v1", "A"))));
		i1.setPolarity(Polarity.True);
		a.addSupportedInfon(i1);
		
		Situation e = new SituationBase("s1");
		ElementaryInfon i2 = new ElementaryInfonBase("i1");
		i2.setRelation(new RelationBase("r1"));
		i2.addRelevantObject(new RelevantIndividualBase("o1", new AttributeBase(
				"a1", new AttributeValueString("v1", "A"))));
		i2.setPolarity(Polarity.True);
		e.addSupportedInfon(i2);

		assertEquals(e, a);
	}
	
}
