package com.ruizvilla.frontino_para_explorar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.mCerrar:
                intent = new Intent (MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.mMiPerfil:
                intent = new Intent (MainActivity.this, PerfilActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item); //
    }
}

