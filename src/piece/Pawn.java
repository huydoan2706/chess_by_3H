package piece;

import main.GamePanel;
import pair.Pair;

public class Pawn extends ChessMan {
    public Pawn(GamePanel panel, int x, int y) {
        super(panel, x, y);
    }

    @Override
    public void setImageName() {
        this.name = "White_Pawn";
    }

    @Override
    public void setValue() {
        this.value = 1;
    }
    @Override
    public void functionUpdate() {
        if (this.y == 8 * this.panel.tileSize){
            moves.add(new Pair<>(this.x, this.y - this.panel.tileSize));
            moves.add(new Pair<>(this.x, this.y - 2 * this.panel.tileSize));
        }
        else if (this.y > 2 * this.panel.tileSize){
            moves.add(new Pair<>(this.x, this.y - this.panel.tileSize));
        }
    }
}
