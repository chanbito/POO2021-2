import java.util.Hashtable;
public class Agenda {
    private Hashtable<DiasDaSemana,Treino> agendaTreino;
    private Hashtable<DiasDaSemana,Dieta> agendaDieta;

    public void setAgendaTreino(DiasDaSemana dia, Treino T) {
            if(agendaTreino == null){
                agendaTreino = new Hashtable<DiasDaSemana,Treino>();
            }
            agendaTreino.put(dia, T);
    }

    public void setAgendaDieta(DiasDaSemana dia, Dieta dieta) {
        if(agendaDieta == null){
            agendaDieta = new Hashtable<DiasDaSemana, Dieta>();
        }
        agendaDieta.put(dia, dieta);

    }

    public Hashtable<DiasDaSemana, Treino> getAgendaTreino() {
        return agendaTreino;
    }

    public Hashtable<DiasDaSemana, Dieta> getAgendaDieta() {
        return agendaDieta;
    }

    @Override
    public String toString() {
        return "Agenda [agendaDieta = " + agendaDieta + ", agendaTreino = " + agendaTreino + "]";
    }
}
enum DiasDaSemana{
    segunda, terca, quarta, quinta, sexta, sabado, domingo;
}
