package com.example.manuel.mascotas;
import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.manuel.mascotas.Mascota;
import com.example.manuel.mascotas.R;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Mascota> mascotas;

    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tool bar ver otro video
        Toolbar miActionBar=(Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas=(RecyclerView)findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        
        inicializarListaMascotas();
        iniciarlizaAdaptador();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mAbout:
                break;
            case R.id.mStings:
                break;
        }


        return super.onOptionsItemSelected(item);
    }

    public void irSegundaActividad(View v){

        Intent intent = new Intent(this,favoritas.class);
        startActivity(intent);
        //finish();
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.gatito, "Minino", 0));
        mascotas.add(new Mascota(R.drawable.perrito, "Pupy", 0));
        mascotas.add(new Mascota(R.drawable.perrito2,"Rufus",0));
        mascotas.add(new Mascota(R.drawable.perrito7, "Geico", 0));
        mascotas.add(new Mascota(R.drawable.perrito3, "Solovino", 0));
        mascotas.add(new Mascota(R.drawable.perrito8, "Solosefue", 0));

    }
    public MascotaAdaptador adaptador;
   public void iniciarlizaAdaptador(){
      MascotaAdaptador adapter = new MascotaAdaptador(mascotas,this);
       listaMascotas.setAdapter(adapter);


    }
}
