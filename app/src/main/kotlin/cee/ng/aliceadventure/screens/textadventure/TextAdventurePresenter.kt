package cee.ng.aliceadventure.screens.textadventure

import cee.ng.aliceadventure.base.BasePresenter
import cee.ng.aliceadventure.base.PresenterConfiguration

class TextAdventurePresenter(view: TextAdventureContract.View, configuration: PresenterConfiguration)
    : BasePresenter<TextAdventureContract.View>(view, configuration), TextAdventureContract.Presenter {

    override fun onMenuClick() {
        view?.goToMenu()
    }
}
