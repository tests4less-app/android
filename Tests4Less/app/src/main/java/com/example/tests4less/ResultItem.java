package com.example.tests4less;

/**
 * Created by Pradeep on 10-04-2015.
 */


public class ResultItem {
    public int icon,priceActual,priceOffered,ratingNo;
    public Double ratingAVG,PostionLong,PostitionLat;
    public String name,place,features,imgURL;


    public ResultItem() {
        super();
    }

    public ResultItem(int icon, String name,String place,int priceActual,int priceOffered,int ratingNo,Double ratingAVG,Double longi,Double lati,String features) {
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