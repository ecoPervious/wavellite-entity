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
import com.vividsolutions.jts.geom.Polygon;

import fi.uef.envi.wavellite.entity.core.base.SpatialGeometryPolygon;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: SpatialGeometryPolygonTest
 * </p>
 * <p>
 * Description:
 * </p>
 * SpatialGeometryPolygon
 * <p>
 * Project: Wavellite Entity
 * </p>
 * <p>
 * Copyright: Copyright (C) 2014
 * </p>
 * 
 * @author Markus Stocker
 */

public class SpatialGeometryPolygonTest {

	@Test
	public void test1() {
		SpatialGeometryPolygon e = new SpatialGeometryPolygon("i1");
		SpatialGeometryPolygon a = new SpatialGeometryPolygon("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		SpatialGeometryPolygon e = new SpatialGeometryPolygon("i1", "t1");
		SpatialGeometryPolygon a = new SpatialGeometryPolygon("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		SpatialGeometryPolygon e = new SpatialGeometryPolygon("i1");
		SpatialGeometryPolygon a = new SpatialGeometryPolygon("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		SpatialGeometryPolygon e = new SpatialGeometryPolygon("i1", "t1");
		SpatialGeometryPolygon a = new SpatialGeometryPolygon("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		SpatialGeometryPolygon s1 = new SpatialGeometryPolygon("i1");
		SpatialGeometryPolygon s2 = new SpatialGeometryPolygon("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		SpatialGeometryPolygon s1 = new SpatialGeometryPolygon("i1", "t1");
		SpatialGeometryPolygon s2 = new SpatialGeometryPolygon("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		SpatialGeometryPolygon s1 = new SpatialGeometryPolygon("i1");
		SpatialGeometryPolygon s2 = new SpatialGeometryPolygon("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		SpatialGeometryPolygon s1 = new SpatialGeometryPolygon("i1", "t1");
		SpatialGeometryPolygon s2 = new SpatialGeometryPolygon("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		SpatialGeometryPolygon s = new SpatialGeometryPolygon("i1", "t1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		SpatialGeometryPolygon s = new SpatialGeometryPolygon("i1");

		assertEquals(WTO.Polygon, s.getType());
	}

	@Test
	public void test11() {
		SpatialGeometryPolygon s = new SpatialGeometryPolygon("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		SpatialGeometryPolygon s = new SpatialGeometryPolygon("i1", "t1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		SpatialGeometryPolygon s = new SpatialGeometryPolygon("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		GeometryFactory gf = new GeometryFactory();
		Polygon g = gf.createPolygon(new Coordinate[] {
				new Coordinate(0.0, 0.0), new Coordinate(1.0, 1.0),
				new Coordinate(-1.0, -1.0), new Coordinate(0.0, 0.0) });

		SpatialGeometryPolygon e = new SpatialGeometryPolygon("p1", g);
		SpatialGeometryPolygon a = new SpatialGeometryPolygon("p1", g);

		assertEquals(e, a);
	}

	@Test
	public void test15() {
		GeometryFactory gf = new GeometryFactory();
		Polygon g1 = gf.createPolygon(new Coordinate[] {
				new Coordinate(0.0, 0.0), new Coordinate(1.0, 1.0),
				new Coordinate(-1.0, -1.0), new Coordinate(0.0, 0.0) });
		Polygon g2 = gf.createPolygon(new Coordinate[] {
				new Coordinate(0.0, 0.0), new Coordinate(2.0, 2.0),
				new Coordinate(-2.0, -2.0), new Coordinate(0.0, 0.0) });

		SpatialGeometryPolygon e = new SpatialGeometryPolygon("p1", g1);
		SpatialGeometryPolygon a = new SpatialGeometryPolygon("p1", g2);

		assertNotEquals(e, a);
	}

	@Test
	public void test16() {
		GeometryFactory gf = new GeometryFactory();
		Polygon g = gf.createPolygon(new Coordinate[] {
				new Coordinate(0.0, 0.0), new Coordinate(1.0, 1.0),
				new Coordinate(-1.0, -1.0), new Coordinate(0.0, 0.0) });

		SpatialGeometryPolygon s = new SpatialGeometryPolygon("p1", g);

		assertEquals(g, s.getGeometry());
	}

}
