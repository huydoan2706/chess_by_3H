package piece;

import main.GamePanel;
import pair.Pair;

public class Bishop extends ChessMan {
    public Bishop(GamePanel panel, int x, int y) {
        super(panel, x, y);
    }

    @Override
    public void setImageName() {
        this.name = "White_Bishop";
    }

    @Override
    public void setValue() {
        this.value = 3;
    }

    @Override
    public void functionUpdate() {
        for (int i = 1; this.x + i * this.panel.tileSize < 12 * panel.tileSize && this.y + i * this.panel.tileSize < 10 * panel.tileSize; ++i) {
            moves.add(new Pair<>(this.x + i * this.panel.tileSize, this.y + i * this.panel.tileSize));
        }
        for (int i = 1; this.x - i * this.panel.tileSize > 3 * panel.tileSize && this.y - i * this.panel.tileSize > 1 * panel.tileSize; ++i) {
            moves.add(new Pair<>(this.x - i * this.panel.tileSize, this.y - i * this.panel.tileSize));
        }
        for (int i = 1; this.x + i * this.panel.tileSize < 12 * panel.tileSize && this.y - i * this.panel.tileSize > 1 * panel.tileSize; ++i) {
            moves.add(new Pair<>(this.x + i * this.panel.tileSize, this.y - i * this.panel.tileSize));
        }
        for (int i = 1; this.x - i * this.panel.tileSize > 3 * panel.tileSize && this.y + i * this.panel.tileSize < 10 * panel.tileSize; ++i) {
            moves.add(new Pair<>(this.x - i * this.panel.tileSize, this.y + i * this.panel.tileSize));
        }
    }
}
