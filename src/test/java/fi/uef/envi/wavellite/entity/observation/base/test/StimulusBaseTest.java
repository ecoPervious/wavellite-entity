/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.observation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.observation.base.StimulusBase;
import fi.uef.envi.wavellite.vocabulary.SSN;

/**
 * <p>
 * Title: StimulusBaseTest
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

public class StimulusBaseTest {

	@Test
	public void test1() {
		StimulusBase e = new StimulusBase("i1");
		StimulusBase a = new StimulusBase("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		StimulusBase e = new StimulusBase("i1", "t1");
		StimulusBase a = new StimulusBase("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		StimulusBase e = new StimulusBase("i1");
		StimulusBase a = new StimulusBase("i2");

		assertNotEquals(e, a);
	}

	@Test
	public void test4() {
		StimulusBase e = new StimulusBase("i1", "t1");
		StimulusBase a = new StimulusBase("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		StimulusBase s1 = new StimulusBase("i1");
		StimulusBase s2 = new StimulusBase("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		StimulusBase s1 = new StimulusBase("i1", "t1");
		StimulusBase s2 = new StimulusBase("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		StimulusBase s1 = new StimulusBase("i1");
		StimulusBase s2 = new StimulusBase("i2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		StimulusBase s1 = new StimulusBase("i1", "t1");
		StimulusBase s2 = new StimulusBase("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		StimulusBase s = new StimulusBase("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		StimulusBase s = new StimulusBase("i1");

		assertEquals(SSN.Stimulus, s.getType());
	}

	@Test
	public void test11() {
		StimulusBase s = new StimulusBase("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		StimulusBase s = new StimulusBase("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		StimulusBase s = new StimulusBase("i1", "t1");

		assertNotEquals("t2", s.getType());
	}
	
}
