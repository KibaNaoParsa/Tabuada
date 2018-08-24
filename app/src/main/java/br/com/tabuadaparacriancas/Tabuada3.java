package br.com.tabuadaparacriancas;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tabuada3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada3);
    }

    public void voltar(View view){

        Intent intent = new Intent(this, Aprender.class);
        startActivity(intent);
    }

    public void abrirModal3(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Tabuada3.this);
        builder.setTitle("Tabuada do 3");
        builder.setMessage("Essa tabuada é bem parecida com a tabuada do 2, porém depois de obter o resultado da soma, você soma esse número mais uma vez Ex: 3x8 -> 8+8=16 -> 16+8 = 24");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}