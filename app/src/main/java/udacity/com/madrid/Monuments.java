package udacity.com.madrid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Monuments extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city);


        ArrayList<City> city =new ArrayList<City>();

        city.add(new City("Plaza de Toros de las Ventas", "Plaza de Toros de Las Ventas (often shortened to Las Ventas) is a famous bullring located in Madrid, Spain.\n" +
                "Situated in the Guindalera quarter of the district of Salamanca, it was inaugurated on June 17, 1931. It has a seating capacity of 25,000.\n" +
                "This bullring was designed by the architect José Espeliú in the Neo-Mudéjar (Moorish) style with ceramic incrustations. The seats are situated in ten \"tendidos\". The price of the seats depends upon how close they are to the arena and whether they are in the sun or the shade (the latter being more expensive). The bullfighting season starts in March and ends in October; bullfights are held every day during the San Isidro Fiesta, and every Sunday or holiday during the season. Bullfights start at 6 or 7pm and last for two to three hours.\n" +
                "\"Las Ventas\" is located in the east of Madrid.", "+34 913 562 200", " From 9 to 18h ", "Calle Alcala 252, Madrid", R.drawable.ventas));

        city.add(new City("La Cibeles ", "The Plaza de Cibeles is a square with a neo-classical complex of marble sculptures with fountains that has become an iconic symbol for the city of Madrid. It sits at the intersection of Calle de Alcalá (running from east to west), Paseo de Recoletos (to the North) and Paseo del Prado (to the south). Plaza de Cibeles was originally named Plaza de Madrid, but in 1900, the City Council named it Plaza de Castelar, which was eventually replaced by its current name.\n" +
                "It is currently delimited by four prominent buildings: The Bank of Spain, the Palacio de Buenavista, the Palacio de Linares and the Cybele Palace. These constructions are located in four different neighbourhoods from three different adjacent districts: Centro, Retiro and Salamanca.\n" +
                "In the years Cybele Palace and her fountain have become symbolic monuments of the city.", "+34 917 01 22 10", " Outdoor monument", " Calle de Alcala 3 , Madrid", R.drawable.cibeles));


        city.add(new City("Museo del Prado", "The Prado Museum (Spanish pronunciation: [muˈseo ðel ˈpɾaðo]) is the main Spanish national art museum, located in central Madrid. It features one of the world's finest collections of European art, dating from the 12th century to the early 20th century, based on the former Spanish Royal Collection, and unquestionably the best single collection of Spanish art. Founded as a museum of paintings and sculpture in 1819, it also contains important collections of other types of works. El Prado is one of the most visited sites in the world, and is considered one the greatest museums of art in the world. The numerous works by Francisco de Goya, the single most extensively represented artist, as well as by Diego Velázquez, El Greco, Titian, Peter Paul Rubens and Hieronymus Bosch are some of the highlights of the collection."
                , "+34 91 330 2800", "From 10 to 20:00", "Calle Ruiz de Alarcón 23. Madrid.", R.drawable.prado));


        city.add(new City("Puerta del Sol", "The Puerta del Sol (Spanish for \"Gate of the Sun\") is a public square in Madrid, one of the best known and busiest places in the city. This is the centre (Km 0) of the radial network of Spanish roads. The square also contains the famous clock whose bells mark the traditional eating of the Twelve Grapes and the beginning of a new year. The New Year's celebration has been broadcast live on national television since 31 December 1962.",
                "+34 917 01 22 10", "Outdoor momument", "Plaza de la Puerta del Sol, s/n, 28013 Madrid", R.drawable.soldos));

        city.add(new City("Plaza Mayor", "The Plaza Mayor (English Main Square) was built during Philip III's reign (1598–1621) and is a central plaza in the city of Madrid, Spain. It is located only a few Spanish blocks away from another famous plaza, the Puerta del Sol. The Plaza Mayor is rectangular in shape, measuring 129 m × 94 m (423 ft × 308 ft), and is surrounded by three-story residential buildings having 237 balconies facing the Plaza. It has a total of nine entrance ways. The Casa de la Panadería (Bakery House), serving municipal and cultural functions, dominates the Plaza Mayor.",
                "+34 917 01 22 10 ", "Outdoor Monument", "Plaza Mayor, Madrid", R.drawable.plaza_mayor_dos));

        CityAdapter adapter = new CityAdapter(this, city);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);


    }}
