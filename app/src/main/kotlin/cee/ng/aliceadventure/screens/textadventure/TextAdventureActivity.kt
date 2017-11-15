package cee.ng.aliceadventure.screens.textadventure

import android.app.FragmentManager
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import butterknife.OnClick
import cee.ng.aliceadventure.R
import cee.ng.aliceadventure.base.BaseMvpActivity
import cee.ng.aliceadventure.base.PresenterConfiguration
import cee.ng.aliceadventure.screens.mainmenu.MainMenuActivity
import cee.ng.aliceadventure.screens.textadventure.startadventure.TextAdventureStartFragment
import timber.log.Timber
import java.util.concurrent.Callable

class TextAdventureActivity : BaseMvpActivity<TextAdventureContract.Presenter>(), TextAdventureContract.View {

    override val layoutResourceId: Int = R.layout.activity_text_adventure

    override fun createPresenter(configuration: PresenterConfiguration): TextAdventureContract.Presenter {
        return TextAdventurePresenter(this, configuration)
    }

    override fun onViewCreated(savedInstanceState: Bundle?) {
        super.onViewCreated(savedInstanceState)
        gotoTextAdventureStart()
    }

    @OnClick(R.id.text_adventure_menu_button)
    internal fun onMenuClick() {
        presenter.onMenuClick()
    }

    override fun goToMenu() {
        val intent = Intent(this, MainMenuActivity::class.java)
        startActivity(intent)
    }

    fun gotoTextAdventureStart() {
        gotoTab(TextAdventureStartFragment.TAG,  Callable{TextAdventureStartFragment.newInstance()})
    }


    private fun gotoTab(tag: String, fragmentCreator: Callable<Fragment>) {
        val fragmentManager = supportFragmentManager
        if (fragmentManager.findFragmentByTag(tag) != null) {
            return
        }

        val fragment: Fragment
        try {
            fragment = fragmentCreator.call()
        } catch (e: Exception) {
            Timber.e(e, "unable to create fragment")
            return
        }

        fragmentManager.beginTransaction().replace(R.id.text_adventure_fragment_block, fragment, tag).commit()
    }

}
