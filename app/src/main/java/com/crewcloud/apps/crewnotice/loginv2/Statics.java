package com.crewcloud.apps.crewnotice.loginv2;


import com.crewcloud.apps.crewnotice.BuildConfig;

/**
 * Created by Admin on 8/10/2016.
 */
public class Statics {
    public static final boolean ENABLE_DEBUG = BuildConfig.ENABLE_DEBUG;
    public static final String TAG = "CrewBoard";
    public static final boolean WRITE_HTTP_REQUEST = true;
    public static final int REQUEST_TIMEOUT_MS = 15000;


    /** PREFS */
    public static final String PREFS_KEY_RELOAD_SETTING = "reload_setting";
    public static final String PREFS_KEY_RELOAD_TIMECARD = "reload_timecard";
    public static final String PREFS_KEY_SESSION_ERROR = "session_error";
    public static final String PREFS_KEY_SORT_STAFF_LIST = "PREFS_KEY_SORT_STAFF_LIST";
    public static final String PREFS_KEY_COMPANY_NAME = "PREFS_KEY_COMPANY_NAME";
    public static final String PREFS_KEY_COMPANY_DOMAIN = "PREFS_KEY_COMPANY_DOMAIN";
    public static final String PREFS_KEY_USER_ID = "PREFS_KEY_USER_ID";

    public static final boolean WRITEHTTPREQUEST = true;
}
