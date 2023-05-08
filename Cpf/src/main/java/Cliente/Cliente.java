package Cliente;

public class Cliente {
	 String nome, cpf, idade;
	
	public Cliente(String nome, String cpf, String idade) {
		   	setNome(nome);
		   	setIdade(idade);
		   	setCpf(cpf);
		    }
	
	public boolean validarCpf(String cpf) {
		  if (cpf.length() != 11) {
			  System.out.println("O CPF informado é inválido! A quantidade de digitos deve ser igual a 11.");
	            return false;
	        }
	        for (int i = 0; i < 11; i++) {
	            if (!Character.isDigit(cpf.charAt(i))) {
	            	 System.out.println("O CPF informado é inválido! Os caracteres informados não são números!");
	                return false;
	            }
	        }
	        return true;
	    }

	
	public boolean validarIdade(String idade) {
		  if (idade.isEmpty() || !idade.matches("\\d+")) {
	        	System.out.println("Idade inválida. A idade deve ser um número inteiro válido.");
	        	return false;
	        }
	        	
		 int idadeConvertida = Integer.parseInt(idade);
		 if (idadeConvertida <= 0 || idadeConvertida  > 120) {
			 	System.out.println("A idade informada é inválida (deve ser maior que 0 e menor ou igual a 120!).");
	            return false; 
	     }
		 return true;
		 
		 }
	
	public boolean validarNome (String nome) {
		  if (nome.isEmpty()) {
			  	System.out.println("O nome precisa estar preenchido!");
	            return false;
		  }
		  
		  else if (!nome.matches("^[a-zA-ZÀ-ÿ\\s]+$")) {
		    	  	System.out.println("O nome deve conter apenas letras e espaços entre as palavras!");
		    	  	return false;
	      }
		  return true;
	}
	
	  public String getNome() {
		    return nome;
		  }
	  public void setNome(String nome) {
		    this.nome =  nome;
		  }

	  public String getIdade() {
		    return  idade;   
		  }
	  
	  public void setIdade(String idade) {
		    this.idade =  idade;
		  }
	  

	  public String getCpf() {
		    return  cpf;
		  }
	  public void setCpf(String cpf) {
		    this.cpf =  cpf;
		  }
	  
}

