package main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Grid_Board {
	
	private String [][]  Board = null;
	private int row_num = 16;
	private int col_num = 6;
	
	private Grid_Board() {
		ReadGrid();
		
	}
	
	private void ReadGrid() {
		
		this.Board = new String[row_num][col_num];
		
        try { 
            BufferedReader reader = new BufferedReader(new FileReader("src/main/gridA1.csv"));
            
            String line = null; 
            int count_row = 0;
            
            while((line=reader.readLine())!=null){ 
                String item[] = line.split(",");//CSV格式文件为逗号分隔符文件，这里根据逗号切分                
                for(int i=0; i<item.length; i++) {
                	this.Board[count_row][i] = item[i];
                }
                count_row ++;
            }
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 

	}

	/*
	public static void main(String[] args) {
		Grid_Board board = new Grid_Board();
		System.out.println("finish"); 
	}
	*/

}
