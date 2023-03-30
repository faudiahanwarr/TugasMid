// Nama Faudiah Anwar
// Stambuk 13020210145

interface A {
    public void aaa();
}

interface B extends A {

}

class Central4DigitTerakhirStambuk implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        System.out.println("main");
        Central4DigitTerakhirStambuk obj = new Central4DigitTerakhirStambuk();
        obj.aaa();
    }
}
