package udacity.com.madrid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Transport extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.city);


        ArrayList<City> transport = new ArrayList<City>();

        transport.add(new City("Cabify","  dfdfde","600 00 00 00","24 hours service","Whole Madrid Service", R.drawable.cabify));
        transport.add(new City("Car2Go","The car2go app is the key ","911 30 94 73","24 hours service","Whitin the city centre", R.drawable.cartwogo));
        transport.add(new City("Taxi","Madrid is served by highly d","914 804 613","24 hours service","Whole Madrid Service", R.drawable.taxi));
        transport.add(new City("BiciMad","Inaugurated by Ana Botell","010","24 hours service","Whitin the city centre", R.drawable.bicimad));

        CityAdapter adapter= new CityAdapter(this,transport);
        ListView   listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }}
