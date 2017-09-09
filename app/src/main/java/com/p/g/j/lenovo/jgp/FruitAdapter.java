package com.p.g.j.lenovo.jgp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by lenovo on 2017/9/6.
 */

public class FruitAdapter extends RecyclerView.Adapter <FruitAdapter.ViewHolder>{
    private Context mContext;
    private List<Fruit> mFruitList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView imageView;
        TextView fruitName;
        TextView description ;
        public ViewHolder(View view){
            super(view);
            cardView = (CardView) view;
            imageView = (ImageView)view.findViewById(R.id.fruit_image);
            fruitName =(TextView)view.findViewById(R.id.item_name);
            description = (TextView)view.findViewById(R.id.description);
        }
    }
    public FruitAdapter(List<Fruit> fruitList){
        mFruitList = fruitList;
    }
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        if(mContext == null){
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.fruit_item,parent,false);
        return  new ViewHolder(view);
    }
    public void onBindViewHolder(ViewHolder holder,int position){
        Fruit fruit = mFruitList.get(position);
        holder.description.setText(fruit.getName());
        Glide.with(mContext).load(fruit.getImageId()).into(holder.imageView);
    }
    public int getItemCount(){
        return mFruitList.size();
    }
}
