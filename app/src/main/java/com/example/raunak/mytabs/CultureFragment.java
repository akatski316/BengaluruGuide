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

public class CultureFragment extends Fragment {

    RecyclerView recyclerView;
    MyCultureRecyclerViewAdapter adapter;
    List<Culture> productList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_culture_list, container, false);
        // Inflate the layout for this fragment
        recyclerView = v.findViewById(R.id.list);
        //Log.d(TAG, "onCreateView: "+recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new MyCultureRecyclerViewAdapter(getContext(), productList);
        recyclerView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return v;
    }

    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);

        productList = new ArrayList<>();

        productList.add(new Culture(R.mipmap.ganesh, getString(R.string.ganeshtitle), getString(R.string.ganeshdesp)));
        productList.add(new Culture(R.mipmap.gowri, getString(R.string.gowrititle), getString(R.string.gowridesp)));
        productList.add(new Culture(R.mipmap.hampi, getString(R.string.hampititle), getString(R.string.hampidesp)));
        productList.add(new Culture(R.mipmap.dress, getString(R.string.dresstitle), getString(R.string.dressdesp)));
        productList.add(new Culture(R.mipmap.dance, getString(R.string.dancetitle), getString(R.string.dancedesp)));
        productList.add(new Culture(R.mipmap.art, getString(R.string.arttitle), getString(R.string.artdesp)));
        productList.add(new Culture(R.mipmap.lang, getString(R.string.langatitle), getString(R.string.langadesp)));


    }
}
