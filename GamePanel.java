package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel{ // GamePanel is a subclass of JPanel
	// Screen Setting
	final int originalTileSize = 16; // 16x16 tile pixels
	final int scale = 3;
	
	final int TileSize = originalTileSize * scale;
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int ScreenWidth = TileSize * maxScreenRow; // 768 pixels
	final int ScreenHeight = TileSize * maxScreenCol; // 576 pixels
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(ScreenHeight, ScreenWidth));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true); // improves game rendering
	}
}
