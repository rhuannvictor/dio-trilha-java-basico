public class ContaTerminal {
    int conta;
    String agencia;
    String nomeCliente;
    double saldo;

    void apresentarDados(){
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é: "
        + agencia + " conta: " + conta + " e seu saldo de: R$" + saldo + " já está disponível para saque." );
    }

    public ContaTerminal(int conta, String agencia, String nomeCliente, double saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
