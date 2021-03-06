package com.example.zhonghuajia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by peple on 2018/8/12.
 */

public class PlantAdapter extends ArrayAdapter<Plant> {

    private int resourceId;

    public PlantAdapter(Context context, int textViewResourceId, List<Plant> objects){
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Plant plant = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ImageView plantImage = (ImageView) view.findViewById(R.id.plant_image);
        TextView plantName = (TextView) view.findViewById(R.id.plant_name);
        plantImage.setImageResource(plant.getImageId());
        plantName.setText(plant.getName());
        return view;
    }
}
