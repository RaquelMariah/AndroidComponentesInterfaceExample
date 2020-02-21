package com.ramaria.androidcomponentesinterfaceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        TextView textoResultado = findViewById(R.id.textoResultado);

    }

    public void enviar (View view){

        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();


        textoResultado.setText( "nome: " + nome + " email: " + email );

    }

    public void limpar(View view){

        campoNome.setText("");
        campoEmail.setText("");
    }
}
