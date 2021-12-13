public abstract class Funcionario extends Pessoa implements Assalariado{
    private String locacao;
    private int matricula;
    
    public Funcionario(String nome, long CPF, int mat){
        super(nome, CPF);
        this.matricula = mat;
        locacao = "";
    }
    
    public abstract float getSalario();
    
    public String toString(){
        return super.toString() + " Locacao = "+locacao+" Matricula = "+matricula;
    }
}
