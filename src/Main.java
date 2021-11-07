public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 55;
        double height = 1.68;
        double bmi = service.calculate(weight, height);
//        double bmi = weight / (height * height);
        System.out.println(bmi);
    }
}