package com.example.aula_01.revisaogeral.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.aula_01.revisaogeral.R;

import java.util.List;
import java.util.zip.Inflater;

import static android.support.design.widget.BottomSheetBehavior.from;

public class KaioAdapter extends RecyclerView.Adapter<KaioAdapter.ViewHolder>{

     private List<KaioAdapter>listaLivros;


    public KaioAdapter(List<KaioAdapter>listaLivros) {
        this.listaLivros = listaLivros;

    }


    @NonNull
    @Override
    public KaioAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutRecycler = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main,parent,false);
        return new KaioAdapter(layoutRecycler);
    }

    @Override
    public void onBindViewHolder(@NonNull KaioAdapter.ViewHolder holder, int position) {
        holder.titulo.setText(listaLivros.get(position).getItemCount());

    }

    @Override
    public int getItemCount() {
        return listaLivros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView titulo;
        TextView Autor;


        public ViewHolder(View itemView) {
            super(itemView);

            titulo = (TextView) itemView.findViewById(R.id.Text1);
            Autor = (TextView) itemView.findViewById(R.id.text2);

        }
    }
}


