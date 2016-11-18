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

        hotel.add(new City(getResources().getString(R.string.hotel_name1),getResources().getString(R.string.hotel_address1),getResources().getString(R.string.hotel_telephone1),5,R.drawable.santo_mauro));
        hotel.add(new City(getResources().getString(R.string.hotel_name2),getResources().getString(R.string.hotel_address2),getResources().getString(R.string.hotel_telephone2),4,R.drawable.meninas));
        hotel.add(new City(getResources().getString(R.string.hotel_name3),getResources().getString(R.string.hotel_address3),getResources().getString(R.string.hotel_telephone3),4,R.drawable.adler));
        hotel.add(new City(getResources().getString(R.string.hotel_name4),getResources().getString(R.string.hotel_address4),getResources().getString(R.string.hotel_telephone4),3,R.drawable.urso));
        hotel.add(new City(getResources().getString(R.string.hotel_name5),getResources().getString(R.string.hotel_address5),getResources().getString(R.string.hotel_telephone5),5,R.drawable.hospes));
        hotel.add(new City(getResources().getString(R.string.hotel_name6),getResources().getString(R.string.hotel_address6),getResources().getString(R.string.hotel_telephone6),3,R.drawable.abalu));
        hotel.add(new City(getResources().getString(R.string.hotel_name7),getResources().getString(R.string.hotel_address7),getResources().getString(R.string.hotel_telephone7),4,R.drawable.abascal));
        hotel.add(new City(getResources().getString(R.string.hotel_name8),getResources().getString(R.string.hotel_address8),getResources().getString(R.string.hotel_telephone8),3,R.drawable.abba));
        hotel.add(new City(getResources().getString(R.string.hotel_name9),getResources().getString(R.string.hotel_address9),getResources().getString(R.string.hotel_telephone9),4,R.drawable.emperador));
        hotel.add(new City(getResources().getString(R.string.hotel_name10),getResources().getString(R.string.hotel_address10),getResources().getString(R.string.hotel_telephone10),4,R.drawable.diana));

        HotelAdapter adapter = new HotelAdapter(this,hotel);
        ListView listView=(ListView)findViewById(R.id.listthree);
        listView.setAdapter(adapter);



    }}
