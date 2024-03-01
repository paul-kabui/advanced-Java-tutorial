package interfaceConcept;


interface Area{
    public int getWidth();
    public int getLength();
    default int calculateArea(){
        return getWidth() * getLength();
    };
    
}
public class Rectangle implements Area {
    public int width;
    public int length;
    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    @Override
    public int getWidth() {
        throw new UnsupportedOperationException("Unimplemented method 'getWidth'");
    }

    @Override
    public int getLength() {
        throw new UnsupportedOperationException("Unimplemented method 'getLength'");
    }
    
}
