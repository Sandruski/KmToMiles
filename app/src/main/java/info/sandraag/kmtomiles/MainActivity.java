package info.sandraag.kmtomiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final float KM_TO_MILES = 0.621371f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edit_km = findViewById(R.id.edit_km);
        edit_km.setText("1.5");
    }

    public void onClickMiles(View view) {
        EditText edit_km = findViewById(R.id.edit_km);
        EditText edit_miles = findViewById(R.id.edit_miles);

        String skm = edit_km.getText().toString();

        if (!skm.equals("")) {
            float km = Float.valueOf(skm);
            float miles = km * KM_TO_MILES;
            String smiles = Float.toString(miles);
            edit_miles.setText(smiles);
        }
    }

    public void onClickKm(View view) {
        EditText edit_km = findViewById(R.id.edit_km);
        EditText edit_miles = findViewById(R.id.edit_miles);

        String smiles = edit_miles.getText().toString();

        if (!smiles.isEmpty()) {
            float miles = Float.valueOf(smiles);
            float km = miles / KM_TO_MILES;
            String skm = Float.toString(km);
            edit_km.setText(skm);
        }
    }
}
