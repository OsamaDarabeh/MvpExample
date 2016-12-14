package osdar.com.mvpexample.util;

import android.text.Html;


import com.google.gson.annotations.SerializedName;

import java.util.Map;


import retrofit.http.Body;
import retrofit.http.POST;
import rx.Observable;

/**
 * Created by Osama on 12/11/2016 --- 1:28 PM.
 */

public interface ServerAPI {

    String ENDPOINT = "http://develop.nana.sa:2020";

    class Item {
        @SerializedName("title")
        public String text;

        @Override
        public String toString() {
            return Html.fromHtml(text).toString();
        }
    }

    class Response {
        @SerializedName("result")
        public Item[] items;
    }

    //    @GET("/jokes/random/10")
    @POST("/get_subcategory_products")
    Observable<Response> getItems(@Body Map<String, String> body);
//    @Query("firstName") String firstName, @Query("lastName") String lastName

//    @POST("/get_subcategory_products")
//    Call<Response> getItemCall(@Body Map<String, String> body);
}
