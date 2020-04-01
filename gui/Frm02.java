import javax.swing.*;

public class Frm02 {
    public void criaTela()
    {
        //Criando o Frame
        JFrame f = new JFrame();
        f.setSize(300, 100);
        f.setTitle("Cadastro de Categorias");
        f.setLocation(150, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Criando o painel
        JPanel pl = new JPanel();
        pl.setLayout(null);

        //Criando os componentes
        //Label
        JLabel meuLabel = new JLabel();
        meuLabel.setBounds(10, 10, 60, 20);

        //Campo de texto
        JTextField meuCampoTexto = new JTextField();
        meuCampoTexto.setBounds(80, 10, 60, 20);

        //Botão
        JButton meuBotao = new JButton();
        meuBotao.setBounds(150, 10, 100, 20);

        //Colando os componentes no painel
        pl.add(meuLabel);
        pl.add(meuCampoTexto);
        pl.add(meuBotao);

        //Colando o painel no frame
        f.add(pl);
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        Frm02 tela = new Frm02();
        tela.criaTela();
    }
}