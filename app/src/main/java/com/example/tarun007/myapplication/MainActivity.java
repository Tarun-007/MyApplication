package com.example.tarun007.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends AppCompatActivity {
     private Button truebuton;
     private TextView txt;
     private Button next;
     private Toast t1,t2;
     private String TAG;
     private Button hintb;
     private static final int  req=1;
     private  boolean res;


    {
        TAG = "MainActivity";
    }

    private static final String KEY="Indexi";

    private bank[] questions = new bank[]{
            new bank(R.string.qsn1, true),
            new bank(R.string.qsn2, true),
            new bank(R.string.qsn3, false),
            new bank(R.string.qsn4, true),
            new bank(R.string.qsn5, false),
    };
    private int index =0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG,"inside onCreate");
        setContentView(R.layout.activity_main);


if(savedInstanceState!=null) {
    index = savedInstanceState.getInt(KEY, 0);
}
       txt = findViewById(R.id.textView);
       final int Question = questions[index].getQsn();
       txt.setText(Question);

      truebuton= findViewById(R.id.trueb);
      truebuton.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View view) {
              if(questions[index].isTruequestion()) {


              
                  t1 = Toast.makeText(MainActivity.this, R.string.toasting, LENGTH_SHORT);
                  t1.show();

              } else {

                  t2 = Toast.makeText(MainActivity.this, R.string.bro, LENGTH_SHORT);
                  t2.show();
              }

          }
      });

      next= findViewById(R.id.next);
      next.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View view) {
              index=(index+1)% questions.length;
             int Question=questions[index].getQsn();
             txt.setText(Question);


          }
      });

hintb=findViewById(R.id.hintb);
hintb.setOnClickListener(new OnClickListener() {
    @Override
    public void onClick(View view) {


        //Intent i= new Intent(MainActivity.this,Main2.class);
        Intent i= Main2.newintent(MainActivity.this,index);
        startActivityForResult(i,req);
    }
});


    }
    @Override
    protected void onActivityResult(int requestcode,int resultcode,Intent data){

    }
    protected void onResume(){
        super.onResume();
        Log.d(TAG,"inside onResume");
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG,"inside onsave_instance");

savedInstanceState.putInt(KEY,index);


    }


}
