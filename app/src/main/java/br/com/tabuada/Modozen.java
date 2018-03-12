package br.com.tabuada;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class Modozen extends Activity {

    int rand;
    Random rnd;
    String txtUsuario, pergunta, resposta;
    EditText txtResposta;
    TextView txtPergunta;
    Button btnResponder;
    Intent it, voltar, continuar;
    int perguntas, acertos;

    Bundle info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modozen);

        rand = 0;

        voltar = getIntent();

        perguntas = voltar.getIntExtra("perguntas", 0);
        acertos = voltar.getIntExtra("acertos", 0);

        info = new Bundle();


        txtPergunta = (TextView) findViewById(R.id.imgPergunta);
        txtResposta = (EditText) findViewById(R.id.modoZenText);
        btnResponder = (Button) findViewById(R.id.btnResponder);

        it = new Intent(this, Modozen.class);
        continuar = new Intent(this, FinalQuizZen.class);

        rnd = new Random();

        while (rand == 0) {

            rand = rnd.nextInt(100);

        }

        final BancoController crud = new BancoController(getBaseContext());
        final Cursor cursor = crud.carregaDadoZen(rand);


        pergunta = cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.PERGUNTA));
        resposta = cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.RESPOSTA));


        txtPergunta.setText(pergunta);


        btnResponder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtUsuario = txtResposta.getText().toString();

                if (txtUsuario.equals(resposta)) {
                    Toast.makeText(getApplicationContext(), "Resposta correta!", Toast.LENGTH_SHORT).show();
                    acertos+=1;
                } else {
                    Toast.makeText(getApplicationContext(), "Resposta errada!", Toast.LENGTH_SHORT).show();
                }

                perguntas+=1;

                info.putInt("acertos", acertos);
                info.putInt("perguntas", perguntas);

                it.putExtras(info);

                if (perguntas != 20) {
                    startActivity(it);
                } else {
                    continuar.putExtras(info);
                    startActivity(continuar);
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent itM = new Intent(this, Praticar.class);
        startActivity(itM);
    }

    @Override
    protected  void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("rand", rand);
        outState.putInt("acertos", acertos);
        outState.putInt("perguntas", perguntas);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        rand = savedInstanceState.getInt("rand", 0);
        acertos = savedInstanceState.getInt("acertos", 0);
        perguntas = savedInstanceState.getInt("perguntas", 0);

    }

}
