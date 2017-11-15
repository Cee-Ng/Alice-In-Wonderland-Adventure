package cee.ng.aliceadventure.screens.textadventure.startadventure

import cee.ng.aliceadventure.R
import cee.ng.aliceadventure.base.BaseFragment
import cee.ng.aliceadventure.base.PresenterConfiguration

class TextAdventureStartFragment: BaseFragment<TextAdventureStartContract.Presenter>(), TextAdventureStartContract.View {

    override val layoutResourceId: Int = R.layout.fragment_text_adventure_start

    companion object {
    val TAG = TextAdventureStartFragment::class.java.simpleName

    fun newInstance(): TextAdventureStartFragment {
        val fragment = TextAdventureStartFragment()
        return fragment
    }

    }

    override fun createPresenter(configuration: PresenterConfiguration): TextAdventureStartContract.Presenter {
        return TextAdventureStartPresenter(this, configuration)
    }
}
