/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.entity.common.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <p>
 * Title: CommonEntityTestSuite
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

@RunWith(Suite.class)
@Suite.SuiteClasses({
	SensorBaseTest.class,
	FeatureBaseTest.class,
	PropertyBaseTest.class
})

public class CommonEntityTestSuite {

}
