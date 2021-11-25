public class Aluno extends Pessoa {
    public Agenda agenda;
    public Aluno(String _nome, String _email, long _matricula) {
        super(_nome, _email, _matricula);
        agenda = new Agenda();
    }
    public Agenda getAgenda() {
        return agenda;
    }
    

    
}
