package mx.edu.tesoem.isc.vjrr.a7s212021prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DividirActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividir);

        num1 = findViewById(R.id.TxtNum1Div);
        num2 = findViewById(R.id.TxtNum2Div);
        resultado = findViewById(R.id.lblDivision);

    }

    public void pCalcular(View v){
        int vnum1 = Integer.parseInt(num1.getText().toString());
        int vnum2 = Integer.parseInt(num2.getText().toString());
        resultado.setText("El Resultado es: " + (vnum1 / vnum2));
    }

}