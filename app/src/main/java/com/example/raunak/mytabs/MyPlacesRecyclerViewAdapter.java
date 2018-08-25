package com.example.raunak.mytabs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyPlacesRecyclerViewAdapter extends RecyclerView.Adapter<MyPlacesRecyclerViewAdapter.PlaceViewHolder> {

        Context mCtx;
        List<Place> productList;

    public MyPlacesRecyclerViewAdapter(Context mCtx, List<Place> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }


    @Override
        public PlaceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            //..converting product_layout into view object
            View view = LayoutInflater.from(mCtx).inflate(R.layout.fragment_places, parent, false);

            //..extracting data from view and construct a ProductViewHolder object
            PlaceViewHolder productViewHolder = new PlaceViewHolder(view);
            return productViewHolder;
        }

        @Override
        public void onBindViewHolder(MyPlacesRecyclerViewAdapter.PlaceViewHolder holder, int position) {
            Place product = productList.get(position);

            holder.textViewtitle.setText(product.getPlace_name());
            holder.textViewDesp.setText(product.getDescription());
            holder.textViewAddress.setText(product.getAddress());
            holder.textViewhours.setText(String.valueOf(product.getHours()));

            holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage(), null));
        }

        @Override
        public int getItemCount() {
            return productList.size();
        }

        static class PlaceViewHolder extends RecyclerView.ViewHolder {

            ImageView imageView;
            TextView textViewtitle, textViewDesp, textViewAddress, textViewhours;

            public PlaceViewHolder(View itemView) {
                super(itemView);

                imageView = itemView.findViewById(R.id.placeimage);
                textViewtitle = itemView.findViewById(R.id.placetitle);
                textViewDesp = itemView.findViewById(R.id.placedesp);
                textViewAddress = itemView.findViewById(R.id.placeadd);
                textViewhours = itemView.findViewById(R.id.placehours);


            }
        }
    }




