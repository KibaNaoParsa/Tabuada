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
/*
    public Cursor carregaDados() {

        Cursor cursor;
        String[] campos = {banco._IDPARTIDA, banco.PLACAR, banco.TIME1, banco.TIME2, banco.DATA};
        db = banco.getReadableDatabase();
        cursor = db.query(banco.TABELA_PARTIDA, campos, null, null, null, null, null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        db.close();
        return cursor;

    }

    public Cursor carregaDadoById(int id) {

        Cursor cursor;
        String [] campos = {banco._IDPARTIDA, banco.NOMETIME1, banco.NOMETIME2, banco.TIME1, banco.TIME2, banco.PLACAR};
        String where = CriaBanco._IDPARTIDA + "=" + id;
        db = banco.getReadableDatabase();
        cursor = db.query(CriaBanco.TABELA_PARTIDA, campos, where, null, null, null, null, null);

        if (cursor != null) {
            cursor.moveToFirst();
        }
        db.close();
        return cursor;

    }

    public void apagaRegistro(int id) {
        String where = CriaBanco._IDPARTIDA + " = " + id;
        db = banco.getReadableDatabase();
        db.delete(CriaBanco.TABELA_PARTIDA, where, null);
        db.close();
    }
*/

}
