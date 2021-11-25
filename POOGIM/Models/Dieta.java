public class Dieta extends Plano {
    private int CaloriasDiarias;

    public Dieta(int colabId, String tipo, String descricao, int caloriasDiarias) {
        super(colabId, tipo, descricao);
        CaloriasDiarias = caloriasDiarias;
    }

    public int getCaloriasDiarias() {
        return CaloriasDiarias;
    }

    public void setCaloriasDiarias(int caloriasDiarias) {
        this.CaloriasDiarias = caloriasDiarias;
    }

    @Override
    public String toString() {
        return " Treino ["+ this.getStringInfo() +" Calorias= " + CaloriasDiarias + " ] ";
    }
}
