import java.util.Hashtable;

public class Agenda {
    private Hashtable<DiaDaSemana,Plano> AgendaPlano;

    public void setAgendaTreino(DiaDaSemana dia, Plano T) {
            if(AgendaPlano == null){
                AgendaPlano = new Hashtable<DiaDaSemana,Plano>();
            }
            AgendaPlano.put(dia, T);
    }

    public Hashtable<DiaDaSemana, Plano> getAgendaTreino() {
        return AgendaPlano;
    }

    public Hashtable<DiaDaSemana, Plano> getAgendaDieta() {
        return AgendaPlano;
    }

    @Override
    public String toString() {
        return "Agenda [agenda = " + AgendaPlano + "]";
    }
}
enum DiaDaSemana{
    segunda, terca, quarta, quinta, sexta, sabado, domingo;
}
