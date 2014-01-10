/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.observation.base.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.joda.time.DateTime;
import org.junit.Test;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;

import fi.uef.envi.wavellite.entity.core.Feature;
import fi.uef.envi.wavellite.entity.core.Property;
import fi.uef.envi.wavellite.entity.core.Sensor;
import fi.uef.envi.wavellite.entity.core.SpatialLocation;
import fi.uef.envi.wavellite.entity.core.TemporalLocation;
import fi.uef.envi.wavellite.entity.core.base.FeatureBase;
import fi.uef.envi.wavellite.entity.core.base.PropertyBase;
import fi.uef.envi.wavellite.entity.core.base.SensorBase;
import fi.uef.envi.wavellite.entity.core.base.SpatialGeometryPoint;
import fi.uef.envi.wavellite.entity.core.base.SpatialLocationRegion;
import fi.uef.envi.wavellite.entity.core.base.TemporalLocationDateTime;
import fi.uef.envi.wavellite.entity.observation.ObservationValue;
import fi.uef.envi.wavellite.entity.observation.SensorOutput;
import fi.uef.envi.wavellite.entity.observation.base.ObservationValueDouble;
import fi.uef.envi.wavellite.entity.observation.base.SensorObservationBase;
import fi.uef.envi.wavellite.entity.observation.base.SensorOutputBase;
import fi.uef.envi.wavellite.vocabulary.WEO;

/**
 * <p>
 * Title: SensorObservationBaseTest
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

public class SensorObservationBaseTest {

	@Test
	public void test1() {
		SensorObservationBase e = new SensorObservationBase("i1");
		SensorObservationBase a = new SensorObservationBase("i1");

		assertEquals(e, a);
	}

	@Test
	public void test2() {
		SensorObservationBase e = new SensorObservationBase("i1", "t1");
		SensorObservationBase a = new SensorObservationBase("i1", "t1");

		assertEquals(e, a);
	}

	@Test
	public void test3() {
		SensorObservationBase e = new SensorObservationBase("i1");
		SensorObservationBase a = new SensorObservationBase("i2");

		assertNotEquals(e, a);
	}

	@Test
	public void test4() {
		SensorObservationBase e = new SensorObservationBase("i1", "t1");
		SensorObservationBase a = new SensorObservationBase("i1", "t2");

		assertNotEquals(e, a);
	}

	@Test
	public void test5() {
		SensorObservationBase s1 = new SensorObservationBase("i1");
		SensorObservationBase s2 = new SensorObservationBase("i1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test6() {
		SensorObservationBase s1 = new SensorObservationBase("i1", "t1");
		SensorObservationBase s2 = new SensorObservationBase("i1", "t1");

		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test7() {
		SensorObservationBase s1 = new SensorObservationBase("i1");
		SensorObservationBase s2 = new SensorObservationBase("i2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test8() {
		SensorObservationBase s1 = new SensorObservationBase("i1", "t1");
		SensorObservationBase s2 = new SensorObservationBase("i1", "t2");

		assertNotEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void test9() {
		SensorObservationBase s = new SensorObservationBase("i1");

		assertEquals("i1", s.getId());
	}

	@Test
	public void test10() {
		SensorObservationBase s = new SensorObservationBase("i1");

		assertEquals(WEO.SensorObservation, s.getType());
	}

	@Test
	public void test11() {
		SensorObservationBase s = new SensorObservationBase("i1", "t1");

		assertEquals("t1", s.getType());
	}

	@Test
	public void test12() {
		SensorObservationBase s = new SensorObservationBase("i1");

		assertNotEquals("i2", s.getId());
	}

	@Test
	public void test13() {
		SensorObservationBase s = new SensorObservationBase("i1", "t1");

		assertNotEquals("t2", s.getType());
	}

	@Test
	public void test14() {
		SensorObservationBase so = new SensorObservationBase();
		Sensor s = new SensorBase("s1");
		so.setSensor(s);
		Property p = new PropertyBase("p1");
		so.setProperty(p);
		Feature f = new FeatureBase("f1");
		so.setFeature(f);
		ObservationValue ov = new ObservationValueDouble(0.0);
		SensorOutput o = new SensorOutputBase(ov);
		so.setSensorOutput(o);
		TemporalLocation tl = new TemporalLocationDateTime(new DateTime(2013,
				10, 31, 0, 0, 0));
		so.setTemporalLocation(tl);

		assertEquals(s, so.getSensor());
		assertEquals(p, so.getProperty());
		assertEquals(f, so.getFeature());
		assertEquals(o, so.getSensorOutput());
		assertEquals(Double.valueOf(0.0), so.getSensorOutput()
				.getObservationValue().getValue());
		assertEquals(new DateTime(2013, 10, 31, 0, 0, 0),
				so.getTemporalLocation().getValue());
	}

	@Test
	public void test15() {
		SensorObservationBase so = new SensorObservationBase();
		Sensor s = new SensorBase("s1");
		so.setSensor(s);
		Property p = new PropertyBase("p1");
		so.setProperty(p);
		Feature f = new FeatureBase("f1");
		so.setFeature(f);
		ObservationValue ov = new ObservationValueDouble(0.5);
		SensorOutput o = new SensorOutputBase(ov);
		so.setSensorOutput(o);
		TemporalLocation tl = new TemporalLocationDateTime(new DateTime(2013,
				11, 1, 0, 0, 0));
		so.setTemporalLocation(tl);

		assertEquals(s, so.getSensor());
		assertEquals(p, so.getProperty());
		assertEquals(f, so.getFeature());
		assertEquals(o, so.getSensorOutput());
		assertNotEquals(Double.valueOf(0.0), so.getSensorOutput()
				.getObservationValue().getValue());
		assertNotEquals(new DateTime(2013, 10, 31, 0, 0, 0),
				so.getTemporalLocation().getValue());
	}
	
	@Test
	public void test16() {
		SensorObservationBase so = new SensorObservationBase();
		Sensor s = new SensorBase("s1");
		so.setSensor(s);
		Property p = new PropertyBase("p1");
		so.setProperty(p);
		Feature f = new FeatureBase("f1");
		so.setFeature(f);
		ObservationValue ov = new ObservationValueDouble(0.0);
		SensorOutput o = new SensorOutputBase(ov);
		so.setSensorOutput(o);
		TemporalLocation tl = new TemporalLocationDateTime(new DateTime(2013,
				10, 31, 0, 0, 0));
		so.setTemporalLocation(tl);
		GeometryFactory gf = new GeometryFactory();
		Point g = gf.createPoint(new Coordinate(0.0, 0.0));
		SpatialLocation sl = new SpatialLocationRegion(new SpatialGeometryPoint(g));
		so.setSpatialLocation(sl);

		assertEquals(s, so.getSensor());
		assertEquals(p, so.getProperty());
		assertEquals(f, so.getFeature());
		assertEquals(o, so.getSensorOutput());
		assertEquals(Double.valueOf(0.0), so.getSensorOutput()
				.getObservationValue().getValue());
		assertEquals(new DateTime(2013, 10, 31, 0, 0, 0),
				so.getTemporalLocation().getValue());
		assertEquals(sl, so.getSpatialLocation());
	}

}
