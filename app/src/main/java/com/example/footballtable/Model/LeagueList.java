package com.example.footballtable.Model;

public class LeagueList {
    private final Integer teamNumber;
    private final String teamName;

    private final Integer teamImage;
    private final String mp;
    private final String wins;
    private final String draws;
    private final String looses;
    private final String goalForward;
    private final String goalAgainst;
    private final String goalDifference;
    private final String points;


    public LeagueList(Integer teamNumber, Integer teamImage, String teamName, String mp, String wins, String draws, String looses, String goalForward, String goalAgainst, String goalDifference, String points) {
        this.teamNumber = teamNumber;
        this.teamImage = teamImage;
        this.teamName = teamName;
        this.mp = mp;
        this.wins = wins;
        this.draws = draws;
        this.looses = looses;
        this.goalForward = goalForward;
        this.goalAgainst = goalAgainst;
        this.goalDifference = goalDifference;
        this.points = points;
    }

    public Integer getTeamNumber() {
        return teamNumber;
    }

    public int getTeamImage() {
        return teamImage;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getMp() {
        return mp;
    }

    public String getWins() {
        return wins;
    }

    public String getDraws() {
        return draws;
    }

    public String getLooses() {
        return looses;
    }

    public String getGoalForward() {
        return goalForward;
    }

    public String getGoalAgainst() {
        return goalAgainst;
    }

    public String getGoalDifference() {
        return goalDifference;
    }

    public String getPoints() {
        return points;
    }
}
