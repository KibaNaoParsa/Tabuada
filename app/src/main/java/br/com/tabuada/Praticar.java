package br.com.tabuada;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Praticar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praticar);
    }

    public void abrirModozen(View view){

        Intent intent = new Intent(this, Modozen.class);
        startActivity(intent);
    }

    public void abrirModoquiz(View view){

        Intent intent = new Intent(this, Modoquiz.class);
        startActivity(intent);
    }


}
