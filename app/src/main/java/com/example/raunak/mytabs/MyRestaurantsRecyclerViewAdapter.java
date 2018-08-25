package com.example.raunak.mytabs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

//import com.example.raunak.mytabs.RestaurantsFragment.OnListFragmentInteractionListener;
import com.example.raunak.mytabs.dummy.DummyContent.DummyItem;

import java.util.List;


public class MyRestaurantsRecyclerViewAdapter extends RecyclerView.Adapter<MyRestaurantsRecyclerViewAdapter.FoodViewHolder> {

    Context mCtx;
    List<Food> productList;

    public MyRestaurantsRecyclerViewAdapter(Context mCtx, List<Food> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public FoodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //..converting product_layout into view object
        View view = LayoutInflater.from(mCtx).inflate(R.layout.fragment_restaurants, parent, false);

        //..extracting data from view and construct a ProductViewHolder object
        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(FoodViewHolder holder, int position) {
        Food product = productList.get(position);

        holder.textViewDish.setText(product.getDish_name());
        holder.textViewRestaurant.setText(product.getResturant());
        holder.textViewAddress.setText(product.getAddress());
        holder.textviewPrice.setText(String.valueOf(product.getPrice()));
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage(), null));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    static class FoodViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewDish, textViewRestaurant,textViewAddress, textViewRating, textviewPrice;
        public FoodViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewDish = itemView.findViewById(R.id.dishname);
            textViewRestaurant = itemView.findViewById(R.id.restaurant);
            textViewAddress = itemView.findViewById(R.id.address);
            textViewRating = itemView.findViewById(R.id.rating);
            textviewPrice = itemView.findViewById(R.id.price);

        }
    }
}
