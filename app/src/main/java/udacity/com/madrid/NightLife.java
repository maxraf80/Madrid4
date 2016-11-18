package udacity.com.madrid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NightLife extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bussiness);

        ArrayList<City> nightLife = new ArrayList<>();

        nightLife.add(new City(getResources().getString(R.string.club_name1),getResources().getString(R.string.club_address1),getResources().getString(R.string.club_telephone1),getResources().getString(R.string.club_timetable1), R.drawable.arts));
        nightLife.add(new City(getResources().getString(R.string.club_name2),getResources().getString(R.string.club_address2),getResources().getString(R.string.club_telephone2),getResources().getString(R.string.club_timetable2), R.drawable.principal));
        nightLife.add(new City(getResources().getString(R.string.club_name3),getResources().getString(R.string.club_address3),getResources().getString(R.string.club_telephone3),getResources().getString(R.string.club_timetable3), R.drawable.tauer));
        nightLife.add(new City(getResources().getString(R.string.club_name4),getResources().getString(R.string.club_address4),getResources().getString(R.string.club_telephone4),getResources().getString(R.string.club_timetable4), R.drawable.chatarra));
        nightLife.add(new City(getResources().getString(R.string.club_name5),getResources().getString(R.string.club_address5),getResources().getString(R.string.club_telephone5),getResources().getString(R.string.club_timetable5), R.drawable.macera));
        nightLife.add(new City(getResources().getString(R.string.club_name6),getResources().getString(R.string.club_address6),getResources().getString(R.string.club_telephone6),getResources().getString(R.string.club_timetable6), R.drawable.tatel));

        BussinessAdapter adapter = new BussinessAdapter(this, nightLife);
        ListView listView = (ListView) findViewById(R.id.listtwo);
        listView.setAdapter(adapter);


    }}
