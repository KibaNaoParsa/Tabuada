package br.com.tabuada;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Praticar extends Activity {

    Intent itT, itN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praticar);

        itN = new Intent(this, Modozen.class);
        itT = new Intent(this, Modoquiz.class);
    }

    public void abrirModozen(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Praticar.this);
        builder.setTitle("Modo Normal");
        builder.setMessage("No modo normal, aparecerá uma conta na sua tela. \nVocê só precisa fazer essa conta, digitar o resultado e confirmar. \n\nVocê vai resolver 15 contas.\n\nNo final, você vai ver quantas perguntas você acertou.");
        builder.setPositiveButton("Começar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(itN);
            }
        });
        builder.show();


    }

    public void abrirModoquiz(View view){

        AlertDialog.Builder builder = new AlertDialog.Builder(Praticar.this);
        builder.setTitle("Modo Tempo");
        builder.setMessage("No modo tempo, aparecerá uma conta na sua tela. \nEmbaixo da conta, você verá quatro alternativas. \n\nClique na que você achar que é a resposta.\n\nSe você não responder em 20 segundos, você não ganhará nenhum ponto naquela pergunta. \n\nVocê vai resolver 10 contas.\n\nNo final, você vai ver qual foi sua pontuação.");
        builder.setPositiveButton("Começar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(itT);
            }
        });
        builder.show();

    }


}
