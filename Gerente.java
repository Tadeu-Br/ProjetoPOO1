public class Gerente extends Funcionario{
    private int numFunc;
    
    public Gerente(String nome, long CPF, int matricula, int nf){
        super(nome, CPF, matricula);
        this.numFunc = nf;
    }
    
    public float getSalario() {return numFunc * 100;}
    
    public String toString(){
        return super.toString() + " NumFunc = "+ numFunc + " Salario = " + getSalario();
    }
    
}
