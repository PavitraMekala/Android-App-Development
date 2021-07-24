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

public class IslandActivity extends AppCompatActivity {

    GridView gridView;
    String[] placeNames = {"Bangaram Island", "Ross Island", "Rutland Island", "Panoramic AgattiIsland", "Aminidivi Island", "Kavaratti Island", "Havelock Island", "Kalpeni Island"};
    int[] placeImages = {R.drawable.island1, R.drawable.island2, R.drawable.island3, R.drawable.island4, R.drawable.island5, R.drawable.island6, R.drawable.island7, R.drawable.island8};
    String[] placeMatter={"BANGARAM ISLAND(4.7⭐)\n\n" + "Bangaram is a tiny teardrop shaped island, which lies very close to Agatti and Kavaratti. The tourist resort on this island provides an amazing opportunity for guests to unwind from the pressures and tensions of modern life. Two small islands of Thinnakara and Parali also lie close to Bangaram enclosed by the same lagoon. During the night, phosphorescent plankton washed ashore on the coral sands impart a bluish glow to the beach, which is totally enchanting. Guests to this resort can either avail of the boat transfer or helicopter transfer from Agatti. Being the only uninhabited island resort in Lakshadweep it has got its own charm. An ideal destination for discerning exclusive tourists, Bangaram has carved its presence in the international tourist map",
            "ROSS ISLAND(4.6⭐)\n\n" + "Named after Captain Daniel Ross, the Ross Island is now renamed as the Netaji Shubash Chandra Bose Dweep by prime minister Narendra Modi in 2018. It is a very small destination that comes under the south Andaman district, Port Blair and is barely 5 Kms from the Water Sports Complex, making it one of easiest inter-island to visit during your trip to Andamans.\n" + "Although most of the attractions in Andaman are famous for beaches and , Ross Island brings a bit of history to the table that makes your vacation complete.",
            "RUTLAND ISLAND(4.5⭐)\n\n" + "Water and adventure lovers are always on the look out for" + "exclusive and enthralling locations. Rutland Island in" + "Andaman and Nicobar Islands spans over an area of 109 km2" + "is one such site. The island is famous for its rich marine life" + "and shallow waters and serves as an ideal place for open" + "water divers to get trained and practice here.\n" + "The island has a rich forest cover and the soil is dry and" + "sandy. The scenic beauty of the place attracts many" + "tourists every year. The affordable rates of the" + "accommodation and site seeing attract the tourists all the" + "more. This diver's paradise has lot to offer to the marine" + "life lovers. Spending time with the loved ones on Rutland" + "Island will let you garner the most special and memorable" + "moments of life.",
            "PANAROMIC AGATTI ISLAND(4.5⭐)\n\n" + "Overview:\n" + "Boasting a 25 km lagoon area and total expanse of 3.3 km sq., Agatti is the only island with an airport that makes travelling to Lakshadweep extremely convenient. It is one of the few inhabited islands of the archipelago.\n"+"Suggested Duration - 1 to 2 days\n" + "What To Expect?\n" + "The shimmering sand, azure water and a clear blue sky calls for a reviving sunbath. Witness the colourful oceanic creatures with scuba diving and snorkelling or go for a ride in the glass-bottomed boat.\n" + "Tips:\n" + "• Permit is required to enter the island form and submit to the Administrator at Lakshadweep Office in Wellington Island, Kochi.\n" + " • Carry enough cash as just one ATM is present on the island.\n" + " • Take a stroll on the coconut tree clad beaches or hire a bicycle.",
            "AMINIDIVI ISLAND(4.5⭐)\n" + "One of the most habited islands of Lakshadweep; Amindivi is a group of islands lying in the North Lakshadweep and is famous for its choir products. It is an ideal place for those seeking to experience the local culture and markets of Lakshadweep.\n" + "Due to government regulations, foreign tourists are not allowed to visit this island.\n" + "The best time to visit Amindivi Islands or Lakshadweep as a whole is between the months of October to midMay.\n",
            "KARAVATTI ISLAND(4.6⭐)\n\n" + "Kavaratti Island is one of the most beautiful gems in Lakshadweep group of islands. The capital of Lakshadweep, it is famous for its splendid sea views and the pristine whitesand beaches. Spread across an area of 3.93 sqm km, it is a small island but there is no dearth of natural beauty at the islands. The island is a home to 12 atolls, five submerged banks, and three coral reefs. The beautiful calm lagoon forms an ideal spot for basking on warm sandy beaches, water sports and swimming. Marine life exhibits can be seen at the new Marine Aquarium which has excellent collection of specimens. The Dolphin Dive Center is another attraction for water sports enthusiasts.\n" + "Kavaratti is 360 km from the shores of Kochi. It doesn't have its airport and Agatti is the nearest airport to the island. Under the mission to develop smart cities, Kavaratti has been chosen to be developed into a smart city in the years to come. The beaches are laden with the swinging coconut trees, and once you take a dip inside the vast expanse, you can witness the abundant marine life of the island. Beholding sights of the multihued underwater life in the lagoons from the lowest deck a glass-bottomed boat can be a truly memorable experience. Kayaks, wind surfers and sailing boats can be availed on rent. The spectacular views of the Arabian sea, the sparkling white-sand beaches offers solace amidst the tranquil nature. Kavaratti is best known for its breathtaking sceneries and the enthralling water sports.",
            "HAVELOCK ISLAND(4.7⭐)\n\n" + "Situated 70 K.M from the capital Port Blair, the Havelock Island has been at the spotlight of the Andaman Tourism for more than a decade. The island boasts some of the most well defined spots of attraction with a perfect mixture of tropical jungle and white sand beaches.\n" + "One of the most intriguing things about the Havelock Island is it's lack of urban density. The island has a very low population density, that makes sure you get as close to nature as possible without having to see yet another urban city, which you probably are taking a break from.\n" + "Narrow roads surrounded by either dense tropical jungles with unique trees or long strips of fields covered with greenery of rice and paddies, combined with a sudden jump of clear open waters on the side of the road makes the Havelock Island, one of the best places to explore with a rental bike.",
            "KALPENI ISLAND(4.6⭐)\n\n" + "Also known as Koefaini, Kalpeni islands is a group of three islands and is one of the most picturesque areas of Lakshadweep. Cheriyam, Pitti and Tillakkam are the islands which together forms the Kalpeni islands.\n" + "These islands are inhabited and are frequently visited by tourists. Kalpeni is famous for its beautiful lagoon surrounding the island and is highly rich in Coral life. Naturally, this place is among the must-see places in Lakshadweep. This is also a great spot to enjoy water sports including Scuba Diving, Snorkeling, Reef walking, canoeing, kayaking and sailing yachts."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_island);

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