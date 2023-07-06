package resolucaotela;

import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoTela {
    public static void main(String[] args) {
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("A resolução do sistema é:");
        System.out.println(resolucao.width + " x " + resolucao.height);
    }
}