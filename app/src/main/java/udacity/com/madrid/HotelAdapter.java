package udacity.com.madrid;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class HotelAdapter extends ArrayAdapter<City>{public HotelAdapter
        (Context context, ArrayList<City>city){super(context,0,city);}


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView=convertView;

        if(listItemView==null){listItemView= LayoutInflater.from(getContext()).inflate(R.layout.hotel_list,parent,false);}

        City currentCity= getItem(position);

        TextView atractionName = (TextView) listItemView.findViewById(R.id.bussinessname);
        atractionName.setText(currentCity.getAtraction());

        TextView  address =(TextView)listItemView.findViewById(R.id.address);
        address.setText(currentCity.getAddress());

        TextView telephone=(TextView)listItemView.findViewById(R.id.telephone);
        telephone.setText(currentCity.getTelephone());

        ImageView photoHotel =(ImageView)listItemView.findViewById(R.id.hotelimage);
        photoHotel.setImageResource(currentCity.getImageResourceId());

        RatingBar points = (RatingBar) listItemView.findViewById(R.id.puntuacion);
        points.setRating((float) currentCity.getValutation());

        return listItemView; }}
