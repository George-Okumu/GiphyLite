package com.george.giphylite.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.george.giphylite.Datum;
import com.george.giphylite.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TrendingAdapter extends RecyclerView.Adapter {
    private List<Datum> mGifs;
    private Context mContext;

    public TrendingAdapter(Context context, List<Datum> gifs){
        this.mContext = context;
        this.mGifs = gifs;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.trending_response_list, parent, false);
        TrendingViewHolder viewHolder = new TrendingViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        holder.bindGifs(mGifs.get(position));
        ((TrendingViewHolder) holder).bindGifs(mGifs.get(position));
//        Picasso.get().load(gifs.getImages().getOriginal().getUrl()).into(gifImageHolder);


    }

//    @Override
//    public void onBindViewHolder(TrendingViewHolder holder, int position) {
//        holder.bindGifs(mGifs.get(position));
//    }

    @Override
    public int getItemCount() {
        return mGifs.size();
    }

//    public class TrendingViewHolder extends  RecyclerView.ViewHolder{
//        @BindView(R.id.gifImageHolder) ImageView gifImageHolder;
//        private Context thisContext;
//
//        public TrendingViewHolder(View itemView) {
//            super(itemView);
//            ButterKnife.bind(this, itemView);
//            thisContext = itemView.getContext();
//        }
//
//        public void bindGifs(Datum gifs){
//            Picasso.get().load(gifs.getImages().getOriginal().getUrl()).into(gifImageHolder);
//        }
//    }
}
