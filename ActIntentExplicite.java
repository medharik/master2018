package com.master;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.View.*;
import android.widget.Button;
import android.widget.Toast;

import com.harik.lenovo2017.activits.R;


public class ActIntentExplicite extends Activity  implements OnClickListener{
private Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_intent_explicite);
        b1= (Button) findViewById(R.id.btn1);
        b2= (Button) findViewById(R.id.btn2);

        b3= (Button) findViewById(R.id.btn3);
b1.setOnClickListener(this);
        b2.setOnClickListener(new EcouteurDeClick(this));
//interface en OO précise ce qu'on veut faire et non pas comment on le faire (l'implémenter)
b3.setOnClickListener(new OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "click sur "+b3.getText(), Toast.LENGTH_SHORT).show();
    }
});

    }


    @Override
    public void onClick(View v) {
Intent i=new  Intent(this,Calcul.class);
        startActivity(i);



    }
}
