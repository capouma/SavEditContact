package com.example.findag.crearmodcontac;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


public class Activity1 extends Activity {
    ArrayList<Contactos> AgregaContac = new ArrayList<Contactos>();//ArrayList para introduccion de contactos
    Contactos contactos;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
        // Definimos el boton Agregar
        Button btbBoton = (Button) findViewById(R.id.btnAgrega); // Casteamos


        //Ahora definimos el listener onClick

        btbBoton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                EditText txvNombre = (EditText) findViewById(R.id.txvNombre);
                EditText txvtelf = (EditText) findViewById(R.id.txvTelefono);
                contactos = new Contactos(txvNombre.getText().toString(),Integer.parseInt(txvtelf.getText().toString()));
                AgregaContac.add(contactos);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
