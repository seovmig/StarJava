public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger = new Jaeger();

        jaeger.setModelName("\nCherno Alpha");
        jaeger.setSpeed(3);

        System.out.println(jaeger.getModelName());

        if(jaeger.getSpeed() > 0) {
            jaeger.move();
        }

        jaeger.setModelName("\nCrimson Typhoon");
        jaeger.setSpeed(9);

        System.out.println(jaeger.getModelName());

        if(jaeger.getSpeed() > 0) {
            jaeger.move();
            System.out.println(jaeger.scanKaiju());
        }
    }
}