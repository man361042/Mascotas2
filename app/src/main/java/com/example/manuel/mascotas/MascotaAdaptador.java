package com.example.manuel.mascotas;

/**
 * Created by manuel on 23/05/16.
 */
import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.manuel.mascotas.Mascota;
import com.example.manuel.mascotas.R;

import java.util.ArrayList;

/**
 * Created by manuel on 22/05/16.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {
    ArrayList<Mascota> mascotas;
    Activity activity;
    //public int n;

    public MascotaAdaptador(ArrayList<Mascota> mascotas,Activity activity){
        this.mascotas=mascotas;
        this.activity=activity;
    }


    //inflar el layout y lo pasara al viewholder para el obtenga los views
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(v);
    }
    //asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota= mascotas.get(position);
        mascotaViewHolder.imgFotoMascota.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombre.setText("Nombre: "+mascota.getNombre());
        mascotaViewHolder.tvLike.setText("Likes: " + String.valueOf(mascota.getNumeroLike()));//mascota.getNumeroLike());

        //al hacre click
        mascotaViewHolder.imgFotoMascota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Hola Me Llamo "+mascota.getNombre()+" Y tengo "+ mascota.getNumeroLike()+ " Likes",Toast.LENGTH_SHORT).show();
            }
        });

        mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n;
                n=mascota.getNumeroLike();
                n++;
                mascota.setNumeroLike(n);
                Toast.makeText(activity,"Total de Likes:  "+String.valueOf(mascota.getNumeroLike()),Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {// cantidad de elementos que contiene mi lista
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFotoMascota;
        private TextView tvNombre;
        private TextView tvLike;
        private ImageButton btnLike;



        public MascotaViewHolder(View itemView) {
            super(itemView);

            imgFotoMascota  =(ImageView)itemView.findViewById(R.id.imgFotoMascota);
            tvNombre        =(TextView)itemView.findViewById(R.id.tvNombre);
            tvLike=(TextView)itemView.findViewById(R.id.tvLike);
            btnLike=(ImageButton)itemView.findViewById(R.id.btnlike);

        }
    }
}
