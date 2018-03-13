package br.com.tabuada;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Modoquiz extends Activity {

    ImageView resA, resB, resC, resD;
    TextView txtA, txtB, txtC, txtD, txtPergunta;
    int rand;
    Random rnd;
    String resposta_letra;
    int perguntas, pontos;
    double divisao;
    Intent it, voltar;
    Bundle res;
    long restante, tempo;
    CountDownTimer contador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modoquiz);

        it = new Intent(this, Modoquiz.class);

        /*int orient=this.getResources().getConfiguration().orientation;

        if (orient == 1) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
*/
        voltar = getIntent();

        perguntas = voltar.getIntExtra("perguntas", 0);
        pontos = voltar.getIntExtra("acertos", 0);

        res = new Bundle();

        tempo = 20000;

        contador = this.contagem(tempo);

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

        resA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resposta_letra.equals("A")) {
                    contador.cancel();
                    divisao = ((double) restante / tempo)*100;
                    pontos += (int) divisao;

                    Toast.makeText(getApplicationContext(), String.valueOf(pontos), Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(), "Resposta errada", Toast.LENGTH_SHORT).show();
                }
            }
        });

        resB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resposta_letra.equals("B")) {
                    contador.cancel();
                    divisao = ((double) restante / tempo)*100;
                    pontos += (int) divisao;
                    Toast.makeText(getApplicationContext(), String.valueOf(pontos), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Resposta errada", Toast.LENGTH_SHORT).show();
                }
            }
        });

        resC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resposta_letra.equals("C")) {
                    contador.cancel();
                    divisao = ((double) restante / tempo)*100;
                    pontos += (int) divisao;
                    Toast.makeText(getApplicationContext(), String.valueOf(pontos), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Resposta errada", Toast.LENGTH_SHORT).show();
                }
            }
        });

        resD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resposta_letra.equals("D")) {
                    contador.cancel();
                    divisao = ((double) restante / tempo)*100;
                    pontos += (int) divisao;
                    Toast.makeText(getApplicationContext(), String.valueOf(pontos), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Resposta errada", Toast.LENGTH_SHORT).show();
                }
            }
        });

        perguntas += 1;

        res.putInt("perguntas", perguntas);
        res.putInt("pontos", pontos);
        it.putExtras(res);
        startActivity(it);


    }


    public CountDownTimer contagem(long segundos) {
        return new CountDownTimer(segundos, 1) {

            public void onTick(long millisUntilFinished) {
                restante = millisUntilFinished;

            }

            public void onFinish() {

            }
        }.start();

    }
}
