package com.visionarymindszm.examsresults.utils;

import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class Utils {
    // use this for physical ensure you on the same network
    // check for the current IP address for the computer (ifconfig or ip addr linux and ipconfig windows)
    public static final String  ROOT_URL = "http://192.168.8.100/exam_api/";
   // private static final String  ROOT_URL = "http://10.0.2.2/exam_api/"; // use this for the emulator
    public static final String LOGIN_URL = ROOT_URL+"?apicall=login";
    public static final String GET_TOP_TEN_PAST_PAPER = ROOT_URL+"?apicall=topTen";
    public static final String SEARCH_PAPER = ROOT_URL +"?apicall=searchPastPaper";
    public static final String GET_RESULTS = ROOT_URL + "?apicall=check_results";
    // Extra
    public static final String PDF_URL = "pdf_url";
    public static final String PDF_NAME = "pdf_name";
    public static final String PDF_YEAR = "pdf_year";


    public static void showSnackBar(View view_name, String message, int length){
        Snackbar.make(view_name, message, Snackbar.LENGTH_LONG).show();
    }
}
