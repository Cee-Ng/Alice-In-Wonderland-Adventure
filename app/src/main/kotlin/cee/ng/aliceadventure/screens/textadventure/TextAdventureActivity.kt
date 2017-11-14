package cee.ng.aliceadventure.screens.textadventure

import android.content.Intent
import butterknife.OnClick
import cee.ng.aliceadventure.R
import cee.ng.aliceadventure.base.BaseMvpActivity
import cee.ng.aliceadventure.base.PresenterConfiguration
import cee.ng.aliceadventure.screens.mainmenu.MainMenuActivity

class TextAdventureActivity : BaseMvpActivity<TextAdventureContract.Presenter>(), TextAdventureContract.View {

    override val layoutResourceId: Int = R.layout.activity_text_adventure

    override fun createPresenter(configuration: PresenterConfiguration): TextAdventureContract.Presenter {
        return TextAdventurePresenter(this, configuration)
    }

    @OnClick(R.id.text_adventure_menu_button)
    internal fun onMenuClick() {
        presenter.onMenuClick()
    }

    override fun goToMenu() {
        val intent = Intent(this, MainMenuActivity::class.java)
        startActivity(intent)
    }

}
