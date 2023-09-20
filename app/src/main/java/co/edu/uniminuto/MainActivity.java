package co.edu.uniminuto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etCapital;
    private EditText etDias;
    private EditText etInteres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void inicio(){
        this.etCapital = findViewById(R.id.etCapital);
        this.etInteres = findViewById(R.id.etInteres);
        this.etDias = findViewById(R.id.etDias);
    }

    public void calculoInteres(View view){
        double capital = Double.parseDouble(etCapital.getText().toString());
        int  dias = Integer.parseInt(etCapital.getText().toString());
        double interes = Double.parseDouble(etInteres.getText().toString());
        double calculo = (capital *(interes/100)) * dias;
        Toast.makeText(this,"El total a pagar es: " +calculo, Toast.LENGTH_LONG).show();


    }
}