package br.com.tabuadaparacriancas;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.MobileAds;

//import com.google.android.gms.ads.MobileAds;

public class MainActivity extends Activity {

    Button btnFace, btn5star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-1594606495855009~8765999583");

        btnFace = (Button) findViewById(R.id.button2);
        btn5star = (Button) findViewById(R.id.btn5star);

        BancoController crud = new BancoController(getBaseContext());

        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.facebook.com/WaVE-Development-519975971719289";
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/apps/details?id=br.com.tabuadaparacriancas";
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Tabuada do 1

        crud.inserePergunta("1 x 1 ?", "0", "1", "2", "3", "1", "B");
        crud.inserePergunta("1 x 2 ?", "1", "2", "4", "5", "2", "B");
        crud.inserePergunta("1 x 3 ?", "0", "1", "2", "3", "3", "D");
        crud.inserePergunta("1 x 4 ?", "0", "1", "3", "4", "4", "D");
        crud.inserePergunta("1 x 5 ?", "2", "4", "5", "7", "5", "C");
        crud.inserePergunta("1 x 6 ?", "2", "4", "6", "8", "6", "C");
        crud.inserePergunta("1 x 7 ?", "5", "7", "8", "9", "7", "B");
        crud.inserePergunta("1 x 8 ?", "8", "9", "10", "12", "8", "A");
        crud.inserePergunta("1 x 9 ?", "7", "8", "9", "10", "9", "C");
        crud.inserePergunta("1 x 10 ?", "7", "8", "9", "10", "10", "D");

        // Tabuada do 2


        crud.inserePergunta("2 x 1 ?", "0", "1", "2", "4", "2", "C");
        crud.inserePergunta("2 x 2 ?", "2", "4", "6", "8", "4", "B");
        crud.inserePergunta("2 x 3 ?", "0", "2", "4", "6", "6", "D");
        crud.inserePergunta("2 x 4 ?", "8", "10", "12", "14", "8", "A");
        crud.inserePergunta("2 x 5 ?", "8", "10", "14", "16", "10", "B");
        crud.inserePergunta("2 x 6 ?", "12", "14", "16", "20", "12", "A");
        crud.inserePergunta("2 x 7 ?", "8", "10", "12", "14", "14", "D");
        crud.inserePergunta("2 x 8 ?", "12", "14", "16", "18", "16", "C");
        crud.inserePergunta("2 x 9 ?", "12", "14", "16", "18", "18", "D");
        crud.inserePergunta("2 x 10 ?", "18", "20", "22", "24", "20", "B");

        // Tabuada do 3

        crud.inserePergunta("3 x 1 ?", "1", "3", "5", "6", "3", "B");
        crud.inserePergunta("3 x 2 ?", "3", "4", "6", "9", "6", "C");
        crud.inserePergunta("3 x 3 ?", "3", "6", "9", "12", "9", "C");
        crud.inserePergunta("3 x 4 ?", "9", "10", "11", "12", "12", "D");
        crud.inserePergunta("3 x 5 ?", "15", "18", "20", "21", "15", "A");
        crud.inserePergunta("3 x 6 ?", "12", "14", "16", "18", "18", "D");
        crud.inserePergunta("3 x 7 ?", "20", "21", "22", "24", "21", "B");
        crud.inserePergunta("3 x 8 ?", "20", "22", "24", "28", "24", "C");
        crud.inserePergunta("3 x 9 ?", "27", "29", "30", "31", "27", "A");
        crud.inserePergunta("3 x 10 ?", "28", "30", "35", "40", "30", "B");

        // Tabuada do 4

        crud.inserePergunta("4 x 1 ?", "2", "4", "6", "8", "4", "B");
        crud.inserePergunta("4 x 2 ?", "4", "6", "8", "10", "8", "C");
        crud.inserePergunta("4 x 3 ?", "6", "8", "10", "12", "12", "D");
        crud.inserePergunta("4 x 4 ?", "16", "18", "20", "22", "16", "A");
        crud.inserePergunta("4 x 5 ?", "15", "20", "25", "30", "20", "B");
        crud.inserePergunta("4 x 6 ?", "20", "22", "24", "26", "24", "C");
        crud.inserePergunta("4 x 7 ?", "24", "26", "27", "28", "28", "D");
        crud.inserePergunta("4 x 8 ?", "24", "28", "32", "36", "32", "C");
        crud.inserePergunta("4 x 9 ?", "34", "36", "38", "39", "36", "B");
        crud.inserePergunta("4 x 10 ?", "30", "35", "40", "45", "40", "C");

        // Tabuada do 5

        crud.inserePergunta("5 x 1 ?", "1", "3", "5", "7", "5", "C");
        crud.inserePergunta("5 x 2 ?", "5", "10", "15", "20", "10", "B");
        crud.inserePergunta("5 x 3 ?", "5", "10", "13", "15", "15", "D");
        crud.inserePergunta("5 x 4 ?", "15", "20", "24", "25", "20", "B");
        crud.inserePergunta("5 x 5 ?", "25", "30", "35", "40", "25", "A");
        crud.inserePergunta("5 x 6 ?", "25", "26", "30", "35", "30", "C");
        crud.inserePergunta("5 x 7 ?", "30", "33", "35", "37", "35", "C");
        crud.inserePergunta("5 x 8 ?", "38", "40", "45", "48", "40", "B");
        crud.inserePergunta("5 x 9 ?", "40", "45", "49", "50", "45", "B");
        crud.inserePergunta("5 x 10 ?", "30", "40", "50", "55", "50", "C");

