package com.example.alertactivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Alert1(View view) {
        //single button Alert

        // Create Dialog Builder.
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        // customize Builder
        dialogBuilder.setTitle("First Alert").setMessage("This is the first Alert");
        dialogBuilder.setPositiveButton("OK", null);
        //Create the AlertDialog from builder
        AlertDialog alert = dialogBuilder.create();
        //show alertdialog
        alert.show();
    }

    public void Alert2(View view) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Alert2");
        alertDialogBuilder.setMessage("This is an alert with 3 buttons");
        alertDialogBuilder.setPositiveButton(R.string.positiveButtonText, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "YOU SAID YES", Toast.LENGTH_LONG).show();
            }
        });
        alertDialogBuilder.setNegativeButton("NO", null);
        alertDialogBuilder.setNeutralButton("Maybe", null);
        alertDialogBuilder.setCancelable(false);


        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();


    }


    public void alert3(View v) {
        //v.setBackgroundColor(Color.blue);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Choose your inner animal");
        final String[] animals = {"horse", "cow", "camel", "sheep", "goat"};
        alertDialogBuilder.setItems(animals, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                showToastBasedOnValueOF(which);


            }
        });

        alertDialogBuilder.create().show();

    }

    void showToastBasedOnValueOF(int w) {
        switch (w) {
            case 0:
                Toast.makeText(MainActivity.this, "You are a horse", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(MainActivity.this, "You are as fat as a cow", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MainActivity.this, "You are as fat as a cow", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(MainActivity.this, "You are as fat as a cow", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(MainActivity.this, "You are as fat as a cow", Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(MainActivity.this, "Choose a different animal", Toast.LENGTH_SHORT).show();

                break;

        }
    }

    public void AlertEditText(View view) {
        // create builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Enter your name: ");
        // create EDITTEXT programatilcally

        final EditText editText = new EditText(this);
        editText.setHint("your name");
        // call set view from builder
        builder.setView(editText);


        builder.setMessage("Your name please");

        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            //    String username = editText.getText().toString();
            //    Toast.makeText(MainActivity.this, "your username is: "+username, Toast.LENGTH_SHORT).show();

            }
        });

        builder.create().show();
    }

    public void AlertWithCustomView(View view){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Enter your name: ");
        // Refrence view from layoutfile
        builder.setView(R.layout.dialog_layout);

        builder.setPositiveButton("OK",null);
        //show alert
        builder.create().show();

    }

    public void sweetAlert1(View view) {
        new SweetAlertDialog(this)
                .setTitleText("Here's a message!")
                .show();



    }
}