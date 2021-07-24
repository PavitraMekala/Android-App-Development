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

public class ParkActivity extends AppCompatActivity {

    GridView gridView;
    String[] placeNames = {"Papikonda National Park", "Sultanpur Bird Sanctuary", "Bandhavgarh National Park", "Valmiki National Park", "Jim Corbett National Park","Jaldapara National Park", "Gir National Park", "Kaziranga National Park"};
    int[] placeImages = {R.drawable.park1 ,R.drawable.park2, R.drawable.park3, R.drawable.park4, R.drawable.park5, R.drawable.park6, R.drawable.park7, R.drawable.park8};
    String[] placeMatter={"PAPIKONDA NATIONAL PARK, ANDHRA PRADESH(4.6⭐)\n\n" + "The area of Papikonda National Park is shared between" + "Telangana and Andhra Pradesh. The tropical rain forest is" + "among the recently declared national parks of India and is" + "gaining popularity because of its rich biodiversity. Engulfed" + "by the vast greenery of Western Ghats, the national park is" + "home to tigers, hyenas, four-horned antelopes, spotted" + "deers, sloth bears, panthers, and more. Being located close" + "to the Godavari basin, the park welcomes numerous" + "migratory birds in the season.\n" + "Best season to visit: October to May\n" + "How to get there: The nearest railhead and airport is" + "located in Rajahmundry which is 108 km away\n" + "Price: INR 650 for adults and INR 550 for children\n" + "Famous for: The views of the Godavari basin",
            "SULTANPUR BIRD SANCTUARY, GURGOAN(4.1⭐)\n\n" + "A perfect weekend getaway from Delhi, Sultanpur Bird" + "Sanctuary is an amazing escape, especially for nature" + "lovers and birding enthusiasts. It is home to a number of" + "migratory birds and is a great spot for spotting the" + "various species, especially during winters. Sultanpur Bird" + "Sanctuary is located at a distance of 40 kilometres from" + "Dhaula-Kuan in Delhi on the Gurgaon-Farukh Nagar" + "Road. There are astonishing 250 species of birds here" + "during the peak season, i.e. September and during winters." + "Sultanpur Bird Sanctuary has been declared to be a" + "National Park by the Haryana Government and is home to" + "a plethora of resident and migratory birds. The varied" + "species of migratory birds flock here after covering" + "incredible distances from various parts of Europe, Siberia" + "and Central Asia. To make the process of bird watching" + "more feasible, there are about four towers erected at" + "different points of this property.",
            "BANDHAVGARH NATIONAL PARK(4.6⭐) \n\n" + "Formerly a hunting ground for the Maharajas of Rewa, the" + "Bandhavgarh National Park is world-renowned as a tiger" + "reserve and it is known to have the highest density of" + "Bengal tigers in the world. The frequent sightings of royal" + "tigers make this national park a must-visit for all wildlife" + "enthusiasts. In 2012, around 44-49 tigers were living in" + "the park. There are more than 22 species of mammals and" + "250 species of avifauna.\n" + "The park got its name from the Bandhavgarh fort" + "situated at the height of 800 m high cliffs nearby. The" + "fort is in ruins now, but an hour trek to the fort is worth" + "it as it provides ample views of the surroundings. The jeep" + "safaris are amongst the most popular activities taken by" + "visitors.",
            "VALMIKI NATIONAL PARK, BIHAR(4.3⭐)\n\n" + "Located on the India-Nepal border, Valmiki National Park is" + "another significant national park in India. The park is" + "situated in the Gangetic Plains bio-geographic zone and is" + "the only national park in Bihar. It is a huge park with" + "flourishing wildlife. The region is famous for a high density" + "of Bengal tigers. You can enjoy exploring the nature trails" + "at this forest and camp in the jungle.\n" + "Best season to visit: October to May\n" + "How to get there: The nearest railhead and airport is" + "located in Patna at a distance of 200 km\n" + "Price: INR 1500\n" + "Famous for: Nepal border trek, watchtowers, Rohua Nala",
            "JIM CORBETT NATIONAL PARK(4.4⭐)\n\n" + "This is the oldest national park of India, and also one of" + "the most popular. It has many claims to fame, including" + "being the site of the Project Tiger launch in 1973. Located" + "in the foothills of the Himalayas in the northern state of" + "Uttarakhand, Corbett is home to more than 200 Bengal" + "tigers – the highest number of any tiger reserve in India." + "Corbett is also a great place for birding, with" + "approximately 650 species of resident and migratory birds." + "It’s one of the only Indian national parks that allows" + "overnight stays in the core zone.",
            "JALDAPARA NATIONAL PARK(4.3⭐)\n\n" + "Situated in the Eastern foothills of the Himalayas, the" + "Jaldapara Wildlife Sanctuary along" + "with Gorumara National Park is famous for one horned" + "rhinoceros, elephants and Bengal Tigers, spotted deers," + "barking deers, sambhar deers, bison, wild pig, hog deer" + "and bison.\n" + "The skies here too will be a part of your tourist spot with" + "a sizeable variety of eagles, Bengal florican, Indian" + "Hornbill, jungle fowl, pea fowl, patridges and more." + "Varieties of eagles such as crested eagle and fishing eagle" + "can also be seen. You can also visit the Gorumara National" + "Park nearby and the ruins of an old fort situated inside" + "the Chilapata Forest. Since Jaldapara is famous for its" + "innumerable elephants, you can take an elephant ride" + "through the park. Alternately, you can also take the" + "Safaris available on hire.",
            "GIR NATIONAL PARK(4.4⭐)\n\n" + "Did you know that India is the only country on earth with" + "endemic lions, tigers and bears? (Oh my!) Located in the" + "western state of Gujarat, Gir National Park is the only" + "remaining natural habitat of the Asiatic lion. In fact, Gir is" + "the only place in the world where you can see lions roaming" + "wild outside of Africa. Hunting reduced the Asiatic lion" + "population in the region to 20 in 1913, and completely wiped " + "them out in other parts of Asia. However, through the" + "intervention of the Nawabs of Junagarh and the Forest" + "Department, there are now 523 lions in Gir National Park." + "The park is also home to leopards, sambar deer and the" + "chowsingha – the world’s only four-horned antelope.",
            "KAZIRANGA NATIONAL PARK(4.5⭐)\n\n" + "Located in the northeast state of Assam, Kaziranga is one" + "of the finest wildlife refuges in the world. Home to the" + "world’s largest population of one-horned rhinos, the park is" + "an undisturbed natural area of wet grasslands, swamps, and" + "pools in the Brahmaputra Valley floodplain. On the" + "UNESCO Natural Heritage list for India, Kaziranga is a" + "great conservation success story, having saved the onehorned rhino from the brink of extinction. In 1903, there" + "were only 12 left in the region; now there are about 1,800.\n" + "The park also harbors several other endangered species," + "such as Bengal tigers, Asian elephants, sloth bears," + "Gangetic dolphin, and many migratory birds. It’s the only" + "park in India where elephant-back safaris are still deemed" + "acceptable, as it’s the only way to view wildlife in the wet" + "grasslands."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);

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