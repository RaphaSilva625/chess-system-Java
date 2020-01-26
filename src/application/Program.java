package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true){
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
		System.out.println("Source: ");
		ChessPosition source = UI.readChessPosition(reader);
		
		System.out.println();
		System.out.println("Target: ");
		ChessPosition target = UI.readChessPosition(reader);
		
		ChessPiece capturedPiece = chessMatch.perfromChessMove(source, target);
		}
	}
}