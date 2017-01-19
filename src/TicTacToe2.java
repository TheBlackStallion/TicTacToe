import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Simple TicTacToe game to introduce JFrame.
 *
 * Created by dlu on 12/2/2016.
 */
public class TicTacToe2 {

    private static JButton spaces[];

    public static void main(String[] args) {
        String title = "Simple Tic Tac Toe v2";
        int width = 3;
        int height = 3;

        JFrame jf = new JFrame(title);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(width, height));
        spaces = new JButton[width * height];
        for (int i = 0; i < spaces.length; i++) {
            spaces[i] = new TTTButton();
            jp.add(spaces[i]);                  // Add button to panel.
        }
        jf.add(jp);                             // Add panel to frame.

        jf.pack();
        jf.setVisible(true);
    }

    private static class TTTButton extends JButton implements ActionListener {

        private static int turn = 0;

        public TTTButton() {
            super();
            setPreferredSize(new Dimension(100, 100));
            setForeground(Color.BLACK);
            setOpaque(true);
            setFont(new Font("Helvetica", Font.PLAIN, 60));
            setText(" ");
            addActionListener(this);
        }

        // Notice button clicks to record moves.
        public void actionPerformed(ActionEvent e) {
            if (turn % 2 == 0 && getText().equals(" ")) {
                setText("1");
            } else if (turn % 2 == 1 && getText().equals(" ")) {
                setText("0");
            }
            if (isThereAWinner()) {
                showWin();
                shallWePlayAgain();
            } else if (noPlaceLeftToPlay()) {
                shallWePlayAgain();
            } else {
                turn++;
            }
        }

                                         
        private boolean isThereAWinner() {
            boolean winner = false;
            System.out.print("winner?");

            System.out.println(spaces[0].getText());
            if (spaces[0].getText().equals("1")) {
                winner = true;
                System.out.println("winner");
            }
            return winner;
        }


        private boolean noPlaceLeftToPlay() {
            if (turn >= 8) {
                return true;
            } else {
                return false;
            }
        }


        private void shallWePlayAgain() {

            System.out.println("game over");
        }


        private void showWin() {

        }


        private void newGame() {

        }
    }
}
