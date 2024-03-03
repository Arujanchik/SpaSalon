package com.example.salon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ServicesAdapter extends RecyclerView.Adapter<ServicesAdapter.ViewHolder> {

    private List<ServiceItem> services;
    private LayoutInflater inflater;
    private ItemClickListener clickListener;

    // Конструктор
    public ServicesAdapter(Context context, List<ServiceItem> services) {
        this.inflater = LayoutInflater.from(context);
        this.services = services;
    }

    // Создание новых представлений
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_service, parent, false);

        return new ViewHolder(view);
    }

    // Заполнение виджетов данными
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ServiceItem service = services.get(position);
        holder.title.setText(service.getTitle());
//        holder.description.setText(service.getDescription());
        holder.image.setImageResource(service.getImageResourceId());
        holder.price.setText(service.getPrice()); // Установка цены
        holder.address.setText(service.getAddress()); // Установка адреса
    }

    // Возвращает размер данных
    @Override
    public int getItemCount() {
        return services.size();
    }

    // Хранит и перерабатывает представления для повторного использования
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
//        TextView description;
        ImageView image;
        TextView price; // Добавить цену
        TextView address; // Добавить адрес

        ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.service_title);
//            description = itemView.findViewById(R.id.service_description);
            image = itemView.findViewById(R.id.service_image);
            price = itemView.findViewById(R.id.service_price); // Инициализация
            address = itemView.findViewById(R.id.service_address); // Инициализация
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (clickListener != null) clickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // Родительская активность будет реализовывать этот метод для реагирования на щелчки
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    // Позволяет ловить щелчки
    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }
}
