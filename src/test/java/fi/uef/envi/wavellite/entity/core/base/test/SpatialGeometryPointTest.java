/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;

import fi.uef.envi.wavellite.entity.core.base.SpatialGeometryPoint;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: SpatialGeometryPointTest
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

public class SpatialGeometryPointTest {

	@Test
	public void test1() {
		SpatialGeometryPoint e = new SpatialGeometryPoint("i1");
		SpatialGeometryPoint a = new SpatialGeometryPoint("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		SpatialGeometryPoint e = new SpatialGeometryPoint("i1", "t1");
		SpatialGeometryPoint a = new SpatialGeometryPoint("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		SpatialGeometryPoint e = new SpatialGeometryPoint("i1");
		SpatialGeometryPoint a = new SpatialGeometryPoint("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		SpatialGeometryPoint e = new SpatialGeometryPoint("i1", "t1");
		SpatialGeometryPoint a = new SpatialGeometryPoint("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		SpatialGeometryPoint s1 = new SpatialGeometryPoint("i1");
		SpatialGeometryPoint s2 = new SpatialGeometryPoint("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		SpatialGeometryPoint s1 = new SpatialGeometryPoint("i1", "t1");
		SpatialGeometryPoint s2 = new SpatialGeometryPoint("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		SpatialGeometryPoint s1 = new SpatialGeometryPoint("i1");
		SpatialGeometryPoint s2 = new SpatialGeometryPoint("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		SpatialGeometryPoint s1 = new SpatialGeometryPoint("i1", "t1");
		SpatialGeometryPoint s2 = new SpatialGeometryPoint("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		SpatialGeometryPoint s = new SpatialGeometryPoint("i1", "t1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		SpatialGeometryPoint s = new SpatialGeometryPoint("i1");

		assertEquals(WTO.SpatialGeometryPoint, s.getType());
	}

	@Test
	public void test11() {
		SpatialGeometryPoint s = new SpatialGeometryPoint("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		SpatialGeometryPoint s = new SpatialGeometryPoint("i1", "t1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		SpatialGeometryPoint s = new SpatialGeometryPoint("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		GeometryFactory gf = new GeometryFactory();
		Point g = gf.createPoint(new Coordinate(0.0, 0.0));

		SpatialGeometryPoint e = new SpatialGeometryPoint("p1", g);
		SpatialGeometryPoint a = new SpatialGeometryPoint("p1", g);

		assertEquals(e, a);
	}

	@Test
	public void test15() {
		GeometryFactory gf = new GeometryFactory();
		Point g1 = gf.createPoint(new Coordinate(0.0, 0.0));
		Point g2 = gf.createPoint(new Coordinate(1.0, 1.0));

		SpatialGeometryPoint e = new SpatialGeometryPoint("p1", g1);
		SpatialGeometryPoint a = new SpatialGeometryPoint("p1", g2);

		assertNotEquals(e, a);
	}

	@Test
	public void test16() {
		GeometryFactory gf = new GeometryFactory();
		Point g = gf.createPoint(new Coordinate(0.0, 0.0));

		SpatialGeometryPoint s = new SpatialGeometryPoint("p1", g);

		assertEquals(g, s.getGeometry());
	}

}
