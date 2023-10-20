package com.example.novoo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String parametro = (String) intent.getSerializableExtra("nome");
        String descricao = (String) intent.getSerializableExtra("nome2");


       TextView nome = (TextView) findViewById(R.id.txtNome);
        TextView nome2 = (TextView) findViewById(R.id.textdescr);


       nome.setText(parametro);
        nome2.setText(descricao);





    }
}