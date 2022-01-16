package com.rubbertrampit.quartzsite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class Activity_Restaurants
        extends AppCompatActivity {

    private static RecyclerView.Adapter adapter;
    private static RecyclerView recyclerView;
    public static List<String> dataNames;
    public static List<String> dataImages;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        Log.d("TROUBLESHOOTING STEP", "Creating recyclerView");
        recyclerView
                = findViewById(R.id.recycler_view_restaurants);

        db = new DatabaseHelper(this);
        recyclerView.setHasFixedSize(true);

        // Create borders and spacing between items
        DividerItemDecoration dividerItemDecorationBorderVertical = new DividerItemDecoration(recyclerView.getContext(),0);
        recyclerView.addItemDecoration(dividerItemDecorationBorderVertical);
        DividerItemDecoration dividerItemDecorationBorderHorizontal = new DividerItemDecoration(recyclerView.getContext(),1);
        recyclerView.addItemDecoration(dividerItemDecorationBorderHorizontal);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2, RecyclerView.VERTICAL, false));
        dataNames = new ArrayList<>();
        dataImages = new ArrayList<>();
        Log.d("TROUBLESHOOTING STEP", "entering fetchdata()");
        fetchData();
    }

    public void fetchData()
    {
        Log.d("TROUBLESHOOTING STEP", "entered fetchData");
        // Before fetching the data
        // directly from the database.
        // first we have to creates an empty
        // database on the system and
        // rewrites it with your own database.
        // Then we have to open the
        // database to fetch the data from it.
        db = new DatabaseHelper(this);
        try {
            db.createDataBase();
            db.openDataBase();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        dataNames = db.getAllRestaurantNames(this);
        dataImages = db.getAllRestaurantImages(this);

//        Log.d("TROUBLESHOOTING dataNames in Activity contains", Integer.toString(dataNames.size()));
//        Log.d("TROUBLESHOOTING dataImages",Integer.toString(dataImages.size()));


        adapter = new MyAdapter(this, this, dataNames, dataImages); // Passing context to MyAdapter for getResources to get id for images
        recyclerView.setAdapter(adapter);
    }
}
