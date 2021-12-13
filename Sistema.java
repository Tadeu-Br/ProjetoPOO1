import java.util.Scanner;
import java.util.List;

public class Sistema{
    public static boolean login(Autenticavel a){
        int senha;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe sua senha: ");
        senha = entrada.nextInt();
        return a.autentica(senha);
    }
    
    public static float calculaFolha(List<Assalariado> lista){
        float total = 0;
        for(Assalariado a : lista){
            total += a.getSalario();
        }
        return total;
    }
}
