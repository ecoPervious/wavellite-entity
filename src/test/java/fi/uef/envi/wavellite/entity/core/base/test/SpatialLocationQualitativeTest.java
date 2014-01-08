/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Collections;

import org.junit.Test;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

import fi.uef.envi.wavellite.entity.core.base.SpatialLocationQualitative;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: SpatialLocationQualitativeTest
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

public class SpatialLocationQualitativeTest {

	private static final ValueFactory vf = ValueFactoryImpl.getInstance();

	@Test
	public void test1() {
		SpatialLocationQualitative e = new SpatialLocationQualitative("l1");
		SpatialLocationQualitative a = new SpatialLocationQualitative("l1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		SpatialLocationQualitative e = new SpatialLocationQualitative("i1",
				"l1");
		SpatialLocationQualitative a = new SpatialLocationQualitative("i1",
				"l1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		SpatialLocationQualitative e = new SpatialLocationQualitative("l1");
		SpatialLocationQualitative a = new SpatialLocationQualitative("l2");

		assertNotEquals(e, a);
	}

	@Test
	public void test4() {
		SpatialLocationQualitative e = new SpatialLocationQualitative("i1",
				"l1");
		SpatialLocationQualitative a = new SpatialLocationQualitative("i1",
				"l2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		SpatialLocationQualitative s1 = new SpatialLocationQualitative("l1");
		SpatialLocationQualitative s2 = new SpatialLocationQualitative("l1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		SpatialLocationQualitative s1 = new SpatialLocationQualitative("i1",
				"l1");
		SpatialLocationQualitative s2 = new SpatialLocationQualitative("i1",
				"l1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		SpatialLocationQualitative s1 = new SpatialLocationQualitative("l1");
		SpatialLocationQualitative s2 = new SpatialLocationQualitative("l2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		SpatialLocationQualitative s1 = new SpatialLocationQualitative("i1",
				"l1");
		SpatialLocationQualitative s2 = new SpatialLocationQualitative("i1",
				"l2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		SpatialLocationQualitative s = new SpatialLocationQualitative("i1",
				"l1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		SpatialLocationQualitative s = new SpatialLocationQualitative("l1");

		assertEquals(WTO.SpatialPlace, s.getType());
	}

	@Test
	public void test11() {
		SpatialLocationQualitative s = new SpatialLocationQualitative("i1",
				"t1", "l1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		SpatialLocationQualitative s = new SpatialLocationQualitative("i1",
				"l1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		SpatialLocationQualitative s = new SpatialLocationQualitative("i1",
				"t1", "l1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		SpatialLocationQualitative e = new SpatialLocationQualitative("l1",
				vf.createURI("http://example.org#i"));
		SpatialLocationQualitative a = new SpatialLocationQualitative("l1",
				vf.createURI("http://example.org#i"));

		assertEquals(e, a);
	}

	@Test
	public void test15() {
		SpatialLocationQualitative e = new SpatialLocationQualitative("l1",
				vf.createURI("http://example.org#i"));
		SpatialLocationQualitative a = new SpatialLocationQualitative("l2",
				vf.createURI("http://example.org#i"));

		assertNotEquals(e, a);
	}

	@Test
	public void test16() {
		SpatialLocationQualitative e = new SpatialLocationQualitative("l1",
				vf.createURI("http://example.org#i"));
		SpatialLocationQualitative a = new SpatialLocationQualitative("l1",
				vf.createURI("http://example.org#j"));

		assertEquals(e, a);
	}

	@Test
	public void test17() {
		SpatialLocationQualitative e = new SpatialLocationQualitative("l1",
				vf.createURI("http://example.org#i"));

		assertEquals(
				Collections.singleton(vf.createURI("http://example.org#i")),
				e.sameAs());
	}

	@Test
	public void test18() {
		SpatialLocationQualitative e = new SpatialLocationQualitative("l1",
				vf.createURI("http://example.org#i"));

		assertNotEquals(
				Collections.singleton(vf.createURI("http://example.org#j")),
				e.sameAs());
	}

}
