package demo.corsoits.com.corsoits.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by CARMINE.PETRUZZIELLO on 20/12/2017.
 */

public class usermodel implements Parcelable {

    //region Variabiles
    private String mName;
            private Integer mAge;

    //endregion


    //region Construction

    public usermodel(String name, Integer age){
        this.mName = name;
        this.mAge = age;
    }

    public usermodel(Parcel parcel){
        this.mName = parcel.readString();
        this.mAge = parcel.readInt();
    }

    //endregion


    //region Getters & Setters

    public String getName(){
        return this.mName;
    }

    public void setName(String name){
        this.mName = name;
    }

    public Integer getAge(){
        return this.mAge;
    }

    public void setmAge(Integer age){
        this.mAge = age;
    }

   //end region


    //region Parcelable
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mName);
        parcel.writeInt(this.mAge);

    }
public static final Creator<usermodel> CREATOR = new Creator<usermodel>() {
    @Override
    public usermodel createFromParcel(Parcel parcel) {
        return new usermodel(parcel);
    }

    @Override
    public usermodel[] newArray(int i) {
        return new usermodel[0];
    }
    };
    //endregion

}
