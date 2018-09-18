package l.sito.kmamll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public static final float MILLES_PER_KM = 0.621371f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edit_km = findViewById(R.id.edit_km);
        edit_km.setText("1.5");
    }

    public void onClickMilles(View view) {
        EditText edit_km = findViewById(R.id.edit_km);
        EditText edit_mll = findViewById(R.id.edit_mll);
        String skm = edit_km.getText().toString();
        if(!skm.equals("")) {
            float km = Float.valueOf(skm);
            float milles = km * MILLES_PER_KM;
            String smilles = Float.toString(milles);

            edit_mll.setText(smilles);
        }
    }

    public void onClickKm(View view) {
        EditText edit_km = findViewById(R.id.edit_km);
        EditText edit_mll = findViewById(R.id.edit_mll);
        String smll = edit_mll.getText().toString();
        if(!smll.equals("")) {
            float milles = Float.valueOf(smll);
            float km = milles / MILLES_PER_KM;
            String skm = Float.toString(km);
            edit_km.setText(skm);
        }
    }
}
