import java.text.DecimalFormat;//Formatação de valores decimais

public class Conta {
    String cliente;
    private double saldo = 0; 
    private double limiteDiario;
    private double valorSacado;


    //Formatar numeros decimais double -> Reais R$
    public String formatarDecimal(double valor){
        String valorFormatado = " R$ " + new DecimalFormat("#,###,##0.00").format(valor);
        return valorFormatado;
    }

    //Metodo para configurar o valor de limite diario de saque
    void setLimiteDiario (double limiteDiarioSolicitado){
        limiteDiario = limiteDiarioSolicitado;
        System.out.println("Seu limite diário foi ajustado em" + formatarDecimal(limiteDiario));
    }

    //Metodo para Exibir Saldo
    void exibirSaldo (){

        System.out.println(cliente +" seu saldo atual é de"+ formatarDecimal(saldo));
    }

    //Metodo para Depositar valor
    void depositar(double valorDeposito){
        saldo = saldo + valorDeposito;
        System.out.println("Desposito realizado no valor de" + formatarDecimal(valorDeposito));
        exibirSaldo();
    }

    //Metodo para Sacar valor
    private void deduzirValor(double valorSaque){
        saldo = saldo - valorSaque;
        System.out.println("Saque realizado no valor de" + formatarDecimal(valorSaque));
        exibirSaldo();
        valorSacado = valorSacado + valorSaque;
        System.out.println("Valor disponível para saque hoje:" + formatarDecimal(limiteDiario - valorSacado) );
    }

    //Metodo de Autorização de saque
    void saque(double valorSaque){

        //Verificação de Saldo na conta
        if (valorSaque > saldo)
        {System.out.println("Não foi possível sacar" + formatarDecimal(valorSaque) + ". Saldo insuficiente na conta.");}
        else 

        //Verificação de Limite Diario
        if (valorSaque + valorSacado > limiteDiario) 
            {System.out.println("Não foi possível sacar"+ formatarDecimal(valorSaque) + ". O valor informado ultrapassou o limite diário disponível.");}
        else 

        //Saque Realizado
            {deduzirValor(valorSaque);}
    }

    }

    

