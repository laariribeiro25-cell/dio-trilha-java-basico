public class Funcionario {
    private Departamento departamento;

    void trabalhar() {
        System.out.println("Funcionário trabalhando");
    }

    void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    Departamento getDepartamento() {
        return departamento;
    }
}