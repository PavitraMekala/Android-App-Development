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

public class ReligiousActivity extends AppCompatActivity {

    GridView gridView;
    String[] placeNames = {"Venkateswara Temple", "Somnath Temple", "Amarnath Temple", "Akshardham Temple", "Jagannath Temple","All Saints Cathedral", "Mathura Temple", "Golden Temple"};
    int[] placeImages = {R.drawable.religious1, R.drawable.religious2, R.drawable.religious3, R.drawable.religious4, R.drawable.religious5, R.drawable.religious6, R.drawable.religious7, R.drawable.religious8};
    String[] placeMatter={"TIRUPATI BALAJI TEMPLE, ANDHRA PRADESH(4.8⭐)\n\n" + "Located in the hilly town of Tirumala in Andhra Pradesh, the temple is also known" + "as Tirumala Venkateswara temple. The temple is devoted to Lord Venkateshwara, who is" + "popularly called ‘Balaji’ and is the incarnation of Lord Vishnu.\n" + "Venkateshwara Tirupati Balaji is the second richest temple in India. The ancient temple" + "was visited by many rulers of great South-Indian dynasties. The temple celebrates many" + "festivals, most famous of them being Brahmotsavam (also known as ‘Salakatla" + "brahmotsavam’), which goes on for 9 days and witnesses thousands of devotees.\n" + "The prasadam offered in the shrine is famous all around the world for its unique" + "delectable taste. As a religious ritual, people get their heads tonsured in large numbers\n" + "here, so much so that every year about 6 million US dollars are earned through the" + "auction of hairs.",
            "SOMNATH TEMPLE(4.8⭐)\n\n" + "Somnath Temple is one of the oldest pilgrimage centres in India and finds mention in" + "the ancient books of Shiv Puran, Skanda Purana and Shreemad Bhagvat Gita. Soma" + "refers to ‘Moon God’, thus Somnath means ‘Protector of the Moon God’.\n" + "According to a legend, the Indian God of Moon, Soma was cursed by his father-in-law to" + "lose his lustre. It was Lord Shiva who cured his illness and later Soma built this temple in" + "his honour. It is one of the most revered ‘jyotirlinga’ among the 12 jyotirlingas of India.\n" + "The temple is located in Prabhas Kshetra in Saurashtra (Gujarat). Prabhas Kshetra is" + "where Lord Krishna is believed to have left his mortal body. The place also has a" + "Somnath museum, Junagadh gate, beach and a sound and light show to amuse the" + "pilgrims.",
            "AMARNATH CAVE TEMPLE(4.5⭐), JAMMU AND KASHMIR\n\n" + "The holy cave of Amarnath is located at an altitude of 3,888 meters in the Union Territory" + "of Jammu and Kashmir. Engulfed with snow-clad mountains, the cave mostly remains" + "covered with snow during the year.\n" + "In the summer season, between the months of June and August, it becomes accessible" + "and hence opens up for the pilgrims. The cave is believed to be 5000 years old. As per a" + "popular legend, Buta Malik, a Muslim shepherd, met a holy man who handed him a bag" + "of coal.\n" + "On reaching home, he found that the coal got converted into gold. Moved by the" + "miracle the shepherd went in search of the saint and instead found the sacred abode of" + "Lord Shiva.\n" + "The pilgrimage to Amarnath consists of a 5-day trek during which the devotees brave" + "tough and uncertain climatic conditions and walk for forty miles.",
            "AKSHARDAM TEMPLE, DELHI(4.6⭐)\n\n" + "Constructed on the principles of Vastu Shastra and Pancharatra Shastra, this temple is" + "situated near the banks of River Yamuna in Delhi. The authenticity of the temple is" + "reflected in its resemblance with ancient Indian architecture and the spirituality the place" + "exudes.\n" + "The principal deity of the temple is Lord Swaminarayan, an incarnation of Lord Vishnu." + "The 11-feet idol lies below the central dome of the temple. The structure has been built" + "of Rajasthani pink stone and Italian Carrara marble.\n" + "The magnificent temple of Akshardham looks more stunning during the night with the" + "beautifully installed lighting arrangements. There are many activities and events like" + "exhibitions, movies, statues and boat rides through which information about the history" + "and philosophy of the Swaminarayan sect and its founder is given to the visitors.",
            "SHRI JAGNNATH TEMPLE, ODISHA(4.7⭐)\n\n" + "Built in the 12th century, Jagannath temple is situated in Puri, Orissa and is popularly" + "called Jagannath Puri. Dedicated to Lord Krishna, the temple is one of the Char Dhams of" + "India.\n" + "Inside the main temple, with the idol of Lord Krishna (Jagannath) in between, the idols of" + "Lord Balabhadra and Goddess Subhadra are placed. Non-Hindus cannot enter the" + "premises of the temple.\n" + "They can get a good view of this magnificent temple from the roof-top of the" + "Raghunandan Library located just opposite to the temple. The annual and world" + "famous Rath Yatra conducted at Puri gives a chance to get a good glimpse of the Lord" + "Jagannath along with Balabhadra and Subhadra riding on the chariots." + "Thousands of people pulling the sacred chariot makes the yatra a worthy spectacle.",
            "ALL SAINTS CATHEDRAL, ALLAHABAD(4.8⭐)\n\n" + "Built in the late 19th century, All Saints Cathedral or Patthar Girja is a" + "spectacular Anglican Christian Church on M G Marg, Allahabad. One of the" + "beautiful churches in the state, it is thronged by tourists and pilgrims alike.\n" + "All known as the \"Church of Stone\", All Saints Cathedral was formerly founded in" + "1871 by Lady Muir Elizabeth Huntly Wemyss. Post its consecration in 1887, the" + "church was further completed in 1891.",
            "MATHURA TEMPLE(4.7⭐)\n\n" + "Shri Krishna Janmasthan Temple is located in the holy city of Mathura, Uttar" + "Pradesh. It is built around the prison cell in which Lord Krishna’s parents, Mata" + "Devaki and Vasudeva were imprisoned by his evil uncle Kansa. The temple is of" + "great significance for the Hindus as it is believed to be the birthplace of Lord" + "Krishna.\n" + "Besides the prison cell, there are other temples located within the Krishna" + "Janmasthan Temple Complex dedicated to the deity. On entering the temple, the" + "divine ambience and its purity fill the heart with conviction that this indeed is the" + "place where Lord Krishna manifested himself. Destroyed multiple times by many" + "kings, it was finally built by financial help from industrialists. A visit to the Krishna" + "Janmasthan Temple becomes more pleasing at the time of festivals like" + "Janmashtami, Basant Panchami, Holi and Deepavali which are celebrated with" + "great fervour.",
            "GOLDEN TEMPLE, PUNJAB(4.9⭐)\n\n" + "Sri Harmandir Sahib, also known as Darbar Sahib or Golden temple is the most pious site" + "of pilgrimage in Amritsar, Punjab for people who follow Sikhism. The temple is built on" + "the values of universal brotherhood and equality.\n" + "The four doors, opening in the four prominent directions, welcome people from any faith" + "or race to seek religious and spiritual contentment. The structure, revered for its majestic" + "architecture, is built on a lower level than that of the immediate surroundings," + "symbolizing the value of humility.\n" + "The holy book of the Sikhs, Guru Granth Sahib, was first placed in Sri Harmandir Sahib" + "after its completion."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious);

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