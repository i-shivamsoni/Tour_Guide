package com.example.tour_guide_21;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DetailsAdapter extends ArrayAdapter<Details> {

    public DetailsAdapter(@NonNull Context context, @NonNull ArrayList<Details> dtls) {
        super(context, 0, dtls);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_model, parent, false);
        }

        Details currentdetails = getItem(position);
        TextView nameOfPlace = listItemView.findViewById(R.id.tv_name);
        assert currentdetails != null;
        nameOfPlace.setText(currentdetails.getNameOfPlace());

        TextView desOfPlace = listItemView.findViewById(R.id.tv_des);
        desOfPlace.setText(currentdetails.getDesOfPlace());

        ImageView imageView = listItemView.findViewById(R.id.Img_view);
        imageView.setImageResource(currentdetails.getmImageResourceId());

        return listItemView;
    }
}
