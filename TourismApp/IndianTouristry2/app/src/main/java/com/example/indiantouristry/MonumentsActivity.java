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

public class MonumentsActivity extends AppCompatActivity {

    GridView gridView;
    String[] placeNames = {"India Gate", "Red Fort", "Cellular Jail", "Mysore Palace", "Jama Masjid","Varanasi", "Ajanta Caves", "Mahabalipuram"};
    int[] placeImages = {R.drawable.monument1, R.drawable.monument2, R.drawable.monument3, R.drawable.monument4, R.drawable.monument5, R.drawable.monument6, R.drawable.monument7, R.drawable.monument8};
    String[] placeMatter={"INDIA GATE(4.6⭐)\n\n" + "This iconic sandstone-granite arch gate is among the" + "largest war memorials in the country. The beauty of this" + "important monument is accentuated by the verdant lawns" + "that surround it. India Gate is undoubtedly one of the" + "most famous landmarks in India.\n" + "Location📍 – Rajpath, India Gate, New Delhi\n" + "How to reach: \n" + " • By Air: Fly to New Delhi’s Indira Gandhi International" + "Airport (14 km away) and then take a bus or taxi. You" + "can also take the metro to Central Secretariat metro" + "station (3 km away) and then board an auto-rickshaw.\n" + " • By Train: New Delhi railway station is 5 km away," + "from where you can take an auto-rickshaw or taxi.\n" + " • By Road: When travelling from a nearby city, you can" + "book a taxi or take a private or state transport bus.\n" + "Entry ticket prices 🎫 – Free entry for all\n" + "Timings⌛ :\n" + "• India Gate is open to visitors 24 hours a day, 7 days" + "a week.\n" + "• Boat timings are from 2 PM to 9 PM and light show" + "timings are from 7 PM to 9: 30 PM.\n" + "Important facts –\n" + "• It has a children’s park and boat club.",
            "RED FORT(4.5⭐)\n\n" + "The Red Fort is the most popular and important of the" + "forts in India. It was constructed under the leadership of" + "Shah Jahan and since then has been home to various nobles" + "and kings.\n" + "Once, the fort’s facade was graciously decorated with" + "diamonds, but over the years the diamonds were stripped" + "off as kings lost their wealth. Today, the Red Fort is an" + "important landmark and is used for the Prime Minister’s" + "address to the nation on Independence Day.\n" + " 📍 Location: Delhi",
            "CELLULAR JAIL(4.6⭐)\n\n" + "This three-storeyed prison, constructed by Britishers in" + "1906, is a pilgrimage destination for freedom fighters. This" + "colossal edifice has mutely witnessed the most treacherous" + "of inhumane atrocities borne by the convicts, who were " + "mostly freedom fighters. Now dedicated to the nation as a" + "National Memorial.\n" + "The saga of the heroic freedom struggle is brought alive in" + "a moving Son-et-Lumiere, shown daily inside the jail" + "compound at 6.00 PM (Hindi) and 7.15 PM (English). Also" + "there is a Museum, an Art gallery, and a Photo gallery, which" + "are open on all days except Monday from 9.00 AM to 12" + "Noon and 2.00 PM to 5.00 PM.\n" + "How to Reach :\n" + "The Veer Savarkar Airport, an International Airport is" + "located in the capital town of Port Blair, the gateway to" + "Andaman and Nicobar Islands. Port Blair, is connected with" + "Chennai, Kolkata and New Delhi by air. Air India, Jet" + "Airways, Jet lite, Go Air & Spice Jet Airlines operate" + "regular flights.\n" + "No Train facilities available\n" + "The Cellular Jail is located at Atlanta Point in the city of" + "Port Blair. Public/Private Transportation is frequently" + "available within the portblair city",
            "MYSORE PALACE, MYSORE(4.6⭐)\n\n" + "The Mysore Palace is a famous historical monument in the" + "city of Mysore in Karnataka. Commonly described as the" + "City of Palaces, this is the most famous tourist attraction\n" + "in India after the Taj Mahal. It is a sight not be missed" + "with its spacious halls, lovely art paintings and IndoSaracenic style architecture. Best time to visit is at night" + "due to the astonishing illuminated lights covering the whole" + "monument.",
            "JAMA MASJID(4.6⭐)\n\n" + "Located in the heart of Old Delhi, the Jama Masjid is one" + "of the few places that is a haven of serenity and calm." + "Dressed in white and pink the mosque stands stall. The " + "highlight of this mosque is the tall minarets from where you" + "can gaze at the beautiful city of Delhi.\n" + " Location📍 : Old Delhi",
            "VARANASI(4.6⭐)\n" + "Varanasi is a city in the northern Indian state of Uttar" + "Pradesh dating to the 11th century B.C. Regarded as the" + "spiritual capital of India, the city draws Hindu pilgrims who" + "bathe in the Ganges River’s sacred waters and perform" + "funeral rites. Along the city's winding streets are some" + "2,000 temples, including Kashi Vishwanath, the “Golden" + "Temple,” dedicated to the Hindu god Shiva.",
            "AJANTA CAVES(4.6⭐)\n\n" + "Ajanta Caves, Buddhist rock-cut cave temples and" + "monasteries, located near Ajanta village, northcentral Maharashtra state, western India, that are " + "celebrated for their wall paintings. The temples are" + "hollowed out of granite cliffs on the inner side of a 70-foot" + "(20-metre) ravine in the Wagurna River valley 65 miles (105" + "km) northeast of Aurangabad, at a site of great scenic" + "beauty.\n" + "The group of some 30 caves was excavated between the 1st" + "century BCE and the 7th century CE and consists of two" + "types, caityas (“sanctuaries”) and viharas (“monasteries”)." + "Although the sculpture, particularly the rich ornamentation" + "of the caitya pillars, is noteworthy, it is the fresco-type" + "paintings that are the chief interest of Ajanta. These" + "paintings depict colourful Buddhist legends and divinities" + "with an exuberance and vitality that is unsurpassed" + "in Indian art. The caves were designated a UNESCO World" + "Heritage site in 1983.",
            "MAHABHALIPURAM(4.5⭐)\n\n" + "Mahabalipuram, also known as Mamallapuram, in Tamil Nadu" + "is the site of a terrific cluster of religious architecture" + "built in the seventh and eighth centuries by the Pallava" + "kings. The word ‘mamalla’ means wrestler and refers to the" + "seventh century Pallava king Narasimha Varman I. While" + "every structure in this UNESCO world heritage site is a" + "work of high art, some are more noteworthy than others. If" + "you’re going for a short visit, spend most of your time" + "among these monuments."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments);

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