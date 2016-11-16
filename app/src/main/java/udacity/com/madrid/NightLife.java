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

        nightLife.add(new City("Arts Club", "Velalquez 96", " (+34) 91 277 03 65", "Th-Sa 19:00-02:00", R.drawable.arts));
        nightLife.add(new City("The Principal", "Marqués de Valdeiglesias, 1 ", " (+34) 91 532 94 96", "Mo-Su 19:00-02:00", R.drawable.principal));
        nightLife.add(new City("Taüer ", " Camino de la Zarzuela 17", " (+34) 91 340 88 40", "Tu-Su 18:00-02:00", R.drawable.tauer));
        nightLife.add(new City("Chatarra Cockatail Bar", "Santa Teresa, 8", " (+34) 91 116 86 66", "We-Su 18:00 -03:00", R.drawable.chatarra));
        nightLife.add(new City("Macera", "San Mateo, 21 ", " (+34) 91 531 80 82", "Mo-Th 11-01 h Fr-Sat 11 - 02h", R.drawable.macera));
        nightLife.add(new City("Tatel Madrid", "Paseo de la Castellana 36", " (+34) 91 172 18 41", "We-Su 18:00 -03:00", R.drawable.tatel));

        BussinessAdapter adapter = new BussinessAdapter(this, nightLife);
        ListView listView = (ListView) findViewById(R.id.listtwo);
        listView.setAdapter(adapter);


    }}
