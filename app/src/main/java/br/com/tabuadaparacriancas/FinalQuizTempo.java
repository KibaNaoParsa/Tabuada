package br.com.tabuadaparacriancas;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by alunos on 14/03/18.
 */

public class FinalQuizTempo extends Activity {

    TextView txtResultado;
    Intent rec;
    int resultado;
    Button btnRepetir, btnFinalizar;
    Intent fim, repetir;
    //InterstitialAd mInterstitialAd;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finaltempo);

        txtResultado = (TextView) findViewById(R.id.txtResultado);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/myriad_pro_bold.ttf");
        txtResultado.setTypeface(font);

        /*
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        */

        txtResultado = (TextView) findViewById(R.id.txtResultado);

        rec = getIntent();

        fim = new Intent(this, MainActivity.class);
        repetir = new Intent(this, Modoquiz.class);

        resultado = rec.getIntExtra("pontos", 0);

        txtResultado.setText(String.valueOf(resultado) + " pontos");

        btnRepetir = (Button) findViewById(R.id.btnRepetir);
        btnFinalizar = (Button) findViewById(R.id.btnFinalizar);

        btnRepetir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(repetir);

                /*
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
                */

            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(fim);

                /*
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
                */
            }
        });
    }
}
