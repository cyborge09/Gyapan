package com.example.cybor.gyapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText name, address , email, phone;
    Spinner s1 , s2;
    Button submit;
    String[] sa = {"M","F"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityinitilizae();
        activity();

    }
    public void activityinitilizae(){
        name = (EditText)findViewById(R.id.name);
        address = (EditText)findViewById(R.id.address);
        email = (EditText)findViewById(R.id.email);
        phone = (EditText)findViewById(R.id.phone);
        submit =(Button)findViewById(R.id.button);
        s1=(Spinner)findViewById(R.id.ages);
        s2 = (Spinner) findViewById(R.id.sexs);

       submit.setOnClickListener(this);
        List<Integer> inti = new ArrayList<Integer>();
        List<String> str = new ArrayList<String >();
        for (int i = 1; i < 100 ; i++) {
            inti.add(i);
        }
        for (int i = 0; i <=1 ; i++) {
            str.add(sa[i]);
        }

        ArrayAdapter<Integer> aA = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_item,inti);
        ArrayAdapter<String> sS = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,str);
        s1.setAdapter(aA);
        s2.setAdapter(sS);

    }
    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.button:
                how();
                Toast.makeText(this,"Button Clicked",Toast.LENGTH_LONG).show();
                break;

        }
    }

    public void activity(){

    }

    public void buttonclick () {
    }

    public void how(){
        String nam = name.getText().toString();
        String add = address.getText().toString();
        String mail = email.getText().toString();
        String phn = phone.getText().toString();


            Intent i = new Intent(MainActivity.this,Show.class);
            i.putExtra("name",nam);
            i.putExtra("addr",add);
            i.putExtra("email",mail);
            i.putExtra("phno",phn);
            startActivity(i);

    }

}
