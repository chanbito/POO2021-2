public class colaborador extends Pessoa {
    public colaborador(String _nome, String _email, long _matricula, int id) {
        super(_nome, _email, _matricula, id);
    }
    private float valorHora;
    private String funcao;

    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "colaborador [valorHora=" + valorHora + "]";
    }
}