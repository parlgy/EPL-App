package com.example.footballtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.footballtable.Design.CastomAdapter;
import com.example.footballtable.Model.LeagueList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<LeagueList> league_list;
    CastomAdapter castomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        listShow();
        castomAdapter = new CastomAdapter(this,league_list);
        listView.setAdapter(castomAdapter);


    }

    private void listShow(){
        league_list = new ArrayList<>();

        league_list.add(new LeagueList(1, R.drawable.arsenal, "Arsenal", "28","22", "3", "3", "66", "26", "40", "69"));
        league_list.add(new LeagueList(2, R.drawable.city, "Man City", "27","19", "4", "4", "67", "25", "42", "61"));
        league_list.add(new LeagueList(3, R.drawable.man_u, "Man U", "26","15", "5", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(4, R.drawable.newcastle, "Newcastle", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(5, R.drawable.tote, "Tottenham", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(6, R.drawable.villa, "Aston Villa", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(7, R.drawable.brignton, "Brighton", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(8, R.drawable.liverpool, "Liverpool", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(9, R.drawable.brent, "Brentford", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(10, R.drawable.fulham, "Fulham", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(11, R.drawable.newcastle, "Chelsea", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(12, R.drawable.crystalpalace, "Crystal Palace", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(13, R.drawable.wolves, "Wolves", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(14, R.drawable.bonmouth, "Bournmouth", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(15, R.drawable.westham, "West Ham", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(16, R.drawable.leads, "Leads United", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(17, R.drawable.evaton, "Everton", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(18, R.drawable.nottm, "Nottm Forest", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(19, R.drawable.leister, "Leicester City", "30","15", "11", "6", "41", "35", "6", "50"));
        league_list.add(new LeagueList(20, R.drawable.southampton, "Southampton", "30","15", "11", "6", "41", "35", "6", "50"));
    }
}