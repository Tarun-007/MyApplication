package com.example.tarun007.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2 extends AppCompatActivity {
    private Button sureb;
    private TextView hintview;
    private boolean ischeated =false;
    private static final String cheatk="cheatk";
    private static final String TAG="cheatactivity";
    private static final String cheatindex="CHEAT_INDEX";
    public static Intent newintent(Context context,int i){
        Intent intent = new Intent(context,Main2.class);
        intent.putExtra(cheatindex,i);
        return intent;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i(TAG,"inside activity 2");
        int i=getIntent().getIntExtra(cheatindex,-999);
        Log.i(TAG,"recieved "+i);
        if(i>=0)
            ischeated=true;

    }

    private void setAnsRes(boolean b){
        Intent i=new Intent();
        i.putExtra(cheatk,b);
        setResult(RESULT_OK,i);

    }

}
