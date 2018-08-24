package br.com.tabuadaparacriancas;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;

import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by alunos on 12/03/18.
 */

public class FinalQuizZen extends Activity {

    TextView txtResultado;
    Intent res;
    Button btnRepetir, btnFinalizar;
    Intent fim, repetir;
    int perguntas, acertos;
    private InterstitialAd mInterstitialAd;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalzen);

        res = getIntent();

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1594606495855009/9504366187");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });

        perguntas = res.getIntExtra("perguntas", 0);
        acertos = res.getIntExtra("acertos", 0);

        txtResultado = (TextView) findViewById(R.id.txtResultado);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/myriad_pro_bold.ttf");
        txtResultado.setTypeface(font);

        txtResultado.setText(acertos + " acertos em " + perguntas + " perguntas.");

        fim = new Intent(this, MainActivity.class);
        repetir = new Intent(this, Modozen.class);
        btnRepetir = (Button) findViewById(R.id.btnRepetir);
        btnFinalizar = (Button) findViewById(R.id.btnFinalizar);

        btnRepetir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                startActivity(repetir);

            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                startActivity(fim);

            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent itM = new Intent(this, MainActivity.class);
        startActivity(itM);
    }
}
