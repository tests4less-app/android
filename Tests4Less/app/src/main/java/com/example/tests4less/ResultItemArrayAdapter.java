package com.example.tests4less;

/**
 * Created by Pradeep on 10-04-2015.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;






public class ResultItemArrayAdapter extends ArrayAdapter<ResultItem> {
    Context context;
    int layoutResourceId;
    ResultItem  data[] = null;

    public ResultItemArrayAdapter(Context context, int layoutResourceId, ResultItem [] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ResultHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new ResultHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            holder.name = (TextView)row.findViewById(R.id.nameView);
            holder.place= (TextView)row.findViewById(R.id.placeView);
            holder.features=(TextView)row.findViewById(R.id.featureView);
            holder.priceActual=(TextView)row.findViewById(R.id.priceAView);
            holder.priceOffered=(TextView)row.findViewById(R.id.priceOView);
            holder.ratingNO=(TextView)row.findViewById(R.id.ratingView);
            holder.ratingAVG=(RatingBar)row.findViewById(R.id.ratingBar);


            row.setTag(holder);
        }
        else
        {
            holder = (ResultHolder)row.getTag();
        }

        ResultItem tmp = data[position];
        holder.name.setText(tmp.name);
        holder.priceActual.setText(Integer.toString(tmp.priceActual));

        holder.priceOffered.setText(Integer.toString(tmp.priceOffered));
        holder.place.setText(tmp.place);
        holder.ratingAVG.setRating(tmp.ratingAVG);
        holder.ratingNO.setText("("+Integer.toString(tmp.ratingNo)+" ratings)");
        holder.features.setText(tmp.features);

        holder.imgIcon.setImageResource(tmp.icon);//// change this

        return row;
    }

    static class ResultHolder
    {
        ImageView imgIcon;
        TextView name,place,features,ratingNO,priceOffered,priceActual;
        RatingBar ratingAVG;



    }
}
