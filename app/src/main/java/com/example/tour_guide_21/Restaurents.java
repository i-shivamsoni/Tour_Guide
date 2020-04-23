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
public class Restaurents extends Fragment {
    View view;

    public Restaurents() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_restaurents, container, false);
        ArrayList<Details> detailR = new ArrayList<Details>();
        detailR.add(new Details(getString(R.string.Shahnama), getString(R.string.ShahnamaDes), R.drawable.shahnama));
        detailR.add(new Details(getString(R.string.Sagffc), getString(R.string.SagffcDes), R.drawable.sagar_gair));
        detailR.add(new Details(getString(R.string.Sharma), getString(R.string.ShahnamaDes), R.drawable.sharma));
        detailR.add(new Details(getString(R.string.Raw), getString(R.string.Rawdes), R.drawable.res_1));
        detailR.add(new Details(getString(R.string.Underm), getString(R.string.UndermDes), R.drawable.charming));
        detailR.add(new Details(getString(R.string.Bapu), getString(R.string.BapuDes), R.drawable.bapu));


        DetailsAdapter detailsAdapterR = new DetailsAdapter(Objects.requireNonNull(getActivity()), detailR);
        ListView listViewR = view.findViewById(R.id.list_res);
        assert listViewR != null;
        if (listViewR != null)
            listViewR.setAdapter(detailsAdapterR);
        return view;
    }
}
