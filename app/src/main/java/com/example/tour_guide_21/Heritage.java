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
public class Heritage extends Fragment {
    View view;

    public Heritage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_heritage, container, false);
        ArrayList<Details> detailH = new ArrayList<Details>();
        detailH.add(new Details(getString(R.string.Bhimbetka), getString(R.string.BhimbetkaDes), R.drawable.bhimbetka_caves));
        detailH.add(new Details(getString(R.string.Raisen), getString(R.string.RaisenDes), R.drawable.raisen_fort));
        detailH.add(new Details(getString(R.string.Bhojpur), getString(R.string.BhojpurDes), R.drawable.bhojpur));
        detailH.add(new Details(getString(R.string.MotiMasjid), getString(R.string.MotiMasjidDes), R.drawable.moti_masjid));
        detailH.add(new Details(getString(R.string.Tajul), getString(R.string.TajulDes), R.drawable.taj_ul));
        DetailsAdapter detailsAdapterH = new DetailsAdapter(Objects.requireNonNull(getActivity()), detailH);
        ListView listViewH = view.findViewById(R.id.list_heritage);
        assert listViewH != null;
        listViewH.setAdapter(detailsAdapterH);
        return view;
    }
}
