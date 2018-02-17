package com.example.fabio.esempio5b;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.fabio.myapplication.Main2Activity;

public class MainActivity extends AppCompatActivity {

    Button button;
    int x=0;
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null){
            x=savedInstanceState.getInt("numero");
        }

        Button vaia=findViewById(R.id.buttonVaia);
        vaia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("x",x);
                startActivity(i);
            }
        });
        // Recupero il puntatore all'elemento grafico
        button = findViewById(R.id.grecoButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Boh",getString(R.string.hello_world));
                x=x+1;
                Toast t=  Toast.makeText(getApplicationContext(),""+x,Toast.LENGTH_SHORT);
                t.show();
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ciclo di vita","sono in onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo di vita","sono in onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ciclo di vita","sono in onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ciclo di vita","sono in onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ciclo di vita","sono in onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ciclo di vita","sono in onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("numero",x);
        super.onSaveInstanceState(outState);
        System.out.println("ciao");
    }

}
