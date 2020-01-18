package chess.pieces;

import board.BoardChess;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(BoardChess board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}
}
