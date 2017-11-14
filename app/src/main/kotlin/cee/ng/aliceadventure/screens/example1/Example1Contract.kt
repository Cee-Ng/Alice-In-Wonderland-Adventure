package cee.ng.aliceadventure.screens.example1

import cee.ng.aliceadventure.base.BaseContract

interface Example1Contract {
    interface View : BaseContract.View {

        fun gotoExample2()
    }

    interface Presenter : BaseContract.Presenter {

        fun onButtonClick()
    }
}
