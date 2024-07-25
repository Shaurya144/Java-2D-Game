package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
 
public class GamePanel extends JPanel implements Runnable{ // GamePanel is a subclass of JPanel
	// Screen Setting
	final int originalTileSize = 16; // 16x16 tile pixels
	final int scale = 3;
	
	final int TileSize = originalTileSize * scale;
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int ScreenWidth = TileSize * maxScreenRow; // 768 pixels
	final int ScreenHeight = TileSize * maxScreenCol; // 576 pixels
	
	Thread gameThread; // useful for screen refresh
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(ScreenHeight, ScreenWidth));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true); // improves game rendering
	}
	
	public void startGameThread() {
		gameThread = new Thread(this);	
		gameThread.start();	// will automatically call run method
	}

	@Override
	public void run() {
		// This will be the "core" of our game
		while (gameThread != null) {
			System.out.println("Game Loop is running");
			
			// Update information such as character information
			Update();
			// Draw the screen with updated information
			repaint(); // this is how you call the paintComponent function
		}
	}
	
	public void Update() {
		
	}
	
	public void paintComponent(Graphics g) { // Built in function by Java
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setColor(Color.white);
		g2.fillRect(100, 100, TileSize, TileSize);
		
		g2.dispose();
	}
}
