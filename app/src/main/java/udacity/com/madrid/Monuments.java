package udacity.com.madrid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Monuments extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city);

        ArrayList<City> city =new ArrayList<City>();

        city.add(new City("Plaza de Toros de las Ventas" , "Al contrario del pensamiento popular, el texto de Lorem Ipsum no es simplemente texto aleatorio. Tiene sus raices en una pieza clasica de la literatura del Latin, que data del año 45 antes de Cristo, haciendo que este adquiera mas de 2000 años de antiguedad." +
                " Richard McClintock, un profesor de Latin de la Universidad de Hampden-Sydney en Virginia, encontró una de las palabras más oscuras de la lengua ", "+954 6617 76", " De 9 a 14 De 17 a 20 h ", R.drawable.cibeles));

        city.add(new City("Plaza de Toros de las Ventas" , "Al contrario del pensamiento popular, el texto de Lorem Ipsum no es simplemente texto aleatorio. Tiene sus raices en una pieza clasica de la literatura del Latin, que data del año 45 antes de Cristo, haciendo que este adquiera mas de 2000 años de antiguedad." +
                " Richard McClintock, un profesor de Latin de la Universidad de Hampden-Sydney en Virginia, encontró una de las palabras más oscuras de la lengua ", "+954 6617 76", " De 9 a 14 De 17 a 20 h ", R.drawable.cibeles));


       CityAdapter adapter = new CityAdapter(this,city);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);


    }}
