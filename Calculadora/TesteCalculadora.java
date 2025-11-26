package Calculadora;

/**
 * <p><strong>Classe de Teste da Calculadora</strong></p>
 *
 * <p>Esta classe contém o método {@code main}, responsável por executar testes
 * simples das operações fornecidas pela classe {@link Calculadora}.</p>
 *
 * <p>Ela demonstra o uso dos métodos de soma, subtração, multiplicação e divisão,
 * incluindo testes de exceção para divisão por zero e operador inválido.</p>
 *
 * <p>É utilizada com fins educacionais para validar o funcionamento da classe
 * principal e exemplificar o tratamento de erros.</p>
 *
 * @author Alanis Prado Silva
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Método principal que executa exemplos de uso da classe {@link Calculadora}.
     *
     * @param args argumentos de linha de comando (não utilizados neste exemplo)
     */
    public static void main(String[] args) {

        // Cria uma instância da calculadora para realizar os testes
        Calculadora calc = new Calculadora();
    
        // Testes das operações básicas com operadores válidos
        System.out.println(calc.calcular(2, 3, "+"));  // Soma: 2 + 3
        System.out.println(calc.calcular(10, 4, "-")); // Subtração: 10 - 4
        System.out.println(calc.calcular(3, 5, "*"));  // Multiplicação: 3 * 5
        System.out.println(calc.calcular(8, 2, "/"));  // Divisão: 8 / 2
    
        // Teste de exceção: tentativa de dividir por zero
        try {
            System.out.println(calc.calcular(8, 0, "/")); // Deve lançar exceção
        } catch (IllegalArgumentException e) {
            // Exibe a mensagem de erro lançada pelo método
            System.out.println(e.getMessage());
        }
    
        // Teste de exceção: operador inválido
        try {
            System.out.println(calc.calcular(5, 5, "x")); // Operador inexistente
        } catch (IllegalArgumentException e) {
            // Exibe a mensagem informando que o operador é inválido
            System.out.println(e.getMessage());
        }
    }
    
}
