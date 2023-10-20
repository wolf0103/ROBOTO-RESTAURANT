package com.example.novoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.listaPratos);
        ArrayList<Restaurante> pratos = adicionarPratos();
        ArrayAdapter adapter = new RestauranteAdapter(this, pratos);
        lista.setAdapter(adapter);



        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("nome", pratos.get(i).getTxtlasanha());
                intent.putExtra("nome2", pratos.get(i).getDlasanha());

                startActivity(intent);


            }


        });



    }

    public ArrayList<Restaurante> adicionarPratos() {
        ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();
        Restaurante e = new Restaurante("Acompanha arroz, feijão, lasanha e salada",
                "Lasanha", R.drawable.lasanha);
                restaurantes.add(e);
        e = new Restaurante("Acompanha arroz",
                "Sopa de Lentilha", R.drawable.images);
        restaurantes.add(e);
        e = new Restaurante("Acompanha arroz, feijão, Bife a parmegiana e salada",
                "Bife á paramegiana", R.drawable.bifep);
        restaurantes.add(e);
        e = new Restaurante("Acompanha arroz, feijão, frango a milanesa e salada",
                "Frango a milanesa", R.drawable.frango);
        restaurantes.add(e);

        e = new Restaurante("Acompanha arroz, feijoada e couve",
                "Feijoada", R.drawable.feijoada);
        restaurantes.add(e);
        return restaurantes;
    }



}