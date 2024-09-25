class Genr <T,U>{
    T obj1;
    U obj2;
    Genr(T obj1, U obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
class Test{
    public static void main(String[] args) {
        Genr<String,Integer> obj= new Genr<String ,Integer>("don",15);
        obj.print();
    }
}