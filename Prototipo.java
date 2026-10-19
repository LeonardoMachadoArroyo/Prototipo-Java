import java.util.Scanner;

public class Prototipo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variavel para controlar qual tela esta aberta
        // 1 = Tela Inicial, 2 = Home, 3 = Criar Posts, 4 = Configuracoes, 5 = Perfil, 6 = Pesquisa, 0 = Sair
        int telaAtual = 1;

        // Variaveis da conta
        String nome = "";
        String email = "";
        String senha = "";
        String emailLogin = "";
        String senhaLogin = "";

        // Variaveis de post
        String tipo = "", titulo = "", descricao = "";
        String local = "", data = "";
        double valor = 0.0;

        // Variaveis de configuracoes
        String privacidade = "Pública";
        String tema = "Claro";
        String notificacoes = "Ativadas";
        String seguranca = "Desativada";

        // Variaveis de perfil
        String banda = "";
        String descricaoPerfil = "";
        String estilo = "";

        // Loop principal do sistema
        while (telaAtual != 0) {
            switch (telaAtual) {

                case 1: // TELA INICIAL
                    System.out.println();
                    System.out.println("----------TELA INICIAL----------");
                    System.out.println("Escolha o que deseja fazer:\n1 - Fazer login\n2 - Criar conta\n3 - Sair\n------------------------------------------------");
                    System.out.println();
                    
                    int menuInicial = scanner.nextInt();
                    scanner.nextLine();

                    switch (menuInicial) {
                        case 1:
                            System.out.print("Digite o seu email: ");
                            emailLogin = scanner.nextLine();
                            System.out.print("Digite a sua senha: ");
                            senhaLogin = scanner.nextLine();

                            if (emailLogin.equals(email) && senhaLogin.equals(senha) && !email.equals("")) {
                                System.out.println("Login realizado com sucesso, " + nome + "!");
                                telaAtual = 2; // Vai para a Home
                            } else {
                                System.out.println("Email ou senha incorretos!");
                                telaAtual = 1;
                            }
                            break;

                        case 2:
                            System.out.print("Digite o seu nome: ");
                            nome = scanner.nextLine();
                            System.out.print("Digite o seu email: ");
                            email = scanner.nextLine();
                            System.out.print("Digite a sua senha: ");
                            senha = scanner.nextLine();
                            System.out.println("Conta criada!");
                            telaAtual = 1;
                            break;

                        case 3:
                            telaAtual = 0; // Sair do programa
                            break;

                        default:
                            System.out.println("Opção inválida!");
                            telaAtual = 1;
                            break;
                    }
                    break;

                case 2: // TELA HOME
                    System.out.println("\n========== TELA HOME ==========");
                    System.out.println("\nBem-vindo ao seu feed!");
                    System.out.println("\n--------------------------------");
                    System.out.println("Banda Eclipse");
                    System.out.println("Novo som disponível!");
                    System.out.println("Estamos procurando locais para tocar neste fim de semana.");

                    System.out.println("\n--------------------------------");
                    System.out.println("Bar do Centro");
                    System.out.println("Oportunidade de apresentação");
                    System.out.println("Procuramos uma banda para tocar sábado às 20h.");
                    System.out.println("Local: São Paulo - SP");

                    System.out.println("\n--------------------------------");
                    System.out.println("Lucas - Guitarrista");
                    System.out.println("Acabei de publicar um novo vídeo tocando!");

                    System.out.println("\n--------------------------------");

                    System.out.println("\n1 - Atualizar feed");
                    System.out.println("2 - Criar publicação");
                    System.out.println("3 - Ver as configurações");
                    System.out.println("4 - Ver o perfil");
                    System.out.println("5 - Barra de pesquisa");
                    System.out.println("6 - Sair");

                    System.out.print("Escolha uma opção: ");
                    int opcaoHome = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcaoHome) {
                        case 1:
                            telaAtual = 2; // Atualizar home
                            break;
                        case 2:
                            telaAtual = 3; // Criar posts
                            break;
                        case 3:
                            telaAtual = 4; // Configuracoes
                            break;
                        case 4:
                            telaAtual = 5; // Perfil
                            break;
                        case 5:
                            telaAtual = 6; // Pesquisa
                            break;
                        case 6:
                            System.out.println("\nSaindo para a tela inicial...");
                            telaAtual = 1;
                            break;
                        default:
                            System.out.println("\nOpção inválida.");
                            telaAtual = 2;
                            break;
                    }
                    break;

                case 3: // TELA DE CRIAÇÃO DE POSTS
                    System.out.println("\n========== TELA DE CRIAÇÃO DE POSTS ==========");
                    System.out.println("Deseja fazer um post? (S/N)");
                    
                    char resPost = scanner.nextLine().charAt(0);
                    
                    switch (resPost) {
                        case 's': 
                        case 'S':
                            System.out.println("\n--- Começando cadastro de post ---");
                            System.out.println("Qual será o tipo de post? (divulgar/expor/comentario)");
                            tipo = scanner.nextLine();
                            System.out.println("Qual o título do post?");
                            titulo = scanner.nextLine();
                            System.out.println("Qual a descrição?");
                            descricao = scanner.nextLine();

                            if (tipo.equalsIgnoreCase("divulgar")) {
                                System.out.println("Qual o local?");
                                local = scanner.nextLine();
                                System.out.println("Qual a data?");
                                data = scanner.nextLine();
                                System.out.println("Qual o valor?");
                                valor = scanner.nextDouble();
                                scanner.nextLine();
                            } 

                            System.out.println("\n--- Tudo certo, post criado com Sucesso! ---");

                            switch (tipo.toLowerCase()) {
                                case "divulgar":
                                    System.out.println("\n=== " + titulo + " ===");
                                    System.out.println("Descrição: " + descricao);
                                    System.out.println("Data: " + data);
                                    System.out.println("Local: " + local);
                                    System.out.println("Valor: " + valor);
                                    System.out.println("Deseja ir para o feed? (S/N)");
                                    char irFeed = scanner.nextLine().charAt(0);
                                    if (irFeed == 's' || irFeed == 'S') {
                                        telaAtual = 2;
                                    } else {
                                        telaAtual = 3;
                                    }
                                    break;
                                case "comentario":
                                case "expor":
                                    System.out.println("\n=== " + titulo + " ===");
                                    System.out.println("Descrição: " + descricao);
                                    telaAtual = 2;
                                    break;
                                default:
                                    System.out.println("Erro ao analisar o tipo");
                                    telaAtual = 2;
                                    break;
                            }
                            break;

                        case 'n': 
                        case 'N':
                            telaAtual = 2;
                            break;

                        default:
                            System.out.println("\nErro, voltando ao início");
                            telaAtual = 2;
                            break;
                    }
                    break;

                case 4: // TELA DE CONFIGURAÇÕES
                    System.out.println("\n========== CONFIGURAÇÕES ==========");
                    System.out.println("Deseja alterar alguma configuração? (S/N)");
                    char resConfig = scanner.nextLine().charAt(0);

                    switch (resConfig) {
                        case 's':
                        case 'S':
                            System.out.println("Como será a privacidade da conta? (publica/privada)");
                            privacidade = scanner.nextLine();
                            System.out.println("Ativar ou desativar as notificações? (ativada/desativada)");
                            notificacoes = scanner.nextLine();
                            System.out.println("Qual será o tema? (claro/escuro)");
                            tema = scanner.nextLine();
                            System.out.println("A Autenticação em duas etapas será ativada ou desativada? (ativada/desativada)");
                            seguranca = scanner.nextLine();
                            System.out.println("Deseja ver como estão as suas configurações? (S/N)");
                            char resConfig2 = scanner.nextLine().charAt(0);
                            
                            if (resConfig2 == 's' || resConfig2 == 'S') {
                                System.out.println("\n========== SUAS CONFIGURAÇÕES ==========");
                                System.out.println("Privacidade: " + privacidade);
                                System.out.println("Notificações: " + notificacoes);
                                System.out.println("Tema: " + tema);
                                System.out.println("Autenticação em duas etapas: " + seguranca);
                                System.out.println("========================================");
                            }
                            telaAtual = 2;
                            break;

                        case 'n':
                        case 'N':
                            System.out.println("\nSaindo das configurações...");
                            telaAtual = 2;
                            break;

                        default:
                            System.out.println("Opção inválida!");
                            telaAtual = 2;
                            break;
                    }
                    break;

                case 5: // TELA DE PERFIL
                    System.out.println();
                    System.out.println("----------CONFIGURAÇÕES DE PERFIL----------");
                    System.out.println("Escolha o que deseja fazer:\n1 - Editar informações do perfil\n2 - Editar descrição do perfil\n3 - Ver informações do perfil\n4 - Voltar ao feed\n------------------------------------------------");
                    System.out.println();
                    
                    int menuPerfil = scanner.nextInt();
                    scanner.nextLine();

                    switch (menuPerfil) {
                        case 1:
                            System.out.print("Digite o seu nome: ");
                            nome = scanner.nextLine();
                            System.out.print("Digite o nome da banda: ");
                            banda = scanner.nextLine();
                            System.out.print("Digite o seu estilo musical: ");
                            estilo = scanner.nextLine();
                            System.out.println("Informações atualizadas!");
                            telaAtual = 5;
                            break;

                        case 2:
                            System.out.println("Digite a descrição do perfil: ");
                            descricaoPerfil = scanner.nextLine();
                            System.out.println("Descrição atualizada!");
                            telaAtual = 5;
                            break;

                        case 3:
                            if (nome.equals("")) {
                                System.out.println("Você ainda não configurou as informações do perfil!");
                            } else {
                                System.out.println("Nome: " + nome);
                                System.out.println("Banda: " + banda);
                                System.out.println("Estilo: " + estilo);
                            }
                            if (descricaoPerfil.equals("")) {
                                System.out.println("Você ainda não editou sua descrição!");
                            } else {
                                System.out.println("Descrição: " + descricaoPerfil);
                            }
                            telaAtual = 5;
                            break;

                        case 4:
                            telaAtual = 2; // Voltar para a Home
                            break;

                        default:
                            System.out.println("Opção inválida!");
                            telaAtual = 5;
                            break;
                    }
                    break;

                case 6: // TELA DE PESQUISA
                    System.out.println("\n\n==== Tela de Pesquisa ====\n");
                    System.out.println("- Cantores disponíveis: ");
                    System.out.println("Michael Jackson | Bruno Mars | The Weeknd | Taylor Swift | Rihanna | Beyoncé");
                    System.out.println("Digite o cantor que busca as músicas no aplicativo, ou digite SAIR para voltar ao feed: ");
                    String opcaoPesquisa = scanner.nextLine();

                    if (opcaoPesquisa.equalsIgnoreCase("sair")) {
                        telaAtual = 2; // Voltar para a Home
                    } else {
                        switch (opcaoPesquisa) {
                            case "Michael Jackson":
                                System.out.println("\nMúsicas do perfil do Michael Jackson:\nBillie Jean, Thriller, Beat It");
                                break;
                            case "Bruno Mars":
                                System.out.println("\nMúsicas do perfil do Bruno Mars:\nUptown Funk, Just the Way You Are, That's What I Like");
                                break;
                            case "The Weeknd":
                                System.out.println("\nMúsicas do perfil do The Weeknd:\nBlinding Lights, Starboy, Save Your Tears");
                                break;
                            case "Taylor Swift":
                                System.out.println("\nMúsicas do perfil do Taylor Swift:\nShake It Off, Blank Space, Anti-Hero");
                                break;
                            case "Rihanna":
                                System.out.println("\nMúsicas do perfil do Rihanna:\nUmbrella, Diamonds, We Found Love");
                                break;
                            case "Beyoncé":
                                System.out.println("\nMúsicas do perfil do Beyoncé:\nHalo, Single Ladies, Crazy in Love");
                                break;
                            default:
                                System.out.println("\nCantor não encontrado!");
                                break;
                        }
                        telaAtual = 6; // Continua na tela de pesquisa até digitar "SAIR"
                    }
                    break;

                default:
                    System.out.println("Tela desconhecida, voltando para o início.");
                    telaAtual = 1;
                    break;
            }
        }

        System.out.println("\nPrograma finalizado!");
    }
}