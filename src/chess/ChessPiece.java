package chess;

import board.BoardChess;
import board.Piece;
import board.Position;

public abstract class ChessPiece extends Piece{

	private Color color;

	public ChessPiece(BoardChess board, Color color) {
		super(board);
		this.color = color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	public Color getColor() {
		return color;
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece piece = (ChessPiece)getBoard().piece(position);
		return piece != null && piece.getColor() != color;
	}

	
}
