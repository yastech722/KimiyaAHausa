package com.ilmaict.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText mEdtName,mEdtAge,mEdtTribe,mEdtChannel,mEdtLocation;
private TextView mTxvOutput;

private void init(){
    mEdtName= findViewById(R.id.edt_name);
    mEdtAge= findViewById(R.id.edt_age);
    mEdtTribe=findViewById(R.id.edt_tribe);
    mEdtChannel=findViewById(R.id.edt_channel);
    mEdtLocation=findViewById(R.id.edt_live);

    mTxvOutput=findViewById(R.id.txv_output);
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    public void mainActivityAction(View view) {
    mTxvOutput.setVisibility(View.VISIBLE);
        String name = mEdtName.getText().toString();
        String age = mEdtAge.getText().toString();
        String tribe = mEdtTribe.getText().toString();
        String channel = mEdtChannel.getText().toString();
        String location = mEdtLocation.getText().toString();

                if(!name.isEmpty() && !age.isEmpty() && !tribe.isEmpty() && !channel.isEmpty() && !location.isEmpty()){
String introduction= "My name is "+ name + " i am "+age+" years old, "+tribe+" by tribe, i live in "+ location+
        "and my favourite youtube channel is" + channel+".";
mTxvOutput.setText(introduction);
                } else {
                    mTxvOutput.setText("Please fill all fields.");
                }
    }
}
