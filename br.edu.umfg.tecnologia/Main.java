
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        do {
            System.out.println("Insira o registro academico do aluno");
             aluno.setRegistroAcademico(scanner.nextLine());
        } while (!aluno.getRegistroAcademico().matches("[0-9]+") || aluno.getRegistroAcademico().equals(""));
        do {
            System.out.println("Insira o nome do aluno");
            aluno.setNome(scanner.nextLine());
        } while (aluno.getNome().matches("[0-9]+") || aluno.getNome().equals(""));
        do {
            System.out.println("Insira a nota da Prova 1");
            aluno.setNotaProvaUm(scanner.nextInt());
        } while (aluno.getNotaProvaUm() > 10 || aluno.getNotaProvaUm() < 0);
        do {
            System.out.println("Insira a nota da prova 2");
            aluno.setNotaProvaDois(scanner.nextInt());
        } while (aluno.getNotaProvaDois() > 10 || aluno.getNotaProvaDois() < 0);
        do {
            System.out.println("Insira a nota do trabalho");
            aluno.setTrabalho(scanner.nextInt());
        } while (aluno.getTrabalho() > 10 || aluno.getTrabalho() < 0);

        System.out.println("RESULTADO " + aluno.toString() + " " + aluno.calcularMedia() + " "  
        + aluno.calcularSituacao(aluno.calcularMedia()));

        scanner.close();
        scannerInt.close();
    }
}
