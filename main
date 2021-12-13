/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;
import java.util.List;
public class Main
{
  public static void main (String[]args)
  {
    List lista = new ArrayList ();
    Pessoa p = new Pessoa ("Aline", 11111);
      lista.add (p);
    Funcionario f = new Gerente ("Maria", 2222222, 123, 16);
      lista.add (f);
    Gerente g = new Gerente ("Ana", 333, 1234, 17);
      lista.add (g);
    Atendente a = new Atendente ("Ana", 333, 1234);
      lista.add (a);

    /*for(int i=0; i<listaPessoas.size(); i++){
       if(Sistema.login(listaPessoas.get(i)))
       System.out.println(listaPessoas.get(i).getNome()+" logado!");
       else
       System.out.println(listaPessoas.get(i).getNome()+" problema com a senha");
       }
     */
      System.out.println ("Valor folha de pagamento = " +
			  Sistema.calculaFolha (lista));

  }
}
