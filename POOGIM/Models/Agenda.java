import java.util.Hashtable;
public class Agenda {
    private Hashtable<DiaDaSemana,Treino> agendaTreino;
    private Hashtable<DiaDaSemana,Alimentacao> agendaDieta;

    public void setAgendaTreino(DiaDaSemana dia, Treino T) {
            if(agendaTreino == null){
                agendaTreino = new Hashtable<DiaDaSemana,Treino>();
            }
            agendaTreino.put(dia, T);
    }

    public void setAgendaDieta(DiaDaSemana dia, Alimentacao dieta) {
        if(agendaDieta == null){
            agendaDieta = new Hashtable<DiaDaSemana, Alimentacao>();
        }
        agendaDieta.put(dia, dieta);

    }

    public Hashtable<DiaDaSemana, Treino> getAgendaTreino() {
        return agendaTreino;
    }

    public Hashtable<DiaDaSemana, Alimentacao> getAgendaDieta() {
        return agendaDieta;
    }

    @Override
    public String toString() {
        return "Agenda [agendaDieta = " + agendaDieta + ", agendaTreino = " + agendaTreino + "]";
    }
}
enum DiaDaSemana{
    segunda, terca, quarta, quinta, sexta, sabado, domingo;
}
