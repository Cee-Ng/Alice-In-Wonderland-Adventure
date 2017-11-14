package cee.ng.aliceadventure.screens.textadventure

import cee.ng.aliceadventure.base.BaseContract

interface TextAdventureContract {

    interface View : BaseContract.View {
        fun goToMenu()
    }

    interface Presenter : BaseContract.Presenter {
        fun onMenuClick()
    }
}
