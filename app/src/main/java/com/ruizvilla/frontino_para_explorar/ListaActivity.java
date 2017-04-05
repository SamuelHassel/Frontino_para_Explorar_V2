package com.ruizvilla.frontino_para_explorar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListaActivity extends AppCompatActivity {
// Nuevo adapador




    ListView listView;
    //String[] data = new String[]{"Casa vieja", "Chaquenoda", "La casona"};
    //La anterior lista se comenta para tomar la info desde la clase Lista enttrada

    private Lista_Entrada[] datos = new Lista_Entrada[]{
            // Esto es un arreglos con indices desde cero
            new Lista_Entrada(R.drawable.r1, "El Artista", "Parque con canchas multiples", "Cra 52d Cll 60"),
            new Lista_Entrada(R.drawable.r2, "Chimeneas", "Parque para disfrutar en familia", "Cll 15Sur Cra 52d"),
            new Lista_Entrada(R.drawable.r3, "Principal", "Parque principal de Itagui", "Cll 50 Cra 51")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        // Ojo la palabra data aca la puse como datos y es el argumento que se ve abajo
        listView = (ListView) findViewById(R.id.lista);
       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, datos);
        Adapter adapter = new Adapter(this, datos);
        listView.setAdapter(adapter);
    }
 //NECESITO TOMAR ESTA INFORMACION Y ADAPTARLA CON UN ADAPTADOR ENTONCES SE CREARA CLASE ADAPADOR

    class  Adapter extends  ArrayAdapter<Lista_Entrada>{
        public Adapter(@NonNull Context context, Lista_Entrada[] datos){
            super(context, R.layout.list_item, datos); // Super es el colocador
            // Esta es la primera parte del constructor y donde se indica donde quedaran los dartos
        }
// Con Control + o  esque saco estos metodos o codigos
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.list_item,null);

            TextView nombre = (TextView) item.findViewById(R.id.tNombre);
            nombre.setText(datos[position].getNombre());

            TextView descrip = (TextView) item.findViewById(R.id.tDescrip);
            descrip.setText(datos[position].getDescrip());

            TextView direcc = (TextView) item.findViewById(R.id.tDirec);
            direcc.setText(datos[position].getDirect());

            ImageView imagen = (ImageView) item.findViewById(R.id.iFoto);
            imagen.setImageResource(datos[position].getIdImagen());

            return item;
        }
    }






}



