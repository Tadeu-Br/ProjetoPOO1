public class Atendente extends Funcionario{
    
    public Atendente(String n, long CPF, int mat){
        super(n, CPF, mat);
    }
    
    
    public float getSalario(){return 10000;}
    
    public String toString(){
        return super.toString()+" Salario = "+getSalario();
        
    }
    
    
}
