package com.dellead;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ToggleButton BotaoToggle = (ToggleButton) findViewById(R.id.botaotoggle);
        BotaoToggle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View toggle) {

            }

        });


        Button Cadastro = (Button) findViewById(R.id.cadastro);
        Cadastro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View cadastrar) {

                Toast.makeText(getApplicationContext(), "Usuário Cadastrado com Sucesso!", Toast.LENGTH_SHORT).show();

            }

        });

    }
}
