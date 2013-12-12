/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyBase;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentSpecificationBase;
import fi.uef.envi.wavellite.vocabulary.QB;

/**
 * <p>
 * Title: ComponentSpecificationBaseTest
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

public class ComponentSpecificationBaseTest {

	@Test
	public void test1() {
		ComponentSpecificationBase e = new ComponentSpecificationBase("i1");
		ComponentSpecificationBase a = new ComponentSpecificationBase("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ComponentSpecificationBase e = new ComponentSpecificationBase("i1",
				"t1");
		ComponentSpecificationBase a = new ComponentSpecificationBase("i1",
				"t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		ComponentSpecificationBase e = new ComponentSpecificationBase("i1");
		ComponentSpecificationBase a = new ComponentSpecificationBase("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		ComponentSpecificationBase e = new ComponentSpecificationBase("i1",
				"t1");
		ComponentSpecificationBase a = new ComponentSpecificationBase("i1",
				"t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		ComponentSpecificationBase s1 = new ComponentSpecificationBase("i1");
		ComponentSpecificationBase s2 = new ComponentSpecificationBase("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		ComponentSpecificationBase s1 = new ComponentSpecificationBase("i1",
				"t1");
		ComponentSpecificationBase s2 = new ComponentSpecificationBase("i1",
				"t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		ComponentSpecificationBase s1 = new ComponentSpecificationBase("i1");
		ComponentSpecificationBase s2 = new ComponentSpecificationBase("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		ComponentSpecificationBase s1 = new ComponentSpecificationBase("i1",
				"t1");
		ComponentSpecificationBase s2 = new ComponentSpecificationBase("i1",
				"t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		ComponentSpecificationBase s = new ComponentSpecificationBase("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		ComponentSpecificationBase s = new ComponentSpecificationBase("i1");

		assertEquals(QB.ComponentSpecification, s.getType());
	}

	@Test
	public void test11() {
		ComponentSpecificationBase s = new ComponentSpecificationBase("i1",
				"t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		ComponentSpecificationBase s = new ComponentSpecificationBase("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		ComponentSpecificationBase s = new ComponentSpecificationBase("i1",
				"t1");

		assertNotEquals("t2", s.getType());
	}
	
	@Test
	public void test14() {
		ComponentSpecificationBase e = new ComponentSpecificationBase();
		ComponentSpecificationBase a = new ComponentSpecificationBase();
		
		e.setComponentProperty(new ComponentPropertyBase("p1"));
		e.setOrder(1);
		e.setComponentRequired(true);
		
		a.setComponentProperty(new ComponentPropertyBase("p1"));
		a.setOrder(1);
		a.setComponentRequired(true);
		
		assertEquals(e, a);
		assertEquals(e.hashCode(), a.hashCode());
	}
	
	@Test
	public void test15() {
		ComponentSpecificationBase e = new ComponentSpecificationBase();
		ComponentSpecificationBase a = new ComponentSpecificationBase();
		
		e.setComponentProperty(new ComponentPropertyBase("p1"));
		e.setOrder(1);
		e.setComponentRequired(true);
		
		a.setComponentProperty(new ComponentPropertyBase("p2"));
		a.setOrder(1);
		a.setComponentRequired(true);
		
		assertNotEquals(e, a);
		assertNotEquals(e.hashCode(), a.hashCode());
	}
	
	@Test
	public void test16() {
		ComponentSpecificationBase e = new ComponentSpecificationBase();
		ComponentSpecificationBase a = new ComponentSpecificationBase();
		
		e.setComponentProperty(new ComponentPropertyBase("p1"));
		e.setOrder(1);
		e.setComponentRequired(true);
		
		a.setComponentProperty(new ComponentPropertyBase("p1"));
		a.setOrder(2);
		a.setComponentRequired(true);
		
		assertNotEquals(e, a);
		assertNotEquals(e.hashCode(), a.hashCode());
	}
	
	@Test
	public void test17() {
		ComponentSpecificationBase e = new ComponentSpecificationBase();
		ComponentSpecificationBase a = new ComponentSpecificationBase();
		
		e.setComponentProperty(new ComponentPropertyBase("p1"));
		e.setOrder(1);
		e.setComponentRequired(true);
		
		a.setComponentProperty(new ComponentPropertyBase("p1"));
		a.setOrder(1);
		a.setComponentRequired(false);
		
		assertNotEquals(e, a);
		assertNotEquals(e.hashCode(), a.hashCode());
	}
	
}
