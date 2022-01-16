package com.rubbertrampit.quartzsite;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter
        extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<String> dataNames;
    private List<String> dataImages;
    Activity activity;
    Context mContext;

    public MyAdapter(Context context, Activity activity,
                     List<String> dataNames, List<String> dataImages)
    {
        this.dataNames = dataNames;
        this.dataImages = dataImages;
        this.activity = activity;
        mContext = context;
    }

    // This method is used to attach
    // custom layout to the recycler view
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType)
    {
        LayoutInflater LI
                = activity.getLayoutInflater();
        View vw = LI.inflate(
                R.layout.custom_layout, null);
        return new ViewHolder(vw);
    }

    // This method is used to set the action
    // to the widgets of our custom layout.
    @Override
    public void onBindViewHolder(
            @NonNull ViewHolder holder,
            int position)
    {

        holder.name.setText(dataNames.get((position)));
        int resId = getImageResourceId(mContext, dataImages.get(position));
        holder.image.setImageResource(resId);
    }

    @Override
    public int getItemCount()
    {
        return dataNames.size();
    }

    class ViewHolder
            extends RecyclerView.ViewHolder {
        TextView name;
        ImageView image;

        public ViewHolder(View itemView)
        {
            super(itemView);
            name  = (TextView) itemView.findViewById(R.id.textView);
            image = (ImageView) itemView.findViewById(R.id.image);
        }
    }

    // Get image id

    private int getImageResourceId(Context mContext, String mImageName){
        int resID = mContext.getResources().getIdentifier(mImageName , "drawable", mContext.getPackageName());

        return resID;
    }
}


