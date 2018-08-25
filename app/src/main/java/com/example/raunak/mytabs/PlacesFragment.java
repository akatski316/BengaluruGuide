package com.example.raunak.mytabs;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.raunak.mytabs.dummy.DummyContent;
import com.example.raunak.mytabs.dummy.DummyContent.DummyItem;

import java.util.ArrayList;
import java.util.List;

public class PlacesFragment extends Fragment {

    RecyclerView recyclerView;
    MyPlacesRecyclerViewAdapter adapter;
    List<Place> productList;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_places_list, container, false);
        // Inflate the layout for this fragment
        recyclerView = v.findViewById(R.id.list);
        //Log.d(TAG, "onCreateView: "+recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new MyPlacesRecyclerViewAdapter(getContext(),productList);
        recyclerView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return v;
    }

    @Override
    public void onCreate(Bundle savedInstance)
    {
        super.onCreate(savedInstance);

        productList = new ArrayList<>();


        productList.add(new Place(R.mipmap.bannerghata,"BANNERGHATA NATIONAL PARK","Lion and Tiger Safari,Bear Safari","Address:Bannerghatta Main Rd, Bannerughatta, Bengaluru, Karnataka 560083"
                ,"Hours: Mon, Wed-Sun 9AM–5PM Tue Closed"));

        productList.add(new Place(R.mipmap.lalbagh,getString(R.string.lalbaghtitle),getString(R.string.lalbaghdesp),getString(R.string.lalbaghadd),getString(R.string.lalbaghhours)));

        productList.add(new Place(R.mipmap.wonderla,getString(R.string.wonderlatitle),getString(R.string.wonderladesp),getString(R.string.wonderlaadd),getString(R.string.wonderlahours)));
        productList.add(new Place(R.mipmap.stadium,getString(R.string.stadiumtitle),getString(R.string.stadiumdesp),getString(R.string.stadiumadd),getString(R.string.stadiumhours)));

        productList.add(new Place(R.mipmap.iskon,getString(R.string.iskontitle),getString(R.string.iskondesp),getString(R.string.iskonadd),getString(R.string.iskonhours)));
    }
}

