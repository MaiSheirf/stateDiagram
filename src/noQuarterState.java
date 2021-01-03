public class noQuarterState implements state{
    gumBall gum;
    public noQuarterState(gumBall gum){
        this.gum=gum;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumBall.setState(gumBall.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven’t inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there’s no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
