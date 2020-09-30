package mx.edu.tesoem.isc.vjrr.a7s212021prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CuadradoActivity extends AppCompatActivity {

    EditText num1;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        num1 = findViewById(R.id.TxtNum1Cuad);
        resultado = findViewById(R.id.lblCuadrado);

    }

    public void pCalcular(View v){
        int vnum1 = Integer.parseInt(num1.getText().toString());
        resultado.setText("El Resultado es: " + (vnum1 * vnum1));
    }

}