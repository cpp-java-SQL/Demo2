
package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
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

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button dialphone  = (Button) findViewById(R.id.dialphone);
        Button toast  = (Button) findViewById(R.id.toast);
        Button showLocation = (Button) findViewById(R.id.showLocation);
        Button OpenWebpage = (Button) findViewById(R.id.OpenWebpage);
        Button ViewIntent  = (Button) findViewById(R.id.ViewIntent);
        Button LGP = (Button) findViewById(R.id.LGP);

        dialphone.setOnClickListener(this);
        toast.setOnClickListener(this);
        showLocation.setOnClickListener(this);
        OpenWebpage.setOnClickListener(this);
        ViewIntent.setOnClickListener(this);
        LGP.setOnClickListener(this);


    }


    String Tag = "MainActivity2";

    @SuppressLint("NonConstantResourceId")

    @Override
    public void onClick(View v) {
        String Tag = "MainActivity2";
        int id = v.getId();
        switch (id) {

            case R.id.dialphone :

                // Dial so happens to be an android component it does not belong to the person writing the program on this framework
                // Components can be made
                // you can make your own data types such as geo: and tel: and https:

                Intent intent_dialphone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:07884584189"));
                startActivity(intent_dialphone);

                Log.i(Tag,"-- dialphone was pressed--");
                break;

            case R.id.toast :

                Toast.makeText(this,"Toast",Toast.LENGTH_SHORT).show();
                Log.i(Tag,"-- toast was pressed--");
                break;

            case R.id.showLocation :

                // Even the google map is using Intent.ACTION_VIEW
                Intent intent_showLocation = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:39.9941026,116.1973072,15"));
                startActivity(intent_showLocation);

                Log.i(Tag,"-- showLocation was pressed--");
                break;

            case R.id.OpenWebpage :

                // Even the browser is using Intent.ACTION_VIEW
                Intent intent_OpenWebpage = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
                startActivity(intent_OpenWebpage);
                Log.i(Tag,"-- OpenWebpage was pressed--");
                break;

            case R.id.ViewIntent :

                Intent intent_ViewIntent = new Intent(Intent.ACTION_VIEW);
                startActivity(intent_ViewIntent);
                Log.i(Tag,"-- ViewIntent was pressed--");
                break;

            case R.id.LGP :

               /* Intent intent_LGP = new Intent("com.example.demo.MainActivity2");
                startActivity(intent_LGP); */

                // this alone will just make the app go to the given activity

                // Getting closer to the component....
                //"com.example.demo.MainActivity2" when left in the Intent() parenthesis alone will call the Activity at the end (MainActivity2)

                // Note: if you put the extra data in other class and initialize it in main the code will bug cause the other class script will not have run leaving the var in the OnCreate function null.
                // However sending from Main to any other class is fine.

                Intent intent_LGP = new Intent(MainActivity2.this, MainActivity.class);
                intent_LGP.putExtra("KEY", "Value is my data....");

                // the function putExtra() id used to send data between activities
                // you can also pass objects along with strings and other stuff

                startActivity(intent_LGP);
                 Log.i(Tag,"-- LGP was pressed--");
                 break;

            default:
                throw new IllegalStateException("Unexpected value: " + id);
        }

    }

 // Another Implicit intent is ACTION_SEND it can be used to send emails

}


