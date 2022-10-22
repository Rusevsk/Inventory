package com.example.inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    /*public void agregarProducto(View view){
        Intent agregarProducto = new Intent(this, AgregarProductoActivity.class);
        startActivity(agregarProducto);
    }*/

    public void AgregarCliente(View view){
        Intent Nuevo= new Intent(this, NuevoActivity.class);
        startActivity(Nuevo);
    }

    public void MostrarCliente(View view){
        Intent Mostrar = new Intent(this, MainActivity.class);
        startActivity(Mostrar);
    }

    /*public void agregarProveedor(View view){
        Intent agregarProveedor= new Intent(this, AgregarProveedor.class);
        startActivity(agregarProveedor);
    }*/

    /*public void agregarSucursal(View view){
        Intent agregarSucursal= new Intent(this, AgregarSucursal.class);
        startActivity(agregarSucursal);
    }*/


}


