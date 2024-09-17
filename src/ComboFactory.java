public class ComboFactory {
    public static ICombo criarCombo(int tipo) {
        switch (tipo) {
            case 1:
                return new ComboMaster();
            case 2:
                return new SuperCombo();
            default:
                throw new IllegalArgumentException("Tipo de combo inválido");
        }
    }
}
