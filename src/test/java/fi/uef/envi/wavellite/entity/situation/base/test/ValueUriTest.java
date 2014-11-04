/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.situation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

import fi.uef.envi.wavellite.entity.situation.base.ValueUri;
import fi.uef.envi.wavellite.vocabulary.STO;

/**
 * <p>
 * Title: ValueUriTest
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Project: Wavellite Entity
 * </p>
 * <p>
 * Copyright: Copyright (C) 2014
 * </p>
 * 
 * @author Markus Stocker
 */

public class ValueUriTest {

	private ValueFactory vf = new ValueFactoryImpl();

	@Test
	public void test1() {
		ValueUri e = new ValueUri("i1", vf.createURI("http://example.org#i1"));
		ValueUri a = new ValueUri("i1", vf.createURI("http://example.org#i1"));

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		ValueUri e = new ValueUri("i1", vf.createURI("http://example.org#i1"));
		ValueUri a = new ValueUri("i1", vf.createURI("http://example.org#i2"));

		assertNotEquals(e, a);
	}

	@Test
	public void test3() {
		ValueUri s1 = new ValueUri("i1", vf.createURI("http://example.org#i1"));
		ValueUri s2 = new ValueUri("i1", vf.createURI("http://example.org#i1"));

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test4() {
		ValueUri s1 = new ValueUri("i1", vf.createURI("http://example.org#i1"));
		ValueUri s2 = new ValueUri("i1", vf.createURI("http://example.org#i2"));

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test5() {
		ValueUri s = new ValueUri("i1", vf.createURI("http://example.org#i1"));

		assertEquals("i1", s.getId());
	}

	@Test
	public void test6() {
		ValueUri s = new ValueUri("i1", vf.createURI("http://example.org#i1"));

		assertEquals(STO.Value, s.getType());
	}

	@Test
	public void test7() {
		ValueUri s = new ValueUri("i1", "t1",
				vf.createURI("http://example.org#i1"));

		assertEquals("t1", s.getType());
	}

	@Test
	public void test8() {
		ValueUri s = new ValueUri("i1", vf.createURI("http://example.org#i1"));

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test9() {
		ValueUri s = new ValueUri("i1", "t1",
				vf.createURI("http://example.org#i1"));

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test10() {
		ValueUri s1 = new ValueUri("i1", null);
		ValueUri s2 = new ValueUri("i1", null);

		s1.setValue(vf.createURI("http://example.org#i1"));
		s2.setValue(vf.createURI("http://example.org#i1"));

		assertEquals(s1, s2);
	}

	@Test
	public void test15() {
		ValueUri s1 = new ValueUri("i1", null);
		ValueUri s2 = new ValueUri("i1", null);

		s1.setValue(vf.createURI("http://example.org#i1"));
		s2.setValue(vf.createURI("http://example.org#i2"));

		assertNotEquals(s1, s2);
	}

}
