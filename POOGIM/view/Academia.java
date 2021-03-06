public class Academia {
    public static void main(String[] args) 
    {
        var nutri = new colaborador("maria", "maria@teste", 103, 3.50, "Nutricionista");
        var prof = new colaborador("Joao", "joao@teste", 102, 5.50, "Personal Treiner");
        var aluno = new Aluno("Gabriel", "Teste@Teste.com.br", 10000010);
        aluno.agenda.setAgenda(DiaDaSemana.segunda, new Treino(prof.get_id(), "Perna", "Agachamento", "3/20"));
        aluno.agenda.setAgenda(DiaDaSemana.quinta, new Treino(prof.get_id(), "Perna", "Agachamento", "3/20"));
        var dieta = new Alimentacao(nutri.get_id(), "Pre-Treino", "Dieta rica em batata", 3000);
        aluno.agenda.setAgenda(DiaDaSemana.domingo, dieta);
        aluno.agenda.setAgenda(DiaDaSemana.quarta, dieta);
        System.out.println(aluno);
        System.out.println(aluno.agenda);
    }
}