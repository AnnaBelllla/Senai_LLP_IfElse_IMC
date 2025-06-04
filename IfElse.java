import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
      float imc[] = new float [4], p, a;
      Scanner leia = new Scanner(System.in);
            System.out.println("Escreva a altura: ");
            a = leia.nextFloat();
            System.out.println("Escreva o peso: ");
            p = leia.nextFloat();
            imc[0] = p / (float)(Math.pow(a,2));
            System.out.println("O IMC é: "+imc[0]);
                if (imc[0]<=18.5) {
                    System.out.println("Abaixo do peso!");
                } else {
                    if (imc[0]<= 24.9){
                        System.out.println("No peso ideal");
                         } else {
                            if (imc[0]<=29.9) {
                                System.out.println("Sobrepeso");
                                }else{
                                    System.out.println("Obesidade");
                                }
                           
                         }
                }
    }
}
