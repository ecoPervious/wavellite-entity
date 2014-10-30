/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fi.uef.envi.wavellite.entity.core.base.OperationBase;
import fi.uef.envi.wavellite.entity.core.base.OperatorBase;
import fi.uef.envi.wavellite.entity.derivation.ComponentProperty;
import fi.uef.envi.wavellite.entity.derivation.ComponentSpecification;
import fi.uef.envi.wavellite.entity.derivation.DataStructureDefinition;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyBase;
import fi.uef.envi.wavellite.entity.derivation.base.ComponentSpecificationBase;
import fi.uef.envi.wavellite.entity.derivation.base.DataStructureDefinitionBase;
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

	@Test
	public void test14() {
		DatasetBase e = new DatasetBase("i1");
		DatasetBase a = new DatasetBase("i1");

		DataStructureDefinition d = new DataStructureDefinitionBase("d1");
		ComponentSpecification s = new ComponentSpecificationBase("s1");
		s.setComponentProperty(new ComponentPropertyBase("p1"));
		s.setComponentRequired(true);
		s.setOrder(1);
		d.addComponentSpecification(s);
		
		e.setDataStructureDefinition(d);
		a.setDataStructureDefinition(d);
		
		assertEquals(e, a);
	}
	
	@Test
	public void test15() {
		DatasetBase e = new DatasetBase("i1");
		DatasetBase a = new DatasetBase("i1");
		
		DataStructureDefinition d1 = new DataStructureDefinitionBase("d1");
		ComponentSpecification s1 = new ComponentSpecificationBase("s1");
		s1.setComponentProperty(new ComponentPropertyBase("p1"));
		s1.setComponentRequired(true);
		s1.setOrder(1);
		d1.addComponentSpecification(s1);
		
		DataStructureDefinition d2 = new DataStructureDefinitionBase("d1");
		ComponentSpecification s2 = new ComponentSpecificationBase("s1");
		s2.setComponentProperty(new ComponentPropertyBase("p1"));
		s2.setComponentRequired(false);
		s2.setOrder(1);
		d2.addComponentSpecification(s2);
		
		e.setDataStructureDefinition(d1);
		a.setDataStructureDefinition(d2);

		assertNotEquals(e, a);
	}
	
	@Test
	public void test16() {
		DatasetBase d = new DatasetBase("i1");

		DataStructureDefinition sd = new DataStructureDefinitionBase("sd1");
		ComponentSpecification cs1 = new ComponentSpecificationBase("cs1");
		cs1.setComponentProperty(new ComponentPropertyBase("cp1"));
		cs1.setComponentRequired(true);
		cs1.setOrder(1);
		sd.addComponentSpecification(cs1);
		ComponentSpecification cs2 = new ComponentSpecificationBase("cs2");
		cs2.setComponentProperty(new ComponentPropertyBase("cp0"));
		cs2.setComponentRequired(true);
		cs2.setOrder(0);
		sd.addComponentSpecification(cs2);
		
		d.setDataStructureDefinition(sd);
		
		List<ComponentProperty> e = new ArrayList<ComponentProperty>();
		
		e.add(new ComponentPropertyBase("cp0"));
		e.add(new ComponentPropertyBase("cp1"));
		
		List<ComponentProperty> a = d.getComponentPropertiesOrdered();
		
		assertEquals(e, a);
	}
	
	@Test
	public void test17() {
		DatasetBase e = new DatasetBase("i1");
		DatasetBase a = new DatasetBase("i1");
		
		e.setOperator(new OperatorBase("o1"));
		a.setOperator(new OperatorBase("o1"));
	
		e.setOperation(new OperationBase("o2"));
		a.setOperation(new OperationBase("o2"));
		
		assertEquals(e, a);
	}
	
	@Test
	public void test18() {
		DatasetBase e = new DatasetBase("i1");
		
		e.setOperator(new OperatorBase("o1"));
	
		e.setOperation(new OperationBase("o2"));
		
		assertEquals(new OperatorBase("o1"), e.getOperator());
		assertEquals(new OperationBase("o2"), e.getOperation());
	}
	
	@Test
	public void test19() {
		DatasetBase e = new DatasetBase("i1");
		
		e.setOperator(new OperatorBase("o1"));
	
		e.setOperation(new OperationBase("o2"));
		
		assertNotEquals(new OperatorBase("p1"), e.getOperator());
		assertNotEquals(new OperationBase("p2"), e.getOperation());
	}

}
