package com.company;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.*;

public class SudokuFrame extends JFrame {

    private JPanel Panel;
    private SudokuPanel aPanel;
    private JButton help;

    /**
     *  Frame of the Sudoku
     */
    public SudokuFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Sudoku");
        /**
         * Giving the dimensions of the Frame
         */
        this.setMinimumSize(new Dimension(900, 600));
        this.setLocationRelativeTo(null);

        JPanel windowPanel = new JPanel();
        windowPanel.setLayout(new FlowLayout());

        Panel = new JPanel();
        Panel.setPreferredSize(new Dimension(100, 500));
        aPanel = new SudokuPanel();


        windowPanel.add(aPanel);
        windowPanel.add(Panel);
        this.add(windowPanel);
        /**
         * Asking the user for the sudoku type
         * and to choose between letters and numbers
         */
        ArrayList<String> nicknames = new ArrayList<String>();
        String language = JOptionPane.showInputDialog("1)English,2)Ελληνικά");
        if (language.equals("1")){
        String User = JOptionPane.showInputDialog("New User?");
        if(User.toLowerCase().equals("yes")) {
            String name = JOptionPane.showInputDialog("Give a nickname");
            nicknames.add(name);
        }
        help = new JButton();
        help.setText("Help!");
        windowPanel.add(help);
        String dialog = JOptionPane.showInputDialog("1)Sudoku,2)KillerSudoku,3)Duidoku");
        if (dialog.equals("1")){
            String selection = JOptionPane.showInputDialog("1)Numbers,2)Letters");
            int answer = Integer.parseInt(selection);
            if (answer == 1) {
                buildInterface(SudokuPuzzleType.SUDOKUNUMBERS,26);
            } else {
                buildInterface(SudokuPuzzleType.SUDOKULETTERS,26);
            }
        }else if (dialog.equals("2")){
            String selection = JOptionPane.showInputDialog("1)Numbers,2)Letters");
            int answer = Integer.parseInt(selection);
            if (answer == 1) {
                buildInterface(SudokuPuzzleType.KILLERSUDOKUNUMBERS,26);
            } else {
                buildInterface(SudokuPuzzleType.KILLERSUDOKULETTERS,26);
            }
        }else {
            String selection = JOptionPane.showInputDialog("1)Numbers,2)Letters");
            int answer = Integer.parseInt(selection);
            if (answer == 1) {
                buildInterface(SudokuPuzzleType.DUIDOKUNUMBERS, 26);
            } else {
                buildInterface(SudokuPuzzleType.DUIDOKULETTERS, 26);
            }
            //ξεκιναει με αντιπαλο τον υπολογιστη και πρωτη κινηση ο χρηστης
        }
        }else{
            String User = JOptionPane.showInputDialog("Νέος Χρήστης;");
            if(User.toLowerCase().equals("yes")) {
                String name = JOptionPane.showInputDialog("Δώσε ενα ψευδώνυμο");
                nicknames.add(name);
            }
            help = new JButton();
            help.setText("Βοήθεια");
            windowPanel.add(help);
            String dialog = JOptionPane.showInputDialog("1)Sudoku,2)KillerSudoku,3)Duidoku");
            if (dialog.equals("1")){
                String selection = JOptionPane.showInputDialog("1)Νούμερα,2)Γράμματα");
                int answer = Integer.parseInt(selection);
                if (answer == 1) {
                    buildInterface(SudokuPuzzleType.SUDOKUNUMBERS,26);
                } else {
                    buildInterface(SudokuPuzzleType.SUDOKULETTERS,26);
                }
            }else if (dialog.equals("2")){
                String selection = JOptionPane.showInputDialog("1)Νούμερα,2)Γράμματα");
                int answer = Integer.parseInt(selection);
                if (answer == 1) {
                    buildInterface(SudokuPuzzleType.KILLERSUDOKUNUMBERS,26);
                } else {
                    buildInterface(SudokuPuzzleType.KILLERSUDOKULETTERS,26);
                }
            }else {
                String selection = JOptionPane.showInputDialog("1)Νούμερα,2)Γράμματα");
                int answer = Integer.parseInt(selection);
                if (answer == 1) {
                    buildInterface(SudokuPuzzleType.DUIDOKUNUMBERS, 26);
                } else {
                    buildInterface(SudokuPuzzleType.DUIDOKULETTERS, 26);
                }
            }

        }

    }


    /**
     * Building the choice of the user
     *
     * */
    public void buildInterface(SudokuPuzzleType puzzleType, int fontSize) {
        SudokuPuzzle generatedPuzzle = new SudokuGenerator().generateRandomSudoku(puzzleType);
        aPanel.newSudokuPuzzle(generatedPuzzle);
        aPanel.setFontSize(fontSize);
        for (String value : generatedPuzzle.getValidValues()) {
            JButton b = new JButton(value);
            b.setPreferredSize(new Dimension(45, 45));
            b.addActionListener(aPanel.new NumActionListener());
            Panel.add(b);
        }
        aPanel.repaint();
        Panel.revalidate();
        Panel.repaint();
    }
}

