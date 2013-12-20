/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.derivation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

import fi.uef.envi.wavellite.entity.derivation.base.ComponentPropertyValueUri;
import fi.uef.envi.wavellite.vocabulary.WO;

/**
 * <p>
 * Title: ComponentPropertyValueUri
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

public class ComponentPropertyValueUriTest {

	@Test
	public void test1() {
		ComponentPropertyValueUri e = new ComponentPropertyValueUri("i1");
		ComponentPropertyValueUri a = new ComponentPropertyValueUri("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ComponentPropertyValueUri e = new ComponentPropertyValueUri("i1", "t1");
		ComponentPropertyValueUri a = new ComponentPropertyValueUri("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		ComponentPropertyValueUri e = new ComponentPropertyValueUri("i1");
		ComponentPropertyValueUri a = new ComponentPropertyValueUri("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		ComponentPropertyValueUri e = new ComponentPropertyValueUri("i1", "t1");
		ComponentPropertyValueUri a = new ComponentPropertyValueUri("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		ComponentPropertyValueUri s1 = new ComponentPropertyValueUri("i1");
		ComponentPropertyValueUri s2 = new ComponentPropertyValueUri("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		ComponentPropertyValueUri s1 = new ComponentPropertyValueUri("i1", "t1");
		ComponentPropertyValueUri s2 = new ComponentPropertyValueUri("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		ComponentPropertyValueUri s1 = new ComponentPropertyValueUri("i1");
		ComponentPropertyValueUri s2 = new ComponentPropertyValueUri("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		ComponentPropertyValueUri s1 = new ComponentPropertyValueUri("i1", "t1");
		ComponentPropertyValueUri s2 = new ComponentPropertyValueUri("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		ComponentPropertyValueUri s = new ComponentPropertyValueUri("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		ComponentPropertyValueUri s = new ComponentPropertyValueUri("i1");

		assertEquals(WO.ComponentPropertyValueUri, s.getType());
	}

	@Test
	public void test11() {
		ComponentPropertyValueUri s = new ComponentPropertyValueUri("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		ComponentPropertyValueUri s = new ComponentPropertyValueUri("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		ComponentPropertyValueUri s = new ComponentPropertyValueUri("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		ValueFactory vf = ValueFactoryImpl.getInstance();

		ComponentPropertyValueUri e = new ComponentPropertyValueUri("i1",
				vf.createURI("http://example.org#i1"));
		ComponentPropertyValueUri a = new ComponentPropertyValueUri("i1",
				vf.createURI("http://example.org#i1"));

		assertEquals(e, a);
	}

	@Test
	public void test15() {
		ValueFactory vf = ValueFactoryImpl.getInstance();

		ComponentPropertyValueUri e = new ComponentPropertyValueUri("i1",
				vf.createURI("http://example.org#i1"));
		ComponentPropertyValueUri a = new ComponentPropertyValueUri("i1",
				vf.createURI("http://example.org#i2"));

		assertNotEquals(e, a);
	}

	@Test
	public void test16() {
		ValueFactory vf = ValueFactoryImpl.getInstance();

		ComponentPropertyValueUri e = new ComponentPropertyValueUri(
				vf.createURI("http://example.org#i1"));
		ComponentPropertyValueUri a = new ComponentPropertyValueUri(
				vf.createURI("http://example.org#i1"));

		assertEquals(e, a);
	}

	@Test
	public void test17() {
		ValueFactory vf = ValueFactoryImpl.getInstance();

		ComponentPropertyValueUri e = new ComponentPropertyValueUri(
				vf.createURI("http://example.org#i1"));
		ComponentPropertyValueUri a = new ComponentPropertyValueUri(
				vf.createURI("http://example.org#i2"));

		assertNotEquals(e, a);
	}

}
