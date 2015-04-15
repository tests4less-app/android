package com.example.tests4less;

import com.example.tests4less.R;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.json.JSONException;

public class TopRatedFragment extends Fragment {
   static ListView listView;
   static ResultItemArrayAdapter topRatedAdapter;
    static ResultItem []array;
    static ProgressDialog pDialog;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {




       /*
        if(Backend.NeedUpdate) {

            pDialog = new ProgressDialog(getActivity());
            pDialog.setMessage("Loading...");
            pDialog.show();
            try {
                Backend.fetchdata();//fetches data and stores them in fetched[] Array
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
*/

		View rootView = inflater.inflate(R.layout.fragment_top_rated, container, false);
        listView=(ListView)rootView.findViewById(R.id.listViewResult_top);

        View header = (View)getActivity().getLayoutInflater().inflate(R.layout.listview_header_row, null);

        topRated_sort();
       // array = new ResultItem[Backend.fetched.size()];
        //Backend.fetched.toArray(array);
         topRatedAdapter =new ResultItemArrayAdapter(getActivity(), R.layout.listview_item_row, Backend.fetched);
        listView.addHeaderView(header);

        listView.setAdapter(topRatedAdapter);


		return rootView;
	}
    public static void topRated_sort(){
        //sort fetched in toprated order
    }
    static public void loadView(){


        topRated_sort();

       topRatedAdapter.updateAdapter(Backend.fetched);
        listView.invalidate();
        listView.invalidateViews();
        Backend.NeedUpdate=false;

        CategorySearch.pDialog.hide();
       // topRatedAdapter.notifyDataSetChanged();





    }
}
