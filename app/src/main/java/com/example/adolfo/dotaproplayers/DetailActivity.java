package com.example.adolfo.dotaproplayers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adolfo.dotaproplayers.model.Player;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    ImageView mImageViewImagen;
    TextView mTextViewName;
    TextView mTextViewSteamName;
    TextView mTextViewCountry;
    TextView mTextViewTeamName;
    Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Player player = new Player();

        mImageViewImagen = findViewById(R.id.player_image_view);
        mTextViewName = findViewById(R.id.player_name_text_view);
        mTextViewSteamName = findViewById(R.id.steam_name_text_view);
        mTextViewCountry = findViewById(R.id.country_text_view);
        mTextViewTeamName = findViewById(R.id.team_name_text_view);

        Intent detailIntent = DetailActivity.this.getIntent();

        if(detailIntent.hasExtra("player")){
            player = (Player) detailIntent.getSerializableExtra("player");
        }

        Log.d("DetailActivity", "Image Src: " + player.getName());

        Picasso.with(this).load(player.getAvatarfull()).into(mImageViewImagen);
        mTextViewName.setText(player.getPersonaname());
        mTextViewSteamName.setText(player.getName());
        mTextViewCountry.setText(player.getCountry_code());
        mTextViewTeamName.setText(player.getTeam_name());
    }
}
