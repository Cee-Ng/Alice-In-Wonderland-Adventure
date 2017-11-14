package cee.ng.aliceadventure.screens.mainmenu

import cee.ng.aliceadventure.base.BasePresenter
import cee.ng.aliceadventure.base.PresenterConfiguration

internal class MainMenuPresenter(view: MainMenuContract.View, configuration: PresenterConfiguration)
    : BasePresenter<MainMenuContract.View>(view, configuration), MainMenuContract.Presenter {

    override fun onButtonClick() {
        view?.goToTextAdventure()
    }
}
