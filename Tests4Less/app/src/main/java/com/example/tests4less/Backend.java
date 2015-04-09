package com.example.tests4less;

import java.util.ArrayList;

/**
 * Created by Pradeep on 10-04-2015.
 */
public class Backend extends android.app.Application {
    public static ArrayList<ResultItem> fetched;

    public static void fetchdata(){
        //fetch data from server and store it in fetched
        fetched=new ArrayList<ResultItem>();
        //sample input
        ResultItem temp;

        temp= new ResultItem(R.drawable.ic_launcher, "ABC","place",9000,700,40, (float) 3.8,0,0,"abcd\nefgh\njkl");





        fetched.add(temp);
        temp= new ResultItem(R.drawable.ic_launcher, "Patha2","place2",3000,900,60, (float) 4.5,0,0,"abcllld\nefglkjh\njkl");
        fetched.add(temp);
        temp= new ResultItem(R.drawable.ic_launcher, "Path3","place3",8000,5000,20, (float) 2.8,0,0,"efgh\njkl");
        fetched.add(temp);
        temp=new ResultItem(R.drawable.ic_launcher, "Path4","place4",8000,2000,50, (float) 4.8,0,0,"abcd\nefgh\njkl");
        fetched.add(temp);

    }
}
