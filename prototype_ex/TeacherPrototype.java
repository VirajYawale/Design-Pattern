package prototype_ex;

class TeacherPrototype implements IPerson{
    String name;
    int e_id;
    int salary;

    public TeacherPrototype(String name, int e_id, int salary){
        this.name = name;
        this.e_id = e_id;
        this.salary = salary;
    }

    @Override
    public TeacherPrototype Clone(){
        return new TeacherPrototype(this.name, this.e_id, this.salary);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getE_id() {
        return e_id;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Teacher [Name=" + name + ", Employee Id=" + e_id + ", Salary=" + salary +"]";
    }
}