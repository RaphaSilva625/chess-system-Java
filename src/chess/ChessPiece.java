package chess;

import board.BoardChess;
import board.Piece;

public class ChessPiece extends Piece{

	private Color color;

	public ChessPiece(BoardChess board, Color color) {
		super(board);
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}

	
}
