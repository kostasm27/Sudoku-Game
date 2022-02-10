package com.company;

public class SudokuPuzzle {


    protected String [][] board;
    private final int ROWS;
    private final int COLUMNS;
    private final int BOXWIDTH;
    private final int BOXHEIGHT;
    private final String [] VALIDVALUES;

    public SudokuPuzzle(int rows,int columns,int boxWidth,int boxHeight,String [] validValues) {
        this.ROWS = rows;
        this.COLUMNS = columns;
        this.BOXWIDTH = boxWidth;
        this.BOXHEIGHT = boxHeight;
        this.VALIDVALUES = validValues;
        this.board = new String[ROWS][COLUMNS];
        initializeBoard();
    }




    public int getNumRows() {
        return this.ROWS;
    }

    public int getNumColumns() {
        return this.COLUMNS;
    }

    public int getBoxWidth() {
        return this.BOXWIDTH;
    }

    public int getBoxHeight() {
        return this.BOXHEIGHT;
    }

    public String [] getValidValues() {
        return this.VALIDVALUES;
    }

    public void makeMove(int row,int col,String value) {
            this.board[row][col] = value;

    }
    public String getValue(int row,int col) {
            return this.board[row][col];
    }

    /**
     * initializing the board
     */
    private void initializeBoard() {
        for(int row = 0;row < this.ROWS;row++) {
            for(int col = 0;col < this.COLUMNS;col++) {
                this.board[row][col] = "";
            }
        }
    }
}