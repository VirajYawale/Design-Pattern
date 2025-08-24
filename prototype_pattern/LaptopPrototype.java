package prototype_pattern;

class LaptopPrototype implements Prototype{
    String processor;
    int ram;

    public LaptopPrototype(String processor, int ram) {
        this.processor = processor;
        this.ram = ram;
    }
 
    @Override
    public LaptopPrototype clone() {
        return new LaptopPrototype(this.processor, this.ram);
    }

    @Override
    public String toString() {
        return "PhonePrototype [Processor=" + processor + ", RAM=" + ram + "GB]";
    }
    
}