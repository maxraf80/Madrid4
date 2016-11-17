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

        transport.add(new City("Cabify","Cabify is an international transportation network company. It provides premium vehicles for hire via its smartphone mobile app. Vehicles are driven by their owners, who must pass a rigorous selection process. Operating in Latin America, Spain, and Portugal, the company offers two services, one for corporate clients and another for private passengers.[1][2][3]\n" +
                "\n" +
                "As one of the biggest transportation network companies in the Spanish- and Portuguese-speaking world. Cabify operates in Mexico, Chile, Colombia, Peru, Brazil, Panama, Ecuador, Portugal and Spain. In early 2016, Cabify reported over one million installations globally, of which the grand majority were in Latin America and the rest in Spain.","600 00 00 00","24 hours service","Whole Madrid Service", R.drawable.cabifydos));
        transport.add(new City("Car2Go","Car2go is a subsidiary of Daimler AG providing carsharing services in European and North American cities. The company offers exclusively Smart Fortwo and Mercedes-Benz vehicles and features one-way point-to-point rentals. Users are charged by the minute, with hourly and daily rates available.[1] The service forgoes the typical centralized rental office, and cars are user-accessed wherever parked via a downloadable smartphone app.[citation needed] As of October 2016, car2go is the largest carsharing company in the world with over 2,000,000 members ","911 30 94 73","24 hours service","Whitin the city centre", R.drawable.cartwogo));
        transport.add(new City("Taxi","Taxis can be hard to find during late hours on weekends, especially if there is some rain. Unlike in other European cities, there are few taxi stands; just stand by the side of a major road or bus stop and wave your hand to signal an available taxi passing by. Available taxis have a green libre sign in the windshield and a green light on top.\n" +
                "\n" +
                "Official taxis are white, and have a red stripe and the flag of Madrid on the front door. The tariff is displayed on top of the car (a 1 during daytime, a 2 during the night, which become 2 and 3 on holidays such as Christmas Eve).\n" +
                "\n" +
                "There are also special surcharges for entering or leaving the airport/train station. Ask for the written table of tariffs and charges (suplementos) (shown on small stickers on rear windows, compulsory by law) before paying if you think it's too expensive.\n" +
                "\n" +
                "Be aware there are some taxi drivers that will do what is called 'la vuelta al ruedo' which basically means they will drive you around or through the crowded avenues to increase the fare.","914 804 613","24 hours service","Whole Madrid Service", R.drawable.taxi));
        transport.add(new City("BiciMad","Opened by Ana Botella, mayor of Madrid, on June 23, 2014, the service began with 1560 bicycles with electric assistance to pedal and 123 charging stations. In 2015, an extension process was carried out, increasing the number of bases to 165, as well as the number of bicycles to 2028, which ended in July of that year. For the new service have been extended in 70 kilometers the ciclocalles and ciclocarriles in the urban center of the city.\n","010","24 hours service","Whitin the city centre", R.drawable.bicimad));

        CityAdapter adapter= new CityAdapter(this,transport);
        ListView   listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

    }}
