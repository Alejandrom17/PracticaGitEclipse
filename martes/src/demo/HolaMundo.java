package demo;

public class HolaMundo {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        int suma = sumar(num1,num2);
        System.out.println(suma);
    }
    
    public static int sumar(int num1, int num2){
    	return num1+num2;
   }

}