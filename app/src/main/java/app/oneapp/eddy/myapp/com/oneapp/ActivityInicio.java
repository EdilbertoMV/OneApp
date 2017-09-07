package app.oneapp.eddy.myapp.com.oneapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityInicio extends AppCompatActivity {

    private View btn;
    private final String gg = "Holi Edd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btn = (Button) findViewById(R.id.buttonCrearEmpresa);

        btn.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View view) {
                                       Intent intent = new Intent(ActivityInicio.this, ActivitySecond.class);
                                       //intent.putExtra("g",gg );
                                       startActivity(intent);
                                   }
                               }



        );


    }
}
