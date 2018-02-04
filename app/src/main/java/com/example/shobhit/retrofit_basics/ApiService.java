package com.example.shobhit.retrofit_basics;

/**
 * Created by shobhit on 4/2/18.
 */
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


/**
 * Created by shobhit on 27/1/18.
 */

public interface ApiService {
    @FormUrlEncoded
    @POST("/Client/index.php")
    Call<Student> insertData(@Field("name") String name, @Field("email") String email , @Field("password") String password);

}
