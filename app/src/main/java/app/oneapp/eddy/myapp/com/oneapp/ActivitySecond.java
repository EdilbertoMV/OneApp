package app.oneapp.eddy.myapp.com.oneapp;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivitySecond extends AppCompatActivity {

    private View btn;
    EditText edtProducto, edtMerchandising, edtEmisora, edtCodigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edtProducto = (EditText) findViewById(R.id.eTProducto);
        edtMerchandising = (EditText) findViewById(R.id.eTMerchandising);
        edtEmisora = (EditText) findViewById(R.id.eTEmisora);
        edtCodigo = (EditText) findViewById(R.id.eTCodigo);

        Toast.makeText(ActivitySecond.this, "Ingrese los datos por favor.", Toast.LENGTH_SHORT).show();

        btn = (Button) findViewById(R.id.buttonGuardar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pro = edtProducto.getText().toString();
                Toast.makeText(ActivitySecond.this, "Ingrese los datos por favor." + pro + "GG", Toast.LENGTH_SHORT).show();

                String mercha = edtMerchandising.getText().toString();
                String emi = edtEmisora.getText().toString();
                String cod = edtCodigo.getText().toString();

                if(pro.length() > 0 && mercha.length() > 0 && emi.length() > 0 && cod.length() > 0){

                   // db.execSQL("INSERT INTO empresa (indice, nombre, merchandising, emisora, codigo) VALUES (" + pro + ", '" + mercha + ", '" + emi + ", '" + cod + "')");
                   // db.close();

                    empresaSQLiteHelper empresa = new empresaSQLiteHelper(ActivitySecond.this, "dbEmpresas", null, 1);
                    SQLiteDatabase db = empresa.getWritableDatabase();
                    int i = 1;
                    String insert = "INSERT INTO " + Adaptador.tabla_empresa + " (" + Adaptador.nombre + ", "
                            + Adaptador.mechardising + ", " + Adaptador.emisora + ", " + Adaptador.codigo + ") VALUES ( '"
                            + pro + "', '" + mercha + "', '" + emi + "', '" + cod + "')";

                    db.execSQL(insert);
                    db.close();

                    Toast.makeText(ActivitySecond.this, "¡SE CREO UNA EMPRESA NUEVA!", Toast.LENGTH_SHORT).show();

                    edtProducto.setText("");
                    edtMerchandising.setText("");
                    edtEmisora.setText("");
                    edtCodigo.setText("");

                }else {

                    Toast.makeText(ActivitySecond.this, "Debe llenar todos los datos para continuar.", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }

}
