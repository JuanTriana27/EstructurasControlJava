public class EstructuraForEach {

    public static void main(String[] args) {

        String [] arreglo = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        //A la variable dia se le asigna el arreglo
        for (String dia: arreglo){
            String arr = arreglo[0]; //Muesta un dia exacto segun el numero en el arreglo
            System.out.println("El dia es = " + dia);
        }
    }
}
