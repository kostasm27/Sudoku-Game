package com.company;
public enum SudokuPuzzleType {
    /**
     *  Types of sudoku
     */
    KILLERSUDOKUNUMBERS(9,9,3,3,new String[] {"1","2","3","4","5","6","7","8","9"},"killerSudoku"),
    KILLERSUDOKULETTERS(9,9,3,3,new String[] {"Α","Β","C","D","E","F","G","H","I"},"killerSudoku"),
    SUDOKUNUMBERS(9,9,3,3,new String[] {"1","2","3","4","5","6","7","8","9"},"Sudoku"),
    SUDOKULETTERS(9,9,3,3,new String[] {"Α","Β","C","D","E","F","G","H","I"},"Sudoku"),
    DUIDOKUNUMBERS(4,4,2,2,new String[] {"Α","Β","C","D"},"DUIDOKU"),
    DUIDOKULETTERS(4,4,2,2,new String[] {"1","2","3","4"},"DUIDOKU"),;


    private final int rows;
    private final int columns;
    private final int boxWidth;
    private final int boxHeight;
    private final String [] validValues;
    private final String desc;

    SudokuPuzzleType(int rows, int columns, int boxWidth, int boxHeight, String[] validValues, String desc) {
        this.rows = rows;
        this.columns = columns;
        this.boxWidth = boxWidth;
        this.boxHeight = boxHeight;
        this.validValues = validValues;
        this.desc = desc;
    }
    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }
    public int getBoxWidth() {
        return boxWidth;
    }
    public int getBoxHeight() {
        return boxHeight;
    }
    public String [] getValidValues() {
        return validValues;
    }
    public String toString() {
        return desc;
    }
}