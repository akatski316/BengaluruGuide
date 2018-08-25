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

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link HotelsFragment.OnListFragmentInteractionListener}
 * interface.
 */
public class RestaurantsFragment extends Fragment {

    RecyclerView recyclerView;
    MyRestaurantsRecyclerViewAdapter adapter;
    List<Food> productList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_restaurants_list, container, false);

        recyclerView = v.findViewById(R.id.list);
        //Log.d(TAG, "onCreateView: "+recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new MyRestaurantsRecyclerViewAdapter(getContext(),productList);
        recyclerView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return v;
    }

    @Override
    public void onCreate(Bundle savedInstance)
    {
        super.onCreate(savedInstance);

        productList = new ArrayList<>();

        productList.add(new Food(R.mipmap.meghanabiryani,"CHICKEN BIRYANI","Meghna Foods",getString(R.string.meghnaaddress),getString(R.string.meghnaprice),getString(R.string.meghnarating)));
        productList.add(new Food(R.mipmap.punjabirasoi,getString(R.string.chola),getString(R.string.punjabirasoi),getString(R.string.punjabirasoiaddress),getString(R.string.punjabirasoiprice),getString(R.string.punjabirasoirating)));
        productList.add(new Food(R.mipmap.chinnese,getString(R.string.exoticvegetables),getString(R.string.mainlandchinnese),getString(R.string.mainlandaddress),getString(R.string.mainlandprice),getString(R.string.mainlandrating)));
        productList.add(new Food(R.mipmap.sandwich,getString(R.string.sandwichtittle),getString(R.string.harisupersandwich),getString(R.string.harisandwichaddresss),getString(R.string.harisandwichprice),getString(R.string.harisandwichrating)));
        productList.add(new Food(R.mipmap.iyermess,getString(R.string.southindianfood),getString(R.string.udipigrand),getString(R.string.udipigrandaddress),getString(R.string.southindianprice),getString(R.string.southindianrating)));

    }
}
