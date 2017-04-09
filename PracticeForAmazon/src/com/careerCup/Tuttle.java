package com.careerCup;

public class Tuttle {

	char dir;

	public char getDir() {
		return dir;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	int x, y;

	public Tuttle(char direction, int xPos, int yPos) {
		dir = direction;
		x = xPos;
		y = yPos;
	}

	public void moveTuttleAround(String movement) {
		for(char step : movement.toCharArray()){
			switch (step) {
			case 'F':
				moveForward();
				break;
			case 'R':
				moveRight();
				break;
			case 'L':
				moveLeft();
				break;
			default:
				System.out.println("Invalid character found");
				return;
			}
		}
	}

	public void moveForward() {
		switch (dir) {
		case 'N':
			y++;
			break;
		case 'E':
			x++;
			break;
		case 'W':
			x--;
			break;
		case 'S':
			y--;
			break;
		default:
			break;
		}
	}

	public void moveLeft() {
		switch (dir) {
		case 'N':
			dir = 'W';
			break;
		case 'E':
			dir = 'N';
			break;
		case 'W':
			dir = 'S';
			break;
		case 'S':
			dir = 'E';
			break;
		default:
			break;
		}
	}

	public void moveRight() {
		switch (dir) {
		case 'N':
			dir = 'E';
			break;
		case 'E':
			dir = 'S';
			break;
		case 'W':
			dir = 'N';
			break;
		case 'S':
			dir = 'W';
			break;
		default:
			break;
		}
	}
}
