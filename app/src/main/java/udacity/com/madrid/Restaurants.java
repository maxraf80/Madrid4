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

        bussiness.add(new City(getResources().getString(R.string.restaurant_name1),getResources().getString(R.string.restaurant_address1),getResources().getString(R.string.restaurant_telephone1),getResources().getString(R.string.restaurant_timetable1), R.drawable.celso_y_manolo));
        bussiness.add(new City(getResources().getString(R.string.restaurant_name2),getResources().getString(R.string.restaurant_address2),getResources().getString(R.string.restaurant_telephone2),getResources().getString(R.string.restaurant_timetable2), R.drawable.taberna_pedraza));
        bussiness.add(new City(getResources().getString(R.string.restaurant_name3),getResources().getString(R.string.restaurant_address3),getResources().getString(R.string.restaurant_telephone3),getResources().getString(R.string.restaurant_timetable3), R.drawable.gabinoteca));
        bussiness.add(new City(getResources().getString(R.string.restaurant_name4),getResources().getString(R.string.restaurant_address4),getResources().getString(R.string.restaurant_telephone4),getResources().getString(R.string.restaurant_timetable4), R.drawable.macera));
        bussiness.add(new City(getResources().getString(R.string.restaurant_name5),getResources().getString(R.string.restaurant_address5),getResources().getString(R.string.restaurant_telephone5),getResources().getString(R.string.restaurant_timetable5), R.drawable.josealfredo));
        bussiness.add(new City(getResources().getString(R.string.restaurant_name6),getResources().getString(R.string.restaurant_address6),getResources().getString(R.string.restaurant_telephone6),getResources().getString(R.string.restaurant_timetable6), R.drawable.ardosa));
        bussiness.add(new City(getResources().getString(R.string.restaurant_name7),getResources().getString(R.string.restaurant_address7),getResources().getString(R.string.restaurant_telephone7),getResources().getString(R.string.restaurant_timetable7), R.drawable.doble));
        bussiness.add(new City(getResources().getString(R.string.restaurant_name8),getResources().getString(R.string.restaurant_address8),getResources().getString(R.string.restaurant_telephone8),getResources().getString(R.string.restaurant_timetable8), R.drawable.toma_cafe));
        bussiness.add(new City(getResources().getString(R.string.restaurant_name9),getResources().getString(R.string.restaurant_address9),getResources().getString(R.string.restaurant_telephone9),getResources().getString(R.string.restaurant_timetable9), R.drawable.fabrica_maravillas));
        bussiness.add(new City(getResources().getString(R.string.restaurant_name10),getResources().getString(R.string.restaurant_address10),getResources().getString(R.string.restaurant_telephone10),getResources().getString(R.string.restaurant_timetable10), R.drawable.la_dolores));


        BussinessAdapter adapter = new BussinessAdapter(this, bussiness);
        ListView listView = (ListView) findViewById(R.id.listtwo);
        listView.setAdapter(adapter);






    }
}
