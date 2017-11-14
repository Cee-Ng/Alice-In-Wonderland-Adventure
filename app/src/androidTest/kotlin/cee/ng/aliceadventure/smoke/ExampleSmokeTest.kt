package cee.ng.aliceadventure.smoke

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.filters.SmallTest
import android.support.test.rule.ActivityTestRule
import cee.ng.aliceadventure.InstrumentationTestApplication
import cee.ng.aliceadventure.R
import cee.ng.aliceadventure.rest.TestRestClient
import cee.ng.aliceadventure.rules.MockServerRule
import cee.ng.aliceadventure.screens.mainmenu.MainMenuActivity
import cee.ng.aliceadventure.settings.UserSettings
import cee.ng.aliceadventure.testutils.BaseUiTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`

@SmallTest
class ExampleSmokeTest : BaseUiTest() {
    @Rule
    @JvmField
    val mockServerRule = MockServerRule()
    @Rule
    @JvmField
    val activityTestRule = ActivityTestRule(MainMenuActivity::class.java, true, false)

    @Mock
    internal lateinit var mockUserSettings: UserSettings

    @Before
    fun setUp() {
        InstrumentationTestApplication.overrideRestApi(TestRestClient.getRestApi(mockServerRule))
        InstrumentationTestApplication.overrideUserSettings(mockUserSettings)
    }

    @Test
    fun smokeTest() {
        activityTestRule.launchActivity(null)
        mockServerRule.enqueueResponse(cee.ng.aliceadventure.debug.test.R.raw.mock_ip)
        
        onView(withId(R.id.main_menu_new_game_button)).perform(click())
        onView(withId(R.id.text_adventure_menu_button)).check(matches(withText("menu")))
    }
}
