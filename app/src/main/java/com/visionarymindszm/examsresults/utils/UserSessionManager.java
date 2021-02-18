package com.visionarymindszm.examsresults.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import com.visionarymindszm.examsresults.R;

/**
 * User session Manager class handles the logic details for a given user
 * This is to allow users not be prompt with login screen each time they open
 * the app
 */
public class UserSessionManager {
    // shared preference
    SharedPreferences sharedPreferences;

    // Editor reference
    Editor editor;

    // activity context or fragment
    Context _context;
    // Shared pref mode
    int PRIVATE_MODE = 0;
    private static final String PREFER_NAME = String.valueOf(R.string.app_name);

    // All Shared Preferences Keys
    private static final String IS_PUPIL_LOGIN = "IsPupilLoggedIn";

    public static final String KEY__PUPIL_NAME = "pupilName";
    public static final String KEY__PUPIL_INTAKE = "pupilIntake";
    public static final String KEY__PUPIL_SCHOOL = "pupilSchool";
    public static final String KEY_PUPIL_ID = "pupilID";

    public UserSessionManager(Context _context) {
        this._context = _context;
        sharedPreferences = _context.getSharedPreferences(PREFER_NAME, PRIVATE_MODE);
        editor = sharedPreferences.edit();
    }


}
