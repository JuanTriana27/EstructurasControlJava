public class EstructuraWhile {

    public static void main(String[] args) {
        
        // calcular suma de numeros enteros del 1 al 10 e imprimir por pantalla la suma
        int suma = 0, numero = 1;
        
        while (numero <= 10){
            suma += numero; // es lo mismo que suma = suma + numero;
            numero++;
            System.out.println("suma = " + suma);
        }

        //ejercicio
        int temperatura = 30;

        while (temperatura>=21){
            System.out.println(" Hace Calor " + temperatura);
            temperatura--;
        }
    }
}
