public class colaborador extends Pessoa {
    private double valorHora;
    private String funcao;

    public colaborador(String _nome, String _email, long _matricula, Double valorHora, String funcao) {
        super(_nome, _email, _matricula);
        this.valorHora = valorHora;
        this.funcao = funcao;
    }
    
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario(int horas){
        return valorHora * horas;
    }
    
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "colaborador [valorHora=" + valorHora + "]\n";
    }
}