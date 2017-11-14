package cee.ng.aliceadventure.screens.mainmenu

import android.content.Intent

import butterknife.OnClick
import cee.ng.aliceadventure.R
import cee.ng.aliceadventure.base.BaseMvpActivity
import cee.ng.aliceadventure.base.PresenterConfiguration
import cee.ng.aliceadventure.screens.textadventure.TextAdventureActivity

class MainMenuActivity : BaseMvpActivity<MainMenuContract.Presenter>(), MainMenuContract.View {

    override val layoutResourceId: Int = R.layout.activity_mainmenu

    override fun createPresenter(configuration: PresenterConfiguration): MainMenuContract.Presenter {
        return MainMenuPresenter(this, configuration)
    }

    @OnClick(R.id.main_menu_new_game_button)
    internal fun onButtonClick() {
        presenter.onButtonClick()
    }

    override fun goToTextAdventure() {
        val intent = Intent(this, TextAdventureActivity::class.java)
        startActivity(intent)
    }
}
