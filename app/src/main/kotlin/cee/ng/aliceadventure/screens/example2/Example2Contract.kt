package cee.ng.aliceadventure.screens.example2

import cee.ng.aliceadventure.base.BaseContract

interface Example2Contract {
    interface View : BaseContract.View {

        fun showCurrentIpAddress(ip: String)

        fun showPreviousIpAddress(ip: String)

        fun hidePreviousIpAddress()
    }

    interface Presenter : BaseContract.Presenter {

    }
}
