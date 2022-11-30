
public class Conta_Teste {

    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.cliente = "Renan";
        conta.setLimiteDiario(500);
        conta.exibirSaldo();
        conta.depositar(900.50);
        conta.saque(400);
        conta.saque(100);
        
    }
}