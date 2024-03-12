package ra.model;

public class Singer {
    private int singerID;
    private String singerName;
    private int age;
    private String nationality;
    private boolean gender;
    private String genre;

    public Singer(){};

    // constructor
    public Singer(int singerID, String singerName, int age, String nationality, boolean gender, String genre) {
        this.singerID = singerID;
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }
// getter/ setter
    public int getSingerID() {
        return singerID;
    }

    public void setSingerID(int singerID) {
        this.singerID = singerID;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void inputData(){

    }

    public void displayData(){};

}


