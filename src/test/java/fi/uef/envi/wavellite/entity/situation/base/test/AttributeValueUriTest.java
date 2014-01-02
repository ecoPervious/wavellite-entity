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

import fi.uef.envi.wavellite.entity.situation.base.AttributeValueUri;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: AttributeValueUriTest
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

public class AttributeValueUriTest {

	private static final ValueFactory vf = ValueFactoryImpl.getInstance();

	@Test
	public void test1() {
		AttributeValueUri e = new AttributeValueUri("i1",
				vf.createURI("http://example.org#v1"));
		AttributeValueUri a = new AttributeValueUri("i1",
				vf.createURI("http://example.org#v1"));

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		AttributeValueUri e = new AttributeValueUri("i1",
				vf.createURI("http://example.org#v1"));
		AttributeValueUri a = new AttributeValueUri("i1",
				vf.createURI("http://example.org#v2"));

		assertNotEquals(e, a);
	}

	@Test
	public void test3() {
		AttributeValueUri s1 = new AttributeValueUri("i1",
				vf.createURI("http://example.org#v1"));
		AttributeValueUri s2 = new AttributeValueUri("i1",
				vf.createURI("http://example.org#v1"));

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test4() {
		AttributeValueUri s1 = new AttributeValueUri("i1",
				vf.createURI("http://example.org#v1"));
		AttributeValueUri s2 = new AttributeValueUri("i1",
				vf.createURI("http://example.org#v2"));

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test5() {
		AttributeValueUri s = new AttributeValueUri("i1",
				vf.createURI("http://example.org#v1"));

		assertEquals("i1", s.getId());
	}

	@Test
	public void test6() {
		AttributeValueUri s = new AttributeValueUri("i1",
				vf.createURI("http://example.org#v1"));

		assertEquals(WTO.AttributeValueUri, s.getType());
	}

	@Test
	public void test7() {
		AttributeValueUri s = new AttributeValueUri("i1", "t1",
				vf.createURI("http://example.org#v1"));

		assertEquals("t1", s.getType());
	}

	@Test
	public void test8() {
		AttributeValueUri s = new AttributeValueUri("i1",
				vf.createURI("http://example.org#v1"));

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test9() {
		AttributeValueUri s = new AttributeValueUri("i1", "t1",
				vf.createURI("http://example.org#v1"));

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test10() {
		AttributeValueUri s1 = new AttributeValueUri("i1");
		AttributeValueUri s2 = new AttributeValueUri("i1");

		s1.setValue("v1");
		s2.setValue("v1");

		assertEquals(s1, s2);
	}

	@Test
	public void test15() {
		AttributeValueUri s1 = new AttributeValueUri("i1");
		AttributeValueUri s2 = new AttributeValueUri("i1");

		s1.setValue("v1");
		s2.setValue("v2");

		assertNotEquals(s1, s2);
	}

}
