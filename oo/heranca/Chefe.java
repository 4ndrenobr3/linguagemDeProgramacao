//Classe final chefe derivada de empregado
public final class Chefe extends Empregado
{
    private double salario;

    public Chefe(String n, String f, double s)
    {
        super(n, f);
        setSalario(s);
    }

    public void setSalario(double s)
    {
        salario = (s > 0 ? s : 0.0);
    }

    public double ganha()   //Implementação do método abstrato da super classe
    {
        return salario;
    }

    public String toString()
    {
        return "Chefe: " + super.toString();
    }
}