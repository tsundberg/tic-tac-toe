import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TicTacToeTest {

    @Test
    public void first_full_row_win() {
        TicTacToe game = new TicTacToe();

        game.play("X", 0, 0);
        game.play("O", 0, 1);
        game.play("X", 1, 0);
        game.play("O", 1, 1);
        game.play("X", 2, 0);

        assertTrue(game.isOver());
    }
}
