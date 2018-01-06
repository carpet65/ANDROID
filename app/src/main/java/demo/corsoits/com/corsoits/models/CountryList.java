package demo.corsoits.com.corsoits.models;

import java.util.ArrayList;

/**
 * Created by CARMINE.PETRUZZIELLO on 20/12/2017.
 */

public class CountryList {
    private ArrayList<String> mCountries;
    public CountryList(){
        this.mCountries=new ArrayList<>();
        for (int i= 0; i<10; i++) {
            this.mCountries.add("Country_" + i);
        }
    }
    public ArrayList<String> getmCountries(){
        return this.mCountries;

    }


}
