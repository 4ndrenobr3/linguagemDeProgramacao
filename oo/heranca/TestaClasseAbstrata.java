import java.text.DecimalFormat;

public class TestaClasseAbstrata {
    
    public static void main(String[] args)
    {
        Empregado e;    //Variável de referencia da super classe
        String sai = "";
        DecimalFormat df = new DecimalFormat("0.00");
        Chefe c = new Chefe("João", "Silva", 3000.00);
        PorComissao pc = new PorComissao("Maria", "Souza", 400.00, 3.00, 150);
        PorItem pi = new PorItem("Pedro", "Cabral", 2.50, 200);
        PorHora ph = new PorHora("Marta", "Ferreira", 13.75, 40.50);
        
        e = c;      //Recupera as características de chefe;
        sai += e.toString() + " ganha $" + df.format(e.ganha()) + "\n";

        e = pc;      //Recupera as características de PorComissao;
        sai += e.toString() + " ganha $" + df.format(e.ganha()) + "\n";

        e = pi;      //Recupera as características de PorItem;
        sai += e.toString() + " ganha $" + df.format(e.ganha()) + "\n";

        e = ph;      //Recupera as características de PorHora;
        sai += e.toString() + " ganha $" + df.format(e.ganha()) + "\n";

        System.out.println(sai);
    }
}