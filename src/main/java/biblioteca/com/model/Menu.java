package biblioteca.com.model;

public class Menu extends metodMenu {
    public void menu(){
        do {
            System.out.println("===== Menu Biblioteca =====");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Adicionar Livro");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("5. Listar Alunos");
            System.out.println("6. Listar Livros");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opcao: ");


            System.out.println("Digite a opcao desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    adicionarLivro();
                    break;
                case 3:
                    emprestarLivro();
                    break;
                case 4:
                    devolverLivro();
                    break;
                case 5:
                    listarAlunos();
                    break;
                case 6:
                    listarLivros();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
        while (opcao != 7);

    }







}
