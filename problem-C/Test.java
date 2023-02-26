package ProblemC;

public class Test {
    public static void main(String[] args) {
        SportAndHobbyImpl spt = new SportAndHobbyImpl();
        spt.display();
        System.out.println();
        spt.setAge(25);
        spt.setName("Alikhan");
        spt.howMuchItCostToPlayThisSport();
        spt.setMyFavoriteSport("Volleyball");
        spt.setMyHobby("Read books");
        spt.display();
    }
}
