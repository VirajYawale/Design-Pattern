package prototype_pattern;

class PhonePrototype implements Prototype {
    String os;
    int ram;
    int ss;

    public PhonePrototype(String os, int ram, int ss) {
        this.os = os;
        this.ram = ram;  // if we return object here instead of makin clone method then it will be copy constructor
        this.ss = ss;
    }

    @Override
    public PhonePrototype clone() {
        return new PhonePrototype(this.os, this.ram, this.ss);
    }
    
    @Override
    public String toString() {
        return "PhonePrototype [OS=" + os + ", RAM=" + ram + "GB, Storage=" + ss + "GB]";
    }

   
}