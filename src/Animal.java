class Animal {
    private int age;
    private String weight;

    public Animal(int age, String weight) {
        this.age = age;
        this.weight = weight;
    }

    public void run() {
        System.out.println("跑动ing");
    }

    public void eat() {
        System.out.println("吃东西ing");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
