package udacity.com.madrid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class BussinessAdapter extends ArrayAdapter<City> {
    public BussinessAdapter(Context context, ArrayList<City> bussiness) {
        super(context, 0, bussiness);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.bussiness_list, parent, false);
        }
        City currentCity = getItem(position);

        ImageView photo = (ImageView) listItemView.findViewById(R.id.localimage);
        photo.setImageResource(currentCity.getImageResourceId());

        TextView name = (TextView) listItemView.findViewById(R.id.bussinessname);
        name.setText(currentCity.getAtraction());

        TextView address = (TextView) listItemView.findViewById(R.id.address);
        address.setText(currentCity.getAddress());

        TextView telephone = (TextView) listItemView.findViewById(R.id.telephone);
        telephone.setText(currentCity.getTimetable());

        TextView timetable = (TextView) listItemView.findViewById(R.id.timetable);
        timetable.setText(currentCity.getTimetable());


        return listItemView;
    }
}
