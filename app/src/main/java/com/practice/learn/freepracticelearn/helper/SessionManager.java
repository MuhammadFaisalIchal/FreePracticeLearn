package com.practice.learn.freepracticelearn.helper;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

import com.practice.learn.freepracticelearn.MainActivity;

import java.util.HashMap;

public class SessionManager {
    // Shared preferences file name
    private static final String PREF_NAME = "RedeemPointPref";
    // Key name
    private static final String KEY_IS_LOGGEDIN = "isLoggedIn";
    public static final String PREF_KEY_ID_USER = "prefKeyIdCIF";
    public static final String PREF_KEY_ID_USER2 = "prefKeyIdCardCode";
    public static final String PREF_KEY_USERNAME = "prefKeyUserName";
    public static final String PREF_KEY_POINT_USER = "prefKeyPointUser";

    public static final String PREF_KEY_IMAGE_REWARD = "prefKeyImageReward";
    public static final String PREF_KEY_NAME_REWARD = "prefKeyNameReward";
    public static final String PREF_KEY_POINT_REWARD = "prefKeyPointReward";
    public static final String PREF_KEY_STOCK_REWARD = "prefKeyStockReward";
    public static final String PREF_KEY_INFO_REWARD = "prefKeyInfoReward";
    public static final String PREF_KEY_QTY_REWARD = "prefKeyQtyReward";
    // LogCat tag
    private static String TAG = SessionManager.class.getSimpleName();
    // Shared Preferences
    SharedPreferences pref;
    // Shared Preferences Editor (to make changes)
    SharedPreferences.Editor editor;
    // To access android context
    Context _context;
    // Shared pref mode
    int PRIVATE_MODE = 0;

    public SessionManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public boolean isLoggedIn() {
        return pref.getBoolean(KEY_IS_LOGGEDIN, false);
    }

    public void createSession(int point) {
        // Login value menjadi true
//        editor.putBoolean(KEY_IS_LOGGEDIN, true);
        // User info
//        editor.putString(PREF_KEY_ID_USER, iduser);
//        editor.putString(PREF_KEY_ID_USER2, iduser2);
//        editor.putString(PREF_KEY_USERNAME, username);
        editor.putInt(PREF_KEY_POINT_USER, point);
        editor.commit();
    }

    public void updatePoint(int point) {
        editor.putInt(PREF_KEY_POINT_USER, point);
        editor.commit();
    }

    public void cartSession(String image, String name, String point, String stock, String info, int qty) {
        editor.putString(PREF_KEY_IMAGE_REWARD, image);
        editor.putString(PREF_KEY_NAME_REWARD, name);
        editor.putString(PREF_KEY_POINT_REWARD, point);
        editor.putString(PREF_KEY_STOCK_REWARD, stock);
        editor.putString(PREF_KEY_INFO_REWARD, info);
        editor.putInt(PREF_KEY_QTY_REWARD, qty);
        editor.commit();
    }

/*
    public void checkLogin() {
//        jika is_login = false
        if (!this.isLoggedIn()) {
            jika false, pergi ke loginactivity
            Intent i = new Intent(_context, LoginActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            _context.startActivity(i);
        } else {
//            jika true, pergi ke mainactivity
            Intent i = new Intent(_context, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            _context.startActivity(i);
        }
    }
*/

    public HashMap<String, String> getUserInfoMap() {
        HashMap<String, String> userInfo = new HashMap<String, String>();
        userInfo.put(PREF_KEY_USERNAME, pref.getString(PREF_KEY_USERNAME, null));
        userInfo.put(PREF_KEY_ID_USER, pref.getString(PREF_KEY_ID_USER, null));
        // return user
        return userInfo;
    }
    public String getIdCiffUser() {
        return pref.getString(PREF_KEY_ID_USER, "");
    }

/*
    public HashMap<String, int> getTest() {
        HashMap<String, int> userInfo = new HashMap<String, int>();
        userInfo.put("prefKeyPointUser", pref.getInt(PREF_KEY_POINT_USER, 0));
        // return user
        return userInfo;
    }
*/

    public String getIdCardCode() {
        return pref.getString(PREF_KEY_ID_USER2, "");
    }

    public int getUserPoint() {
        return pref.getInt(PREF_KEY_POINT_USER, 0);
    }

/*
    public void logout() {
        editor.clear();
        editor.commit();
        Intent i = new Intent(_context, LoginActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        _context.startActivity(i);
    }
*/

    public void setLogin(boolean isLoggedIn) {
        editor.putBoolean(KEY_IS_LOGGEDIN, isLoggedIn);
        // commit changes
        editor.commit();
        Log.d(TAG, "User login session modified!");
    }

    /*public void setUserData(String iduser, String username, String pointReward) {
        // Memasukkan data ke dalam variable kunci data SharedPreferences
        editor.putString(PREF_KEY_ID_USER, iduser);
        editor.putString(PREF_KEY_USERNAME, username);
        editor.putString(PREF_KEY_POINT_USER, pointReward);
        editor.commit();
    }*/
}