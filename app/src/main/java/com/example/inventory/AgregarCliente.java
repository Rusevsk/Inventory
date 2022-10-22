package com.example.inventory;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.inventory.db.DbClientes;

public class AgregarCliente extends AppCompatActivity {

    EditText c_nombre,Cedula, Fecha, Correo, Telefono;
    Spinner c_estado;
    Button c_guardar,btn_mostrarcliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agregar_cliente);

        //busqueda de controles

        c_nombre = findViewById(R.id.c_nombre);
        //c_estado = (Spinner) findViewById(R.id.c_estado);
        Cedula = findViewById(R.id.C_cedula);
        //Fecha = findViewById(R.id.c_fecha);
        Correo =  findViewById(R.id.c_correo);
        Telefono = findViewById(R.id.c_telefono);

        c_guardar = findViewById(R.id.c_guardar);
        /*btn_mostrarcliente = (Button) findViewById(R.id.btn_mostrarcliente);
        btn_mostrarcliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AgregarCliente.this, ListadoCliente.class));
            }
        });*/

        c_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //guardar(c_nombre.getText().toString(),c_estado.getText().toString());
                if (!c_nombre.getText().toString().equals("") && !Telefono.getText().toString().equals("")) {
                    DbClientes dbCLientes = new DbClientes(AgregarCliente.this);
                    long id = dbCLientes.insertarContacto(c_nombre.getText().toString(),Telefono.getText().toString(), Correo.getText().toString());

                    if (id > 0) {
                        Toast.makeText(AgregarCliente.this, "REGISTRO GUARDADO", Toast.LENGTH_LONG).show();
                        limpiar();
                    } else {
                        Toast.makeText(AgregarCliente.this, "ERROR AL GUARDAR REGISTRO", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(AgregarCliente.this, "DEBE LLENAR LOS CAMPOS OBLIGATORIOS", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void limpiar() {
        c_nombre.setText("");
        Cedula.setText("");
        Fecha.setText("");
        Correo.setText("");
        Telefono.setText("");
    }


}
