package com.example.aplicacionrepaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView txtSaludo;
    private Button btnSaludar;
    private Button btnReset;
    private EditText txtNombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializacionVistas();

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtNombre.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity.this, "Pon un Nombre imbecil", Toast.LENGTH_SHORT).show();
                }else{
                    String Nombre = txtNombre.getText().toString();
                    txtSaludo.setText("Hola "+Nombre+" subnormal");
                }
            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNombre.setText("");
                txtSaludo.setText("");
                Toast.makeText(MainActivity.this, "Borrado", Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void inicializacionVistas() {
        txtSaludo = findViewById(R.id.lblSaludoMain);
        btnReset = findViewById(R.id.btnReset);
        btnSaludar = findViewById(R.id.btnSaludarMain);
        txtNombre = findViewById(R.id.TxtNombreMain);
    }
}