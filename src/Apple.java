import java.awt.Color;

import java.awt.Graphics;

public class Apple {
	
	private int xCoor, yCoor, width, heigth;
	
	public Apple(int xCoor, int yCoor, int tileSize) {
		
		this.xCoor = xCoor;
		this.yCoor = yCoor;
		width = tileSize;
		heigth = tileSize;
	}
	
	public void tick() {
		
		
	}

	public void draw(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillRect(xCoor * width, yCoor * heigth, width, heigth);
		
	}

	public int getxCoor() {
		return xCoor;
	}

	public void setxCoor(int xCoor) {
		this.xCoor = xCoor;
	}

	public int getyCoor() {
		return yCoor;
	}

	public void setyCoor(int yCoor) {
		this.yCoor = yCoor;
	}
	
}