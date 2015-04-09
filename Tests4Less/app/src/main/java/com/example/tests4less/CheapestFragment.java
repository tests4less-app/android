package com.example.tests4less;

import com.example.tests4less.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class CheapestFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_cheapest, container, false);




        ListView listView=(ListView)rootView.findViewById(R.id.listViewResult_cheap);

        View header = (View)getActivity().getLayoutInflater().inflate(R.layout.listview_header_row, null);

        cheapest_sort();
        ResultItem []array = new ResultItem[Backend.fetched.size()];
        Backend.fetched.toArray(array);
        ResultItemArrayAdapter topRatedAdapter =new ResultItemArrayAdapter(getActivity(), R.layout.listview_item_row, array);
        listView.addHeaderView(header);

        listView.setAdapter(topRatedAdapter);

		return rootView;
	}

    public void cheapest_sort(){
        //sort fetched in cheapest order
    }
}
