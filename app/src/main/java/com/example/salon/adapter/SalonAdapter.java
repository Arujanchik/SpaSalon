package com.example.salon.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.salon.R;
import com.example.salon.models.Salon;

import java.util.List;

public class SalonAdapter extends RecyclerView.Adapter<SalonAdapter.SalonViewHolder> {

    private List<Salon> salonList;

    public SalonAdapter(List<Salon> salonList) {
        this.salonList = salonList;
    }

    @Override
    public SalonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_salon, parent, false);
        return new SalonViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SalonViewHolder holder, int position) {
        Salon salon = salonList.get(position);
        holder.salonName.setText(salon.getName());
        holder.salonAddress.setText(salon.getAddress());
        holder.salonRating.setRating((float) salon.getRating());
        holder.salonImage.setImageResource(salon.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return salonList.size();
    }

    public static class SalonViewHolder extends RecyclerView.ViewHolder {
        public TextView salonName, salonAddress;
        public RatingBar salonRating;
        public ImageView salonImage;

        public SalonViewHolder(View view) {
            super(view);
            salonName = view.findViewById(R.id.text_view_salon_name);
            salonAddress = view.findViewById(R.id.text_view_salon_address);
            salonRating = view.findViewById(R.id.rating_bar_salon);
            salonImage = view.findViewById(R.id.image_view_salon);
        }
    }
}

