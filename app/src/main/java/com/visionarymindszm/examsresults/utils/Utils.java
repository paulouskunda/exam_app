package com.visionarymindszm.examsresults.utils;

import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class Utils {
    // use this for physical ensure you on the same network
    // check for the current IP address for the computer (ifconfig linux and ipconfig windows)
    private static final String  ROOT_URL = "http://192.168.8.100/exam_api/?apicall=";
   // private static final String  ROOT_URL = "http://10.0.2.2/exam_api/?apicall="; // use this for the emulator
    public static final String LOGIN_URL = ROOT_URL+"login";


    public static void showSnackBar(View view_name, String message, int length){
        Snackbar.make(view_name, message, Snackbar.LENGTH_LONG).show();
    }
}
