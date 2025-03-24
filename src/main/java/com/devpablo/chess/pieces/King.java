package com.devpablo.chess.pieces;

import com.devpablo.boardgame.Board;
import com.devpablo.chess.ChessPiece;
import com.devpablo.chess.Color;

public class King extends ChessPiece {
    
    public King(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
