public class Skeleton extends Boss{

private int numberOfArrows;

    public Skeleton(int health, int hit, int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + ", numberOfArrows:" + this.numberOfArrows;
    }
}
