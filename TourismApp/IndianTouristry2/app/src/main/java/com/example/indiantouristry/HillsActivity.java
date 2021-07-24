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

public class HillsActivity extends AppCompatActivity {

    GridView gridView;
    String[] placeNames = {"Araku Valley","Dal Housie","Tawang","Dharamshala","Coorg","Nilgiri Hills","Gulmarg","Shillong"};
    int[] placeImages = {R.drawable.hills1,R.drawable.hills2,R.drawable.hills3,R.drawable.hills4,R.drawable.hills5,R.drawable.hills6,R.drawable.hills7,R.drawable.hills8};
    String[] placeMatter={"ARAKU VALLEY, ANDHRA PRADESH(3.7⭐)\n\n" + "Araku Valley is a hill station in Visakhapatnam district in the state of Andhra Pradesh. It is a valley which is famous for coffee plantations.\n" + "Best Experiences: Explore the beautiful villages of Madugala and Champi as you trek through the carpeted terrains.\n Other tourist attractions include Chaparai falls and Ananthagiri falls.\n" + "Best Time To Visit: October to March\n" + "Ideal Duration: Visit here for a minimum of 3 days for a good trip.\n" + "How To Reach: \n"+" • Daily railways are available from Visakhapatnam railway station.\n"+ " • Buses and taxis are also available.\n" + "Places To Stay: Ushodaya Resorts, Hill Park Resorts, Sri Sai Suvarna Inn, The Village Villa Resorts & Restaurants",
            "DALHOUSIE, HIMACHAL PRADESH(4.3⭐)\n\n" + "Dalhousie, a popular hill station in Himachal Pradesh is situated at a height of 1,970 metres above sea level. Boasting views of the snow-capped peaks of Dhauladhar ranges, Dalhousie is famous for its meadows, dense jungles and waterfalls. Established in 1854, it was named after Lord Dalhousie and this hill station was one of the favourite summer destinations of the Britishers during the colonial era.\n" + "Dalhousie offers an old-world charm, mesmerizing natural landscapes, pine-clad valleys and magnificent misty mountains. The Scottish and Victorian-era architecture of churches reminds you of its colonial heritage.",
            "TAWANG, ARUNACHAL PRADESH(4.6⭐)\n\n" + "Breathtaking valleys, misty rivers, and stunning waterfalls give you the ultimate experience in the mystical Tawang.\n" + "Best Experiences: Visit the snow-clad Sela Pass for a spectacular view and stop over at the beautiful" + "Paradise Lake on your way there. Make a trip to the Tawang Monastery, the largest monastery in India.\n" + "Other destinations are Gorichen Peak, the Shongatser Lake, Pankang Teng Tso Lake, Bap Teng Kang Waterfall, and Nuranang Waterfalls.\n" + "Best Time To Visit: March to June, September and October\n" + "Ideal Duration: Visit for a minimum of 4 days for a good trip.\n" + "How To Reach: • Take a flight directly to the Salonibari Airport, Tezpur followed by a 6 hour taxi ride Or take the train to Guwahati followed by a 13 hours taxi ride.\n" + "Things To Do: ➡Go Hiking \n+"+"➡Visit Waterfalls\n" + "Places To Stay: Vamoosetrail Tawang, Hotel The Oak, Treebo Trip Yangsell, Hotel Ashoka",
            "DHARMASHALA, HIMACHAL PRADESH(4.7⭐)\n\n" + "Dharmashala is one of the most famous hill stations in India and is located in Himachal Pradesh. From trails for trekking to amazing cafes, Dharamshala has it all and is a perfect weekend getaway spot. Whether you are a shopaholic or a foodie, this hill station has something for every traveler. Get ready to fall in love with the lush green hills and the peaceful surroundings in Dharamshala.\n" + "Best Experiences: Visit St John’s Church and Dal Lake, Mediate at Gyuto Monastery, Explore the ancient Kangra Fort\n" + "Best Time To Visit: February to June" + "Ideal Duration: 3 days\n" + "How To Reach: Pathankot railway station is the nearest railway station and you can hire a cab from there till Dharamshala.\n" + "Things To Do: Paragliding, Explore McLeodganj\n" + "Places To Stay: Green Hotel, Bob’s n Barley, The Unmad, Hotel Pine spring\n",
            "COORG, KARNATAKA(4.4⭐)\n\n" + "Coorg is a district in the Karnataka state which is known for an array of tourist attractions and quaint villages. There are mountain ranges with a spectacular view.\n" + "Best Experiences: For a nature lover, nothing is as blissful as the experience of exploring The Coorg District. The beautiful scenery, warm hospitality of people can allure you towards the hill station. The other attractions include Abbey falls, Nagarahole Wild Life Sanctuary, Mountain Ranges, Churches,Forts.\n" + "Best Time To Visit: December to February\n" + "Ideal Duration: Coorg is an idyllic place for a quick" + "weekend getaway.\n" + "How To Reach: The nearest railway station is at" + "Mysore which is about 100 kms away from Coorg." + "Buses are frequently available to take off to Coorg" + "on a 4-5 hours comfortable journey.\n" + "Things To Do: Enjoy Views Of The Magnificient" + "Waterfall, Sightseeing\n" + "Places To Stay: Sanctum Retreat, Club Mahindra" + "Virajpet, The Tamara Coorg, Estate Stay, Amritara" + "Ambatty Greens Resort",
            "NIGIRI HILLS, TAMILNADU(4.3⭐)\n\n" + "The Nilgiri Hills are major sub range of large Western Ghats with more then 20 mountains peaks. Nilgiri Hills also called Blue Mountains are located at the junction of three major south Indian states Karnataka, Kerala and Tamil Nadu. Doddabetta Peak is the highest peak of the Nilgiris with a height of 2,637 meters (8,652 ft) followed by Kolaribetta, Kattadadu and Kulkudi. The wildlife corridor or green corridor is home to some of the highest waterfalls of India and provide habitat to countless types of flowerless plants and so many exotic species.",
            "GULMARG, JAMMU & KASHMIR(4.7⭐)\n\n" + "Literally meaning the ‘meadow of flowers’, Gulmarg is known for its unparalleled natural beauty. A popular ski destination during winters, its Pine forests and wild flowers make for a breathtaking summer trip too. This is another best hill station in India. Best Experiences: Visit the Ningle Nallah,originating from the melting snow of the Apharwat peak and get enamored by the aerial view of the Himalayan peaks from the Gondola Lift. Other great locations are Lien Marg, the pristine and medicinal waters of Verinag, the Biosphere Reserve of Gulmarg and Alpather Lake, all of which make it one of the most beautiful top most hill stations in India.\n" + "Best Time To Visit: March to June\n" + "Ideal Duration: Visit for a minimum of 3 days for a good trip.\n" + "How To Reach: Take a flight directly to the Srinagar International Airport followed by a 3-hour taxi ride.\n" + "Things To Do: Skiing, Gondola Ride, Trekking\n" + "Places To Stay: Heevan Retreat Gulmarg, Hotel, Affarwat, Nedous Hotel Gulmarg, The Khyber, Himalayan Resort & Spa, The Rosewood\n",
            "SHILLONG, MEGHALAYA(4.2⭐)\n\n" + "With lush green fields, picturesque landscapes, and sweet-smelling flowers, Shillong is all about natural beauty combined with colonial hospitality, making it an amazing hill station in North East India.\n" + "Best Experiences: Visit the Umaim lake created by the Umiam river and famous for water sports. Also, visit the rolling meadows of Shillong Golf Course bordered by pine trees and enjoy a boat ride on the Ward’s Lake. Other attractions here are the Shillong Peak, Elephant Falls, Sweet Falls, and the Lady Hydari Park.\n" + "Best Time To Visit: September to May" + "Ideal Duration: Visit for a minimum of 3 days for a good trip.\n" + "How To Reach: Take a flight directly to the Shillong Airport in Umroi Or take the train to Guwahati (104" + "km) followed by a 3-hour taxi.\n" + "Things To Do: Visit The Umiam Lake, Enjoy The Elephant Falls\n" + "Places To Stay: Mantra Guest House, Ha Sharing,Silver Brook Resort, S. S. HOME STAY, The Heritage Club – Tripura Castle"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hills);

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