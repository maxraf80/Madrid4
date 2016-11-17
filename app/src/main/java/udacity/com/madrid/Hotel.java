package udacity.com.madrid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class Hotel extends AppCompatActivity{
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel);

        ArrayList<City> hotel= new ArrayList<City>();

        hotel.add(new City("Hotel Santo Mauro","Zurbano 36 ","914 41 45 00",5,R.drawable.santo_mauro));
        hotel.add(new City("Meninas Hotel","Campomanes, 7 ","915 41 28 05",4,R.drawable.meninas));
        hotel.add(new City("Adler Hotel","Velazquez 33","914 26 32 20",4,R.drawable.adler));
        hotel.add(new City("URSO Hotel & Spa","Mejía Lequerica 8","914 44 44 58",3,R.drawable.urso));
        hotel.add(new City("Hospes Puerta de Alcalá","Plaza de la Independencia, 3 ","914 32 29 11",5,R.drawable.hospes));
        hotel.add(new City("Abalu","Pez, 19","915 31 47 44",3,R.drawable.abalu));
        hotel.add(new City("Abascal","José Abascal, 47","914 41 00 15",4,R.drawable.abascal));
        hotel.add(new City("Abba Atocha ","Paseo Santa María de la Cabeza, 73","912 12 50 00",3,R.drawable.abba));
        hotel.add(new City("Emperador","Paseo de la Castellana, 220","915 47 28 00",4,R.drawable.emperador));
        hotel.add(new City("Diana Plus","Gran Vía , 54","915 07 20 40",4,R.drawable.diana));

        HotelAdapter adapter = new HotelAdapter(this,hotel);
        ListView listView=(ListView)findViewById(R.id.listthree);
        listView.setAdapter(adapter);



    }





}
