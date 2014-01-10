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
import com.vividsolutions.jts.geom.LineString;

import fi.uef.envi.wavellite.entity.core.base.SpatialGeometryLineString;
import fi.uef.envi.wavellite.vocabulary.WOE;

/**
 * <p>
 * Title: SpatialGeometryLineStringTest
 * </p>
 * <p>
 * Description:
 * </p>
 * SpatialGeometryLineString
 * <p>
 * Project: Wavellite Entity
 * </p>
 * <p>
 * Copyright: Copyright (C) 2014
 * </p>
 * 
 * @author Markus Stocker
 */

public class SpatialGeometryLineStringTest {

	@Test
	public void test1() {
		SpatialGeometryLineString e = new SpatialGeometryLineString("i1");
		SpatialGeometryLineString a = new SpatialGeometryLineString("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		SpatialGeometryLineString e = new SpatialGeometryLineString("i1", "t1");
		SpatialGeometryLineString a = new SpatialGeometryLineString("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		SpatialGeometryLineString e = new SpatialGeometryLineString("i1");
		SpatialGeometryLineString a = new SpatialGeometryLineString("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		SpatialGeometryLineString e = new SpatialGeometryLineString("i1", "t1");
		SpatialGeometryLineString a = new SpatialGeometryLineString("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		SpatialGeometryLineString s1 = new SpatialGeometryLineString("i1");
		SpatialGeometryLineString s2 = new SpatialGeometryLineString("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		SpatialGeometryLineString s1 = new SpatialGeometryLineString("i1", "t1");
		SpatialGeometryLineString s2 = new SpatialGeometryLineString("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		SpatialGeometryLineString s1 = new SpatialGeometryLineString("i1");
		SpatialGeometryLineString s2 = new SpatialGeometryLineString("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		SpatialGeometryLineString s1 = new SpatialGeometryLineString("i1", "t1");
		SpatialGeometryLineString s2 = new SpatialGeometryLineString("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		SpatialGeometryLineString s = new SpatialGeometryLineString("i1", "t1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		SpatialGeometryLineString s = new SpatialGeometryLineString("i1");

		assertEquals(WOE.LineString, s.getType());
	}

	@Test
	public void test11() {
		SpatialGeometryLineString s = new SpatialGeometryLineString("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		SpatialGeometryLineString s = new SpatialGeometryLineString("i1", "t1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		SpatialGeometryLineString s = new SpatialGeometryLineString("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		GeometryFactory gf = new GeometryFactory();
		LineString g = gf.createLineString(new Coordinate[] {
				new Coordinate(0.0, 0.0), new Coordinate(1.0, 1.0) });

		SpatialGeometryLineString e = new SpatialGeometryLineString("p1", g);
		SpatialGeometryLineString a = new SpatialGeometryLineString("p1", g);

		assertEquals(e, a);
	}

	@Test
	public void test15() {
		GeometryFactory gf = new GeometryFactory();
		LineString g1 = gf.createLineString(new Coordinate[] {
				new Coordinate(0.0, 0.0), new Coordinate(1.0, 1.0) });
		LineString g2 = gf.createLineString(new Coordinate[] {
				new Coordinate(0.0, 0.0), new Coordinate(-1.0, -1.0) });

		SpatialGeometryLineString e = new SpatialGeometryLineString("p1", g1);
		SpatialGeometryLineString a = new SpatialGeometryLineString("p1", g2);

		assertNotEquals(e, a);
	}

	@Test
	public void test16() {
		GeometryFactory gf = new GeometryFactory();
		LineString g = gf.createLineString(new Coordinate[] {
				new Coordinate(0.0, 0.0), new Coordinate(1.0, 1.0) });

		SpatialGeometryLineString s = new SpatialGeometryLineString("p1", g);

		assertEquals(g, s.getGeometry());
	}

}
