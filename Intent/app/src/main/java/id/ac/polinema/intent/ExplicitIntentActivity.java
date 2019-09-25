package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ExplicitIntentActivity extends AppCompatActivity {
    EditText name;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        name = findViewById(R.id.input_name);
        output = findViewById(R.id.text_output);
    }

    public void handleButton(View view) {
        String nama = name.getText().toString();
        if(nama.equalsIgnoreCase("")){
            Toast.makeText(this, "Harus di isi", Toast.LENGTH_SHORT).show();
        }
        output.setText("Hello "+nama+" Congratulation");
    }
}
