package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    CarouselView carouselView;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<listItem> listItems;
    int[] sampleImages = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listItems = new ArrayList<>();


        listItems.add(new listItem("Reputation - Taylor Swift","25th July Saturday ", "Rs 50,000", "Book Now", R.drawable.a11));
        listItems.add(new listItem("Revival - Selena Gomez","29th July Wednesday", "Rs 30,060", "Book Now", R.drawable.a12));
        listItems.add(new listItem("Wake Up - BTS","31st July Friday", "Rs 65,000", "Book Now", R.drawable.a13));
        listItems.add(new listItem("Aviation - Alan Walker","2nd Aug Sunday", "Rs 41,000", "Book Now", R.drawable.a14));
        listItems.add(new listItem("Believe - Justin Bieber","7th Aug Friday", "Rs 71,060", "Book Now", R.drawable.a15));
        listItems.add(new listItem("Imagination - Shawn Mendes","9th Aug Sunday", "Rs 63,000", "Book Now", R.drawable.a16));
        listItems.add(new listItem("California Dreams - Katy Perry","13th Aug Thursday", "Rs 37,030", "Book Now", R.drawable.a17));
        listItems.add(new listItem("World War Joy - Chain Smokers","17th Aug Monday", "Rs 64,000", "Book Now", R.drawable.a18));
        listItems.add(new listItem("Where we are - One Direction","25th Aug Tuesday", "Rs 79,000", "Book Now", R.drawable.a19));
        listItems.add(new listItem("Divide - Ed Sheeran","29th Aug Saturday", "Rs 61,000", "Book Now", R.drawable.a20));

        adapter = new myAdapter(listItems, this);
        recyclerView.setAdapter(adapter);
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
}
