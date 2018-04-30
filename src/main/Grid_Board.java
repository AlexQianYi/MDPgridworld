package main;
import java.io.BufferedReader;
import java.io.FileReader;

public class Grid_Board {
	
	private String [][]  Board = null;
	private int row_num = 0;
	private int col_num = 0;
	private String file_path;
	
	public Grid_Board(String file_path, int row, int col) {
		row_num = row;
		col_num = col;
		this.file_path = file_path;
		ReadGrid();
	}
	
	public void ReadGrid() {
		
		this.Board = new String[row_num][col_num];
		
        try { 
            BufferedReader reader = new BufferedReader(new FileReader(this.file_path));
            
            String line = null; 
            int count_row = 0;
            
            while((line=reader.readLine())!=null){ 
                String item[] = line.split(",");//CSV格式文件为逗号分隔符文件，这里根据逗号切分                
                for(int i=0; i<item.length; i++) {
                	this.Board[count_row][i] = item[i];
                }
                count_row ++;
            }
            System.out.println("load finish");
            reader.close();
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 

	}
	
	public String getItem(int i, int j) {
		return this.Board[i][j];
	}
	
	public void setColNum(int col) {
		this.col_num = col;
	}
	
	public void setRowNum(int row) {
		this.row_num = row;
	}	
	
	public int getColNum() {
		return col_num;
	}
	
	public int getRowNum() {
		return row_num;
	}
	
	public void setItem(int i, int j, double val) {
		this.Board[i][j] = Double.toString(val);
	}

	
	public static void main(String[] args) {
		Grid_Board board = new Grid_Board("src/main/gridA1.csv", 16, 6);
		System.out.println("finish"); 
		System.out.println(board.getColNum());
	}
	

}
