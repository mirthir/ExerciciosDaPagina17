// Exercício da página 17 imprime duas vezes small x
public class Excercise1b {
    public static void main(String [] args){
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
}