        // Tabuada do 6

        crud.inserePergunta("6 x 1 ?", "2", "4", "6", "8", "6", "C");
        crud.inserePergunta("6 x 2 ?", "6", "8", "10", "12", "12", "D");
        crud.inserePergunta("6 x 3 ?", "12", "18", "24", "26", "18", "B");
        crud.inserePergunta("6 x 4 ?", "20", "22", "24", "26", "24", "C");
        crud.inserePergunta("6 x 5 ?", "30", "35", "36", "40", "30", "A");
        crud.inserePergunta("6 x 6 ?", "30", "36", "39", "42", "36", "B");
        crud.inserePergunta("6 x 7 ?", "42", "44", "46", "47", "42", "A");
        crud.inserePergunta("6 x 8 ?", "38", "40", "46", "48", "48", "D");
        crud.inserePergunta("6 x 9 ?", "45", "46", "49", "54", "54", "D");
        crud.inserePergunta("6 x 10 ?", "50", "60", "70", "80", "60", "B");

        // Tabuada do 7

        crud.inserePergunta("7 x 1? ", "1", "3", "5", "7", "7", "D");
        crud.inserePergunta("7 x 2? ", "4", "7", "14", "17", "14", "C");
        crud.inserePergunta("7 x 3? ", "21", "23", "25", "27", "21", "A");
        crud.inserePergunta("7 x 4? ", "20", "24", "28", "32", "28", "C");
        crud.inserePergunta("7 x 5? ", "30", "35", "37", "40", "35", "B");
        crud.inserePergunta("7 x 6? ", "36", "37", "42", "46", "42", "C");
        crud.inserePergunta("7 x 7? ", "46", "47", "48", "49", "49", "D");
        crud.inserePergunta("7 x 8? ", "55", "56", "57", "58", "56", "B");
        crud.inserePergunta("7 x 9? ", "63", "65", "67", "69", "63", "A");
        crud.inserePergunta("7 x 10? ", "50", "60", "70", "80", "70", "C");

        // Tabuada do 8

        crud.inserePergunta("8 x 1? ", "4", "6", "8", "10", "8", "C");
        crud.inserePergunta("8 x 2? ", "8", "12", "16", "18", "16", "C");
        crud.inserePergunta("8 x 3? ", "21", "22", "23", "24", "24", "A");
        crud.inserePergunta("8 x 4? ", "28", "32", "36", "40", "32", "B");
        crud.inserePergunta("8 x 5? ", "30", "35", "38", "40", "40", "D");
        crud.inserePergunta("8 x 6? ", "36", "44", "46", "48", "48", "D");
        crud.inserePergunta("8 x 7? ", "56", "57", "58", "59", "56", "A");
        crud.inserePergunta("8 x 8? ", "60", "64", "68", "72", "64", "B");
        crud.inserePergunta("8 x 9 ?", "72", "77", "78", "79", "72", "A");
        crud.inserePergunta("8 x 10 ?", "60", "70", "80", "90", "80", "C");

        // Tabuada do 9

        crud.inserePergunta("9 x 1 ?", "6", "7", "8", "9", "9", "D");
        crud.inserePergunta("9 x 2 ?", "6", "12", "18", "19", "18", "C");
        crud.inserePergunta("9 x 3 ?", "27", "28", "29", "30", "27", "A");
        crud.inserePergunta("9 x 4 ?", "33", "34", "36", "39", "36", "C");
        crud.inserePergunta("9 x 5 ?", "45", "49", "50", "55", "45", "A");
        crud.inserePergunta("9 x 6 ?", "54", "56", "58", "59", "54", "A");
        crud.inserePergunta("9 x 7 ?", "60", "63", "67", "69", "63", "B");
        crud.inserePergunta("9 x 8 ?", "68", "69", "72", "78", "72", "C");
        crud.inserePergunta("9 x 9 ?", "79", "81", "89", "90", "81", "B");
        crud.inserePergunta("9 x 10 ?", "90", "91", "99", "100", "90", "A");

        // Tabuada do 10

        crud.inserePergunta("10 x 1 ?", "10", "20", "30", "40", "10", "A");
        crud.inserePergunta("10 x 2 ?", "10", "20", "21", "22", "20", "B");
        crud.inserePergunta("10 x 3 ?", "20", "30", "40", "50", "30", "B");
        crud.inserePergunta("10 x 4 ?", "20", "30", "40", "41", "40", "C");
        crud.inserePergunta("10 x 5 ?", "50", "51", "55", "60", "50", "A");
        crud.inserePergunta("10 x 6 ?", "40", "50", "56", "60", "60", "D");
        crud.inserePergunta("10 x 7 ?", "60", "70", "71", "77", "70", "B");
        crud.inserePergunta("10 x 8 ?", "60", "70", "80", "88", "80", "C");
        crud.inserePergunta("10 x 9 ?", "90", "91", "99", "100", "90", "A");
        crud.inserePergunta("10 x 10 ?", "10", "100", "101", "1000", "100", "B");



    }

    public void abrirAprender(View view){

        Intent intent = new Intent(this, Aprender.class);
        startActivity(intent);
    }

    public void abrirPraticar(View view){

        Intent intent = new Intent(this, Praticar.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent itM = new Intent(this, MainActivity.class);
        startActivity(itM);
    }

}
