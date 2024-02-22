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
}

