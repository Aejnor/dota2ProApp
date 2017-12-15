package com.example.adolfo.dotaproplayers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;

import com.example.adolfo.dotaproplayers.model.Player;

import java.net.URL;
import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    ListView mListViewPlayers;
    ArrayList<Player> mListaPlayers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListViewPlayers = findViewById(R.id.list_view_players);

        final ArrayAdapter<Player> adapter = new ArrayAdapter<Player>(
                this,
                R.layout.list_item_players,
                R.id.text_view_player,
                mListaPlayers
        );

        mListViewPlayers.setAdapter(adapter);

        mListViewPlayers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent detailIntent = new Intent(
                        MainActivity.this,
                        DetailActivity.class);
                detailIntent.putExtra("player", mListaPlayers.get(position));
                startActivity(detailIntent);
            }
        });

        AsyncHttpClient client = new AsyncHttpClient();
        client.get(getString(R.string.URL)+ getString(R.string.API),
                new TextHttpResponseHandler() {
                    @Override
                    public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                        Log.e("MainActivity", "El guaifai no funsiona !!!");
                    }

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, String responseString) {
                        Log.d("MainActivity", "OK->Response:" + responseString);
                        Gson gson = new GsonBuilder().create();
                        Player[] players = gson.fromJson(responseString, Player[].class);
                        adapter.clear();
                        for (Player player : players) {
                            adapter.add(player);
                        }
                    }
                });
    }
}