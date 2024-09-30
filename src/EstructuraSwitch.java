public class EstructuraSwitch {

    public static void main(String[] args) {

        String diaSemana = "Lunees";

        switch (diaSemana){

            case "Lunes":
                System.out.println("Hoy es = " + diaSemana);
                break;

            case "Martes":
                System.out.println("Hoy es = " + diaSemana);
                break;

            case "Miercoles":
                System.out.println("Hoy es = " + diaSemana);
                break;

            case "Jueves":
                System.out.println("Hoy es = " + diaSemana);
                break;

            case "Viernes":
                System.out.println("Hoy es = " + diaSemana);
                break;

            case "Sabado":
                System.out.println("Hoy es = " + diaSemana);
                break;

            case "Domingo":
                System.out.println("Hoy es = " + diaSemana);
                break;

            default://sino es ninguna de las opciones
                System.out.println(" Escribe un día de la semana valido ");
                break;
        }
    }
}
