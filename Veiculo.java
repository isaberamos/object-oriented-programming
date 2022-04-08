public class Veiculo {
    private int anoDeFabricacao;
    private String modelo;
    private String marca;

    Veiculo(int adf, String m, String ma) {
        anoDeFabricacao = adf;
        modelo = m;
        marca = ma;
    }

    public int getanoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setanoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
}
