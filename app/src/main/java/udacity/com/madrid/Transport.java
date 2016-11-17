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

        transport.add(new City("Cabify","  Cabify is an international transportation network company. It provides premium vehicles for hire via its smartphone mobile app. Vehicles are driven by their owners, who must pass a rigorous selection process. Operating in Latin America, Spain, and Portugal, the company offers two services, one for corporate clients and another for private passengers.[1][2][3]\n" +
                "\n" +
                "As one of the biggest transportation network companies in the Spanish- and Portuguese-speaking world. Cabify operates in Mexico, Chile, Colombia, Peru, Brazil, Panama, Ecuador, Portugal and Spain. In early 2016, Cabify reported over one million installations globally, of which the grand majority were in Latin America and the rest in Spain.","600 00 00 00","24 hours service","Whole Madrid Service", R.drawable.cabifydos));
        transport.add(new City("Car2Go","The car2go app is the key ","911 30 94 73","24 hours service","Whitin the city centre", R.drawable.cartwogo));
        transport.add(new City("Taxi","Madrid is served by highly d","914 804 613","24 hours service","Whole Madrid Service", R.drawable.taxi));
        transport.add(new City("BiciMad","Inaugurated by Ana Botell","010","24 hours service","Whitin the city centre", R.drawable.bicimad));

        CityAdapter adapter= new CityAdapter(this,transport);
        ListView   listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }}
