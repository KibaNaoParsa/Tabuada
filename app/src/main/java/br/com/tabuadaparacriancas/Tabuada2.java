package br.com.tabuadaparacriancas;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tabuada2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada2);
    }

    public void voltar(View view){

        Intent intent = new Intent(this, Aprender.class);
        startActivity(intent);
    }

    public void abrirModal2(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Tabuada2.this);
        builder.setTitle("Tabuada do 2");
        builder.setMessage("Essa tabuada também é bem fácil, todos os seus números são pares e são contados de 2 em 2, de 0 até 20, para obter a resposta basta somar o número por ele mesmo Ex: 2x7 -> 7+7=14");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}