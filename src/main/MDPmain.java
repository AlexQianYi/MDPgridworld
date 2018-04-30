package main;

public class MDPmain {
	
	private Grid_Board board;
	private int col_num = 6;
	private int row_num = 16;
	private double N_pos = 0.65;
	private double E_pos = 0.15;
	private double W_pos = 0.15;
	private double S_pos = 0.05;
	private double discount = 0.9;
	private double reward = -0.01;
	private String MaxValue = "1000";
	private String MinValue = "-800";
	private int[][] direction = null;
	
	private MDPmain() {
		board = new Grid_Board("src/main/gridA1.csv", row_num, col_num);
		direction = new int[16][6];
		printBoard();
	}
	
	public void MDPiter() {
		int count = 0;
		System.out.println("in1");
		for(int i=0; i<this.row_num; i++) {
			for(int j=0; j<this.col_num; j++) {
				System.out.println(this.board.getItem(i, j));
				if(this.board.getItem(i, j).equals("-") || this.board.getItem(i, j).equals(MaxValue) || this.board.getItem(i, j).equals(MinValue)) {
					continue;
				}else {
					this.board.setItem(i, j, Cal_Vval(i, j));	
				}
			}
			count++;
		}
		printBoard();
	}
	
	private Double cal_Qval(Double X_N,Double X_S,Double X_W, Double X_E)
	{
		return (reward+discount*X_N)*N_pos+(reward+discount*X_S)*E_pos+(reward+discount*X_W)*W_pos+(reward+discount*X_S)*S_pos;
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
		
		java.text.DecimalFormat df = new java.text.DecimalFormat("#.0000");
		

		//value of North position value
		if(i<=0 || this.board.getItem(i-1, j).equals("-"))
		{
			X_N=Double.parseDouble(this.board.getItem(i, j));

		}
		else
		{
			X_N=Double.parseDouble(this.board.getItem(i-1, j));
		}

		

	//value of South position value
		if(i>=15 || this.board.getItem(i+1, j).equals("-"))	
		{
			X_S=Double.parseDouble(this.board.getItem(i, j));
		}
		else
		{
			X_S=Double.parseDouble(this.board.getItem(i+1, j));

		}

	// west
		if(j<=0 || this.board.getItem(i, j-1).equals("-"))
		{
			X_W=Double.parseDouble(this.board.getItem(i, j));

		}
		else
		{
			X_W=Double.parseDouble(this.board.getItem(i, j-1));
		}

	// east
		if(j>=5 || this.board.getItem(i, j+1) .equals("-"))
		{
			X_E=Double.parseDouble(this.board.getItem(i, j));
		}
		else
		{
			X_E=Double.parseDouble(this.board.getItem(i, j+1));

		}

		System.out.println("up");
		Q_N=cal_Qval(X_N,X_S,X_W,X_E);
		System.out.println("right");
		Q_E=cal_Qval(X_E,X_W,X_N,X_S);
		System.out.println("down");
		Q_S=cal_Qval(X_S,X_N,X_E,X_W);
		System.out.println("left");
		Q_W=cal_Qval(X_W,X_E,X_S,X_N);

		int direction_temp;
		double temp_max;
		
		if(Q_N >= Q_E && Q_N >= Q_S && Q_N >= Q_W) {
			direction_temp = 1;
		}else if(Q_E >= Q_N && Q_E >= Q_S && Q_E >= Q_W) {
			direction_temp = 2;
		}else if(Q_S >= Q_N && Q_S >= Q_E && Q_S >= Q_W) {
			direction_temp = 3;
		}else {
			direction_temp = 4;
		}

		Vstar=Math.max(Math.max(Math.max(Q_N, Q_E), Q_S), Q_W);
		
		this.direction[i][j] = direction_temp;

	return Double.valueOf(df.format(Vstar));
	}
	
	public void printBoard() {
		
		for(int i=0; i<this.row_num; i++) {
			for(int j=0; j<this.col_num; j++) {
				System.out.print(this.board.getItem(i, j));
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
	}
	
	public void printDirection() {
		
		for(int i=0; i<this.row_num; i++) {
			for(int j=0; j<this.col_num; j++) {
				System.out.print(this.direction[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
	}
	
	public static void main(String[] args) {
		
		MDPmain mdp = new MDPmain();
		
		for(int i=0; i<20; i++) {
			mdp.MDPiter();
		}
		
		mdp.printDirection();
		
	}
	
}
