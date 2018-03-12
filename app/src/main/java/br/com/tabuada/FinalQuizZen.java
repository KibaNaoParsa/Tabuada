package br.com.tabuada;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by alunos on 12/03/18.
 */

public class FinalQuizZen extends Activity {

    TextView txtResultado;
    Intent res;
    int perguntas, acertos;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalzen);

        res = getIntent();

        perguntas = res.getIntExtra("perguntas", 0);
        acertos = res.getIntExtra("acertos", 0);

        txtResultado = (TextView) findViewById(R.id.txtResultado);

        txtResultado.setText(acertos + "/" + perguntas);

    }

    @Override
    public void onBackPressed() {
        Intent itM = new Intent(this, MainActivity.class);
        startActivity(itM);
    }
}
