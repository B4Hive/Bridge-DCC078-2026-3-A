package b4hive;

public class Gasoso implements Componente {
    Temperatura armazenamento;
    public Gasoso(Temperatura armazenamento) {
        this.armazenamento = armazenamento;
    }
    public String get() {
        return "Gasoso" + armazenamento.get();
    }
}
