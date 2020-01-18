package chess;

import board.BoardChess;

public class ChessMatch {

	private BoardChess board;
	public ChessMatch() {
		board = new BoardChess(8, 8);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j]= (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}
