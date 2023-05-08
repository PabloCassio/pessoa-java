import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Cliente.Cliente;
class TestValidacao {

	//validações de nome
	@Test
	void testValidarNome() {
		String nome = "João Silva";
		String cpf = null;
		String idade = null;
		Cliente pessoa = new Cliente(nome, cpf, idade);
		assertTrue(pessoa.validarNome(nome));
	}
	
	@Test
	void testValidarNomeVazio() {
		String nome = "";
		String cpf = null;
		String idade = null;
		Cliente pessoa = new Cliente(nome, cpf, idade);
		assertFalse(pessoa.validarNome(nome));
	}
	
	@Test
	void testValidarNomeComNumeros() {
		String nome = "J0ao S1lva";
		String cpf = null;
		String idade = null;
		Cliente pessoa = new Cliente(nome, cpf, idade);
		assertFalse(pessoa.validarNome(nome));
	}
	
	@Test
	void testValidarNomeComApenasAcentos() {
		String nome = "~^^~~`´";
		String cpf = null;
		String idade = null;
		Cliente pessoa = new Cliente(nome, cpf, idade);
		assertFalse(pessoa.validarNome(nome));
	}
	
	
	// validações de CPF
	@Test
	void testValidarCpfApenasNumeros(){
		String nome = null;
		String cpf = "12345678901";
		String idade = null;
		Cliente pessoa = new Cliente(nome, cpf, idade);
		assertTrue(pessoa.validarCpf(cpf));
	}
	
	@Test
	void testValidarCpfApenasLetras(){
		String nome = null;
		String cpf = "abcdefghijk";
		String idade = null;
		Cliente pessoa = new Cliente(nome, cpf, idade);
		assertFalse(pessoa.validarCpf(cpf));
	}
	
	@Test
	void testValidarCpfVazio(){
		String nome = null;
		String cpf = "";
		String idade = null;
		Cliente pessoa = new Cliente(nome, cpf, idade);
		assertFalse(pessoa.validarCpf(cpf));
	}
	
	@Test
	void testValidarCpfOnzeDigitosComUmaLetra(){
		String nome = null;
		String cpf = "1234567890a";
		String idade = null;
		Cliente pessoa = new Cliente(nome, cpf, idade);
		assertFalse(pessoa.validarCpf(cpf));
	}
	
	void testValidarCpfSemOnzeDigitos(){
		String nome = null;
		String cpf = "1234567";
		String idade = null;
		Cliente pessoa = new Cliente(nome, cpf, idade);
		assertFalse(pessoa.validarCpf(cpf));
	}
	
	// validações de idade
	@Test
	void testValidarIdade(){
		String nome = null;
		String cpf = null;
		String idade = "21";
		Cliente pessoa = new Cliente(nome, cpf, idade);
		assertTrue(pessoa.validarIdade(idade));
	}
	
	@Test
	void testValidarIdadecomLetras(){
		String nome = null;
		String cpf = null;
		String idade = "21a";
		Cliente pessoa = new Cliente(nome, cpf, idade);
		assertFalse(pessoa.validarIdade(idade));
	}
	
	@Test
	void testValidarIdadeVazia(){
		String nome = null;
		String cpf = null;
		String idade = "";
		Cliente pessoa = new Cliente(nome, cpf, idade);
		assertFalse(pessoa.validarIdade(idade));
	}

	@Test
	void testValidarIdadeInválida(){
		String nome = null;
		String cpf = null;
		String idade = "143";
		Cliente pessoa = new Cliente(nome, cpf, idade);
		assertFalse(pessoa.validarIdade(idade));
	}
	void testValidarIdadeZero(){
		String nome = null;
		String cpf = null;
		String idade = "0";
		Cliente pessoa = new Cliente(nome, cpf, idade);
		assertFalse(pessoa.validarIdade(idade));
	}

}
