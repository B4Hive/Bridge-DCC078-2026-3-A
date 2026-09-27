package b4hive;

public class Liquido implements Componente {
    Temperatura armazenamento;
    public Liquido(Temperatura armazenamento) {
        this.armazenamento = armazenamento;
    }
    public String get() {
        return "Liquido" + armazenamento.get();
    }
}
