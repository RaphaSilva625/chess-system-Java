package chess.pieces;

import board.BoardChess;
import board.Position;
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
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position piece = new Position(0, 0);
		
		//above
		piece.setValues(position.getRow() - 1, position.getColumn());
		while(getBoard().positionExists(piece) && !getBoard().thereIsAPiece(piece)) {
			mat[piece.getRow()][piece.getColumn()] = true;
			piece.setRow(piece.getRow() - 1);
		}
		if (getBoard().positionExists(piece) && isThereOpponentPiece(piece)) {
			mat[piece.getRow()][piece.getColumn()] = true;
		}
		
		//left
		piece.setValues(position.getRow(), position.getColumn() - 1);
		while(getBoard().positionExists(piece) && !getBoard().thereIsAPiece(piece)) {
			mat[piece.getRow()][piece.getColumn()] = true;
			piece.setRow(piece.getColumn() - 1);
		}
		if (getBoard().positionExists(piece) && isThereOpponentPiece(piece)) {
			mat[piece.getRow()][piece.getColumn()] = true;
		}
		
		//Right
		piece.setValues(position.getRow(), position.getColumn() + 1);
		while(getBoard().positionExists(piece) && !getBoard().thereIsAPiece(piece)) {
			mat[piece.getRow()][piece.getColumn()] = true;
			piece.setRow(piece.getColumn() + 1);
		}
		if (getBoard().positionExists(piece) && isThereOpponentPiece(piece)) {
			mat[piece.getRow()][piece.getColumn()] = true;
		}
		
		//below
		piece.setValues(position.getRow() + 1, position.getColumn());
		while(getBoard().positionExists(piece) && !getBoard().thereIsAPiece(piece)) {
			mat[piece.getRow()][piece.getColumn()] = true;
			piece.setRow(piece.getRow() + 1);
		}
		if (getBoard().positionExists(piece) && isThereOpponentPiece(piece)) {
			mat[piece.getRow()][piece.getColumn()] = true;
		}
		return mat;
	}
}
