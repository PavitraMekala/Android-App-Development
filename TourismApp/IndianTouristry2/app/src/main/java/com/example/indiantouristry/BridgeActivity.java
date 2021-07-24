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

public class BridgeActivity extends AppCompatActivity {

    GridView gridView;
    String[] placeNames = {"Howrah Bridge", "Godavari Bridge", "Pamban Bridge", "Gandhi Setu Bridge", "Nivedita Bridge","Narmada Bridge", "Dhola Sadiya Bridge", "Chambal Bridge"};
    int[] placeImages = {R.drawable.bridge1, R.drawable.bridge2, R.drawable.bridge3, R.drawable.bridge4, R.drawable.bridge5, R.drawable.bridge6, R.drawable.bridge7, R.drawable.bridge8};
    String[] placeMatter={"HOWRAH BRIDGE, KOLKATA(4.6⭐)\n\n" + "When one thinks of Kolkata, the image of the Howrah" + "bridge pops into one's head. Howrah Bridge is the most" + "famous landmark of Kolkata. Located over the Hooghly" + "river, this iconic bridge in India dates back to 1943. It is" + "suspended over the river and is a cantilever bridge that" + "is; it is supported only on the ends. It took six years to" + "complete this bridge, and in its constructed, not a single" + "bolt or nut was used. The Tata Iron and Steel Company" + "provided the steel for this. Each day, thousands of" + "vehicles and pedestrians use this bridge. Today, the" + "British Era bridge still stands tall and has stood the test" + "of time.",
            "GODAVARI ARCH BRIDGE, ANDHRA PRADESH(4.5⭐)\n\n" + "Opened in 1997, Godavari Arch Bridge is an engineering" + "marvel. The bridge is the longest arch bridge in Asia" + "which is constructed using prestressed concrete. It runs" + "over the Godavari river and is located in the city" + "of Rajahmundry. The bridge is a railroad bridge and is" + "spread across an area of 320 feet. Being situated in a" + "cyclonic area, it has been designed to withstand cyclonic" + "storms.",
            "PAMBAN BRIDGE, TAMIL NADU(4.7⭐)\n\n" + "Pamban Bridge in Tamil Nadu is India's first sea bridge" + "and was opened in 1914. It served as the only link between" + "the island Rameshwaram and the mainland until 1988 when" + "a road bridge was also constructed. German engineer" + "Scherzer designed the central part of the Pamban Railway" + "bridge which opens up, and it allows ferries to pass" + "through. It is popularly known as the Scherzer span. It" + "took over a decade to construct this bridge, and even" + "after witnessing damage as it lies in a cyclone prone, it" + "stands tall.",
            "MAHATMA GANDHI SETU, BIHAR(3.6⭐)\n\n" + "Mahatma Gandhi Setu is one of longest river bridge in" + "India, and it runs over the Ganges. The bridge was opened" + "in 1982 and connects the state's capital, Patna to Hajipur." + "The 5.75 km long bridge was constructed by Gammon" + "India Limited, and it took them ten years to complete this" + "marvel. This is an integral part of Bihar as thousands of" + "vehicles and pedestrians use this bridge on a daily basis." + "It is considered an engineering marvel and the India Post" + "has even launched a postal stamp to commemorate it.",
            "NIVEDITA SETU(4.4⭐)\n\n" + "Nivedita Setu (also called Second Vivekananda Setu) is a" + "cable-stayed bridge over Hooghly River in Kolkata, West" + "Bengal. It runs parallel to and around 50 m downstream of" + "the old Vivekananda Setu opened in 1932. The bridge is" + "named after Sister Nivedita, the social worker-disciple of" + "Swami Vivekananda. Belghoria Expressway that connects" + "the meeting point of NH 2 with NH 6 at Dankuni to NH 34," + "NH 35, Dum Dum Airport and northern parts of Kolkata" + "passes over the bridge. The bridge is designed to carry" + "48,000 vehicles per day.\n" + "The construction of the bridge started in April 2004, by" + "the construction giant Larsen and Toubro and was opened to" + "traffic in a record time in July 2007. The bridge is the" + "India's first multi-span, single-plane cable supported extradosed bridge; with short pylons and seven continuous spans" + "of 110 m, totaling a length of 880 m (2,887 feet). It is 29 m" + "wide and will be able to support 6 lanes of traffic. Nivedita" + "Setu has won an Award of Excellence from the American" + "Segmental Bridge Institute, USA.",
            "NARMADA BRIDGE(4.6⭐)\n\n" + "The New Narmada Bridge (or the 3rd Narmada Bridge) is" + "an extra dosed bridge, constructed at Bharuch, India. It is" + "a 1,344 m (4,409 ft) long bridge, built over" + "river Narmada on NH-8. The four-lane bridge is a part of" + "larger project involving six laning of a section of NH8 between Vadodara and Surat. It runs parallel to Sardar" + "Bridge. It is the extradosed bridge with the longest spans" + "in India, 144 m (472 ft) long." + "The bridge was constructed by Larsen & Toubro and" + "Dywidag Systems International (DSI-Bridgecon). The" + "estimated cost of bridge is ₹379 crore (equivalent" + "to ₹428 crore or US$60 million in 2019). This bridge was" + "inaugurated by Indian Prime Minister Narendra Modi on 7" + "March 2017.\n" + "A few months later in June 2017, the Arrah–Chhapra" + "Bridge opened and became the longest multi-span" + "extradosed bridge in the world, with a main bridge length of" + "1,920 m (6,300 ft). Even so, the 3rd Narmada Bridge" + "remains the extradosed bridge with the longest spans in" + "India.",
            "DHOLA - SADIYA BRIDGE, ASSAM(4.6⭐)\n\n" + "Spanning over the Lohit River over 9 km, Dhola- Sadiya" + "Bridge is the longest river bridge in India. It connects" + "the states of Assam and Arunachal Pradesh. The bridge" + "was completed and opened up in 2017. The bridge is " + "considered very important as it will reduce the travel" + "time between the two states from 6 hours to just one" + "hour. It has been constructed to bear the weight of" + "battle tanks to help facilitate their movement for border" + "protection in Arunachal Pradesh. The Dhola Sadiya Bridge" + "was built at a considerable cost and is an asset to the" + "nation.",
            "CHAMBAL BRIDGE(4.4⭐)\n\n" + "The Kota Bridge or Kota Chambal or Kota Cable Bridge is a" + "cable-stayed bridge in Kota, Rajasthan. The bridge was" + "inaugurated by Prime Minister of India Narendra Modi on " + "29 August 2017. The bridge is a part of the Kota Bypass" + "and crosses the Chambal River in the outskirts of the city.\n" + "Description:\n" + "Total length: 1,500 m\n" + "Location📍 : Kota\n" + "Body of water🌊 : Chambal\n" + "Clearance below: 46 m\n" + "Construction started: 2008\n" + "Bridge type🌉 : Cable-stayed bridge"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);

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