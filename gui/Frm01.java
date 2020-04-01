import javax.swing.*;

public class Frm01 {
    public void criaTela()
    {
        JFrame f = new JFrame();
        f.setSize(290, 100);
        f.setTitle("Cadastro");
        f.setLocation(10, 10);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        Frm01 tela = new Frm01();
        tela.criaTela();
    }
}
