public class Main {
    public static void main(String[] args) {
        Person person = new Person(" Aidana ", " Admin ");
        Programmer programmer = new Programmer(" Akbar ", " IT ", " Peaksoft ");
        Dancer dancer = new Dancer(" Begimai ", " Dancer ", " Hiphop ");
        Singer singer = new Singer(" Beka ", " Opera ", " Love ");

        person.eat();
        person.walk();
        person.learn();
        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.coding();
        dancer.eat();
        dancer.walk();
        dancer.learn();
        dancer.dancing();
        singer.eat();
        singer.walk();
        singer.learn();
        singer.singing();
        System.out.println(person);
        System.out.println(programmer);
        System.out.println(dancer);
        System.out.println(singer);
    }
}