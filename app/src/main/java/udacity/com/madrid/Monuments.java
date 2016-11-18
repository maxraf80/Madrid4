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

        city.add(new City(getResources().getString(R.string.monument_name1), getResources().getString(R.string.monument_definition1), getResources().getString(R.string.monument_telephone1), getResources().getString(R.string.monument_timetable1),getResources().getString(R.string.monument_address1) , R.drawable.ventas));
        city.add(new City(getResources().getString(R.string.monument_name2), getResources().getString(R.string.monument_definition2), getResources().getString(R.string.monument_telephone2), getResources().getString(R.string.monument_timetable2),getResources().getString(R.string.monument_address2), R.drawable.cibeles));
        city.add(new City(getResources().getString(R.string.monument_name3), getResources().getString(R.string.monument_definition3), getResources().getString(R.string.monument_telephone3), getResources().getString(R.string.monument_timetable3),getResources().getString(R.string.monument_address3), R.drawable.sol));
        city.add(new City(getResources().getString(R.string.monument_name4), getResources().getString(R.string.monument_definition4), getResources().getString(R.string.monument_telephone4), getResources().getString(R.string.monument_timetable4),getResources().getString(R.string.monument_address4), R.drawable.plaza_mayor_dos));

        CityAdapter adapter = new CityAdapter(this, city);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);


    }}
