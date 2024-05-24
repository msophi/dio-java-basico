public class contaTerminal {
    public static void main(String[] args) {
        // Primeira execução: saldo = 25, valor solicitado = 18
        double saldo = 25;
        double valorSolicitado = 18;
        
        System.out.println("Primeira execução:");
        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("Saldo atual: " + saldo);
        
        // Segunda execução: saldo = 15, valor solicitado = 22
        saldo = 15;
        valorSolicitado = 22;
        
        System.out.println("\nSegunda execução:");
        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("Saldo atual: " + saldo);
    }
}