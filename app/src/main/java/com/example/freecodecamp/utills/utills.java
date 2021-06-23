package com.example.freecodecamp.utills;

import android.app.ProgressDialog;
import android.content.Context;

public class utills {
    public static ProgressDialog dialog;

    public static void showDialog(Context context) {
        dialog= new ProgressDialog(context);
        dialog.setMessage("Loading .......");
        dialog.show();
    }
    public static void dissmiss(){
        if(dialog!=null){
            dialog.dismiss();
        }
    }
}
