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

        transport.add(new City(getResources().getString(R.string.transport_name),getResources().getString(R.string.transport_definition1),getResources().getString(R.string.transport_telephone1),getResources().getString(R.string.transport_timetable1),getResources().getString(R.string.transport_address1), R.drawable.cabifydos));
        transport.add(new City(getResources().getString(R.string.transport_name2),getResources().getString(R.string.transport_definition2),getResources().getString(R.string.transport_telephone2),getResources().getString(R.string.transport_timetable1),getResources().getString(R.string.transport_address2), R.drawable.cartwogo));
        transport.add(new City(getResources().getString(R.string.transport_name3),getResources().getString(R.string.transport_definition3),getResources().getString(R.string.transport_telephone3),getResources().getString(R.string.transport_timetable1),getResources().getString(R.string.transport_address2), R.drawable.taxi));
        transport.add(new City(getResources().getString(R.string.transport_name4),getResources().getString(R.string.transport_definition4),getResources().getString(R.string.transport_telephone4),getResources().getString(R.string.transport_timetable1),getResources().getString(R.string.transport_address1), R.drawable.bicimad));

        CityAdapter adapter= new CityAdapter(this,transport);
        ListView   listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);


    }}
