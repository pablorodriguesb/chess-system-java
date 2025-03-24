package com.devpablo.chess;

import com.devpablo.boardgame.Board;
import com.devpablo.boardgame.Position;
import com.devpablo.chess.pieces.King;
import com.devpablo.chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        Position position = new ChessPosition(column, row).toPosition();

        // Verifica se a posição já está ocupada
        if (board.thereIsAPiece(position)) {
            System.out.println("Position " + position + " is already occupied!");
            return; // Não coloca a peça se já houver uma peça
        }

        board.placePiece(piece, position); // Coloca a peça
    }

    private void initialSetup() {

        placeNewPiece('b', 6, new Rook(board, Color.WHITE));  // Rook em b6
        placeNewPiece('c', 1, new Rook(board, Color.WHITE));  // Rook em c1
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));  // Rook em c2
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));  // Rook em d2
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));  // Rook em e2
        placeNewPiece('d', 1, new King(board, Color.WHITE));  // King em d1

        // Rooks pretos e rei preto
        placeNewPiece('c', 7, new Rook(board, Color.BLACK));  // Rook em c7
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));  // Rook em c8
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));  // Rook em d7
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));  // Rook em e7
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));  // Rook em e8
        placeNewPiece('d', 8, new King(board, Color.BLACK));  // King em d8

        // Outros Kings
        // placeNewPiece('e', 1, new King(board, Color.WHITE));  // King em e1 (Reparar aqui se necessário, pois pode ter conflito com outra peça)
        placeNewPiece('e', 8, new King(board, Color.BLACK));  // King em e8 (Reparar aqui se necessário, pois pode ter conflito com outra peça)
    }

}
