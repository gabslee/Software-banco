public class TestaMetodo {

    public static void main(String[] args){

        Conta conta = new Conta();
        conta.deposita(300);
        System.out.println(conta.saldo);

        System.out.println(conta.saldo);


        Conta contaDoMenezes = new Conta();
        conta.deposita(1000);
        contaDoMenezes.transfere(500,conta);

        boolean conseguiuRetirar = conta.saca(100);
        System.out.println(conta.saldo);
        System.out.println(conseguiuRetirar);

    }
}
