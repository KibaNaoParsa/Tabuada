package br.com.tabuada;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alunos on 14/03/18.
 */

public class FinalQuizTempo extends Activity {

    TextView txtResultado;
    Intent rec;
    int resultado;
    Button btnRepetir, btnFinalizar;
    Intent fim, repetir;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finaltempo);

        txtResultado = (TextView) findViewById(R.id.txtResultado);

        rec = getIntent();

        fim = new Intent(this, MainActivity.class);
        repetir = new Intent(this, Modoquiz.class);

        resultado = rec.getIntExtra("pontos", 0);

        txtResultado.setText(String.valueOf(resultado) + " pontos.");

        btnRepetir = (Button) findViewById(R.id.btnRepetir);
        btnFinalizar = (Button) findViewById(R.id.btnFinalizar);

        btnRepetir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(repetir);
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(fim);
            }
        });
    }
}
