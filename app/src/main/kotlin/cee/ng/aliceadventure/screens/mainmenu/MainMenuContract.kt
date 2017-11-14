package cee.ng.aliceadventure.screens.mainmenu

import cee.ng.aliceadventure.base.BaseContract

interface MainMenuContract {
    interface View : BaseContract.View {

        fun goToTextAdventure()
    }

    interface Presenter : BaseContract.Presenter {

        fun onButtonClick()
    }
}
