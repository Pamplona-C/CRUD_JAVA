package controller;
import model.UserDAO;

import java.util.Scanner;

public class UserController {
    private UserDAO userDAO;
    private Scanner scanner;

    public UserController(){
        userDAO = new UserDAO();
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("\n");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Atualizar usuário");
            System.out.println("4 - Remover usuário");
            System.out.println("5 - Sair");

            int option = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (option) {
                case 1:
                    addUser();
                    break;
                case 2:
                    listUsers();
                    break;
                case 3:
                    updateUser();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void addUser(){
        System.out.println("Digite o nome do Usuário : ");
        String name = scanner.nextLine();
        System.out.println("Digite o email do Usuário : ");
        String email = scanner.nextLine();
        userDAO.addUser(name, email);
    }

    private void listUsers(){
        userDAO.getAllUsers().forEach(System.out::println);
    }

    private void updateUser(){
        System.out.println("Digite o Nome do Usuário que deseja atualizar : ");
        String antName = scanner.nextLine();
        System.out.println("***Dados atuais*** : ");
        userDAO.getUserByName(antName);
        System.out.println("Digite o novo nome do Usuário : ");
        String name = scanner.nextLine();
        System.out.println("Digite o novo email do Usuário : ");
        String email = scanner.nextLine();

        userDAO.updateUser(antName, name, email);
        System.out.println("***Novos dados*** : ");
        userDAO.getUserByName(name);
    }

    private void deleteUser(){
        System.out.println("Digite o Nome do usuário que deseja remover : ");
        String name = scanner.nextLine();
        userDAO.removeUser(name);
    }
}
