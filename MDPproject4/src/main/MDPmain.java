package main;

public class MDPmain {
	
	Grid_Board board;
	private int col_num;
	private int row_num;
	private double N_pos = 0.65;
	private double E_pos = 0.15;
	private double W_pos = 0.15;
	private double S_pos = 0.05;
	private double discount = 0.9;
	private double reward = -0.01;
	
	private void MDPmain() {
		this.board = new Grid_board();
		this.col_num = board.getCol();
		this.row_num = board.getRow();
		
		for(int i=0; i<this.row_num; i++) {
			for(int j=0; j<this.col_num; j++) {
				this.board.setItem(i, j) = Cal_Val(i, j);
			}
		}
	}
	
	private Double cal_Qval(Double X_N,Double X_S,Double X_W, Double X_E)
	{
		Double N=0.65;
		Double E=0.15;
		Double W=0.15;
		Double S=0.05;
		Double R=-0.01;
		Double D=0.9;
		Double Q;

		Q=(reward+discount*X_N)*N_pos+(reward+discount*X_S)*E_pos+(reward+discount*X_W)*W_pos+(reward+discount*X_S)*S_pos;

		return Q
	}

	private Double Cal_Vval(int i, int j)
	{	
		Double Vstar;
		Double X_N;
		Double X_S;
		Double X_W;
		Double X_E;
		Double Q_N;
		Double Q_S;
		Double Q_W;
		Double Q_E;

		//value of North position value
		if(i<=0 || this.Board.getItem(i-1, j)=="-")
		{
			X_N=Double.parseDouble(this.Board.getItem(i, j));

		}
		else
		{
			X_N=Double.parseDouble(this.Board.getItem(i-1, j));
		}

		

	//value of South position value
		if(i>=15 || this.Board.getItem(i+1, j)=="-")	
		{
			X_S=Double.parseDouble(this.Board.getItem(i, j));
		}
		else
		{
			X_S=Double.parseDouble(this.Board.getItem(i+1, j));

		}

	// west
		if(j<=0 || this.Board.getItem(i, j-1)=="-")
		{
			X_W=Double.parseDouble(this.Board.getItem(i, j));

		}
		else
		{
			X_W=Double.parseDouble(this.Board.getItem(i, j-1));
		}

	// east
		if(j>=5 || this.Board.getItem(i, j+1) =="-" )
		{
			X_E=Double.parseDouble(this.Board.getItem(i, j));
		}
		else
		{
			X_E=Double.parseDouble(this.board.getItem(i, j+1));

		}


		Q_N=cal_Qval(X_N,X_S,X_W,X_E);
		Q_E=cal_Qval(X_E,X_W,X_N,X_S);
		Q_S=cal_Qval(X_S,X_N,X_E,X_W);
		Q_W=cal_Qval(X_W,X_E,X_S,X_N);

		Vstar=max(max(max(Q_N, Q_E), Q_S), Q_W);

	return Vstar;
	}
	
	
	
	public static void main(String[] args) {
		
	}
	
}
