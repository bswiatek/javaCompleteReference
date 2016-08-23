package lambda;

interface MyNumber{
    double getValue();
}

public class LambdaDemo {
    public static void main(String args[]){
        MyNumber myNum;

        myNum = () -> 123.45;
        System.out.println("Wartość stała: " + myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println("Wartość losowa: " + myNum.getValue());
        System.out.println("Inna wartość losowa: " + myNum.getValue());
        System.out.println("Inna wartość losowa: " + myNum.getValue());
        System.out.println("Inna wartość losowa: " + myNum.getValue());
    }
}
