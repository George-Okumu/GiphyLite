package com.george.giphylite.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.george.giphylite.Datum;
import com.george.giphylite.R;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TrendingViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.gifImageHolder) ImageView gifImageHolder;
        private Context thisContext;

        public TrendingViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            thisContext = itemView.getContext();
        }

        public void bindGifs(Datum gifs){
            Picasso.get().load(gifs.getImages().getOriginal().getUrl()).into(gifImageHolder);
        }
}
