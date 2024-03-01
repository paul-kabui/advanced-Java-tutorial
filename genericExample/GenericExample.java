package genericExample;


class User<T>{
    private final T id;
    private final T userName;

    public User(T id, T userName){
        this.id = id;
        this.userName = userName;
    }

    public T getUserid(){
        return this.id;
    }

    public T getUserName(){
        return this.userName;
    }

    public  static <S> S  shout(S name){
        return name;
    } 

    public static void main(String[] args){
        User<String> user1 = new User<>("123", "phauz");
        System.out.println(user1.id);
        String name1 = shout("paul");
        System.out.println(name1);
    }
}

