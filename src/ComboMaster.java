class ComboMaster implements ICombo {
    @Override
    public void mostrarItens() {
        System.out.println("Combo Master: X-Tudo, Batata Grande, Coca-Cola");
    }

    @Override
    public double calcularPrecoTotal() {
        return 25.0; // Preço Combo Master
    }
}
