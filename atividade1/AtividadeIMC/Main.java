package AtividadeIMC;

public class Main {
    public class Principal {
    public static void main(String[] args) {
        // Criando três instâncias da classe Paciente
        Paciente p1 = new Paciente(50, 1.60);
        Paciente p2 = new Paciente(80, 1.75);
        Paciente p3 = new Paciente(110, 1.70);

        // Exibindo resultados
        System.out.println("Paciente 1:");
        System.out.printf("IMC: %.2f - %s%n", p1.calcularIMC(), p1.diagnostico());

        System.out.println("\nPaciente 2:");
        System.out.printf("IMC: %.2f - %s%n", p2.calcularIMC(), p2.diagnostico());

        System.out.println("\nPaciente 3:");
        System.out.printf("IMC: %.2f - %s%n", p3.calcularIMC(), p3.diagnostico());
    }
}

    
}
