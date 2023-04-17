package com.example.footballtable.Design;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.footballtable.Model.LeagueList;
import com.example.footballtable.R;


import java.util.ArrayList;

public class CastomAdapter extends BaseAdapter {
    private final Context context;
    private final ArrayList<LeagueList> tableList;

    public CastomAdapter(Context context, ArrayList<LeagueList> tableList) {
        this.context = context;
        this.tableList = tableList;
    }

    @Override
    public int getCount() {
        return tableList.size();
    }

    @Override
    public Object getItem(int position) {

        return tableList.get(position);
    }

    @Override
    public long getItemId(int id) {

        return id;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);

        TextView teamNumber = view.findViewById(R.id.team_id);
        ImageView teamImage = view.findViewById(R.id.team_image_id);
        TextView teamName = view.findViewById(R.id.team_name_id);
        TextView teamMp = view.findViewById(R.id.mp_id);
        TextView teamW = view.findViewById(R.id.wins_id);
        TextView teamD = view.findViewById(R.id.draws_id);
        TextView teamL = view.findViewById(R.id.loose_id);
        TextView teamGf = view.findViewById(R.id.goalForward_id);
        TextView teamGa = view.findViewById(R.id.goalAgainst_id);
        TextView teamGd = view.findViewById(R.id.goalDifference_id);
        TextView teamPoints = view.findViewById(R.id.points_id);



        teamNumber.setText(Integer.toString(tableList.get(position).getTeamNumber()));
        teamImage.setImageResource(tableList.get(position).getTeamImage());
        teamName.setText(tableList.get(position).getTeamName());
        teamMp.setText(tableList.get(position).getMp());
        teamW.setText(tableList.get(position).getWins());
        teamD.setText(tableList.get(position).getDraws());
        teamL.setText(tableList.get(position).getLooses());
        teamGf.setText(tableList.get(position).getGoalDifference());
        teamGa.setText(tableList.get(position).getGoalAgainst());
        teamGd.setText(tableList.get(position).getGoalDifference());
        teamPoints.setText(tableList.get(position).getPoints());


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Position" + position, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }


}
