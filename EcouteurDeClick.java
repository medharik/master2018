package com.master;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by lenovo on 1/15/2018.
 */

public class EcouteurDeClick    implements View.OnClickListener{
Context context;
   public  EcouteurDeClick(){

    }
 
    public  EcouteurDeClick(Context context){
this.context=context;
    }

    @Override
    public void onClick(View v) {
        Button b=null;
        if( v instanceof  Button){
             b= (Button) v;
        }

        Toast.makeText(context, "click sur "+b.getText(), Toast.LENGTH_SHORT).show();

    }
}
