class Father {
    int age;
    public Father(int age){
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative!");
        } else {
            this.age = age;
        }
    }
}