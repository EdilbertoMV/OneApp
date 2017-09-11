package app.oneapp.eddy.myapp.com.oneapp;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class empresaSQLiteHelper extends SQLiteOpenHelper {

    String sqlCreate = "CREATE TABLE empresa (indice INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, nombre TEXT, mechardising TEXT, emisora TEXT, codigo INTEGER)";

    public empresaSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST empresa");
        db.execSQL(sqlCreate);

    }
}
