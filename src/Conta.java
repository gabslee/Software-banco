public class Conta {
    double saldo = 1000;
    int agencia = 42;
    int numero;
    String titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor,Conta destino) {
        if(this.saldo >= valor){
            saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }


}