package lesson1;



public class Main {
    public static void main(String[] args) {

        Athlete[] groupOne = new Athlete[4];
        groupOne[0] = new Athlete("Ivan",35, 12.5f);
        groupOne[1] = new Athlete("Olga",23, 9.5f);
        groupOne[2] = new Athlete("Dima",30, 10f);
        groupOne[3] = new Athlete("Oleg",25, 13.1f);

        Athlete[] groupTwo = new Athlete[4];
        groupTwo[0] = new Athlete("Max",31, 14.1f);
        groupTwo[1] = new Athlete("Anna",23, 8.3f);
        groupTwo[2] = new Athlete("Viktor",45, 16.6f);
        groupTwo[3] = new Athlete("Vlad",20, 10.9f);


        Team teamOne = new Team(groupOne, "Moon");
        Team teamTwo = new Team(groupTwo, "Mars");


        // Забег
        Course race = new Course();
        race.doit(teamOne);
        race.doit(teamTwo);
    }

}