package br.com.tabuadaparacriancas;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Tabuada7 extends Activity {
    private AdView mAdView;
    private AdRequest adRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada7);

        MobileAds.initialize(this,
                "ca-app-pub-1594606495855009~8765999583");

        mAdView = (AdView) findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void voltar(View view){

        Intent intent = new Intent(this, Aprender.class);
        startActivity(intent);
    }

    public void abrirModal7(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Tabuada7.this);
        builder.setTitle("Tabuada do 7");
        builder.setMessage("Para aprender a tabuada do 7, recomenda-se o auxílio de um método envolvendo um 'jogo da velha', disponível neste link goo.gl/B9bEoF");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}