public class EnunciadoBreak {

    public static void main(String[] args) {

        for(int i = 1; i < 10; i++){
            if(i == 6)
                break;
            System.out.println("Variable i: " + i);
        }
        System.out.println("He salido del For ");
    }
}
