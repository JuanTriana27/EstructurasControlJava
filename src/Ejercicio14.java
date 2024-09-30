public class Ejercicio14 {

    public static void main(String[] args) {

        String condicion = "", var1 = "Par", var2 = "Impar";
        int num = 64, r = 0;
        r = num%2;

        if(r==0)
            condicion = "Par";
        else
            condicion = "Impar";


            switch (condicion){
                case "Par":
                    System.out.println("El numero es = " + var1);
                    break;

                case "Impar":
                    System.out.println("El numero es = " + var2);
            }
    }
}
