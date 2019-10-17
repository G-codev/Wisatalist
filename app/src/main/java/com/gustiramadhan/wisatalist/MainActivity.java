package com.gustiramadhan.wisatalist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private  String[] dataName;
    private  String[] dataDescription;
    private TypedArray dataPhoto;
    private Adapter adapter;
    private ArrayList<Attaraction> places;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new Adapter(this);
        ListView listView = findViewById(R.id.lv_list);

        listView.setAdapter(adapter);


        prepare();
        additem();
    }

    private  void additem(){
        places =new ArrayList<>();

        for (int i = 0; i < dataName.length; i++){
            Attaraction place = new Attaraction();
            place.setImage(dataPhoto.getResourceId(i,-1));
            place.setPlaceName(dataName[i]);
            place.setDescription(dataDescription[i]);
            places.add(place);

        }
        adapter.setAttaraction(places);
    }

    private void prepare(){
        dataName = getResources().getStringArray((R.array.data_name));
        dataDescription = getResources().getStringArray(R.array.deskripsi);
        dataPhoto = getResources().obtainTypedArray(R.array.image);
    }
}

