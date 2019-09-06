package com.example.agenda.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.example.agenda.MainActivity;
import com.example.agenda.R;

public class TelaCarregamento extends AppCompatActivity {

    private ImageView gifRobo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_carregamento);

        //gifRobo = findViewById(R.id.gifRobo);

       /* Glide.with(this)
                .load("https://media0.giphy.com/media/MkcgltZ9e1UI/giphy.gif")
                .into(gifRobo);*/

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                telaLogin();
            }
        }, 3000);

    }

    private void telaLogin() {
        Intent intent = new Intent(TelaCarregamento.this, MainActivity.class);
        startActivity(intent);

        finish();
    }

    @Override  //Bloqueia o Botão de voltar do celular
    public void onBackPressed() {

    }
}
