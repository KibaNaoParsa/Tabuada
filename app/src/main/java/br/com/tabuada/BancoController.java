package br.com.tabuada;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by alunos on 05/03/18.
 */

public class BancoController {

    private SQLiteDatabase db;
    private CriaBanco banco;

    public BancoController(Context context) {
        banco = new CriaBanco(context);
    }

    public void inserePergunta(String pergunta, String resA, String resB, String resC, String resD, String resposta, String resposta_letra) {

        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(CriaBanco.PERGUNTA, pergunta);
        valores.put(CriaBanco.RES_A, resA);
        valores.put(CriaBanco.RES_B, resB);
        valores.put(CriaBanco.RES_C, resC);
        valores.put(CriaBanco.RES_D, resD);
        valores.put(CriaBanco.RESPOSTA, resposta);
        valores.put(CriaBanco.RESPOSTA_LETRA, resposta_letra);

        resultado = db.insert(CriaBanco.TABELA, null, valores);
        db.close();

    }

    public Cursor carregaDadoZen(int id) {

        Cursor cursor;
        String [] campos = {banco._ID, banco.PERGUNTA, banco.RESPOSTA};
        String where = CriaBanco._ID + " = " + id;
        db = banco.getReadableDatabase();
        cursor = db.query(CriaBanco.TABELA, campos, where, null, null, null, null, null);

        if (cursor != null) {
            cursor.moveToFirst();
        }

        db.close();
        return cursor;

    }

    public Cursor carregaDadoQuiz(int id) {

        Cursor cursor;
        String [] campos = {banco._ID, banco.PERGUNTA, banco.RES_A, banco.RES_B, banco.RES_C, banco.RES_D, banco.RESPOSTA_LETRA};
        String where = CriaBanco._ID + "=" + id;
        db = banco.getReadableDatabase();
        cursor = db.query(CriaBanco.TABELA, campos, where, null, null, null, null, null);

        if (cursor != null) {
            cursor.moveToFirst();
        }
        db.close();
        return cursor;

    }


    /*
    public void apagaRegistro(int id) {
        String where = CriaBanco._IDPARTIDA + " = " + id;
        db = banco.getReadableDatabase();
        db.delete(CriaBanco.TABELA_PARTIDA, where, null);
        db.close();
    }
*/

}
