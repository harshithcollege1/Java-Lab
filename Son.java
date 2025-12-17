class Son extends Father {
    int sonAge;
    public Son(int fatherAge, int sonAge){
        super(fatherAge);     // Must be first statement
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father’s age!");
        }
        this.sonAge = sonAge;
    }
}