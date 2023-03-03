import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];
        int maior = 0;
        int menor = 0;
        int soma = 0;
        float media = 0;
        int i = 0;
        int acumuladora = 0;

        // DEFINIR VALORES
        for (i = 0; i < valores.length; i++) {
        System.out.println("Digite o " + (i + 1) + "° valor");
        valores[i] = sc.nextInt();
        }
      

        System.out.println("");

        // SOMA

        for (int o : valores) {
            acumuladora = soma;
            soma = acumuladora + o;
            System.out.println(acumuladora + " + " + o + " = " + soma);
        }
        System.out.println("A soma de todos os números do vetor é igual a: " + soma);


        System.out.println("");

        // MÉDIA

        for (int o : valores){
            media = o + media;
        }
        media = media / valores.length;
        System.out.println("Média = " + media);


        System.out.println("");

        // MAIOR

        for (int o : valores ){
            if (o > maior) {
                maior = o;
            }
        }
        System.out.println("Maior valor: " + maior);

        System.out.println("");

        // MENOR
    
        menor = valores[0];
        for ( int o : valores) {
            if (menor > o) {
                menor = o;
            }
        }
        System.out.println("O menor valor é: " + menor);

        sc.close();
    }
}