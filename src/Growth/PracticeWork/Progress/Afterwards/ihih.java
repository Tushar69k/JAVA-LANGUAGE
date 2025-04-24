package Growth.PracticeWork.Progress.Afterwards;

public class ihih {
    int i = 10;
}

class B extends ihih {
    int i = 20;

    public static void main(String[] args) {
        ihih a = new ihih();
        System.out.println(a.i);

        B ko = new B();
        System.out.println(ko.i);


    }

}