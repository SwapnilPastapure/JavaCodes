 

/*if two objects are equal to each other based on equals() method, then the hash code must be the same,
    but if the hash code is the same, then equals() can return false.*/
public class HashCodeAndEquals {
    @Override
    public int hashCode() {
        return 100;
    }


    public static void main(String[] args) {
        HashCodeAndEquals obj1 = new HashCodeAndEquals();
        System.out.println("HashCode value of obj is "+obj1.hashCode());

        HashCodeAndEquals obj2 = new HashCodeAndEquals();
        System.out.println("HashCode value of obj1 is "+obj2.hashCode());

        HashCodeAndEquals obj3 = null;
        //obj3 = new HashCodeAndEquals();
        System.out.println("HashCode value of obj1 is "+obj3.hashCode());


        boolean tt = obj1.equals(obj2);
        System.out.println("Value of tt is "+tt);
    }
}
