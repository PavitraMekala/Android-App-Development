package com.example.indiantouristry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class All extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        ImageButton mainButton = (ImageButton) findViewById(R.id.imageButton);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, WeekendActivity.class);
                startActivity(intent);
            }
        });

        ImageButton secondButton = (ImageButton) findViewById(R.id.imageButton2);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, ExploreActivity.class);
                startActivity(intent);
            }
        });
        ImageButton thirdButton = (ImageButton) findViewById(R.id.imageButton3);
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, VacationActivity.class);
                startActivity(intent);
            }
        });
        ImageButton fourthButton = (ImageButton) findViewById(R.id.imageButton4);
        fourthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, BeachActivity.class);
                startActivity(intent);
            }
        });
        ImageButton fifthButton = (ImageButton) findViewById(R.id.imageButton5);
        fifthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, HillsActivity.class);
                startActivity(intent);
            }
        });
        ImageButton sixthButton = (ImageButton) findViewById(R.id.imageButton6);
        sixthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, WaterfallActivity.class);
                startActivity(intent);
            }
        });
        ImageButton seventhButton = (ImageButton) findViewById(R.id.imageButton7);
        seventhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, IslandActivity.class);
                startActivity(intent);
            }
        });
        ImageButton eighthButton = (ImageButton) findViewById(R.id.imageButton8);
        eighthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, MonumentsActivity.class);
                startActivity(intent);
            }
        });
        ImageButton ninthButton = (ImageButton) findViewById(R.id.imageButton9);
        ninthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, ReligiousActivity.class);
                startActivity(intent);
            }
        });
        ImageButton tenthButton = (ImageButton) findViewById(R.id.imageButton10);
        tenthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, BridgeActivity.class);
                startActivity(intent);
            }
        });
        ImageButton eleventhButton = (ImageButton) findViewById(R.id.imageButton11);
        eleventhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this, ParkActivity.class);
                startActivity(intent);
            }
        });
        ImageButton twelveButton = (ImageButton) findViewById(R.id.imageButton12);
        twelveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All.this,StatesActivity.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTajActivity();

            }
        });

        button = (Button) findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLotusActivity();

            }
        });

        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDalActivity();

            }
        });

        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openManaliActivity();
            }
        });

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGangaActivity();
            }
        });

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKonarkActivity();
            }
        });
    }
    public void openTajActivity() {
        Intent intent = new Intent(this, TajActivity.class);
        startActivity(intent);
    }

    public void openLotusActivity() {
        Intent intent = new Intent(this, LotusActivity.class);
        startActivity(intent);


    }
    public void openDalActivity() {
        Intent intent = new Intent(this, DalActivity.class);
        startActivity(intent);
    }
    public void openManaliActivity() {
        Intent intent = new Intent(this, ManaliActivity.class);
        startActivity(intent);
    }
    public void openGangaActivity(){
        Intent intent = new Intent(this,GangaActivity.class);
        startActivity(intent);
    }
    public void openKonarkActivity(){
        Intent intent = new Intent(this,KonarkActivity.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.profile:
                startActivity(new Intent(All.this,ProfileActivity.class));
                Toast.makeText(this,"You Clicked Profile",Toast.LENGTH_SHORT).show();
                break;
            case R.id.out:
                startActivity(new Intent(All.this,HomeActivity.class));
                Toast.makeText(this,"You Clicked Sign Out Button",Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}