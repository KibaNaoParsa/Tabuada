package br.com.tabuadaparacriancas;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by alunos on 05/03/18.
 */

public class CriaBanco extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "tabuada.db";
    public static final String TABELA = "PERGUNTAS";
    public static final String _ID = "_id";
    public static final String PERGUNTA = "pergunta";
    public static final String RES_A = "respostaA";
    public static final String RES_B = "respostaB";
    public static final String RES_C = "respostaC";
    public static final String RES_D = "respostaD";
    public static final String RESPOSTA = "resposta";
    public static final String RESPOSTA_LETRA = "resposta_letra";

    private static final int VERSAO = 1;

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE " + TABELA + " ( "
                + _ID + " integer primary key autoincrement, "
                + PERGUNTA + " text, "
                + RES_A + " text, "
                + RES_B + " text, "
                + RES_C + " text, "
                + RES_D + " text, "
                + RESPOSTA + " text, "
                + RESPOSTA_LETRA + " text ) ";
        sqLiteDatabase.execSQL(sql);
    }

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABELA);
        onCreate(sqLiteDatabase);
    }

    public CriaBanco(Context context) {
        super(context, NOME_BANCO, null, VERSAO);
    }

}
