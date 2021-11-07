public class BmiService {
    public double calculate (float weight,double height ){
        double bmi = weight / (height * height);
        return bmi;
    }
}