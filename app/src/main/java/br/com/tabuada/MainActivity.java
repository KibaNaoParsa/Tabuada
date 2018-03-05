package br.com.tabuada;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BancoController crud = new BancoController(getBaseContext());


        // Tabuada do 1

        crud.inserePergunta("1 x 0?", "0", "1", "2", "4", "0", "A");
        crud.inserePergunta("1 x 1?", "0", "1", "2", "3", "1", "B");
        crud.inserePergunta("1 x 2?", "1", "2", "4", "5", "2", "B");
        crud.inserePergunta("1 x 3?", "0", "1", "2", "3", "3", "D");
        crud.inserePergunta("1 x 4?", "0", "1", "3", "4", "4", "D");
        crud.inserePergunta("1 x 5?", "2", "4", "5", "7", "5", "C");
        crud.inserePergunta("1 x 6?", "2", "4", "6", "8", "6", "C");
        crud.inserePergunta("1 x 7?", "5", "7", "8", "9", "7", "B");
        crud.inserePergunta("1 x 8?", "8", "9", "10", "12", "8", "A");
        crud.inserePergunta("1 x 9?", "7", "8", "9", "10", "9", "C");
        crud.inserePergunta("1 x 10?", "7", "8", "9", "10", "10", "D");

        // Tabuada do 2

        crud.inserePergunta("2 x 0?", "0", "2", "3", "4", "0", "A");
        crud.inserePergunta("2 x 1?", "0", "1", "2", "4", "2", "C");
        crud.inserePergunta("2 x 2?", "2", "4", "6", "8", "4", "B");
        crud.inserePergunta("2 x 3?", "0", "2", "4", "6", "6", "D");
        crud.inserePergunta("2 x 4?", "8", "10", "12", "14", "8", "A");
        crud.inserePergunta("2 x 5?", "8", "10", "14", "16", "10", "B");
        crud.inserePergunta("2 x 6?", "12", "14", "16", "20", "12", "A");
        crud.inserePergunta("2 x 7?", "8", "10", "12", "14", "14", "D");
        crud.inserePergunta("2 x 8?", "12", "14", "16", "18", "16", "C");
        crud.inserePergunta("2 x 9?", "7", "8", "9", "10", "18", "");
        crud.inserePergunta("2 x 10?", "7", "8", "9", "10", "20", "");


    }

    public void abrirAprender(View view){

        Intent intent = new Intent(this, Aprender.class);
        startActivity(intent);
    }

    public void abrirPraticar(View view){

        Intent intent = new Intent(this, Praticar.class);
        startActivity(intent);
    }

}
