package cee.ng.aliceadventure

import android.app.Application
import com.squareup.leakcanary.LeakCanary
import cee.ng.aliceadventure.base.PresenterConfiguration
import cee.ng.aliceadventure.logging.CrashlyticsReporter
import cee.ng.aliceadventure.logging.TimberConfig
import cee.ng.aliceadventure.rest.RetrofitClient
import cee.ng.aliceadventure.settings.SharedPreferencesManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import uk.co.chrisjenx.calligraphy.CalligraphyConfig

open class AliceadventureApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        setupLeakCanary()

        CrashlyticsReporter.init(this)

        TimberConfig.init(CrashlyticsReporter)

        initCalligraphy()
    }

    protected open fun setupLeakCanary() {
        LeakCanary.install(this)
    }

    private fun initCalligraphy() {
        val config = CalligraphyConfig.Builder()
                .setDefaultFontPath(getString(R.string.Roboto_Regular))
                .setFontAttrId(R.attr.fontPath)
                .build()
        CalligraphyConfig.initDefault(config)
    }

    open fun getPresenterConfiguration(): PresenterConfiguration {
        return PresenterConfiguration(
                Schedulers.io(),
                AndroidSchedulers.mainThread(),
                SharedPreferencesManager.getInstance(this),
                RetrofitClient.restApi,
                CrashlyticsReporter
        )
    }
}
