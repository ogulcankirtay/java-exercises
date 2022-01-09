/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;

import java.awt.Graphics;
import java.util.Random;
import java.awt.Paint;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static com.sun.tools.attach.VirtualMachine.list;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.Files.list;
import java.nio.file.Paths;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.*;

public class MazeSolverGui extends javax.swing.JFrame implements ActionListener {

    char[][] mazeArray;
    private String solveMode = "wallFollow";
    private JTextArea mazeText;

    int[][] dizi = {
        {0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 1, 0, 0},
        {0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0},
        {0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0},
        {0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0},
        {0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0},
        {1, 1, 0, 1, 1, 1, 2, 0, 1, 0, 1, 1, 0},
        {0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0},
        {0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0},
        {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

    public MazeSolverGui() throws Exception {

        JFrame frame = new JFrame("Maze Solver");

        StringBuilder defaultText = new StringBuilder();

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 13; j++) {
                if (i == 5 && j == 6) {
                    defaultText.append(MazeSolver.startChar);
                } else if (dizi[i][j] == 3) {
                    defaultText.append(MazeSolver.endChar);
                } else if (dizi[i][j] == 0) {
                    defaultText.append(MazeSolver.wallChar);
                } else {
                    defaultText.append(MazeSolver.emptyChar);
                }
            }
            defaultText.append('\n');
        }

        mazeText = new JTextArea(defaultText.toString());
        mazeText.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 35));
        frame.getContentPane().add(mazeText, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());

        JButton solveButton = new JButton("Solve!");

        if (mazeText.getText().isEmpty()) {
            return;
        }

        char[][] mazeStrings = new char[dizi.length][dizi[0].length];
        ArrayList<Point> result = null;
        Point start = null;
        Point end = null;
        mazeArray = new char[dizi.length][dizi[0].length];

        for (int i = 0; i < dizi.length; i++) {

            for (int j = 0; j < dizi[i].length; j++) {
                if (i == 5 && j == 6) {
                    mazeStrings[i][j] = 's';
                } else if (dizi[i][j] == 3) {
                    mazeStrings[i][j] = 'e';
                } else if (dizi[i][j] == 0) {
                    mazeStrings[i][j] = '#';
                } else {
                    mazeStrings[i][j] = '.';
                }

            }

        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {

                {
                    mazeArray[i][j] = mazeStrings[i][j];
                }

                if (mazeArray[i][j] == MazeSolver.startChar) {
                    start = new Point(i, j);
                }

                if (mazeArray[i][j] == MazeSolver.endChar) {
                    end = new Point(i, j);
                }

                if (mazeArray[i][j] == MazeSolver.horizontalPathChar || mazeArray[i][j] == '-') {
                    mazeArray[i][j] = MazeSolver.emptyChar;
                }
            }
        }

        result = MazeSolver.dijkstraSolve(mazeArray, start, end);

        if (result == null) {

            return;
        } else {

            for (int i = 1; i < result.size() - 1; i++) {
                if (result.get(i - 1).r != result.get(i + 1).r && result.get(i - 1).c != result.get(i + 1).c) {
                    mazeArray[result.get(i).r][result.get(i).c] = MazeSolver.horizontalPathChar;
                } else if (result.get(i - 1).r == result.get(i).r) {
                    mazeArray[result.get(i).r][result.get(i).c] = MazeSolver.horizontalPathChar;
                } else if (result.get(i - 1).c == result.get(i).c) {
                    mazeArray[result.get(i).r][result.get(i).c] = '-';
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mazeArray.length; i++) {
                sb.append(mazeArray[i]);
                sb.append('\n');
            }

            mazeText.setText(sb.toString());
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 1500);

        frame.setVisible(true);

    }

    public static void main(String[] args) throws Exception {

        new MazeSolverGui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
