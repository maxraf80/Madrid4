package udacity.com.madrid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Museums extends AppCompatActivity{

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bussiness);

        ArrayList<City> museums = new ArrayList<>();

        museums.add(new City(getResources().getString(R.string.museums_name1),getResources().getString(R.string.museums_address1),getResources().getString(R.string.museums_telephone1),getResources().getString(R.string.museums_timetable1),R.drawable.african));
        museums.add(new City(getResources().getString(R.string.museums_name2),getResources().getString(R.string.museums_address2),getResources().getString(R.string.museums_telephone2),getResources().getString(R.string.museums_timetable2),R.drawable.pradodos));
        museums.add(new City(getResources().getString(R.string.museums_name3),getResources().getString(R.string.museums_address3),getResources().getString(R.string.museums_telephone3),getResources().getString(R.string.museums_timetable3),R.drawable.historia));
        museums.add(new City(getResources().getString(R.string.museums_name4),getResources().getString(R.string.museums_address4),getResources().getString(R.string.museums_telephone4),getResources().getString(R.string.museums_timetable4),R.drawable.cerralbo));
        museums.add(new City(getResources().getString(R.string.museums_name5),getResources().getString(R.string.museums_address5),getResources().getString(R.string.museums_telephone5),getResources().getString(R.string.museums_timetable5),R.drawable.bellas_artes));
        museums.add(new City(getResources().getString(R.string.museums_name6),getResources().getString(R.string.museums_address6),getResources().getString(R.string.museums_telephone6),getResources().getString(R.string.museums_timetable6),R.drawable.thyssen));
        museums.add(new City(getResources().getString(R.string.museums_name7),getResources().getString(R.string.museums_address7),getResources().getString(R.string.museums_telephone7),getResources().getString(R.string.museums_timetable7),R.drawable.romanticismo));

    BussinessAdapter adapter = new BussinessAdapter(this,museums);
    ListView listView = (ListView) findViewById(R.id.listtwo);
    listView.setAdapter(adapter);






    }}
