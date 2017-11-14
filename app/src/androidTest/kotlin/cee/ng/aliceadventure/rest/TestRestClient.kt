package cee.ng.aliceadventure.rest

import cee.ng.aliceadventure.rules.MockServerRule

object TestRestClient {
    fun getRestApi(mockServer: MockServerRule): RestApi {
        return RetrofitClient.getTestApi(mockServer.serverUrl)
    }
}
