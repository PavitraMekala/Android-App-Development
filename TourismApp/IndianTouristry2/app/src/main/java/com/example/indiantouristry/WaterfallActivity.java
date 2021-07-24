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

public class WaterfallActivity extends AppCompatActivity {

    GridView gridView;
    String[] placeNames = {"chitrakote Falls","Jog Falls","Athirappilly Falls","Langshiang Falls","Hogenakkal Falls","Vantawng Falls","Elephant Falls","Courtallam Falls"};
    int[] placeImages = {R.drawable.waterfalls1,R.drawable.waterfalls2,R.drawable.waterfalls3,R.drawable.waterfalls4,R.drawable.waterfalls5,R.drawable.waterfalls6,R.drawable.waterfalls7,R.drawable.waterfalls8};
    String[] placeMatter={"CHITRAKOTE FALLS, CHHATTISGARH(4.6⭐)\n\n" + "With 30-metre height, Chitrakote (or Chitrakoot) Falls might not sound extraordinary but you would be surprised to know that it is the broadest waterfall in India. Every year, thousands of people come here during the rainy season to witness its astounding girth spanning up to 300 m and just the sheer beauty of the wilderness surrounding it.\n" + "Fed by the Indravati River, this waterfall is perfect for sunset viewing, day picnics, rejuvenating in the lap of nature, or spending some ‘me’ time as there are many meditation and yoga centres here.\n" + "Location📍: Tiratha, Bastar district, Chhattisgarh\n" + "Timings⌛: Open 24 hours\n" + "Entry Fee 🎫: Free\n" + "Best Time to Visit: July to March",
            "JOG FALLS, KARNATAKA(4.6⭐)\n\n" + "Created by River Sharavathi, Jog Falls is second on the list" + "of highest plunge waterfalls in the country. It falls from an" + "altitude of 830 feet amidst lush greenery in four distinct" + "cascades – Raja, Rani, Rocket and Roarer, leaving the" + "onlookers stunned.\n" + "You can enjoy a resplendent view of the falls by either" + "hiking up to the Watkins viewpoint or trekking down 1,400" + "steps to the platform at its bottom. The chance to dive into" + "the river beneath makes the Jog Falls experience all the" + "more enthralling.\n" + "Location: Shimoga district, Karnataka\n" + "Timings: 00 am to 4.00 pm\n" + "Entry Fee 🎫: INR 10 per person\n" + "Best Time to Visit: June to September",
            "ATHIRAPPILLY FALLS, KERALA(4.6⭐) \n\n" + "Featured in numerous Indian movies including Dil Se and" + "Guru, the majestic Athirappilly Falls boasts of being the" + "largest of its kind in the state of Kerala. The 330-feet-" + "wide fall plunges beautifully from a height of 80 feet to" + "join the River Chalakudy. Owing to its enormity and the" + "scenic vistas it offers, the fall has been given the title of" + "the ‘Niagara of India’.\n" + "The dense forests of Vazhachal surrounding the fall are a" + "hotspot of biodiversity, making Athirappilly a fascinating" + "site for both nature lovers and wildlife enthusiasts.\n" + "Location: Thrissur district, Kerala\n" + "Timings:00 am to 6.00 pm\n" + "Entry Fee 🎫: INR 15 per person\n" + "Best Time to Visit: June to October\n",
            "LANGSHIANG FALLS, MEGHALAYA(4.1⭐)\n\n" + "Langshiang falls in Meghalaya is one of the highest falls in" + "India. It is located in the West Khasi Hills district, near the" + "village of Sangriang which is 105 kms from the state capital" + "city of Shillong and road distance around 25 kms from the" + "Nongstoin town. It is also known as the ‘Kshaid – Ur- Nar’." + "Langshiang falls is formed from the mighty Kynshi River." + "The river splits into two and falls from a height of 1106" + "feet into a deep gorge in the dense forest of the West" + "Khasi Hills. There are settlements of several villages around" + "this place. The lush green surrounding of the region is" + "gaining popularity gradually among the tourists. The" + "Langshiang falls in the midst of the towering hills and the " + "green valley is a sight to behold. Being the third highest waterfall of India, Langshiang falls attracts many tourists. It is a perfect place for the visitors who want to spend time in the midst of the nature with panoramic view of the surroundings. With majestic hills all around, this place also offers trekking and hiking opportunities.",
            "HOGENAKKAL FALLS, TAMILNADU(4.2⭐)\n\n" + "Translating to ‘smoking rocks’ in Kannada and aptly so," + "Hogenakkal Falls rushes down 66 feet with its clear waters" + "cutting through the rocky cliff in a way that appears as if" + "it’s emitting smoke. Though it’s not as high, it counts among" + "the top 10 waterfalls in South India for its unique" + "formation, enthralling surroundings, the finesse of its" + "flowing water and surprisingly so, its therapeutic" + "properties.\n" + "You can admire the beauty of Hogenakkal Falls while bathing" + "or taking a boat ride in its waters at the bottom.\n" + "Location: Dharmapuri district, Tamil Nadu\n" + "Timings: 00 am to 5.30 pm\n" + "Entry Fee:\n" + "INR 30 per person\n" + "INR 10 for viewpoint\n" + "INR 200 or more for boating\n" + "Best Time to Visit: October to March\n",
            "VANTAWNG FALLS, MIZORAM(4.1⭐)\n\n" + "Located at a distance of about 137kms from Aizawl," + "Vantawng khawhthla or Vantawng Fall is the highest and" + "most spectacular of all the waterfalls and cascades in the" + "fast flowing rivers of Mizoram. It is located in Vanva river " + "near Thenzawl and is named after Vantawnga who was said" + "to be an excellent swimmer. So good a swimmer was" + "Vantawnga that he could hover in the cascading water like a" + "fish, but unfortunately during one of such performances, a" + "drifting log fell from above and killed him.\n" + "The height of the fall is recorded as 750 ft and though it is" + "difficult to get close to it because of the sheer forested" + "hillsides surrounding it, a comfortable viewing tower has" + "been constructed.\n" + "September to January are the best months to visit Vantawng Falls due to greater clarity. The waterfall is visible running at its full might through the verdant Mizo Hills. The greenery surrounding the waterfall is also accentuated and thick during these months of the year. The winters months will be cold due to high altitude and some protection is required from the cold especially during night time. Hence be generous while you pack woollens.",
            "ELEPHANT FALLS, SHILLONG(4.4⭐)\n\n" + "Elephant falls are situated on the outskirts of “Scotland of" + "the East”, Shillong. What make this waterfall stand out in" + "the assortment of natural treasures you find in Shillong, are" + "the three sections of the waterfall that flow in sequence." + "It is one of the busiest tourist spots around, especially if" + "you go there in monsoon. During this season the fall is in its" + "full vigour and even the locals can’t resist to get one glimpse" + "of this mighty fall. So if that’s the time you visit the falls," + "make sure you know what to expect.\n" + "How To Reach: 12 kms from Shillong and a few minutes’" + "drive from the Shillong Peak.\n" + "Best Time To Visit: Between November to February.",
            "COURTALLAM FALLS, TAMILNADU(4.5⭐)\n\n" + "Not one or two but you’ll get to witness nine enthralling" + "waterfalls at one place in the small town of Courtallam (also" + "called Kutralam) – the ‘Spa of South India’. The biggest and" + "most prominent of all is Peraruvi (Main Falls) that is 60 m" + "high and a deep crater called Pongumakadal interrupts its" + "fall.\n" + "Other falls in the area include Aintharuvi (Five Falls)," + "Chitraruvi (Small Falls), Pazhaya Courtalla Aruvi (Old" + "Courtallam falls), Shenbagadevi, Thenaruvi (Honey Falls)," + "Palaruvi, the artificial Puli Aruvi (Tiger Falls), and" + "Pazhathotta Aruvi.\n" + "Location: Tirunelveli district, Tamil Nadu\n" + "Timings: 00 am to 8.00 pm\n" + "Entry Fee: Free\n" + "Best Time to Visit: July to September"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterfall);

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