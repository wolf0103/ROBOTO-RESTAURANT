package com.example.novoo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestauranteAdapter extends ArrayAdapter<Restaurante> {
    private final Context context;
    private final ArrayList<Restaurante> elementos;
    public RestauranteAdapter(Context context, ArrayList<Restaurante> elementos) {
        super(context, R.layout.linha, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linha, parent,false);

        TextView Dlasanha = (TextView) rowView.findViewById(R.id.DLasanha);
        TextView txtlasanha = (TextView) rowView.findViewById(R.id.txtlasanha);
        ImageView Plasanha = (ImageView) rowView.findViewById(R.id.Plasanha);
        Dlasanha.setText(elementos.get(position).getDlasanha());
        txtlasanha.setText(elementos.get(position).getTxtlasanha());
        Plasanha.setImageResource(elementos.get(position).getPlasanha());
        return rowView;
    }

}
