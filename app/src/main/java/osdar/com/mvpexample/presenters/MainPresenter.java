package osdar.com.mvpexample.presenters;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import io.swagger.client.ApiException;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.InlineResponse200;
import nucleus.presenter.RxPresenter;
import osdar.com.mvpexample.Const;
import osdar.com.mvpexample.MainActivity;
import osdar.com.mvpexample.util.App;
import osdar.com.mvpexample.util.ServerAPI;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/**
 * Created by Osama on 12/11/2016 --- 12:50 PM.
 */

public class MainPresenter extends RxPresenter<MainActivity> {
    public static final String DEFAULT_NAME = "Chuck Norris";

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        Map<String, String> body = new HashMap<>();
        body.put("page_no", "0");
        body.put("limit", "10");
        body.put("category_id", "CAT00000010");
        body.put("store_id", "STR00000003");

        /**
         * Swagger api
         */

        DefaultApi defaultApi = new DefaultApi();
        defaultApi.getAllMainCategoriesPost(Const.AUTH, new Response.Listener<InlineResponse200>() {
            @Override
            public void onResponse(InlineResponse200 response) {
                Log.d("response", response.toString());
                getView().onItemsNext(response.getResult());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("throwable", error.getMessage());
                getView().onItemsError(error);
            }
        });


        /**
         * Retrofit api
         */

//        App.getServerAPI()
////        DEFAULT_NAME.split("\\s+")[0], DEFAULT_NAME.split("\\s+")[1]
//                .getItems(body)
//                .delay(1, TimeUnit.SECONDS)
//                .observeOn(AndroidSchedulers.mainThread())
//                .compose(this.<ServerAPI.Response>deliverLatestCache())
//                .subscribe(new Action1<ServerAPI.Response>() {
//                    @Override
//                    public void call(ServerAPI.Response response) {
//                        Log.d("response", response.toString());
//                        getView().onItemsNext(response.items);
//                    }
//                }, new Action1<Throwable>() {
//                    @Override
//                    public void call(Throwable throwable) {
//                        Log.d("throwable", throwable.getMessage());
//                        getView().onItemsError(throwable);
//                    }
//                });
    }
}
