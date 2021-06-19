public class JaegerTest {
    public static void main(String[] args) {
        // Jaeger jaeger = new Jaeger();
        Jaeger chernoAlpha = new Jaeger("\nCherno Alpha", 3);

        // jaeger.modelName = "\nCherno Alpha";
        // jaeger.speed = 3;

        System.out.println(chernoAlpha.modelName);
        System.out.println(chernoAlpha.speed);

        if(chernoAlpha.speed > 0) {
            chernoAlpha.move();
        } else {
            System.out.println("Робот остановился!\n");
        }

        Jaeger crimsonTyphoon = new Jaeger("\nCrimson Typhoon", 99);

        // jaeger.modelName = "\nCrimson Typhoon";
        // jaeger.speed = 99;

        System.out.println(crimsonTyphoon.modelName);
        System.out.println(crimsonTyphoon.speed);

        if(crimsonTyphoon.speed > 0) {
            crimsonTyphoon.move();
            System.out.println(crimsonTyphoon.scanKaiju());
        }
    }
}