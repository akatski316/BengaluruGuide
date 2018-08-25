package com.example.raunak.mytabs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class MyCultureRecyclerViewAdapter extends RecyclerView.Adapter<MyCultureRecyclerViewAdapter.CultureViewHolder> {

    Context mCtx;
    List<Culture> productList;

    public MyCultureRecyclerViewAdapter(Context mCtx, List<Culture> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public CultureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //..converting product_layout into view object
        View view = LayoutInflater.from(mCtx).inflate(R.layout.fragment_culture, parent, false);

        //..extracting data from view and construct a ProductViewHolder object
        CultureViewHolder cultureViewHolder = new CultureViewHolder(view);
        return cultureViewHolder;
    }

    @Override
    public void onBindViewHolder(MyCultureRecyclerViewAdapter.CultureViewHolder holder, int position) {
        Culture product = productList.get(position);

        holder.textViewtitle.setText(product.getCulture_name());
        holder.textViewDesp.setText(product.getDescription());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage(), null));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class CultureViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewtitle, textViewDesp;

        public CultureViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.cultureimage);
            textViewtitle = itemView.findViewById(R.id.culturetitle);
            textViewDesp = itemView.findViewById(R.id.culturedesp);


        }
    }
}
