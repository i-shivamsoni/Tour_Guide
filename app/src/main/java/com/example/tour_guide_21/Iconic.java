package com.example.tour_guide_21;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class Iconic extends Fragment {
    View view;

    public Iconic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_iconic, container, false);
        ArrayList<Details> detailI = new ArrayList<Details>();

        detailI.add(new Details(getString(R.string.Bharat), getString(R.string.BharatDes), R.drawable.bharat_bhavan));
        detailI.add(new Details(getString(R.string.National), getString(R.string.NationalDes), R.drawable.museum));
        detailI.add(new Details(getString(R.string.Uday), getString(R.string.Udaydes), R.drawable.udayagiri));
        detailI.add(new Details(getString(R.string.Manu), getString(R.string.ManuDes), R.drawable.manua_bhan));
        detailI.add(new Details(getString(R.string.Yodhasthal), getString(R.string.YodhasthalDes), R.drawable.yodhasthal));

        DetailsAdapter detailsAdapterI = new DetailsAdapter(Objects.requireNonNull(getActivity()), detailI);
        ListView listViewI = view.findViewById(R.id.list_icon);
        assert listViewI != null;
        listViewI.setAdapter(detailsAdapterI);
        return view;
    }
}
