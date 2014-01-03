/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.core.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;

import fi.uef.envi.wavellite.entity.core.base.SpatialLocationQuantitative;
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
		SpatialLocationQuantitative e = new SpatialLocationQuantitative("i1");
		SpatialLocationQuantitative a = new SpatialLocationQuantitative("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		SpatialLocationQuantitative e = new SpatialLocationQuantitative("i1",
				"t1");
		SpatialLocationQuantitative a = new SpatialLocationQuantitative("i1",
				"t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		SpatialLocationQuantitative e = new SpatialLocationQuantitative("i1");
		SpatialLocationQuantitative a = new SpatialLocationQuantitative("i2");

		assertEquals(e, a);
	}

	@Test
	public void test4() {
		SpatialLocationQuantitative e = new SpatialLocationQuantitative("i1",
				"t1");
		SpatialLocationQuantitative a = new SpatialLocationQuantitative("i1",
				"t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		SpatialLocationQuantitative s1 = new SpatialLocationQuantitative("i1");
		SpatialLocationQuantitative s2 = new SpatialLocationQuantitative("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		SpatialLocationQuantitative s1 = new SpatialLocationQuantitative("i1",
				"t1");
		SpatialLocationQuantitative s2 = new SpatialLocationQuantitative("i1",
				"t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		SpatialLocationQuantitative s1 = new SpatialLocationQuantitative("i1");
		SpatialLocationQuantitative s2 = new SpatialLocationQuantitative("i2");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		SpatialLocationQuantitative s1 = new SpatialLocationQuantitative("i1",
				"t1");
		SpatialLocationQuantitative s2 = new SpatialLocationQuantitative("i1",
				"t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		SpatialLocationQuantitative s = new SpatialLocationQuantitative("i1",
				"t1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		SpatialLocationQuantitative s = new SpatialLocationQuantitative("i1");

		assertEquals(WTO.SpatialLocationQuantitative, s.getType());
	}

	@Test
	public void test11() {
		SpatialLocationQuantitative s = new SpatialLocationQuantitative("i1",
				"t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		SpatialLocationQuantitative s = new SpatialLocationQuantitative("i1",
				"t1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		SpatialLocationQuantitative s = new SpatialLocationQuantitative("i1",
				"t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		GeometryFactory gf = new GeometryFactory();
		Geometry g = gf.createPoint(new Coordinate(0.0, 0.0));

		SpatialLocationQuantitative e = new SpatialLocationQuantitative(g);
		SpatialLocationQuantitative a = new SpatialLocationQuantitative(g);
		
		assertEquals(e, a);
	}
	
	@Test
	public void test15() {
		GeometryFactory gf = new GeometryFactory();
		Geometry g1 = gf.createPoint(new Coordinate(0.0, 0.0));
		Geometry g2 = gf.createPoint(new Coordinate(1.0, 1.0));

		SpatialLocationQuantitative e = new SpatialLocationQuantitative(g1);
		SpatialLocationQuantitative a = new SpatialLocationQuantitative(g2);
		
		assertNotEquals(e, a);
	}
	
	@Test
	public void test16() {
		GeometryFactory gf = new GeometryFactory();
		Geometry g = gf.createPoint(new Coordinate(0.0, 0.0));

		SpatialLocationQuantitative s = new SpatialLocationQuantitative(g);
		
		assertEquals(g, s.getGeometry());
	}
	
}
