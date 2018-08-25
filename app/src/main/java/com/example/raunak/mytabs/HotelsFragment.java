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

public class HotelsFragment extends Fragment {

    RecyclerView recyclerView;
    MyHotelsRecyclerViewAdapter adapter;
    List<Hotel> hotelList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_hotels_list, container, false);

        recyclerView = v.findViewById(R.id.list);
        //Log.d(TAG, "onCreateView: "+recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new MyHotelsRecyclerViewAdapter(getContext(),hotelList);
        recyclerView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return v;
    }

    @Override
    public void onCreate(Bundle savedInstance)
    {
        super.onCreate(savedInstance);

        hotelList = new ArrayList<>();

        hotelList.add(new Hotel(R.mipmap.leelapalace,getString(R.string.leelapalace),getString(R.string.leelastar),getString(R.string.leelaaddress),getString(R.string.leelaprice),5));
        hotelList.add(new Hotel(R.mipmap.taj,getString(R.string.taj),getString(R.string.tajstar),getString(R.string.tajaddress),getString(R.string.tajprice),4));
        hotelList.add(new Hotel(R.mipmap.windsor,getString(R.string.windsor),getString(R.string.windsorstar),getString(R.string.windsoraddress),getString(R.string.windsorprice),5));
        hotelList.add(new Hotel(R.mipmap.lemeridian,getString(R.string.le),getString(R.string.leelastar),getString(R.string.leelaaddress),getString(R.string.leelaprice),5));
        hotelList.add(new Hotel(R.mipmap.palms,getString(R.string.palms),getString(R.string.palmstar),getString(R.string.palmaddress),getString(R.string.palmprice),5));
    }
}
