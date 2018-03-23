package br.com.tabuada;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
        AlertDialog.Builder builder = new AlertDialog.Builder(Praticar.this);
        builder.setTitle("Modo Normal");
        builder.setMessage("No modo normal, aparecerá uma conta na sua tela. Você só precisa fazer essa conta, digitar o resultado e confirmar. /nVocê vai resolver 15 contas./nNo final, você vai ver quantas perguntas você acertou.");
        builder.setPositiveButton("Começar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();

        Intent intent = new Intent(this, Modozen.class);
        startActivity(intent);
    }

    public void abrirModoquiz(View view){

        Intent intent = new Intent(this, Modoquiz.class);
        startActivity(intent);
    }


}
