package com.gustiramadhan.wisatalist;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    private Context context;
    private ArrayList<Attaraction> places= new ArrayList<>();
    public void setAttaraction(ArrayList<Attaraction> places){

        this.places = places;
    }


    public Adapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return places.size();
    }

    @Override
    public Object getItem(int i) {
        return places.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context)
                    .inflate(R.layout.itemlist,viewGroup,false);
        }
        ViewHolder viewHolder = new ViewHolder(view);
        Attaraction place = (Attaraction) getItem(i);
        viewHolder.bind(place);

        return view;
    }

    private class ViewHolder{
        private TextView txtName;
        private TextView txtDescription;
        private ImageView imgphoto;

        ViewHolder (View view){
            txtName = view.findViewById(R.id.txtname);
            txtDescription = view.findViewById(R.id.txt_descripsi);
            imgphoto = view.findViewById(R.id.img_photo);
        }
        void  bind (Attaraction places){
            txtName.setText(places.getPlaceName());
            txtDescription.setText(places.getDescription());
            imgphoto.setImageResource(places.getImage());

        }
    }
}
