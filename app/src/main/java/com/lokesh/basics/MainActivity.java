package com.lokesh.basics;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view)                                     //button to open another activity
                                 {
                                     Intent i = new Intent(MainActivity.this, Activity2.class);
                                     startActivity(i);
                                 }
                             }

        );

        b = (Button) findViewById(R.id.toast);
        b.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view)                                     //button to show toast messages
                                 {
                                     Toast.makeText(getApplicationContext(), "This is my Toast message!",
                                             Toast.LENGTH_SHORT).show();
                                 }
                             }

        );

        mEditText = (EditText) findViewById(R.id.editText);
        b = (Button) findViewById(R.id.display);
        b.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view)                                     // to display input text as toasts
                                 {
                                     Toast.makeText(getApplicationContext(), mEditText.getText(),
                                             Toast.LENGTH_SHORT).show();
                                 }
                             }

        );

        final Context context = this;
        b = (Button) findViewById(R.id.exit);
        b.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View argO)                                     // to display input text as toasts
                                 {
                                     AlertDialog.Builder alertDialgBuilder = new AlertDialog.Builder(context);

                                     //set title
                                     alertDialgBuilder.setTitle("Your title");

                                     //set dialog message
                                     alertDialgBuilder.setMessage("Click yes to exit")
                                             .setCancelable(false)
                                             .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                                 @Override
                                                 public void onClick(DialogInterface dialog, int id) {

                                                     //if this button is clicked, close the current activity

                                                     MainActivity.this.finish();
                                                 }
                                             })
                                             .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                                 @Override
                                                 public void onClick(DialogInterface dialog, int which) {
                                                     //if this button is clicked ,just close the dialog box and do nothing

                                                     dialog.cancel();
                                                 }
                                             });

                                     //cancel alert dialog
                                     AlertDialog alertDialog = alertDialgBuilder.create();

                                     //show it
                                     alertDialog.show();
                                 }
                             }

        );

        b= (Button)findViewById(R.id.applink);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {                                                             //open a link within app
                                     Intent i = new Intent(MainActivity.this,inapplink.class);
                                     startActivity(i);
                                 }
                             }

        );

        b= (Button)findViewById(R.id.browserlink);
        b.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View view)
                                 {                                                              //open link through browser
                                     Intent intent=new Intent();
                                     intent.setAction(Intent.ACTION_VIEW);
                                     intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                     intent.setData(Uri.parse("https://www.google.com/"));
                                     startActivity(intent);
                                 }
                             }

        );
    }

}
