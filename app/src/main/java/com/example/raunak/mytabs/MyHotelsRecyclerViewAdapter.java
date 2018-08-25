package com.example.raunak.mytabs;

import android.content.Context;
import android.media.Rating;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import static android.os.Build.VERSION_CODES.M;

public class MyHotelsRecyclerViewAdapter extends RecyclerView.Adapter<MyHotelsRecyclerViewAdapter.HotelViewHolder> {

    Context mCtx;
    List<Hotel> HotelList;

    public MyHotelsRecyclerViewAdapter(Context mCtx, List<Hotel> productList) {
        this.mCtx = mCtx;
        this.HotelList = productList;
    }

    @Override
    public MyHotelsRecyclerViewAdapter.HotelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //..converting product_layout into view object
        View view = LayoutInflater.from(mCtx).inflate(R.layout.fragment_hotels, parent, false);

        //..extracting data from view and construct a ProductViewHolder object
        MyHotelsRecyclerViewAdapter.HotelViewHolder hotelViewHolder = new MyHotelsRecyclerViewAdapter.HotelViewHolder(view);
        return hotelViewHolder;
    }

    @Override
    public void onBindViewHolder(MyHotelsRecyclerViewAdapter.HotelViewHolder holder, int position) {
        Hotel product = HotelList.get(position);

        holder.textViewname.setText(product.getHotelname());
        holder.textViewstar.setText(product.getStar());
        holder.textViewAddress.setText(product.getAddress());
        holder.textviewPrice.setText(String.valueOf(product.getPrice()));
        holder.ratebar.setNumStars(product.getRate());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage(), null));
    }

    @Override
    public int getItemCount() {
        return HotelList.size();
    }

    static class HotelViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewname, textViewstar,textViewAddress, textviewPrice;
        RatingBar ratebar;

        public HotelViewHolder(View itemView) {

            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textViewname = itemView.findViewById(R.id.hotelname);
            textViewstar = itemView.findViewById(R.id.hotelstars);
            textViewAddress = itemView.findViewById(R.id.hoteladdress);
            textviewPrice = itemView.findViewById(R.id.hotelprice);
            ratebar = itemView.findViewById(R.id.rating);

        }
    }
}
