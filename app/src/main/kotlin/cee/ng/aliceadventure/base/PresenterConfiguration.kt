package cee.ng.aliceadventure.base

import cee.ng.aliceadventure.logging.CrashReporter
import cee.ng.aliceadventure.rest.RestApi
import cee.ng.aliceadventure.settings.UserSettings
import io.reactivex.Scheduler

/**
 * Wrapper class for common dependencies that all presenters are expected to have
 */
open class PresenterConfiguration(open val ioScheduler: Scheduler,
                                  open val uiScheduler: Scheduler,
                                  val userSettings: UserSettings,
                                  val restApi: RestApi,
                                  val crashReporter: CrashReporter)
