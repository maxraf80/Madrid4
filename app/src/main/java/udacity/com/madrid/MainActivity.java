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

        ImageView madrid = (ImageView)findViewById(R.id.madrid);
        madrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent madridIntent = new Intent(MainActivity.this, Monuments.class);
                startActivity(madridIntent);}});}}
