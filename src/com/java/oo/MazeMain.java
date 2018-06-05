package com.java.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MazeMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		try {
			fr = new FileReader("maze.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] token = line.split(",");
			int col = Integer.parseInt(token[0]);
			int row = Integer.parseInt(token[1]);
			line = in.readLine();
			int trapCount = Integer.parseInt(line);
					
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	}
class Maze{
	int row,col;
	int trapCount;
	int []traps;
	Player player;
	public Maze (int col,int row , int trapCount){
		
	}
}
class Player{
	int hp = 100;
	int pos =0;
	
}
}
