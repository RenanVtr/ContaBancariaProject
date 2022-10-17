
public class Conta_Teste {

    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.cliente = "Renan";
        conta.setlimiteDiario(500);
        conta.exibir_saldo();
        conta.depositar(900.50);
        conta.validarSaque(400);
        conta.validarSaque(100);
        
    }
}