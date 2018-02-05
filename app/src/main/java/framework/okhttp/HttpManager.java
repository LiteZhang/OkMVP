package framework.okhttp;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.ArrayMap;

import framework.okhttp.interfaces.Callback;
import framework.okhttp.interfaces.IRequestMethods;

/**
 * @Author Lyf
 * @CreateTime 2018/1/23
 * @Description HttpManager for doing request, The real request doing in OkUtils.
 **/
public class HttpManager implements IRequestMethods {

    private static HttpManager INSTANCE;

    private HttpManager() {
    }

    public static HttpManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HttpManager();
        }
        return INSTANCE;
    }

    @Override
    public void doGet(@NonNull String url) {
        doGet(url, null, null);
    }

    @Override
    public <T> void doGet(@NonNull String url, @Nullable Callback<T> responseCallback) {
        doGet(url, null, responseCallback);
    }

    @Override
    public <T> void doGet(@NonNull String url, @Nullable ArrayMap<String, Object> params, @Nullable Callback<T> responseCallback) {
        OkUtils.getInstance().doGet(url, params, responseCallback);
    }

    @Override
    public <T> void doPost(@NonNull String url, @Nullable ArrayMap<String, Object> params, @Nullable Callback<T> responseCallback) {
        OkUtils.getInstance().doPost(url, params, responseCallback);
    }

    @Override
    public void doPost(Object tag, String url) {

    }

    @Override
    public <T> void doPost(@NonNull String url, @Nullable Callback<T> responseCallback) {

    }

    @Override
    public void doPut(Object tag, String url) {

    }

    @Override
    public void doDelete(Object tag, String url) {

    }


}
