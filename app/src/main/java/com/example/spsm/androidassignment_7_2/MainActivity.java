package com.example.spsm.androidassignment_7_2;


import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;

import com.example.spsm.androidassignment_7_2.R;

public class MainActivity extends Activity {

    private EditText editTextInput;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //editTextInput = (EditText) findViewById(R.id.editTextInput);


    }

    public void onSearchClick(View v)
    {
        try {
            Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);

            startActivity(intent);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
