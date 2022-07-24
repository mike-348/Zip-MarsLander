public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        // goal is to reduce acceleration
        // next burn = fuel needed to maintain current descent speed + amount of acceleration
        // can't be 100 because it will stall if acceleration reaches 0
        int burn = 99 + (status.Velocity * status.Velocity)/(2 * status.Altitude);
        System.out.println(burn); /*hack!*/
        return burn;
    }

}
