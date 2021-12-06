public class Treino extends Plano {
    private String sequencia;
    
    public Treino(int colabId, String tipo, String descricao, String sequencia) {
        super(colabId, tipo, descricao);
        this.sequencia = sequencia;
    }
    public String getSequencia() {
        return sequencia;
    }
    public void setSequencia(String sequencia) {
        this.sequencia = sequencia;
    }

    @Override
    public String toString() {
        return " Treino [ "+ this.getStringInfo() +" ,sequencia= " + sequencia + " ] \n";
    }
    
    
}

    