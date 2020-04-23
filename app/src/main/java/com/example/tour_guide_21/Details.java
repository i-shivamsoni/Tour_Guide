package com.example.tour_guide_21;

public class Details {

    private String nameOfPlace;
    private String desOfPlace;
    private int mImageResourceId;

    public Details(String nameOfPlace, String desOfPlace, int mImageResourceId) {
        this.nameOfPlace = nameOfPlace;
        this.desOfPlace = desOfPlace;
        this.mImageResourceId = mImageResourceId;
    }

    public String getNameOfPlace() {
        return nameOfPlace;
    }

    public String getDesOfPlace() {
        return desOfPlace;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
