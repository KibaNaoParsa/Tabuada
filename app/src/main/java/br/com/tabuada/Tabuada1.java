package br.com.tabuada;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tabuada1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_tabuada1);
    }

    public void voltar(View view){

        Intent intent = new Intent(this, Aprender.class);
        startActivity(intent);
    }
}