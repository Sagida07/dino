package org.example;

import components.Dino;
import components.GamePanel;
import components.Ground;
import components.Obstacles;

import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame mainWindow = new JFrame("Dino");

    public static int width = 800;
    public static int height = 500;

    public void createAndShowU() {
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = mainWindow.getContentPane();
        GamePanel gamePanel = new GamePanel(WIDTH,HEIGHT);
        gamePanel.addKeyListener(gamePanel);
        gamePanel.setFocusable(true);
        container.setLayout(new BorderLayout());
        container.add(gamePanel,BorderLayout.CENTER);

        mainWindow.setSize(WIDTH,HEIGHT);
        mainWindow.setResizable(false);
        mainWindow.setVisible(true);

        Dino dino = new Dino();
        dino.setJumpFactor(20);
        Ground ground = new Ground(HEIGHT);
        gamePanel.setObstacleIntervalAndSpeed(300,10);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().createGameAndShow());
    }
}
