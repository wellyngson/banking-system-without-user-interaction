package contaBanco;

public class ContaBanco {
	
//	CRIA��O DAS VARI�VEIS 
	private String typeAccount, numberAccount, user, closingAccount, errorDeposit, errorWithDraw, payMonth;
	private int balance, depositValue, withAmount = 0;
	private boolean statusAccount;
	
//	CRIA��O DO CONSTRUTOR CONTA BANCO
	public ContaBanco(String typeAccount) {
		super();
		
		this.setTypeAccount(typeAccount);
		
		this.account();
	}
	
	
	private void account() {
		if (this.typeAccount.equals("Conta Corrente")) {
			this.numberAccount = "0001";
			this.balance = 300;
			this.user = "Jubileu";
			this.statusAccount = false;
		} else {
			this.numberAccount = "0002";
			this.balance = 400;
			this.user = "Creuza";
			this.statusAccount = false;
		}
	}
	
//	CRIA��O DOS M�TODOS ESPECIAIS
//	M�TODO PARA ABRIR CONTA
	public void openAccount() {
		this.setStatusAccount(true);
		if (this.getTypeAccount().equals("Conta Corrente")) {
			System.out.println( "SEJA BEM VINDO " + this.getUser().toUpperCase() + "\n" +
								"SUA CONTA CORRENTE FOI ABERTA COM SUCESSO" + "\n");
		} else {
			System.out.println("SEJA BEM VINDO " + this.getUser().toUpperCase() + "\n" +
					"SUA CONTA POUPAN�A FOI ABERTA COM SUCESSO" + "\n");

		}
	}


//	M�TODO PARA DEPOSITAR
	public void deposit(int depositValue) {
		if (this.getStatusAccount(false)) {
			System.out.println("\n" + "N�o � poss�vel realizar dep�sito pois voc� n�o possui conta");			
		} else {
			this.setBalance(this.getBalance() + depositValue);
			System.out.println("\n" + "VOC� SOLICITOU UM DEP�SITO DE " + depositValue + "\n" +
									  "ESTAMOS PROCESSANDO O SEU DEP�SITO" + "\n" +
								      "DEP�SITO REALIZADO COM SUCESSO");
		}
		
		System.out.println("Seu saldo atual �: " + this.getBalance() + "\n");
	}
	
//	M�TODO PARA SACAR
	public void withDraw(int withAmount) {
		if (getWithAmount() < 0 || withAmount > this.getBalance()) {
			System.out.println("N�o � poss�vel sacar seu valor: Voc� n�o possui saldo ou o valor desejado � inferior ao seu valor na conta.");
		} else {
			this.setBalance(this.getBalance() - withAmount);
			System.out.println( "VOC� SOLICITOU UM SAQUE DE " + withAmount + "\n" +
								"SAQUE REALIZADO COM SUCESSO!" + "\n" + 
							    "Saldo atual: " + this.getBalance() + "\n");
		}		
	}
	
//	M�TODO PARA PAGAR MENSALIDADE
	public void month() {
		if (typeAccount.equals("cc")) {
			this.setBalance(this.getBalance() - 12);
			System.out.println( "O VALOR DA SUA MENSALIDADE (R$ 12,00) FOI DESCONTADO" + "\n" + 
								"Seu saldo atual �: " + this.getBalance());
		} else {
			this.setBalance(this.getBalance() - 20);
			System.out.println( "O VALOR DA SUA MENSALIDADE (R$ 20,00) FOI DESCONTADO" + "\n" + 
								"Seu saldo atual �: " + this.getBalance());
		}	
	}

//	M�TODO PARA FECHAR A CONTA
	public void closeAccount() {
		if (this.getBalance() > 0) {
			System.out.println( "\n" + 
								"Seu saldo atual � R$ " + this.getBalance() + "\n" +
								"SOLICITAMOS QUE VOC� RETIRE TODO O DINHEIRO DA SUA CONTA PARA PROSSEGUIR NO CANCELAMENTO." + "\n");
		} else if (this.getBalance() < 0){
			System.out.println( "\n" + "VOC� EST� EM D�VIDAS COM O BANCO" +
								"SOLICITAMOS QUE REGULARIZE SUA SITUA��O BANC�RIA PARA PROSSEGUIR COM O CANCELAMENTO." + "\n");
		} else {
			this.setStatusAccount(false);
			System.out.println("\n" + "CONTA BANC�RIA CANCELADA COM SUCESSO" + "\n");
		}
		System.out.println("__________________________________________" +
						   "__________________________________________" + "\n");
	}
	
//	CRIA��O DOS M�TODOS GET E SET DOS ATRIBUTOS
	
	public String getTypeAccount() {
		return typeAccount;
	}


	public void setTypeAccount(String typeAccount) {
		this.typeAccount = typeAccount;
	}


	public String getNumberAccount() {
		return numberAccount;
	}


	public void setNumberAccount(String numberAccount) {
		this.numberAccount = numberAccount;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public boolean getStatusAccount(boolean statusAccount) {
		return statusAccount;
	}


	public void setStatusAccount(boolean statusAccount) {
		this.statusAccount = statusAccount;
	}


	public int getDepositValue() {
		return depositValue;
	}


	public void setDepositValue(int depositValue) {
		this.depositValue = depositValue;
	}


	public int getWithAmount() {
		return withAmount;
	}


	public void setWithAmount(int withAmount) {
		this.withAmount = withAmount;
	}


	public String getClosingAccount() {
		return closingAccount;
	}


	public void setClosingAccount(String closingAccount) {
		this.closingAccount = closingAccount;
	}


	public String getErrorDeposit() {
		return errorDeposit;
	}


	public void setErrorDeposit(String errorDeposit) {
		this.errorDeposit = errorDeposit;
	}


	public String getErrorWithDraw() {
		return errorWithDraw;
	}


	public void setErrorWithDraw(String errorWithDraw) {
		this.errorWithDraw = errorWithDraw;
	}


	public String getPayMonth() {
		return payMonth;
	}


	public void setPayMonth(String payMonth) {
		this.payMonth = payMonth;
	}

	
	@Override
	public String toString() {
		return  "DADOS DO USU�RIO" + "\n\n" + 
				"Usu�rio: " + getUser() + "\n" +
				"N�mero da conta:  " + getNumberAccount() + "\n" + 
				"Tipo da conta: " + getTypeAccount() + "\n" +
				"Seu saldo atual �: " + getBalance();
	}
}
