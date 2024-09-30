public class EstructuraIfElse {

    public static void main(String[] args) {

        int calificacion = 40;

        if(calificacion >= 90)
            System.out.println(" A ");
         else if (calificacion>=80)
            System.out.println(" B ");
         else if (calificacion>=70)
            System.out.println(" C ");
         else if (calificacion>=60)
            System.out.println(" D ");
         else  //sino cumple ninguna de las condiciones
            System.out.println(" F ");

         int diaSemana = 4;

         if(diaSemana == 0)
             System.out.println("Hoy es Lunes");
         else if (diaSemana ==1)
             System.out.println("Hoy es Martes");
         else if (diaSemana ==2)
             System.out.println("Hoy es Miercoles");
         else if (diaSemana ==3)
             System.out.println("Hoy es Jueves");
         else if (diaSemana ==4)
             System.out.println("Hoy es Viernes");
         else if (diaSemana ==5)
             System.out.println("Hoy es Sabado");
         else if (diaSemana ==6)
             System.out.println("Hoy es Domingo");

    }
}
