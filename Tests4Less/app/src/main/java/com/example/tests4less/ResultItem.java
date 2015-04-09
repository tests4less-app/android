package com.example.tests4less;

/**
 * Created by Pradeep on 10-04-2015.
 */


public class ResultItem {
    public int icon,priceActual,priceOffered,ratingNo;
    public float ratingAVG,PostionLong,PostitionLat;
    public String name,place,features;


    public ResultItem() {
        super();
    }

    public ResultItem(int icon, String name,String place,int priceActual,int priceOffered,int ratingNo,float ratingAVG,float longi,float lati,String features) {
        super();
        this.icon = icon;
        this.name = name;
        this.priceActual=priceActual;
        this.priceOffered=priceOffered;
        this.ratingNo=ratingNo;
        this.ratingAVG=ratingAVG;
        this.PostionLong=longi;
        this.PostitionLat=lati;
        this.features=features;
    }
}