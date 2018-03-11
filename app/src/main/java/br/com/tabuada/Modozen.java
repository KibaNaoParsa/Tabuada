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
    String txtUsuario;
    EditText txtResposta;
    TextView txtPergunta;
    Button btnResponder;
    Intent it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modozen);

        txtPergunta = (TextView) findViewById(R.id.txtPergunta);
        txtResposta = (EditText) findViewById(R.id.modoZenText);
        btnResponder = (Button) findViewById(R.id.btnResponder);

        it = new Intent(this, Modozen.class);

        rnd = new Random();

        do {

            rand = rnd.nextInt(100);

        } while (rand == 0);

        BancoController crud = new BancoController(getBaseContext());
        Cursor cursor = crud.carregaDadoZen(rand);

        String pergunta = cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.PERGUNTA));
        final String resposta = cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.RESPOSTA));

        txtPergunta.setText(pergunta);

        btnResponder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtUsuario = txtResposta.getText().toString();

                if (txtUsuario.equals(resposta)) {
                    Toast.makeText(getApplicationContext(), "Resposta correta!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Resposta errada!", Toast.LENGTH_SHORT).show();
                }

                startActivity(it);
            }
        });

    }
}
