package br.com.tabuadaparacriancas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Aprender extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprender);
    }

    public void abrirTabuada1(View view){

        Intent intent = new Intent(this, Tabuada1.class);
        startActivity(intent);
    }

    public void abrirTabuada2(View view){

        Intent intent = new Intent(this, Tabuada2.class);
        startActivity(intent);
    }

    public void abrirTabuada3(View view){

        Intent intent = new Intent(this, Tabuada3.class);
        startActivity(intent);
    }

    public void abrirTabuada4(View view){

        Intent intent = new Intent(this, Tabuada4.class);
        startActivity(intent);
    }

    public void abrirTabuada5(View view){

        Intent intent = new Intent(this, Tabuada5.class);
        startActivity(intent);
    }

    public void abrirTabuada6(View view){

        Intent intent = new Intent(this, Tabuada6.class);
        startActivity(intent);
    }

    public void abrirTabuada7(View view){

        Intent intent = new Intent(this, Tabuada7.class);
        startActivity(intent);
    }

    public void abrirTabuada8(View view){

        Intent intent = new Intent(this, Tabuada8.class);
        startActivity(intent);
    }

    public void abrirTabuada9(View view){

        Intent intent = new Intent(this, Tabuada9.class);
        startActivity(intent);
    }

    public void abrirTabuada10(View view){

        Intent intent = new Intent(this, Tabuada10.class);
        startActivity(intent);
    }
}
