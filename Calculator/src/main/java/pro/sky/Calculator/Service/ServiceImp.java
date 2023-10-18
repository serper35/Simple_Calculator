package pro.sky.Calculator.Service;

@org.springframework.stereotype.Service
public class ServiceImp implements Service{

    @Override
    public String plus(float num1, float num2) {
        return  num1 + " + " +  num2 + " = " + (num1 + num2) ;
    }

    @Override
    public String minus(float num1, float num2) {
        return  num1 + " - " +  num2 + " = " + (num1 - num2) ;
    }

    @Override
    public String multiply(float num1, float num2) {
        return  num1 + " * " +  num2 + " = " + (num1 * num2) ;
    }

    @Override
    public String divide(float num1, float num2) {
        if (num1 != 0 ) {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        } else {
            return "На ноль делить нельзя";
        }
    }
}
