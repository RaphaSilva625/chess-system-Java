package board;

public class Piece {

	protected Position position;
	private BoardChess board;
	
	public Piece(BoardChess board) {
		this.board = board;
		position = null;
	}

	protected BoardChess getBoard() {
		return board;
	}
}
