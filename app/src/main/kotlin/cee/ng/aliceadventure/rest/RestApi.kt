package cee.ng.aliceadventure.rest

import cee.ng.aliceadventure.models.IpModel
import io.reactivex.Single
import retrofit2.http.GET

interface RestApi {
    @GET("/?format=json")
    fun getMyIp(): Single<IpModel>
}
