public class Program {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 34;
        System.out.println("Area: " + circle.area());

        Circle.area(23);

        String phone = "+7927123456";
        for (int i = 0; i < phone.length(); i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(phone.charAt(i) + " | ");
            }
            System.out.println();
        }
    }
}