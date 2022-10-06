public class CriaConta {

    public static void main(String[] args){

      Conta primeiraConta =  new Conta();
        primeiraConta.saldo = 200;
        primeiraConta.saldo +=100;


        Conta segundaConta = new Conta();
        segundaConta.saldo = 450;

        System.out.println("saldo primeira conta: " + primeiraConta.saldo);
        System.out.println("sado segunda conta: " + segundaConta.saldo);
        System.out.println(primeiraConta.agencia);
        System.out.println(segundaConta.agencia);
    }
}
