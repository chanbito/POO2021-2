public class Pessoa{
    private String _nome;
    private String _email;
    private long _matricula;
    private int id;
    private static int ID;

    public Pessoa(String _nome, String _email, long _matricula){
        this.id = this.GenerateID();
        this._nome = _nome;
        this._email = _email;
        this._matricula = _matricula;
    }

    public int get_id(){
        return id;
    }

    private int GenerateID() {
        return ++ID;
    }

    public long get_matricula() {
        return _matricula;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_nome() {
        return _nome;
    }

    @Override
    public String toString() {
        return "Pessoa [_email=" + _email + ", _matricula=" + _matricula + ", _nome=" + _nome + ", id=" + id + "]";
    }

}
