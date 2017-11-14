package cee.ng.aliceadventure.testutils

import cee.ng.aliceadventure.InstrumentationTestApplication
import org.junit.After
import org.junit.Rule
import org.mockito.junit.MockitoJUnit

abstract class BaseUiTest {
    @Rule
    @JvmField
    val mockitoRule = MockitoJUnit.rule()

    @After
    fun tearDown() {
        InstrumentationTestApplication.clearRestApiOverride()
        InstrumentationTestApplication.clearUserSettingsOverride()
    }
}
