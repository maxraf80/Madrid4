package udacity.com.madrid;

public class City {
    private String attraction;
    private String description;
    private String telephone;
    private String timetable;
    private String address;
    private int imageResourceId;
    private double valutation;

    public City(String mAttraction, String mDescription, String mTelephone, String mTimetable, String mAddress, int mImageResourceId) {


        attraction = mAttraction;
        description = mDescription;
        telephone = mTelephone;
        timetable = mTimetable;
        address = mAddress;
        imageResourceId = mImageResourceId
        ;
    }


    public City(String mAttraction, String mAddress, String mTelephone, String mTimetable, int mImageResourceId) {


        attraction = mAttraction;
        telephone = mTelephone;
        address = mAddress;
        timetable = mTimetable;
        imageResourceId = mImageResourceId;}


    public City (String mAttraction, String mAddress, String mTelephone,int mImageResourceId, double mValutation){

        attraction = mAttraction;
        address = mAddress;
        telephone = mTelephone;
        valutation=mValutation;
        imageResourceId = mImageResourceId;
    }



    public String getAtraction() {
        return attraction;
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

    public double getValutation(){return  valutation;}
}
