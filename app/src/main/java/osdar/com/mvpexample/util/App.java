package osdar.com.mvpexample.util;

import android.app.Application;
import android.util.Log;

import osdar.com.mvpexample.Const;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;

/**
 * Created by Osama on 12/11/2016 --- 1:25 PM.
 */

public class App extends Application {

    private static App instance;
    private static ServerAPI serverAPI;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        serverAPI = new RestAdapter.Builder()
                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestFacade request) {
                        request.addHeader("Content-Type","application/json");
                        request.addHeader("Authorization", Const.AUTH);
                    }
                })
                .setEndpoint(ServerAPI.ENDPOINT)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setLog(new RestAdapter.Log() {
                    @Override
                    public void log(String message) {
                        Log.v("Retrofit", message);
                    }
                })
                .build().create(ServerAPI.class);
    }

    public static ServerAPI getServerAPI() {
        return serverAPI;
    }

    public static App getAppInstance() {
        return instance;
    }
}
