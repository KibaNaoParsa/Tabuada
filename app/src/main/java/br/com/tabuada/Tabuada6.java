package br.com.tabuada;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tabuada6 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada6);
    }

    public void voltar(View view){

        Intent intent = new Intent(this, Aprender.class);
        startActivity(intent);
    }

    public void abrirModal6(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Tabuada6.this);
        builder.setTitle("Tabuada do 6");
        builder.setMessage("Para fazer a tabuada do 6, basta saber a tabuada do 5 e somar o resultado com o número que o 6 estiver multiplicando Ex: 6x7 -> 5x7 + 7 = 42");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}