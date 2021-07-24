package com.example.indiantouristry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class BeachActivity extends AppCompatActivity {

    GridView gridView;
    String[] placeNames = {"Rock Beach","RK Beach","Kovalam Beach","Colva Beach","Nogli Beach","Golden Beach","Jalandhar Beach","Digha Beach"};
    int[] placeImages = {R.drawable.beach1,R.drawable.beach2,R.drawable.beach3,R.drawable.beach4,R.drawable.beach5,R.drawable.beach6,R.drawable.beach7,R.drawable.beach8};
    String[] placeMatter={"ROCK BEACH IN WHITE TOWN, PONDICHERRY(4.6⭐)\n"+"\n"+ "As the name suggests, this rocky beach is perfect for idling, watching the waves crash against the rocks, and shooting memorable photos. You can also satiate hunger pangs at the nearby cafes.\n" + " Best time to visit: November to March\n" + " How to reach–\n" + "• By Air: Puducherry Airport is 7 km away. You can take a taxi or auto from there.\n" + "• By Train: Puducherry Railway station is at 2 km.\n" + "• By Road: The beach is 3 km from Pondicherry Bus Stand.",
            "RAMAKRISHNA BEACH, VISHAKAPATNAM(4.5⭐)\n\n" + "The Ramakrishna beach is a beautiful spot for relaxation" + "and pleasure is a natural beautic scene. There is an imposing" + "Kali Temple near this beach. The aquarium here is an added " + "attraction. The roaring sounds of sea gives enormous" + "pleasure.\n" + "How to Reach :\n" + " • Ramakrishna Beach is located at a distance of 18 km from" + "the Visakhapatnam International Airport.\n" + " • Ramakrishna Beach is located at a distance of 5 km from" + "the Visakhapatnam Railway Station.\n" + " • Ramakrishna Beach is located at a distance of 5 km from" + "the RTC complex.\n"+" People can reach the destination by bus," + "auto or cab.",
            "KOVALAM BEACH IN TRIVANDRUM, KERALA(4.0⭐) \n \n" + "Kovalam Beach is a pristine affair, with its black sand and tall lighthouses creating a calm atmosphere. It is perfect for photography and long, leisurely walks.\n" + "Best time to visit: November to February\n" + "How to reach–\n" + " • By Air: Trivandrum International Airport is 16 km from the beach. You can then take a taxi.\n" + " • By Train: Thiruvananthapuram Central Railway \n" + "Station is the closest railhead (at 16 km).\n" + " • By Road: Kovalam bus stand is 4 km from the beach, and buses from different parts of Kerala ply to Kovalam.",
            "COLVA BEACH IN SOUTH GOA(4.3⭐) \n\n" + "As the oldest and largest beach in Goa, Colva Beach stuns with lofty palms and a 2.4 km stretch. Thanks to the fine powdery white sand, it practically transports you to Greece.\n" + "Best time to visit: November to February\n" + "How to reach–\n" + " • By Air: Goa International Airport is 24 km away. Once you fly there, you can get a taxi.\n" + " • By Train: Margao Railway Station is at a distance of 8 km.\n" + " • By Road: Panaji Bus Stand is 33 km away.",
            "NOGLI BEACH - PARK IN SHIMLA, INDIA(4.1⭐) \n\n" + "This place has been awarded with 2 trophies in the following categories:\n" + "✅ Top Rated Beach in Shimla\n" + "✅ Most Reviewed Beach in Shimla\n" +"Address:\n"+ "Bushahr Regency, National Highway 22, Rampur Bushahr, Himachal Pradesh 172001, India\n" + "Rating on Google Maps - 4.20 (179 Reviews)\n",
            "BLUE FLAG GOLDEN BEACH IN PURI,ODISHA(4.5⭐)\n\n" + "The newly opened Golden Beach in Puri has recently bagged India’s Cleanest Beach title. It is 870 m long, well maintained, safe and beautiful.\n" + "Best time to visit: October to February\n" + "How to reach–\n" + " • By Air: Biju Patnaik International Airport is the nearest airport (at 56 km), and cabs and buses are available from there.\n" + " • By Train: Puri Railway Station is the nearest railway station (at 2 km), and you can take a cab from there.\n" + " • By Road: Travelling from Bhubaneswar (the capital city) to Puri via road is easy. It takes around one hour.",
            "JALANDHAR BEACH, DIU AND DAMAN(4.4⭐) \n\n" + "This beach is located a kilometre away from the city, and yet it is a quiet and sparsely crowded beach in Diu. The beach was named after the mythological Hindu demon Jalandhar whose shrine is located on a hillock, close to the beach. A temple dedicated to goddess Chandrikais is also here. The beach has a few private resorts, perfect for a stay on the beach, quite literally. There are plenty of water-sports that are hosted as part of the attraction. You can expect tranquillity amidst the swaying palm trees, the cool ocean breeze and the soft sand under your feet. One of the more romantic things you must do is experience the beachfront dining with the spectacular sea-view.\n" + "Location: Near Naida Caves, Diu, Daman and Diu 362520\n" + "Price- No entry fee, the activities, however, are to be paid for.\n" + "Timing: 6am - 6pm\n" + "Best Time to Visit: October – February",
            "DIGHA BEACH, WEST BENGAL(4.4⭐)\n" + "Digha Beach, located in Purba Medinipur, is one of the few beaches in West Bengal, and for that reason, is extremely popular with its inhabitants. The golden rays of the sun reflecting on the sparkling sea is a sight to behold. Along with that, the beach is also popular for swimming. The shallow and calm water allows tourists to enjoy swimming at Digha Beach. The casuarina trees lined up on the shore create a picturesque landscape.\n" + "Location:\n" + "Midnapore, West Bengal, India.\n" + "Opening & Closing Timings:\n" + "For tourists, Digha Beach remains open all days a week. One can visit the place on any day from Sunday to Saturday.\n"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beach);

        gridView = findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(getApplicationContext(),GridActivity.class);
                intent.putExtra("name",placeNames[i]);
                intent.putExtra("image",placeImages[i]);
                intent.putExtra("matter",placeMatter[i]);
                startActivity(intent);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return placeImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);

            TextView name = view1.findViewById(R.id.places);
            ImageView image = view1.findViewById(R.id.images);


            name.setText(placeNames[i]);
            image.setImageResource(placeImages[i]);

            return view1;
        }
    }
}
