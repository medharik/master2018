package com.master;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.harik.lenovo2017.activits.R;
public class Calcul extends Activity {
private     Button btncalcul;
   private  EditText edprix;
    private
    TextView tvresultat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // faire la liaison entre les variables java et les views dans l'interafec graphiqe
        setContentView(R.layout.activity_calcul);
        edprix= (EditText) findViewById(R.id.edprix);
        tvresultat= (TextView) findViewById(R.id.tresultat);

    }
//methode appelé qd on click sur le btn (voir xml)
   public  void calculer (View v){
        //recuperation du text prix
        String tprix=edprix.getText().toString();

        try {  //conversion  (parse) vers nombre
            double prix=  Double.parseDouble(tprix);
            double ptc=prix*1.20;
            tvresultat.setText("le prix taxe comprise est "+ptc+" dhs");
        }catch (Exception erreur){
            Toast.makeText(this, "ce n'est pas un nombre", Toast.LENGTH_SHORT).show();
        }


    }
}
