package com.george.giphylite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.george.giphylite.adapter.TrendingAdapter;
import com.george.giphylite.network.GiphyApi;
import com.george.giphylite.network.TrendingClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "";
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;
    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;

    private TrendingAdapter trendingAdapter;
    public List<Datum> gifData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        GiphyApi giphyApi = TrendingClient.returnTrendingGifs();
        Call<TrendingResponse> call = giphyApi.getTrendingGifs("tv6yWZ56py5wWeWnm38aXowXMKW6DPr2", 20);

        call.enqueue(new Callback<TrendingResponse>() {
            @Override
            public void onResponse(Call<TrendingResponse> call, Response<TrendingResponse> response) {
                Log.d(TAG, "onResponse: Success");
                hideProgressBar();
                if(response.isSuccessful()){
                    gifData =response.body().getData();
//                    Log.d(TAG, "onResponse second: " + gifData);
                    trendingAdapter = new TrendingAdapter(MainActivity.this, gifData);
                    mRecyclerView.setAdapter(trendingAdapter);
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 3);
                    gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                    mRecyclerView.setLayoutManager(gridLayoutManager);
                    showGifs();
                }else{
                    showUnsuccessfulMessage();
                }

            }

            @Override
            public void onFailure(Call<TrendingResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: ", t);
                showFailureMessage();
            }
        });
    }

    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again!");
        mErrorTextView.setVisibility(View.VISIBLE);
    }
    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }
    private void showGifs() {
        mRecyclerView.setVisibility(View.VISIBLE);

    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }

}