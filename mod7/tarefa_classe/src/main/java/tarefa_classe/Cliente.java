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
        System.out.println(
                "+55 13 987 654 321");
    }
    private static void email()
    {
        System.out.println(
                "cliente@cliente.com.br");
    }
    private static void cpf()
    {
        System.out.println(
                "123.456.789-10");
    }
    private static void nomeCompleto()
    {
        System.out.println(
                "\nCliente da Silva Sauro");
    }
}
