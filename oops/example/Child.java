package oops.example;

class Parent{
    private String parentName;
    private int parentAge;
    public Parent(String parentName, int parentAge){
        this.parentName = parentName;
        this.parentAge = parentAge;
    }
    public String getParentName(){
        return parentName;
    }
    public int getParentAge(){
        return parentAge;
    }
}

class Child extends Parent{
    private String childName;
    private int childAge;
    public Child(String  parentName, int parentAge, String childName, int childAge) {
        super(parentName, parentAge);
        this.childName = childName;
        this.childAge = childAge;
    }
    public static void main(String[] args) {
        Child child1 = new Child("Kabui", 55, "paul", 25);
        System.out.println(child1.getParentName()+ child1.getParentAge() + child1.childAge);
    }
    
}