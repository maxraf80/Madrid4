package udacity.com.madrid;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CityAdapter extends ArrayAdapter <City> { public CityAdapter (Context context, ArrayList<City> city) {super(context,0,city);}


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView=convertView;

        if(listItemView==null){listItemView= LayoutInflater.from(getContext()).inflate(R.layout.city_list,parent,false);}
        City currentCity = getItem(position);

        TextView atractionName = (TextView) listItemView.findViewById(R.id.monument_name);
        atractionName.setText(currentCity.getAtraction());


        TextView description = (TextView) listItemView.findViewById(R.id.monument_text);
        description.setText(currentCity.getDescription());

        TextView telephone = (TextView) listItemView.findViewById(R.id.monument_telephone);
        telephone.setText(currentCity.getTelephone());

        TextView timetable = (TextView) listItemView.findViewById(R.id.monument_timetable);
        timetable.setText(currentCity.getTimetable());

        ImageView photo = (ImageView) listItemView.findViewById(R.id.monument_photo);
        photo.setImageResource(currentCity.getImageResourceId());



         return listItemView;}}






