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
public class Intrest extends Fragment {

    View view;


    public Intrest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_intrest, container, false);
        ArrayList<Details> detail = new ArrayList<Details>();
        detail.add(new Details(getString(R.string.VanVihar), getString(R.string.VanViharDes), R.drawable.van_vihar));
        detail.add(new Details(getString(R.string.Upperlake), getString(R.string.UpperlakeDes), R.drawable.upper_lake));
        detail.add(new Details(getString(R.string.BoatClub), getString(R.string.BoatClubDes), R.drawable.boatclub));
        detail.add(new Details(getString(R.string.SairSapata), getString(R.string.SairSapataDes), R.drawable.sairsapata));
        detail.add(new Details(getString(R.string.LowerLake), getString(R.string.LowerLakeDes), R.drawable.viewpoint));


        DetailsAdapter detailsAdapter = new DetailsAdapter(Objects.requireNonNull(getActivity()), detail);


        ListView listView = view.findViewById(R.id.List_intrest);
        assert listView != null;
        listView.setAdapter(detailsAdapter);
        return view;
    }
}
