package mx.edu.tesoem.isc.vjrr.a7s212021prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void OpcSuma(View v){
        Intent intent = new Intent(this, SumarActivity.class);
        startActivity(intent);
    }

    public void OpcResta(View v){
        Intent intent = new Intent(this, RestarActivity.class);
        startActivity(intent);
    }

    public void OpcDivision(View v){
        Intent intent = new Intent(this, DividirActivity.class);
        startActivity(intent);
    }

    public void OpcMultiplicar(View v){
        Intent intent = new Intent(this, MultiplicarActivity.class);
        startActivity(intent);
    }

    public void OpcCuadrado(View v){
        Intent intent = new Intent(this, CuadradoActivity.class);
        startActivity(intent);
    }

}