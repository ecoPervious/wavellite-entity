/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.derivation.ComponentSpecification;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyBase;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentSpecificationBase;
import fi.uef.envi.wavellite.entity.derivation.base.DataStructureDefinitionBase;
import fi.uef.envi.wavellite.vocabulary.QB;

/**
 * <p>
 * Title: DataStructureDefinitionBaseTest
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

public class DataStructureDefinitionBaseTest {

	@Test
	public void test1() {
		DataStructureDefinitionBase e = new DataStructureDefinitionBase("i1");
		DataStructureDefinitionBase a = new DataStructureDefinitionBase("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		DataStructureDefinitionBase e = new DataStructureDefinitionBase("i1",
				"t1");
		DataStructureDefinitionBase a = new DataStructureDefinitionBase("i1",
				"t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		DataStructureDefinitionBase e = new DataStructureDefinitionBase("i1");
		DataStructureDefinitionBase a = new DataStructureDefinitionBase("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		DataStructureDefinitionBase e = new DataStructureDefinitionBase("i1",
				"t1");
		DataStructureDefinitionBase a = new DataStructureDefinitionBase("i1",
				"t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		DataStructureDefinitionBase s1 = new DataStructureDefinitionBase("i1");
		DataStructureDefinitionBase s2 = new DataStructureDefinitionBase("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		DataStructureDefinitionBase s1 = new DataStructureDefinitionBase("i1",
				"t1");
		DataStructureDefinitionBase s2 = new DataStructureDefinitionBase("i1",
				"t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		DataStructureDefinitionBase s1 = new DataStructureDefinitionBase("i1");
		DataStructureDefinitionBase s2 = new DataStructureDefinitionBase("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		DataStructureDefinitionBase s1 = new DataStructureDefinitionBase("i1",
				"t1");
		DataStructureDefinitionBase s2 = new DataStructureDefinitionBase("i1",
				"t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		DataStructureDefinitionBase s = new DataStructureDefinitionBase("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		DataStructureDefinitionBase s = new DataStructureDefinitionBase("i1");

		assertEquals(QB.DataStructureDefinition, s.getType());
	}

	@Test
	public void test11() {
		DataStructureDefinitionBase s = new DataStructureDefinitionBase("i1",
				"t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		DataStructureDefinitionBase s = new DataStructureDefinitionBase("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		DataStructureDefinitionBase s = new DataStructureDefinitionBase("i1",
				"t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		DataStructureDefinitionBase e = new DataStructureDefinitionBase();
		DataStructureDefinitionBase a = new DataStructureDefinitionBase();

		e.addComponentSpecification(new ComponentSpecificationBase());
		a.addComponentSpecification(new ComponentSpecificationBase());
		
		assertEquals(e, a);
	}
	
	@Test
	public void test15() {
		DataStructureDefinitionBase e = new DataStructureDefinitionBase();
		DataStructureDefinitionBase a = new DataStructureDefinitionBase();

		e.addComponentSpecification(new ComponentSpecificationBase("p1"));
		a.addComponentSpecification(new ComponentSpecificationBase("p2"));
		
		assertEquals(e, a);
	}

	@Test
	public void test16() {
		DataStructureDefinitionBase e = new DataStructureDefinitionBase();
		DataStructureDefinitionBase a = new DataStructureDefinitionBase();

		ComponentSpecification cs1 = new ComponentSpecificationBase();
		ComponentSpecification cs2 = new ComponentSpecificationBase();
		
		cs1.setComponentProperty(new ComponentPropertyBase("p1"));
		cs1.setComponentRequired(true);
		cs1.setOrder(0);
		cs2.setComponentProperty(new ComponentPropertyBase("p1"));
		cs2.setComponentRequired(true);
		cs2.setOrder(0);
		
		e.addComponentSpecification(cs1);
		a.addComponentSpecification(cs2);
		
		assertEquals(e, a);
	}
	
	@Test
	public void test17() {
		DataStructureDefinitionBase e = new DataStructureDefinitionBase();
		DataStructureDefinitionBase a = new DataStructureDefinitionBase();

		ComponentSpecification cs1 = new ComponentSpecificationBase();
		ComponentSpecification cs2 = new ComponentSpecificationBase();
		
		cs1.setComponentProperty(new ComponentPropertyBase("p1"));
		cs1.setComponentRequired(true);
		cs1.setOrder(0);
		cs2.setComponentProperty(new ComponentPropertyBase("p1"));
		cs2.setComponentRequired(false);
		cs2.setOrder(0);
		
		e.addComponentSpecification(cs1);
		a.addComponentSpecification(cs2);
		
		assertNotEquals(e, a);
	}
	
}
