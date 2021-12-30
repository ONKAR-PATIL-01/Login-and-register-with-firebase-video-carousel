package com.example.company_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.asura.library.posters.Poster;
import com.asura.library.posters.RawVideo;
import com.asura.library.posters.RemoteImage;
import com.asura.library.posters.RemoteVideo;
import com.asura.library.views.PosterSlider;
import com.yihsian.slider.library.SliderItemView;
import com.yihsian.slider.library.SliderLayout;

import java.util.ArrayList;
import java.util.List;

import static com.yihsian.slider.library.SliderItemView.*;

public class Dashboard extends AppCompatActivity {
     Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        b1=findViewById(R.id.b111);

        PosterSlider posterSlider =  findViewById(R.id.poster_slider);
        List<Poster> posters=new ArrayList<>();


        posters.add(new RawVideo(R.raw.v2));
        posters.add(new RawVideo(R.raw.v3));
        posters.add(new RawVideo(R.raw.v4));

        posterSlider.setPosters(posters);
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
           startActivity(new Intent(Dashboard.this,reward.class));
            }
        });




    }
}