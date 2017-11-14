package cee.ng.aliceadventure.screens.mainmenu

import cee.ng.aliceadventure.testutils.BasePresenterTest
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.verify

internal class MainMenuPresenterTest : BasePresenterTest<MainMenuPresenter>() {

    @Mock
    lateinit var mockView: MainMenuContract.View

    @Before
    fun setup() {
        presenter = MainMenuPresenter(mockView, testConfiguration)
    }

    @Test
    fun onButtonClick() {
        presenter.onButtonClick()
        verify(mockView).goToTextAdventure()
    }
}
