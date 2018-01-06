package demo.corsoits.com.corsoits.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import demo.corsoits.com.corsoits.models.CountryList;

/**
 * Created by CARMINE.PETRUZZIELLO on 20/12/2017.
 */

public class FragmentCountry extends ListFragment {

    private OnFragmentEventListener mListener;
    private String [] mCountries;
    private CountryList List = new CountryList();



    public FragmentCountry(){
        this.mCountries = new String[List.getmCountries().size()];
        List.getmCountries().toArray(mCountries);

    }

    @Override
    public void onAttach (Context context){
        super.onAttach(context);
        this.mListener=(OnFragmentEventListener) context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>((Context) this.mListener,android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    public interface OnFragmentEventListener{
        void onSelectCountry(String country);

    }

}

//region variables


//endregion




