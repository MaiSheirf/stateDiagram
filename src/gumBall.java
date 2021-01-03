public class gumBall {
    state  soldOutState;
    state noQuarterState;
    state hasQuarterState;
    state  soldState;
    state state = soldOutState;
    int count = 0;

    public gumBall(int numberGumballs) {
        noQuarterState = new noQuarterState(this);
           this.count = numberGumballs;
                if (numberGumballs > 0) {
                state = noQuarterState;
            }
    }

    public static state getHasQuarterState() {
        return null;
    }

    public void insertQuarter() {
        state.insertQuarter();
}

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }
    static void setState(state state) {

    }

}

