package lolgame;

public class Players {

    private Champion champion = new Champion();

    public void Line(){

        champion.LineFight();

    }

    public void Gang() {

        champion.GangFight();

    }

    public void Dra() {

        champion.Dragon();

    }

    public void Bra() {

        champion.Baron();

    }
    public void Win() {

        champion.Winner();

    }

}
