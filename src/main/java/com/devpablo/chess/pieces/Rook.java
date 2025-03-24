package com.devpablo.chess.pieces;

import com.devpablo.boardgame.Board;
import com.devpablo.chess.ChessPiece;
import com.devpablo.chess.Color;

public class Rook extends ChessPiece {
    
    public Rook(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString() {
        return "R";
    }
    
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
