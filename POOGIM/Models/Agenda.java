import java.util.Hashtable;

public class Agenda {
    private Hashtable<DiaDaSemana,Plano> AgendaPlano;

    public void setAgenda(DiaDaSemana dia, Plano T) {
            if(AgendaPlano == null){
                AgendaPlano = new Hashtable<DiaDaSemana,Plano>();
            }
            AgendaPlano.put(dia, T);
    }

    public Hashtable<DiaDaSemana, Plano> getAgenda() {
        return AgendaPlano;
    }

    @Override
    public String toString() {
        return "Agenda [agenda = \n" + AgendaPlano + "]\n";
    }
}
enum DiaDaSemana{
    segunda, terca, quarta, quinta, sexta, sabado, domingo;
}
