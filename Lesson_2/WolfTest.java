public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.age = 6;
        wolfOne.gender = 'M';
        wolfOne.weight = 13.13;
        wolfOne.nickname = "Пульба";
        wolfOne.coloration = "Red";

        System.out.println(wolfOne.age + " лет волку.");
        System.out.println(wolfOne.gender + " - пол волка.");
        System.out.println(wolfOne.weight + " кг весит волк.");
        System.out.println(wolfOne.coloration + " окрас очень редкий.");
        System.out.println(wolfOne.nickname + " - такую кличку мы дали нашему чуду.\n");

        wolfOne.go();

        wolfOne.run();

        wolfOne.sit();

        wolfOne.howl();

        wolfOne.hunt();
    }
}