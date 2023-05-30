public class Cat {
    private String name;
    private int appetite;
    private boolean ishungry;

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        ishungry = true;
    }

    public void eat(Plate plate) {
        if (ishungry) {
            if (plate.getFood() >= this.appetite) {
                System.out.printf("Котик %s съел %d еды\n", this.name, this.appetite);
                plate.takeFood(this.appetite);
                this.ishungry = false;
            } else {
                System.out.printf("Котик %s не хватило %d еды и он к ней не притронулся,ТАМ ЖЕ ВИДНО ДНООО!\n",
                        this.name, plate.getFood());
            }
        } else {
            System.out.printf("Котик %s не голоден\n", this.name);
            this.ishungry = true;
        }
    }

    public void info() {
        System.out.printf("Котик %s " + (this.ishungry ? "голоден и готов съесть %d еды" : "не голоден") + "\n",
                this.name, this.appetite);
    }
}