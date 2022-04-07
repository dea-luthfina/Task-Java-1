package task1java;
public class NamaBiodata {
    private String fullName;
    private String birthPlace;
    private String birthDate;
    private String hobby;
    private String zodiac;
    private String favFood;
    private String goals;

    // set methods
    void setFullName(String fullName){
     this.fullName = fullName;
    }

    void setBirthPlace(String birthPlace){
     this.birthPlace = birthPlace;
    }

    void setBirthDate(String birthDate){
     this.birthDate = birthDate;
    }

    void setHobby(String hobby){
     this.hobby = hobby;
    }

    void setZodiac(String zodiac){
     this.zodiac = zodiac;
    }

    void setFavFood(String favFood){
     this.favFood = favFood;
    }

    void setGoals(String goals){
     this.goals = goals;
    }

    // get methods
    public String getfullName() {
        return fullName;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getHobby() {
        return hobby;
    }

    public String getZodiac() {
        return zodiac;
    }
    
    public String getfavFood() {
        return favFood;
    }
 
    public String getGoals() {
        return goals;
    }
}
