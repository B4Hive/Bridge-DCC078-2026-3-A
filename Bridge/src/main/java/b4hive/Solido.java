package b4hive;

public class Solido implements Componente {
    Temperatura armazenamento;
    public Solido(Temperatura armazenamento) {
        this.armazenamento = armazenamento;
    }
    public String get() {
        return "Solido" + armazenamento.get();
    }
}
