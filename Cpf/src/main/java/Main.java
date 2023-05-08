import java.util.Scanner;
import Cliente.Cliente;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = "", cpf = "";
        String idade = "";
        Cliente pessoa = new Cliente(nome, cpf, idade);
        
        do {
            System.out.print("Digite seu nome: ");
            nome = input.nextLine().trim();
        }
        while(!pessoa.validarNome(nome));
        
        do {
        	System.out.print("Digite seu CPF: ");
            cpf = input.nextLine().trim();
        }
        while(!pessoa.validarCpf(cpf));
       
        do {
        	System.out.print("Digite a sua idade: ");
            idade = input.nextLine().trim();
        }
        while(!pessoa.validarIdade(idade));
        
        input.close();
        
        pessoa.setIdade(idade);
        pessoa.setNome((nome));
        pessoa.setCpf(cpf);
        
        System.out.print("Nome: " + pessoa.getNome());
        System.out.print("\nCPF: " + pessoa.getCpf());
        System.out.print("\nIdade: " + pessoa.getIdade());
        
        }
    	
    	


}




