package id.ac.polbeng.dedihermawan.kabkotaretrofitapp.retrofit

import id.ac.polbeng.dedihermawan.kabkotaretrofitapp.response.KabKotaResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("api/read_kabkota.php")
    fun getListUsers(): Call<KabKotaResponse>
}