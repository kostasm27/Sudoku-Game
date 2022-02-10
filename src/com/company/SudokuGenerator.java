package com.company;



public class SudokuGenerator {
    /**
     *
     * @param puzzleType
     * @return chosen puzzle
     */

   public SudokuPuzzle generateRandomSudoku(SudokuPuzzleType puzzleType) {
        SudokuPuzzle puzzle = new SudokuPuzzle(puzzleType.getRows(), puzzleType.getColumns(), puzzleType.getBoxWidth(), puzzleType.getBoxHeight(), puzzleType.getValidValues());

        return puzzle;
    }
}