package cee.ng.aliceadventure.screens.example1

import cee.ng.aliceadventure.base.BasePresenter
import cee.ng.aliceadventure.base.PresenterConfiguration

internal class Example1Presenter(view: Example1Contract.View, configuration: PresenterConfiguration)
    : BasePresenter<Example1Contract.View>(view, configuration), Example1Contract.Presenter {

    override fun onButtonClick() {
        view?.gotoExample2()
    }
}
