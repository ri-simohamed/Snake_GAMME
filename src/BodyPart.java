import java.awt.*;

public class BodyPart {
	
	private int xCoor, yCoor, width, heigth;
	
	public BodyPart(int xCoor, int yCoor, int tileSize) {
		
		this.xCoor = xCoor;
		this.yCoor = yCoor;
		width = tileSize;
		heigth = tileSize;
		
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
	
	public void tick() {
		
		
		
	}

	public void draw(Graphics g) {
		
		g.setColor(Color.green);
		g.fillRect(xCoor * width, yCoor * heigth, width, heigth);
		
	}

}
