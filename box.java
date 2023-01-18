public class box<T> {
    private T value;

    public box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    public static void main(String[] args) {
        box b1 =new box<Integer>(15);
        System.out.println("Gia tri la: "+b1.getValue());
        box b2=new box<Double>(15.5);
        System.out.println("Gia tri la: "+b2.getValue());
        box b3 =new box<String>("TTP");
        System.out.println("Gia tri la: "+b3.getValue());
    }
}
