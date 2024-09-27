package piece;

import main.GamePanel;
import pair.Pair;

public class Knight extends ChessMan {
    public Knight(GamePanel panel, int x, int y) {
        super(panel, x, y);
    }

    @Override
    public void setImageName() {
        this.name = "White_Knight";
    }

    @Override
    public void setValue() {
        this.value = 3;
    }

    @Override
    public void functionUpdate() {
        if(this.x + this.panel.tileSize < 12 * panel.tileSize && this.y + 2 * this.panel.tileSize < 10 * panel.tileSize) {
            moves.add(new Pair<>(this.x + this.panel.tileSize, this.y + 2 * this.panel.tileSize));
        }
        if(this.x - this.panel.tileSize > 3 * panel.tileSize && this.y - 2 * this.panel.tileSize > 1 * panel.tileSize){
            moves.add(new Pair<>(this.x - this.panel.tileSize, this.y - 2 * this.panel.tileSize));
        }
        if(this.x + this.panel.tileSize < 12 * panel.tileSize  && this.y - 2 * this.panel.tileSize > 1 * panel.tileSize){
            moves.add(new Pair<>(this.x + this.panel.tileSize, this.y - 2 * this.panel.tileSize));
        }
        if(this.x - this.panel.tileSize > 3 * panel.tileSize && this.y + 2 * this.panel.tileSize < 10 * panel.tileSize){
            moves.add(new Pair<>(this.x - this.panel.tileSize, this.y + 2 * this.panel.tileSize));
        }
        if(this.x + 2 * this.panel.tileSize < 12 * panel.tileSize && this.y + this.panel.tileSize < 10 * panel.tileSize) {
            moves.add(new Pair<>(this.x + 2 * this.panel.tileSize, this.y + this.panel.tileSize));
        }

        if(this.x - 2 * this.panel.tileSize > 3 * panel.tileSize && this.y - this.panel.tileSize > 1 * panel.tileSize){
            moves.add(new Pair<>(this.x - 2 * this.panel.tileSize, this.y - this.panel.tileSize));
        }
        if(this.x + 2 * this.panel.tileSize < 12 * panel.tileSize  && this.y - this.panel.tileSize > 1 * panel.tileSize){
            moves.add(new Pair<>(this.x + 2 * this.panel.tileSize, this.y - this.panel.tileSize));
        }
        if(this.x - 2 * this.panel.tileSize > 3 * panel.tileSize && this.y + this.panel.tileSize < 10 * panel.tileSize){
            moves.add(new Pair<>(this.x - 2 * this.panel.tileSize, this.y + this.panel.tileSize));
        }
    }
}
