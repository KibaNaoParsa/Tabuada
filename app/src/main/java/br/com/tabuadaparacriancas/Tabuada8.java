package br.com.tabuadaparacriancas;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Tabuada8 extends Activity {
    private AdView mAdView;
    private AdRequest adRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada8);

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

    public void abrirModal8(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Tabuada8.this);
        builder.setTitle("Tabuada do 8");
        builder.setMessage("Para fazer a tabuada do 8 basta escrever de um lado os números de 0 a 8 repetindo o 4 e do outro lado escrever duas vezes os números pares de 8 a 0 -> (0123445678) - (8642086420) (08 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 | 80)");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}