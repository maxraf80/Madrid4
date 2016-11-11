package udacity.com.madrid;
public class City {
    private String atraction;
    private String description;
    private String telephone;
    private String timetable;
    private int    imageResourceId;

    public City (String mAtraction, String mDescription,String mTelephone, String mTimetable, int mImageresourceId){


        atraction=mAtraction;
        description=mDescription;
        telephone=mTelephone;
        timetable=mTimetable;
        imageResourceId=mImageresourceId;}


    public String getAtraction(){return atraction;}
    public String getDescription(){return description;}
    public String getTelephone(){return telephone;}
    public String getTimetable(){return timetable;}
    public int    getImageResourceId(){return imageResourceId;}


    public City (String mAtraction, String mDescription,String mTelephone, String mTimetable){


        atraction=mAtraction;
        description=mDescription;
        telephone=mTelephone;
        timetable=mTimetable;


    }


}
