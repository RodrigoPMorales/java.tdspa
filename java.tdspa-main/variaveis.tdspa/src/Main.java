import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //variaveis();
        //operadoresECondicionais();



        //Array ou vetores
        var nomes = new String[]{"João", "Maria", "José"};
        var numeros = new int[] {1, 2, 3, 4, 5, 6, 7, 8 };

        //para cada nome dentro do Array de nomes
        for(var nome : nomes)
            //ele imprime o nome
            System.out.println(nome);

        for(int i = 0; i < numeros.length; i++)
            System.out.println(numeros[i]);
        // mesma maneira de fazer o codigo anterior porem mais simples
            //for(var numero : numeros)
            //System.out.println(numero);

        //while
        System.out.println("While:");
        var contador = 0;
        while(contador < numeros.length) {
            System.out.println(nomes[contador]);
            contador++;
        }

    }



    public static void variaveis(){

        System.out.println("Sistema iniciando...");

        var scan = new Scanner(System.in);
        System.out.println("Digite o numero 1: ");
        var numero1 = scan.nextBigDecimal();
        scan.nextLine();

        System.out.println("Digite o numero 2:");
        var numero2 = scan.nextBigDecimal();
        scan.nextLine();

        System.out.println( numero1.add(numero2));

        String nome = "FIAP";
        System.out.println(nome);

        int numero = 10;
        System.out.println(numero);

        double valor = 10.5;

        System.out.println(valor + 10);

        long valorGrande = 1000000000000000000L;

        short valorPequeno = 10;

        char letra = 'A';

        boolean condicao = true;

        var numeroTexto = "10";
        //conversao explicita de String para int
        var numeroConvertido = Integer.parseInt(numeroTexto);


        //delaracao de variaveis
        int idade;
        //inicializacao de variaveis
        idade = 10;
        idade = 20;
        idade = 30;
        //declaracao de inicializacao
        int idade2 = 10;


        System.out.println("Sistema finalizando..." );



    }

    public static void operadoresECondicionais(){

        var calculo = 1 + 2 - (3 * 2) / 5.0;
        System.out.println(calculo);
        calculo++;
        System.out.println(calculo);
        calculo--;
        System.out.println(calculo);

        //condicionais();
        var scanner = new Scanner(System.in);
        System.out.println("Digite a idade:");
        var idade = scanner.nextInt();

        if(idade >= 18 && idade <= 200)
            System.out.println("A pessoa é maior de idade");
        else if(idade > 200)
            System.out.println("A pessoa é um vampiro");
        else
            System.out.println("A pessoa é menor de idade");

        var notaDDD = 8;
        var notaCPT = 3;
        var notaBD = 10;

        // operador ternario
        // funcao(<condicao>) ? <valor se verdadeiro> : <valor se falso>
        // na matematica: f(x) = x > 0 ? x : -x

        System.out.println(notaDDD < 6 || notaCPT < 6 || notaBD < 6 ?
                "Reprovado em pelo menos uma disciplina," +
                        "nao irá se formar no tempo minimo" :
                "Aprovado em todas as diciplinas");

        System.out.println("Digite o numero:");
        var numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println(numero % 2 == 0
                ? "o númro é par" : "o número é impar");
    }
    }
