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

        museums.add(new City("Museo Africano","Arturo Soria 101","(+34) 91.415.24.12","Su: 11:30",R.drawable.african));
        museums.add(new City("Museo del Prado","Paseo Prado S/n","(+34) 91.330.28.00","Tu-Su: 10-20h",R.drawable.pradodos));
        museums.add(new City("Museo de Historia","Calle Fuencarral 78.","(+34)  91.701.18.63","Tu-Su: 10-20h",R.drawable.historia));
        museums.add(new City("museo Cerralbo","Ventura Rodríguez 17","(+34) 91.547.36.46","Tu-Su: 09:30 -15h",R.drawable.cerralbo));
        museums.add(new City("Museo de Bellas Artes","Alcalá 13","(+34) 91-524 08 64","Tu-Su: 10-15h",R.drawable.bellas_artes));
        museums.add(new City("Museo Thyssen","Paseo del Prado 8","(+34) 91.369.01.51","Mo: 12-16 Tu-Su: 10-19h",R.drawable.thyssen));
        museums.add(new City("Museo Romantico"," San Mateo 13.","(+34) 914 481 045 ","Tu-Su: 10-15h",R.drawable.romanticismo));

    BussinessAdapter adapter = new BussinessAdapter(this,museums);
    ListView listView = (ListView) findViewById(R.id.listtwo);
    listView.setAdapter(adapter);






    }}
