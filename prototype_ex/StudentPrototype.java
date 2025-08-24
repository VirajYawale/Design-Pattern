package prototype_ex;

class StudentPrototype implements IPerson{
    String name;
    int s_id;
    double cgpa;

    public StudentPrototype(String name, int s_id, double cgpa){
        this.name = name;
        this.s_id = s_id;
        this.cgpa = cgpa;
    }

    @Override
    public StudentPrototype Clone(){
        return new StudentPrototype(this.name, this.s_id, this.cgpa);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getS_id() {
        return s_id;
    }

    public double getCgpa() {
        return cgpa;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString(){
        return "Student [Name=" + name + ", Student Id=" + s_id + ", CGPA=" + cgpa +"]";
    }

}
