public class entity {
    // Instant Variables
    int type;
    int team;

    public entity() {
        type = 0;
        team = 0;
    }

    public entity(int type, int team) {
        this.type = type;
        this.team = team;
    }

    /*
     * type = 0 // empty type = 1 // regular piece type = 2 // king piece team = 1
     * // team = 2 //
     */
    public void setKing() {
        this.type = 2;
    }

    public void capture() {
        this.team = 0;
        this.type = 0;
    }
}
