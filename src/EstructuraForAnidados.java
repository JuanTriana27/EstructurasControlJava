public class EstructuraForAnidados {

    public static void main(String[] args) {

        // i = , j =
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 10; j++){
                System.out.println("j = " + j);
            }
        }

        //Ejercicio
        int num = 0, r = 0, suma = 0;
        for(int h = 0; h<=55; h++){
            r = h % 2;
            if(r != 0){
                suma = h + h;
                System.out.println("La suma de: " + h + " + " + h + " es: "+ suma);
            }
        }
    }
}
