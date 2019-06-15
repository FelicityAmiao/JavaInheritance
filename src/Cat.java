class Cat extends Animal{
    public Cat(int age, String weight) {
        super(age, weight);
    }
    protected void voice() {
        System.out.println("喵喵喵~");
    }
}
