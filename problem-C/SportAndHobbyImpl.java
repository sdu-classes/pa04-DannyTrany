package ProblemC;

public class SportAndHobbyImpl implements PersonInterface, SportInterface, HobbyInterface{
    private String myName;
    private int myAge;
    private String myFavoriteSport;
    private String myHobby;

    @Override
    public String whatIsMyHobby() {
        return myHobby;
    }

    @Override
    public void setMyHobby(String hobby) {
        myHobby = hobby;
    }

    @Override
    public void setName(String myName) {
        this.myName = myName;
    }

    @Override
    public void setAge(int myAge) {
        this.myAge = myAge;
    }

    @Override
    public String getMyFavoriteSport() {
        return myFavoriteSport;
    }

    @Override
    public void setMyFavoriteSport(String sportName) {
        myFavoriteSport = sportName;
    }

    @Override
    public int howMuchItCostToPlayThisSport() {
        return myAge*10;
    }

    public void display() {
        System.out.println("Name: " + myName);
        System.out.println("Age: " + myAge);
        System.out.println("Favorite Sport: " + myFavoriteSport);
        System.out.println("Hobby: " + myHobby);
        System.out.println("Cost to play favorite sport: " + howMuchItCostToPlayThisSport());
    }
}
