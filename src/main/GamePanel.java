package main;

import button.MenuButton;
import piece.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class GamePanel extends Panel {
    MenuButton menuButton;
    BufferedImage board, queue;
    double boardScale = 1;
    public int [][] Board = new int[8][8];

    public MouseHandle [][] mouseHandles = new MouseHandle[8][8];

    King king;
    Rook rook1, rook2;
    Queen queen;
    Bishop bishop1, bishop2;
    Knight knight1, knight2;
    Pawn pawn1, pawn2, pawn3, pawn4, pawn5, pawn6, pawn7, pawn8;

    public GamePanel(Frame frame) {
        super(frame);
        this.menuButton = new MenuButton(this,0,0,2 * tileSize,tileSize);
        this.setBackground(Color.BLACK);
        for (int i = 0; i < 8; i++ ) {
            for (int j = 0; j < 8; j++) {
                mouseHandles[i][j] = new MouseHandle((j + 4) * tileSize, (i + 2) * tileSize, tileSize, tileSize);
                this.addMouseListener(mouseHandles[i][j]);
            }
        }
        this.king = new King(this, 8 * tileSize,  9 * tileSize);
        this.queen = new Queen(this, 7 * tileSize,  9 * tileSize);
        this.rook1 = new Rook(this, 4 * tileSize,  9 * tileSize);
        this.rook2 = new Rook(this, 11 * tileSize,  9 * tileSize);
        this.bishop1 = new Bishop(this, 6 * tileSize,  9 * tileSize);
        this.bishop2 = new Bishop(this, 9 * tileSize,  9 * tileSize);
        this.knight1 = new Knight(this, 5 * tileSize,  9 * tileSize);
        this.knight2 = new Knight(this, 10 * tileSize,  9 * tileSize);
        this.pawn1 = new Pawn(this, 4 * tileSize,  8 * tileSize);
        this.pawn2 = new Pawn(this, 5 * tileSize,  8 * tileSize);
        this.pawn3 = new Pawn(this, 6 * tileSize,  8 * tileSize);
        this.pawn4 = new Pawn(this, 7 * tileSize,  8 * tileSize);
        this.pawn5 = new Pawn(this, 8 * tileSize,  8 * tileSize);
        this.pawn6 = new Pawn(this, 9 * tileSize,  8 * tileSize);
        this.pawn7 = new Pawn(this, 10 * tileSize,  8 * tileSize);
        this.pawn8 = new Pawn(this, 11 * tileSize,  8 * tileSize);
        getImage();
    }

    public void getImage(){
        try {
            board = ImageIO.read((getClass().getResourceAsStream("/image/Board.png")));
            queue = ImageIO.read((getClass().getResourceAsStream("/image/Queue.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(){
        menuButton.update();
        king.update();
        queen.update();
        rook1.update();
        rook2.update();
        bishop1.update();
        bishop2.update();
        knight1.update();
        knight2.update();
        pawn1.update();
        pawn2.update();
        pawn3.update();
        pawn4.update();
        pawn5.update();
        pawn6.update();
        pawn7.update();
        pawn8.update();
        System.out.println(Board[2][2]);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2D =(Graphics2D) g;
        menuButton.draw(g2D);
        g2D.drawImage(board, 4 * tileSize, 2 * tileSize, (int) (8 * boardScale * tileSize), (int) (8 * boardScale *tileSize), null);
        for (int i = 2; i < 10; i ++){
            for (int j = 1; j <= 2; j++){
                g2D.drawImage(queue, j * tileSize, i * tileSize, tileSize, tileSize, null);
                g2D.drawImage(queue, (j + 12) * tileSize, i * tileSize, tileSize, tileSize, null);
            }
        }
        king.draw(g2D);
        queen.draw(g2D);
        rook1.draw(g2D);
        rook2.draw(g2D);
        bishop1.draw(g2D);
        bishop2.draw(g2D);
        knight1.draw(g2D);
        knight2.draw(g2D);
        pawn1.draw(g2D);
        pawn2.draw(g2D);
        pawn3.draw(g2D);
        pawn4.draw(g2D);
        pawn5.draw(g2D);
        pawn6.draw(g2D);
        pawn7.draw(g2D);
        pawn8.draw(g2D);
        g2D.dispose();
    }
}
