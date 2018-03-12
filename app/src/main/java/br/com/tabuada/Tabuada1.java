package br.com.tabuada;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tabuada1 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada1);
    }

    public void voltar(View view){

        Intent intent = new Intent(this, Aprender.class);
        startActivity(intent);
    }

    public void abrirModal1(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Tabuada1.this);
        builder.setTitle("Tabuada do 1");
        builder.setMessage("Essa tabuada é a mais simples, para ter cada resultado, basta contar com os dedos de 1 até 10");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}