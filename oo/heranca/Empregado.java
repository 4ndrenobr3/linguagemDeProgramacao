// Classe abstrata empregado
public abstract class Empregado     //Como a classe contém um método abstrato,ela deve ser declarada com abstrata
{
    private String nome;
    private String familia;

    public Empregado(String n, String f)
    {
        nome = n;
        familia = f;
    }

    public String getNome()
    {
        return nome;
    }

    public String getFamilia()
    {
        return familia;
    }

    public String toString()
    {
        return nome + ' ' + familia;
    }

    public abstract double ganha();     //Método Abstrato, deve ser implementado na subclasse.
}