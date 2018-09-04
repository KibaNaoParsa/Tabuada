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

public class Tabuada9 extends Activity {
    private AdView mAdView;
    private AdRequest adRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada9);

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

    public void abrirModal9(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Tabuada9.this);
        builder.setTitle("Tabuada do 9");
        builder.setMessage("Uma dica para escrever toda a tabuada do 9 é escrever os números de 0 a 9 de um lado e os de 9 a 0 do outro -> (0123456789) - (9876543210) - (0|9) (1|8) (2|7) (3|6) (4|5) (5|4) (6|3) (7|2) (8|1) (9|0)");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}