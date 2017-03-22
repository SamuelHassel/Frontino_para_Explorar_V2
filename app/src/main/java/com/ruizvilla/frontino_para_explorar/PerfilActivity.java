package com.ruizvilla.frontino_para_explorar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {

    TextView tUsername, tCorreo;
    String username,correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Bundle extras = getIntent().getExtras(); // Extrae cosas desde el inten en login, tambien se copia en el perfil
        username = extras.getString("username",username);//
        correo = extras.getString("correo", correo);

        tUsername = (TextView) findViewById(R.id.tUsername);
        tCorreo = (TextView) findViewById(R.id.tCorreo);
        // Y cuando yo llame mi perfil mande estos dos datos

        //llenando las cajas de texto
        tUsername.setText(username);
        tCorreo.setText(correo);

    }
}