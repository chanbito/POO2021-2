import java.util.Dictionary;

import javax.swing.text.Segment;

public class Treino extends id_class {
    private Dictionary<DiasDaSemana,String> agenda;
    public Treino(int id) {
        super(id);
    }
}
enum DiasDaSemana{
    segunda, terca, quarta, quinta, sexta, sabado, domingo;
}
    