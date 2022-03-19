public class Cat extends Animal {

    protected boolean swim;

    public Cat(String name, int run, boolean swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public void catInfo() {
        System.out.println(name + "Пробежал: " + run + " м." + " Плавать не умеет " + swim);
    }
}

