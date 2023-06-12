package tarefa_classe;
/**
 * @author nnkidev
 */
public class Cliente
{
    public static void main(String[] args)
    {
        nomeCompleto();
        cpf();
        email();
        numeroDeCelular();
    }
    private static void numeroDeCelular()
    {
        /*
        Cel. (abreviação de Celular)
        Pegar o DDI e o DDD (+xx xx xxx xxx xxx)
         */
        System.out.println("  Cel.: " +
                "+55 13 987 654 321");
    }
    private static void email()
    {
        System.out.println("E-mail: " +
                "cliente@cliente.com.br");
    }
    private static void cpf()
    {
        System.out.println("   CPF: " +
                "123.456.789-10");
    }
    private static void nomeCompleto()
    {
        System.out.println("\n  Nome: " +
                "Cliente da Silva Sauro");
    }
}