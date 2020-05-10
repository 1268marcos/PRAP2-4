package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TVSerie")


public class TVSerie {

    

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "TVSerieId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "TVSerieTitle")
    private String mTilte;

    private String mPersonage;

    public Museum(@Nullable String title, String personage, int score, String creationDate) {
        mTitle = title;
        mPersonage = Personage;
        mScore = score;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getPersonage() {
        return mPersonage;
    }

    public void setPersonage(String personage) {
        mPersonage = personage;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
        mScore = score;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mScore;
    private String mCreationDate;

}
