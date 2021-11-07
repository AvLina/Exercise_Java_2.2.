public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 57;
        double height = 1.58;
        double bmi = service.calculate(weight, height);
        if ((bmi > 18)&& (bmi < 25)){
          // параметр "18" должен быть "18,5", но я не знаю как записать чтобы идея не ругалась
            System.out.println("NORMA");
        }
        if (bmi > 25) {
            System.out.println("OVERWEIGHT");
        }
        if (bmi < 18) {
            System.out.println("UNDERWEIGH");
        }
        System.out.println(bmi);

    }

}