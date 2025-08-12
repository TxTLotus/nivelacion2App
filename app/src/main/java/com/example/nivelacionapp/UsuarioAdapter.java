package com.example.nivelacionapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class UsuarioAdapter extends ArrayAdapter<Usuario> {
    private Context context;
    private List<Usuario> listaUsuarios;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

    public UsuarioAdapter(@NonNull Context context, List<Usuario> listaUsuarios) {
        super(context, 0, listaUsuarios);
        this.context=context;
        this.listaUsuarios = listaUsuarios;

    }
}
