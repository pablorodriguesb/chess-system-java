package com.devpablo.chess;

import com.devpablo.boardgame.Board;
import com.devpablo.boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
}
