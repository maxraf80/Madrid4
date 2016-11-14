package udacity.com.madrid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bussiness);

        ArrayList<City> bussiness = new ArrayList<City>();

        bussiness.add(new City("Celso y Manolo", "Libertad, 1 ", "(+)34 91 531 80 79", "Mo to Su from 13 to 17 and 20 to 24 h", R.drawable.celso_y_manolo));
        bussiness.add(new City("Taberna Pedraza", "Ibiza, 38 ", "(+)34 91 032 72 00", "Mo to Su from 13 to 16:30 and 20:30 to 24 h", R.drawable.gabinoteca));
        bussiness.add(new City("La Gabinoteca", "Fernández de la Hoz, 53 ", "(+)34 91 399 15 00", "Mo to Th. from 11 a 01 h Fr-Sat 11 to 02h Su  11 to 01h.", R.drawable.macera));
        bussiness.add(new City("Macera", "San Mateo, 21 ", "(+)34 91 531 80 82", "Mo to Th. from 11 a 01 h Fr-Sat 11 to 02h Su  11 to 01h.", R.drawable.taberna_pedraza));
        bussiness.add(new City("Josealfredo Bar", "Silva, 22 ", "(+)34 91 521 49 60", "Tu to We. from 13 a 01 h We-Sat 13 to 02h Su  13 to 23h.", R.drawable.josealfredo));
        bussiness.add(new City("La Ardosa", "Colón, 13 ", "(+)34 91 521 49 79", "Mo to Fr. from 08:30 a 02 h Sat to Su 11:45 to 02:30h ", R.drawable.ardosa));
        bussiness.add(new City("El Doble", "Ponzano, 58 ", "(+)34 91 441 47 18", "Tu to We. from 13 a 01 h We-Sat 13 to 02h Su  13 to 23h.", R.drawable.doble));
        bussiness.add(new City("Toma Café", "Palma, 49 ", "(+)34 91 702 56 20", "Mo to Fr. from 08:30 a 02 h Sat to Su 11:45 to 02:30h ", R.drawable.toma_cafe));
        bussiness.add(new City("Fábrica Maravillas", "Valverde, 29 ", "(+)34 91 521 87 53", "Mo to Fr. from 08:30 a 02 h Sat to Su 11:45 to 02:30h ", R.drawable.fabrica_maravillas));
        bussiness.add(new City("La Dolores", "Plaza de Jesús, 4 ", "(+)34 91 429 22 43", "Mo to Th. from 11 a 01 h Fr-Sat 11 to 02h Su  11 to 01h.", R.drawable.la_dolores));


        CityAdapter adapter = new CityAdapter(this, bussiness);
        ListView listView = (ListView) findViewById(R.id.listtwo);
        listView.setAdapter(adapter);


    }
}
