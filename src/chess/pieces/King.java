package chess.pieces;

import board.BoardChess;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(BoardChess board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}
}
