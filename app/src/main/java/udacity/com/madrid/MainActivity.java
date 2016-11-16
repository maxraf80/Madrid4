package udacity.com.madrid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView madrid = (ImageView) findViewById(R.id.madrid);
        madrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent madridIntent = new Intent(MainActivity.this, Monuments.class);
                startActivity(madridIntent);
            }
        });

        ImageView paella = (ImageView) findViewById(R.id.food);
        paella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, Restaurants.class);
                startActivity(foodIntent);
            }
        });

        ImageView hotel = (ImageView) findViewById(R.id.hotel);
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelIntent = new Intent(MainActivity.this, Hotel.class);
                startActivity(hotelIntent);
            }
        });

        ImageView nightlife = (ImageView) findViewById(R.id.nightlife);
        nightlife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nightLifeIntent = new Intent(MainActivity.this, NightLife.class);
                startActivity(nightLifeIntent);
            }
        });

        ImageView museums = (ImageView) findViewById(R.id.museums);
        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museumsIntent = new Intent(MainActivity.this, Museums.class);
                startActivity(museumsIntent);}});


    ImageView transport = (ImageView) findViewById(R.id.taxi);
    transport.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        Intent transportIntent =new Intent(MainActivity.this,Transport.class);
        startActivity(transportIntent);
        }
    });



    }}
