package com.example.petteri.basicuiconrolsexercises2;

import android.content.Context;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.Toast;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView)
                findViewById(R.id.login); // add stings to control
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,
                new String[]
                        {"Pasi","Juha","Kari","Jouni","Esa","Hannu"});
        actv.setAdapter(aa);
    }
    public void loginButtonClicked(View view) {
        // login name
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.login);
        String login = actv.getText().toString();
        // password
        EditText et = (EditText) findViewById(R.id.password);
        String password = et.getText().toString();
        // get context
        Context context = getApplicationContext();
        // toast message to screen
        Toast.makeText(context, login+" "+password, Toast.LENGTH_LONG).show();
    }
}
