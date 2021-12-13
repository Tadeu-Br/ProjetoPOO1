public class Pessoa implements Autenticavel, Assalariado{
    private String nome;
    private int RG;
    private long CPF;
    private String endereco;
    private int senha;
    
    public Pessoa(String nome, long CPF){
        this.nome = nome;
        this.CPF = CPF;
        endereco = "";
        RG = 0;
        senha = 0;
    }
    
    public void setSenha(int novaSenha) {senha = novaSenha;}
    public String getNome() {return nome;}
    public long getCPF() {return CPF;}
    public int getRG() {return RG;}
    public String getEndereco(){ return endereco;}
    
    public boolean autentica(int senha){
        if(this.senha == senha)
            return true;
        return false;        
    }
    
    public float getSalario() {return 1000;}
    
    public String toString(){
        return "Nome = "+nome+" CPF = "+CPF+" RG = " +RG + " Endereço = "+ endereco;
    }
    
    
}
