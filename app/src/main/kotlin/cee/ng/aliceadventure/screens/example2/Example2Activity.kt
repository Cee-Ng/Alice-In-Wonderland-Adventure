package cee.ng.aliceadventure.screens.example2

import android.content.Intent
import android.support.v4.app.Fragment

import cee.ng.aliceadventure.base.BaseFragmentActivity

class Example2Activity : BaseFragmentActivity() {

    override fun createFragment(intent: Intent?): Fragment {
        return Example2Fragment()
    }
}
