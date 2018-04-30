package main;

public class MDPmain {
	
	Grid_Board board;
	int col_num;
	int row_num;
	
	private void MDPmain() {
		this.board = new Grid_board();
		this.col_num = board.getCol();
		this.row_num = board.getRow();
	}
	
	public static void main(String[] args) {
		
	}
	
}
