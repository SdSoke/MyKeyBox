package com.bignerdranch.admin.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class AddActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextaccount;
    private EditText editTextPassword;
    private EditText editTextNote;


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_check:
                SharedPreferences.Editor editor=getSharedPreferences("data",MODE_PRIVATE).edit();
                String inputName=editTextName.getText().toString();
                String inputAccount=editTextaccount.getText().toString();
                String inputPassword=editTextPassword.getText().toString();
                String inputNote=editTextNote.getText().toString();
                editor.putString("name",inputName);
                editor.putString("account",inputAccount);
                editor.putString("password",inputPassword);
                editor.putString("note",inputNote);
                editor.apply();

                Intent intent =new Intent(AddActivity.this,MainActivity.class);
                startActivity(intent);

        }
        switch (item.getItemId()){
           case  android.R.id.home:
               finish();

        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Toolbar toolbar= (Toolbar) findViewById(R.id.add_toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar !=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);
        }
        editTextName = (EditText) findViewById(R.id.add_name);
        editTextaccount= (EditText) findViewById(R.id.add_account);
        editTextPassword= (EditText) findViewById(R.id.add_password);
        editTextNote= (EditText) findViewById(R.id.add_note);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.addtoolbar, menu);
        return true;
    }
}
