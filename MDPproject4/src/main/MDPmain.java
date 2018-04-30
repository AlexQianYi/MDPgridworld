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

	private Double Cal_Vval(Double [][]Board)
	{	
		Double X;
		Double X_N;
		Double X_S;
		Double X_W;
		Double X_E;
		Double V_N;
		Double V_S;
		Double V_W;
		Double V_E;

		//value of North position value
		if(i<=0 || Board[i-1][j]=="-")
		{
			X_N=Double.parseDouble(Board[i][j]);

		}
		else
		{
			X_N=Double.parseDouble(Board[i-1][j]);
		}

		

	//value of South position value
		if(i>=15 || Board[i+1][j]=="-")	
		{
			X_S=Double.parseDouble(Board[i][j]);
		}
		else
		{
			X_S=Double.parseDouble(Board[i+1][j]);

		}

	// west
		if(j<=0 || Board[i][j-1]=="-")
		{
			X_W=Double.parseDouble(Board[i][j]);

		}
		else
		{
			X_W=Double.parseDouble(Board[i][j-1]);
		}

	// east
		if(j>=5 || Board[i][j+1]=="-" )
		{
			X_E=Double.parseDouble(Board[i][j]);
		}
		else
		{
			X_E=Double.parseDouble(Board[i][j+1]);

		}


		V_N=cal_Qval(X_N,X_S,X_W,X_E);
		V_E=cal_Qval(X_E,X_W,X_N,X_S);
		V_S=cal_Qval(X_S,X_N,X_E,X_W);
		V_W=cal_Qval(X_W,X_E,X_S,X_N);

		X=Max(V_N,V_E,V_S,V_W); 

	retrun X;

	}
	
	public static void main(String[] args) {
		
	}
	
}
