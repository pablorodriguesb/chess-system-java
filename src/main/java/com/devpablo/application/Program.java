package com.devpablo.application;

import com.devpablo.boardgame.Board;
import com.devpablo.chess.ChessMatch;
import com.devpablo.chess.ChessPiece;
import com.devpablo.chess.ChessPosition;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board board = new Board(8, 8);

        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            
            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);
            
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }

    }
}
