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

public class Tabuada4 extends Activity {
    private AdView mAdView;
    private AdRequest adRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada4);

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

    public void abrirModal4(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Tabuada4.this);
        builder.setTitle("Tabuada do 4");
        builder.setMessage("Podemos entender essa tabuada como duas vezes a tabuada do 2, como por exemplo Ex: 2x6 = 12 -> 12x2 = 24");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}