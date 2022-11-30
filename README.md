## Projeto de Conta Bancária

O objetivo deste projeto é implementar o funcionamento de uma conta bancária, possibilitando funcionalidades como:
- Depósito
- Saque
- Ajuste de limite de valor saque
- Visualização de saldo
- Validação de valores

Os dados da classe `conta` são privados, sendo acessados apenas por métodos:

### Limite Diário de Saque
`setLimiteDiario(double)` - Permite ajustar o valor limite diário de saque que poderá ser realizado;

### Exibir Saldo
`exibirSaldo()` - Mostra o saldo atual da conta;

### Despositar
`depositar(double)` - Insere o valor a depositar na conta;

### Sacar
`sacar(double)` - Retira o valor da conta, caso seja validado de acordo com o saldo disponível na conta e o limite diário estabelecido.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
