class SuperCombo implements ICombo {
    @Override
    public void mostrarItens() {
        System.out.println("Super Combo: Duplo Cheddar, Batata Média, Refrigerante 1L");
    }

    @Override
    public double calcularPrecoTotal() {
        return 30.0; // Preço Super Combo
    }
}
