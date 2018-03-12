package br.com.tabuada;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Modoquiz extends Activity {

    ImageView resA, resB, resC, resD;
    TextView txtA, txtB, txtC, txtD, txtPergunta;
    int rand;
    Random rnd;
    String resposta_letra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modoquiz);

        resA = (ImageView) findViewById(R.id.resA);
        resB = (ImageView) findViewById(R.id.resB);
        resC = (ImageView) findViewById(R.id.resC);
        resD = (ImageView) findViewById(R.id.resD);

        txtA = (TextView) findViewById(R.id.txtA);
        txtB= (TextView) findViewById(R.id.txtB);
        txtC = (TextView) findViewById(R.id.txtC);
        txtD = (TextView) findViewById(R.id.txtD);
        txtPergunta = (TextView) findViewById(R.id.txtPergunta);

        rnd = new Random();
        rand = 0;

        while (rand == 0) {

            rand = rnd.nextInt(100);

        }

        final BancoController crud = new BancoController(getBaseContext());
        final Cursor cursor = crud.carregaDadoQuiz(rand);

        txtPergunta.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.PERGUNTA)));
        txtA.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.RES_A)));
        txtB.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.RES_B)));
        txtC.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.RES_C)));
        txtD.setText(cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.RES_D)));

        resposta_letra = cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.RESPOSTA_LETRA));

        
    }
}
