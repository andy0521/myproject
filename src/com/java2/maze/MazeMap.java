package com.java2.maze;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.java2.maze.MazeMap.Player;

public class MazeMap {

	// TODO Auto-generated constructor stub

	class Player {
		int hp = 100;
		int pos = 0;

		public Player(int hp, int pos) {
			this.hp = hp;
			this.pos = pos;
		}

		class Maze {

			int hp = 100;
			int pos = 0;
			int row, col;
			int trapCount;
			int[] traps;
			Player player; 

			public Maze(int col, int row, int trapCount) {
				this.col = col;
				this.row = row;
				this.trapCount = trapCount;
			}

		}

	}
}
