package cee.ng.aliceadventure.screens.textadventure.startadventure

import android.os.Bundle
import butterknife.BindView
import cee.ng.aliceadventure.R
import cee.ng.aliceadventure.base.BaseFragment
import cee.ng.aliceadventure.base.PresenterConfiguration
import cee.ng.aliceadventure.customviews.TypeWriter

class TextAdventureStartFragment : BaseFragment<TextAdventureStartContract.Presenter>(), TextAdventureStartContract.View {

    @BindView(R.id.text_adventure_text)
    lateinit var storyText: TypeWriter
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

    override fun onStart() {
        super.onStart()
        storyText.text = ""
        storyText.setCharacterDelay(100)
        storyText.animateText("Alice, it's times to wake up!")
    }
}
