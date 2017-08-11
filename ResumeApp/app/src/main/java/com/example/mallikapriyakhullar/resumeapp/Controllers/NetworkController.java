package com.example.mallikapriyakhullar.resumeapp.Controllers;

/**
 * Created by mallikapriyakhullar on 12/08/17.
 */

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;


public class NetworkController {
    private static NetworkController mInstance;
    private RequestQueue mRequestQueue;
    private static Context mCtx;

    private NetworkController(Context context) {
        mCtx = context;
        mRequestQueue = getRequestQueue();
    }

    public static synchronized NetworkController getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new NetworkController(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) mRequestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        return mRequestQueue;
    }

    public <T> void addNewRequest(Request<T> req) {
        getRequestQueue().add(req);
    }

    public Request addNewRequest(final int method, final String url, final JSONObject jsonRequest, final Response.Listener<JSONObject> listener, final Response.ErrorListener errorListener){
        return getRequestQueue().add(new JsonObjectRequest(method, url, jsonRequest, listener, errorListener));
    }

}