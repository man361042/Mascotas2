package com.example.manuel.mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class favoritas extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritas);

        Toolbar miActionBar=(Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);



        //miActionBar.setNavigationOnClickListener(new View.OnClickListener() {
          //  @Override
        //    public void onClick(View v) {


       //     }
     //   });



        listaMascotas=(RecyclerView)findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        iniciarlizaAdaptador();

    }


   public void irMainActivity(View v){
       Intent intent2 = new Intent(this,MainActivity.class);
       startActivity(intent2);
      finish();
   }
    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.perrito7, "Geico", 100));
        mascotas.add(new Mascota(R.drawable.perrito3, "Solovino", 98));
        mascotas.add(new Mascota(R.drawable.gatito, "Minino", 45));
        mascotas.add(new Mascota(R.drawable.perrito, "Pupy", 30));
        mascotas.add(new Mascota(R.drawable.perrito2, "Rufus", 9));



    }
    public MascotaAdaptador adaptador;
    public void iniciarlizaAdaptador(){
        MascotaAdaptador adapter = new MascotaAdaptador(mascotas,this);
        listaMascotas.setAdapter(adapter);


    }

}
