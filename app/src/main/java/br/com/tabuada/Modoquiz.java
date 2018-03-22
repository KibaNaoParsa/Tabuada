package br.com.tabuada;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Random;

public class Modoquiz extends Activity {

    ImageView resA, resB, resC, resD;
    TextView txtA, txtB, txtC, txtD, txtPergunta;
    int rand, teste;
    Random rnd;
    String resposta_letra;
    int perguntas, pontos;
    double divisao;
    Intent it, voltar, continuar;
    Bundle res;
    long restante, tempo;
    CountDownTimer contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modoquiz);

        int orient=this.getResources().getConfiguration().orientation;

        if (orient == 1) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }



        voltar = getIntent();

        perguntas = voltar.getIntExtra("perguntas", 0);
        pontos = voltar.getIntExtra("pontos", 0);

        res = new Bundle();

        teste = 20;

        tempo = 20000;

        contador = this.contagem(tempo);

        it = new Intent(this, Modoquiz.class);
        continuar = new Intent(this, FinalQuizTempo.class);


        resA = (ImageView) findViewById(R.id.resA);
        resB = (ImageView) findViewById(R.id.resB);
        resC = (ImageView) findViewById(R.id.resC);
        resD = (ImageView) findViewById(R.id.resD);

        txtA = (TextView) findViewById(R.id.txtA);
        txtB= (TextView) findViewById(R.id.txtB);
        txtC = (TextView) findViewById(R.id.txtC);
        txtD = (TextView) findViewById(R.id.txtD);
        txtPergunta = (TextView) findViewById(R.id.txtPergunta);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/myriad_pro_bold.ttf");
        txtA.setTypeface(typeface);
        txtB.setTypeface(typeface);
        txtC.setTypeface(typeface);
        txtD.setTypeface(typeface);
        txtPergunta.setTypeface(typeface);


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

                    perguntas += 1;

                    res.putInt("pontos", pontos);
                    res.putInt("perguntas", perguntas);

                    it.putExtras(res);

                    if (perguntas != teste) {
                        startActivity(it);
                    } else {
                        continuar.putExtras(res);

                        startActivity(continuar);


                    }


                } else {

                    perguntas += 1;

                    res.putInt("pontos", pontos);
                    res.putInt("perguntas", perguntas);

                    it.putExtras(res);

                    if (perguntas != teste) {
                        startActivity(it);
                    } else {
                        continuar.putExtras(res);

                        startActivity(continuar);
                    }
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

                    perguntas += 1;

                    res.putInt("pontos", pontos);
                    res.putInt("perguntas", perguntas);

                    it.putExtras(res);

                    if (perguntas != teste) {
                        startActivity(it);
                    } else {
                        continuar.putExtras(res);

                        startActivity(continuar);
                    }

                } else {

                    perguntas += 1;

                    res.putInt("pontos", pontos);
                    res.putInt("perguntas", perguntas);

                    it.putExtras(res);


                    if (perguntas != teste) {
                        startActivity(it);
                    } else {
                        continuar.putExtras(res);

                        startActivity(continuar);
                    }
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

                    perguntas += 1;
                    res.putInt("pontos", pontos);
                    res.putInt("perguntas", perguntas);

                    it.putExtras(res);

                    if (perguntas != teste) {
                        startActivity(it);
                    } else {
                        continuar.putExtras(res);

                        startActivity(continuar);

                    }
                } else {

                    perguntas += 1;

                    res.putInt("pontos", pontos);
                    res.putInt("perguntas", perguntas);

                    it.putExtras(res);

                    if (perguntas != teste) {
                        startActivity(it);
                    } else {
                        continuar.putExtras(res);

                        startActivity(continuar);
                    }

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

                    perguntas += 1;
                    res.putInt("pontos", pontos);
                    res.putInt("perguntas", perguntas);

                    it.putExtras(res);

                    if (perguntas != teste) {
                        startActivity(it);
                    } else {
                        continuar.putExtras(res);

                        startActivity(continuar);
                    }

                } else {

                    perguntas += 1;

                    res.putInt("pontos", pontos);
                    res.putInt("perguntas", perguntas);

                    it.putExtras(res);

                    if (perguntas != teste) {
                        startActivity(it);
                    } else {
                        continuar.putExtras(res);

                        startActivity(continuar);

                    }
                }
            }
        });

    }


    public CountDownTimer contagem(long segundos) {
        return new CountDownTimer(segundos, 1) {

            public void onTick(long millisUntilFinished) {
                restante = millisUntilFinished;

            }

            public void onFinish() {
                perguntas += 1;

                res.putInt("pontos", pontos);
                res.putInt("perguntas", perguntas);

                it.putExtras(res);

                if (perguntas != teste) {
                    startActivity(it);
                } else {
                    continuar.putExtras(res);

                    startActivity(continuar);
                }
            }
        }.start();

    }

    @Override
    public void onBackPressed() {
        contador.cancel();
        Intent it1 = new Intent(this, MainActivity.class);
        startActivity(it1);
        finish();
    }
}
