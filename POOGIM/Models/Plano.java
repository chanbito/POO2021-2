public abstract class Plano {
    private int ColabId;
    private String Tipo;
    private String descricao;

    public Plano(int colabId, String tipo, String descricao) {
        setColabId(colabId);
        setTipo(tipo);
        this.setDescricao(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public int getColabId() {
        return ColabId;
    }

    public void setColabId(int colabId) {
        this.ColabId = colabId;
    }

    protected String getStringInfo(){
        return " Responsavel=" + ColabId + ", Tipo=" + Tipo + ", descricao=" + descricao + " ";
    }

    @Override
    public String toString() {
        return "Plano [Responsavel=" + ColabId + ", Tipo=" + Tipo + ", descricao=" + descricao + "]";
    }
}
