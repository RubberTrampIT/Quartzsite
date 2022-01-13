package com.rubbertrampit.quartzsite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity
        extends AppCompatActivity {

//    private static RecyclerView.Adapter adapter;
//    private static RecyclerView recyclerView;
//    public static List<String> data;
//    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        recyclerView
//                = findViewById(R.id.my_recycler_view);
//
//        db = new DatabaseHelper(this);
//        recyclerView.setLayoutManager(
//                new LinearLayoutManager(this));
//        data = new ArrayList<>();
//        fetchData();

        // Launch Restaurants activity
        Button button1 = (Button) findViewById(R.id.button_main_restaurants);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Activity_Restaurants.class);
                view.getContext().startActivity(intent);}
        });

    }

//    public void fetchData()
//    {
//        // Before fetching the data
//        // directly from the database.
//        // first we have to creates an empty
//        // database on the system and
//        // rewrites it with your own database.
//        // Then we have to open the
//        // database to fetch the data from it.
//        db = new DatabaseHelper(this);
//        try {
//            db.createDataBase();
//            db.openDataBase();
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        data = db.getAlgorithmTopics(this);
//        adapter = new MyAdapter(this, data);
//        recyclerView.setAdapter(adapter);
//    }
}
