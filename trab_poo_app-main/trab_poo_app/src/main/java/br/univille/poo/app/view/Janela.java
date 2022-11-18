package br.univille.poo.app.view;

import javax.swing.*;

public class Janela extends JFrame {

    private JTextArea campoTextArea;
    private JComboBox<String> opcoesComboBox;
    private String[] opcoes = {"Alta","Média","Baixa"};

    public Janela(){
        setTitle("Cadastro de Tarefas");
        setSize(800,550);
        configurarJanela();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void configurarJanela() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        campoTextArea = new JTextArea(40,100);
        campoTextArea.setBounds(50,40,700,90);
        campoTextArea.setBorder(BorderFactory.createLineBorder(getForeground()));

        JLabel label = new JLabel("Tarefa");
        label.setBounds(50,10,100,30);
        label.setOpaque(true);

        JLabel label2 = new JLabel("Prioridade");
        label2.setBounds(50,200,100,60);
        label2.setOpaque(true);

        opcoesComboBox = new JComboBox<>(opcoes);
        opcoesComboBox.setBounds(50,260,700,30);

        JButton salvarBotao = new JButton("Salvar");
        salvarBotao.setBounds(650, 380, 100, 25);

        JButton cancelarBotao = new JButton("Cancelar");
        cancelarBotao.setBounds(530, 380, 100, 25);

        panel.add(label);
        panel.add(label2);
        panel.add(salvarBotao);
        panel.add(cancelarBotao);
        panel.add(opcoesComboBox);
        panel.add(campoTextArea);
        
        add(panel);
    }

}
