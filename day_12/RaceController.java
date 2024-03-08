package day_12;

import java.util.List;

public class RaceController {

    public static IRaceAble getWinner(List<IRaceAble> raceGroup) {

        IRaceAble winner = raceGroup.get(0);

        for (IRaceAble current : raceGroup)
            if (current.speed() > winner.speed())
                winner = current;

        return winner;
    }

    /**
     * Program base on interface not details implementation
     *
     * */

}
