package br.com.tabuada;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tabuada10 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada10);
    }

    public void voltar(View view){

        Intent intent = new Intent(this, Aprender.class);
        startActivity(intent);
    }

    public void abrirModal10(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Tabuada10.this);
        builder.setTitle("Tabuada do 10");
        builder.setMessage("Para fazer a tabuada do 10 basta pegar o número que está sendo multiplicado por 10 e colocar um 0 em sua frente Ex: 8x10 -> 8 mais um 0 = 80");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}