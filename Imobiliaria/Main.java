import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Imobiliaria imobiliaria = new Imobiliaria("9999-9999","Casas", "Sta");

        Scanner sc = new Scanner(System.in);
        boolean flag = true; // Flag de controle do while

        while (flag) {
            System.out.println("--- BEM VINDO " + imobiliaria.nome + " ---");
            System.out.println("1 - Cadastrar apartamentos");
            System.out.println("2 - Mostrar as informações da imobiliaria");
            System.out.println("3 - Ajuste aluguel");
            System.out.println("4 - Area");
            System.out.println("5 - Sair do sistema");

            int opcao = sc.nextInt(); // Atribuindo a entrada de dados a variável opção
            sc.nextLine();

            switch (opcao) {
                case 1:
                    // Criando o apartamento que será adicionado no array de apartamentos
                    System.out.println("Endereço: ");
                    String endereco = sc.nextLine();
                    System.out.println("numQuarto: ");
                    int numQuartos = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Area: ");
                    Double area = sc.nextDouble();
                    System.out.println("Aluguel: ");
                    Double aluguel = sc.nextDouble();

                    // Criando um ap
                    Apartamento ap1 = new Apartamento(endereco, numQuartos, area, aluguel);

                    // Adicionando ap criado na imobiliaria
                    imobiliaria.addApartamento(ap1);
                    break;

                case 2:
                    imobiliaria.mostraInfos();
                    break;
                case 3:
                    imobiliaria.ajustaAluguel();
                    break;
                case 4:
                    imobiliaria.mediaArea();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Opção inválida !!");
                    break;
            }

        }
        sc.close();// Fechando entrade de dados
    }

}


