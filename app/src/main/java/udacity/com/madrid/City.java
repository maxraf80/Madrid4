package udacity.com.madrid;

public class City {
    private String atraction;
    private String description;
    private String telephone;
    private String timetable;
    private String address;
    private int    imageResourceId;

    public City(String mAtraction, String mDescription, String mTelephone, String mTimetable, String maddress, int mImageresourceId) {


        atraction=mAtraction;
        description=mDescription;
        telephone=mTelephone;
        timetable=mTimetable;
        address = maddress;
        imageResourceId = mImageresourceId
        ;
    }


    public City(String mAtraction, String mAddress, String mTelephone, String mTimetable, int mImageResourceId) {


        atraction=mAtraction;
        telephone=mTelephone;
        address = mAddress;
        timetable=mTimetable;
        imageResourceId = mImageResourceId;


    }

    public String getAtraction() {
        return atraction;
    }

    public String getDescription() {
        return description;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getTimetable() {
        return timetable;
    }

    public String getAddress() {
        return address;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
