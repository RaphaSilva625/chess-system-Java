package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true){
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(reader);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(reader);
				
				ChessPiece capturedPiece = chessMatch.perfromChessMove(source, target);
			}
			catch (ChessException error){
				System.out.println(error.getMessage());
				reader.nextLine();
			}
			catch (InputMismatchException error){
				System.out.println(error.getMessage());
				reader.nextLine();
			}
		}
	}
}