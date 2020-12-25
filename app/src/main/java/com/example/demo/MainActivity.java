package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.TextView;
import android.content.Intent;


import java.util.Date;


// for activity main

public class MainActivity<button> extends AppCompatActivity  {


    TextView textView;

    //ListView listView;
    // ArrayAdapter<String> adapter;
    String Tag = "activity_main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Tag, "--onCreate--"); // - information
        Log.d(Tag,"In onCreate"); //- debug
        Log.w(Tag,"In onCreate"); //- warning
        Log.e(Tag,"In onCreate"); //- error

        Button Press_me = (Button) findViewById(R.id.button);
        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {

            String str = bundle.getString("KEY");
            Toast.makeText(this,str,Toast.LENGTH_LONG).show();

        }



        // getIntent() is used to locate intents
        // getExtras is used to get the value of the given name in the parenthesis

        // Event listener example
       /* Press_me.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Log.i(Tag,"-- Press_me was clicked --");
                                            textView.setText("Somebody pushed the button");
                                        }
                                    });
 */
                textView = (TextView) findViewById(R.id.textView1);
       /* listView = (ListView)findViewById(R.id.listView);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        adapter.add("Amazon");
        adapter.add("Microsoft");
        adapter.add("apple");
        adapter.add("Snapchat");

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);`

      */
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "--onStart--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "--onResume--");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag, "--onRestart--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "--Onpause--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag, "--onStop--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "--onDestroy--");

    }

    /*@Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        String item =  adapter.getItem(i);
        Toast.makeText(this, "You selected:" + item ,Toast.LENGTH_LONG).show();
        // Navigate from activity to activity
        setContentView(R.layout.activity_main_listview);
      }

*/

    public void clickHandler(View view) {
        Toast.makeText(this, "This button changes the time", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);

    }

    public void punishment(View view) {
        Toast.makeText(this, "Nyse Cutt Gee", Toast.LENGTH_LONG).show();
        Date date = new Date();
        textView.setText("Today is " + date.toString());


        // how to navigate using intents

       /* Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent); */

        // Better approach to making click listener implement view.Onclick to MainActivity
        // it should make the method below automatically:
        /*
        @Override
        public void Onclick(View view) {

        // example code can be:

        switch(view.getId())
        {
        case R.id.button:
         blah blah blah
           break;
        case R.id.button2
          blah blah blah
           break;

           etc...
        }

        // though if you wan to do that you will have to do something like : button.setOnClickListener(this)
         */


    }



}

