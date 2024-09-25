public class DiffMethod {
     <T> void  callKaro(T element){
         System.out.println(element.getClass().getName()+"="+ element);
     }

    public static void main(String[] args) {
         DiffMethod obj = new DiffMethod();
         obj.callKaro(10);
         obj.callKaro("RAM");
         obj.callKaro(0.9);
         obj.callKaro(0.8F);
    }
}


