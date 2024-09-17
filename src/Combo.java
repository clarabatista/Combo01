public class Combo {
    private ICombo combo;

    public void criarCombo(int tipo) {
        combo = ComboFactory.criarCombo(tipo);
    }

    public void mostrarItens() {
        combo.mostrarItens();
    }

    public double calcularPrecoTotal() {
        return combo.calcularPrecoTotal();
    }
}