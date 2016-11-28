package com.example.cybor.gyapan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by cybor on 25/11/2016.
 */

public class Show extends AppCompatActivity{
    TextView name1,address1,email1,phone1,sex1,age1,name2,address2,email2,phone2;
    String name,address,phone,sex,age,email;
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_layout);

       name1 = (TextView)findViewById(R.id.n);
        address1 = (TextView)findViewById(R.id.ad);
        email1 = (TextView)findViewById(R.id.e);
        phone1 = (TextView)findViewById(R.id.p);
        sex1 = (TextView)findViewById(R.id.s);
        age1 = (TextView)findViewById(R.id.a);
        name2 = (TextView)findViewById(R.id.namei);
        address2 = (TextView)findViewById(R.id.addressi);
        email2 = (TextView)findViewById(R.id.emaili);
        phone2 = (TextView)findViewById(R.id.phonei);

        Intent i = this.getIntent();

        name = getIntent().getStringExtra("name");
        address = getIntent().getStringExtra("addr");
        phone = getIntent().getStringExtra("phno");
        email = getIntent().getStringExtra("email");

        name2.setText(name);
        address2.setText(address);
        email2.setText(email);
        phone2.setText(phone);


    }




}
