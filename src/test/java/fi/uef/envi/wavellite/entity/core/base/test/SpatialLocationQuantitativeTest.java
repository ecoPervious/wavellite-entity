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
import fi.uef.envi.wavellite.entity.core.base.SpatialLocationRegion;
import fi.uef.envi.wavellite.vocabulary.WTO;

/**
 * <p>
 * Title: SpatialLocationQuantitativeTest
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Project:
 * </p>
 * <p>
 * Copyright: Copyright (C) 2014
 * </p>
 * 
 * @author Markus Stocker
 */

public class SpatialLocationQuantitativeTest {

	@Test
	public void test1() {
		SpatialLocationRegion e = new SpatialLocationRegion("i1");
		SpatialLocationRegion a = new SpatialLocationRegion("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		SpatialLocationRegion e = new SpatialLocationRegion("i1",
				"t1");
		SpatialLocationRegion a = new SpatialLocationRegion("i1",
				"t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		SpatialLocationRegion e = new SpatialLocationRegion("i1");
		SpatialLocationRegion a = new SpatialLocationRegion("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		SpatialLocationRegion e = new SpatialLocationRegion("i1",
				"t1");
		SpatialLocationRegion a = new SpatialLocationRegion("i1",
				"t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		SpatialLocationRegion s1 = new SpatialLocationRegion("i1");
		SpatialLocationRegion s2 = new SpatialLocationRegion("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		SpatialLocationRegion s1 = new SpatialLocationRegion("i1",
				"t1");
		SpatialLocationRegion s2 = new SpatialLocationRegion("i1",
				"t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		SpatialLocationRegion s1 = new SpatialLocationRegion("i1");
		SpatialLocationRegion s2 = new SpatialLocationRegion("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		SpatialLocationRegion s1 = new SpatialLocationRegion("i1",
				"t1");
		SpatialLocationRegion s2 = new SpatialLocationRegion("i1",
				"t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		SpatialLocationRegion s = new SpatialLocationRegion("i1",
				"t1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		SpatialLocationRegion s = new SpatialLocationRegion("i1");

		assertEquals(WTO.SpatialRegion, s.getType());
	}

	@Test
	public void test11() {
		SpatialLocationRegion s = new SpatialLocationRegion("i1",
				"t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		SpatialLocationRegion s = new SpatialLocationRegion("i1",
				"t1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		SpatialLocationRegion s = new SpatialLocationRegion("i1",
				"t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		GeometryFactory gf = new GeometryFactory();
		Point g = gf.createPoint(new Coordinate(0.0, 0.0));

		SpatialLocationRegion e = new SpatialLocationRegion(new SpatialGeometryPoint("p1", g));
		SpatialLocationRegion a = new SpatialLocationRegion(new SpatialGeometryPoint("p1", g));
		
		assertEquals(e, a);
	}
	
	@Test
	public void test15() {
		GeometryFactory gf = new GeometryFactory();
		Point g1 = gf.createPoint(new Coordinate(0.0, 0.0));
		Point g2 = gf.createPoint(new Coordinate(1.0, 1.0));

		SpatialLocationRegion e = new SpatialLocationRegion(new SpatialGeometryPoint("p1", g1));
		SpatialLocationRegion a = new SpatialLocationRegion(new SpatialGeometryPoint("p1", g2));
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test16() {
		GeometryFactory gf = new GeometryFactory();
		Point g = gf.createPoint(new Coordinate(0.0, 0.0));

		SpatialLocationRegion s = new SpatialLocationRegion(new SpatialGeometryPoint("p1", g));
		
		assertEquals(g, s.getSpatialGeometry().getGeometry());
	}
	
}
