package com.example.naman.stayuncleprototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    RecyclerView mrecyclerView;
    RecyclerView.Adapter madapter;
    RecyclerView.LayoutManager layoutManager;
    private ArrayList<Hotel_Details_POJO.HotelDetails> cardDetails;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardDetails = new ArrayList<>();


    Hotel_Details_POJO.HotelDetails ob=new Hotel_Details_POJO.HotelDetails(R.drawable.hotel,
            "Gaba Corporate Suites",
            "122 BS 100,Sector 70,Noida",
            true,true,true,true,2222);
        cardDetails.add(ob);

        Hotel_Details_POJO.HotelDetails ob1=new Hotel_Details_POJO.HotelDetails(R.drawable.hotel2,
                "The Grand Vikalp",
                "C-48A, Greater Kailash I, New Delhi, Delhi 110048",
                true,true,true,true,3418);
        cardDetails.add(ob1);

        Hotel_Details_POJO.HotelDetails ob2=new Hotel_Details_POJO.HotelDetails(R.drawable.hotel3,
                "Dusit Devarana",
                "NH-8 ,Samalkha, New Delhi, Delhi 110037",
                true,true,true,true,10000);
        cardDetails.add(ob2);

        mrecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(this);
        mrecyclerView.setLayoutManager(layoutManager);
        mrecyclerView.setHasFixedSize(true);
        madapter = new CardViewAdapter(cardDetails,this);
        mrecyclerView.setAdapter(madapter);
    }
}
