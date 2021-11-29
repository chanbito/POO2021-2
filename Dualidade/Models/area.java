public class area extends BaseClass{
    private String nome;
    private String description;
    public area(String nome, String description) {
        this.nome = nome;
        this.description = description;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
       update();
        this.nome = nome;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        update();
        this.description = description;
    }
    @Override
    public String toString() {
        return "area [description=" + description + ", nome=" + nome + "," + GetStringDates() +"]";
    }
}
