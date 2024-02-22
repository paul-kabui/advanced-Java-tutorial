package abstraction;

abstract class Component{
    // Abstract class cannot be instantiated
    // class must be marked abstract, when it has at least one abstract method
    // An abstract method is a method that has no implementation
    private int x, y;
    public void setPostion(int x, int y){
        this.x = x;
        this.y = y;
    }
    public abstract void render(); //abstract method

}
class Button extends Component{
    @Override
    public void render(){
        //implentation can be don here
        System.out.println("This is a rendered button");
    }
    public static void main(String[] args){
        // note how we instantiate
        Component myButton = new Button();
        myButton.render();
    }
}

class TextBox extends Component{
    @Override
    public void render(){
        // implementation can be done here
        System.out.println("render TextBox");
    }
    // N/B *****
    //this is an anonymousClass example
    static Component myFrame = new Component(){
        @Override
        public void render() {
            // render a quick 1-time use component
            System.out.println("This a Frame");
        }
    };
    public static void main(String[] args){
        // note how we instantiate
        Component textBox = new TextBox();
        textBox.render();
        myFrame.render();
    }
}
