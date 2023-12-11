package com.example.roomdatabase;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class MainactivityClickHandler {
    Context context;

    public MainactivityClickHandler(Context context) {
        this.context = context;
    }
    public void fabclicked(View view){
        Intent intent=new Intent(view.getContext(), MainActivity2.class);
        context.startActivity(intent);
    }
}