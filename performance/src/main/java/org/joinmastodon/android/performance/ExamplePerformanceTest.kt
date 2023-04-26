package org.joinmastodon.android.performance

import com.emergetools.relax.Relax
import com.emergetools.test.annotations.EmergeInit
import com.emergetools.test.annotations.EmergeSetup
import com.emergetools.test.annotations.EmergeTest

private const val APP_PACKAGE_NAME = "org.joinmastodon.android"

/**
 * An example performance test class.
 *
 * Performance test classes can have multiple tests, but tests in a given class share @EmergeInit and @EmergeSetup
 * methods. For tests that require a different init or setup multiple test classes are supported.
 *
 * Note that each test (ie. each method annotated with @EmergeTest) will be run on a separate device, they cannot
 * impact each other in any way.
 */
class ExamplePerformanceTest {

  @EmergeInit
  fun init() {
    // OPTIONAL
    // Runs just once after installing the app on the test device before any other method.
    // Typically this is used to log into the app, if needed.
    // Only one @EmergeInit method per class is supported.
  }

  @EmergeSetup
  fun setup() {
    // OPTIONAL
    // Runs once before each test iteration.
    // Typically this is used to navigate through to the screen where the performance test is meant to begin.
    // Only one @EmergeSetup method per class is supported.
  }

  @EmergeTest
  fun coldLaunchAndOpenLogInTest() {
    Relax(APP_PACKAGE_NAME) {
      coldLaunch()
      click("Log in")
    }
  }
}
