package com.example.owntask;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class AddCardActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
    }

    public void onClick(View view) {
        Intent data = new Intent();
        //---get the EditText view---
        EditText txt_username = (EditText) findViewById(R.id.txtName);
        EditText txt_description = (EditText) findViewById(R.id.txtDescription);

        //---set the data to pass back---
        data.setData(Uri.parse(txt_username.getText().toString()));
        data.setData(Uri.parse(txt_description.getText().toString()));

        //data.putExtra("task_name", txt_username.getText().toString());
        //data.putExtra("description", txt_description.getText().toString());

        setResult(RESULT_OK, data);
        //---closes the activity---
        finish();
    }
}
